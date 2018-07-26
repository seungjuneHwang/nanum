package com.nanum.servlet.board.jeollanamdo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nanum.dao.BoardJeollanamdoDAO;
import com.nanum.vo.BoardBean;



/**
 * Servlet implementation class ModifyBoardServlet
 */
@WebServlet("/JeollanamdoModifyBoardServlet")
public class JeollanamdoModifyBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JeollanamdoModifyBoardServlet() {
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
			// 게시글 데이터를 가져온다.
			BoardBean board_bean = BoardJeollanamdoDAO.getBoardContent(board_idx);
			request.setAttribute("board_bean", board_bean);
			// 뷰로 이동한다.
			String site = "/board/jeollanamdo_board/modify_board_jeollanamdo.jsp";
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