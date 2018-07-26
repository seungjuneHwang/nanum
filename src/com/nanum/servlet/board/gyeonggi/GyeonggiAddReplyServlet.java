package com.nanum.servlet.board.gyeonggi;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.nanum.dao.BoardGyeonggiDAO;
import com.nanum.vo.ReplyBean;
import com.nanum.vo.UserVO;



/**
 * Servlet implementation class AddReplyServlet
 */
@WebServlet("/GyeonggiAddReplyServlet")
public class GyeonggiAddReplyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GyeonggiAddReplyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			String str1 = request.getParameter("reply_board_idx");
			int reply_board_idx = Integer.parseInt(str1);
			String reply_content = request.getParameter("reply_content");
			// 데이터를 담는다.
			ReplyBean bean = new ReplyBean();
			
			HttpSession session = request.getSession();
			UserVO login_bean = (UserVO)session.getAttribute("login_bean");
			
			bean.setReply_content(reply_content);
			bean.setReply_board_idx(reply_board_idx);
			bean.setReply_ip(request.getRemoteAddr());
			bean.setReply_writer_idx(login_bean.getU_idx());
			
			BoardGyeonggiDAO.add_reply(bean);
			
			String site = "/board/gyeonggi_board/add_reply_gyeonggi.jsp";
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
