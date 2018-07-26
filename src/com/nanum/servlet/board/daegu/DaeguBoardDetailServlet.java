package com.nanum.servlet.board.daegu;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nanum.dao.BoardDaeguDAO;
import com.nanum.vo.BoardBean;
import com.nanum.vo.ReplyBean;
import com.nanum.vo.UserVO;



/**
 * Servlet implementation class BoardDetailServlet
 */
@WebServlet("/DaeguBoardDetailServlet")
public class DaeguBoardDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DaeguBoardDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			
			// 파라미터 추출
			String board_idx_str = request.getParameter("board_idx");
			int board_idx = Integer.parseInt(board_idx_str);
			// 게시글 정보를 가져온다.
			BoardBean board_bean = BoardDaeguDAO.getBoardContent(board_idx);
			request.setAttribute("board_bean", board_bean);
			// 작성자와 로그인한 사람이 다르면 조회수를
			// 증가시킨다.
			HttpSession session = request.getSession();
			UserVO login_bean = (UserVO)session.getAttribute("login_bean");
			if(board_bean.getBoard_writer_idx() != login_bean.getU_idx()){
				BoardDaeguDAO.addReadCnt(board_idx);
			}
			
			// 댓글 정보를 가져온다.
			ArrayList<ReplyBean> reply_list = BoardDaeguDAO.getReplyList(board_idx);
			request.setAttribute("reply_list", reply_list);
			
			String site = "/board/daegu_board/board_detail_daegu.jsp";
			RequestDispatcher dis = request.getRequestDispatcher(site);
			dis.forward(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
