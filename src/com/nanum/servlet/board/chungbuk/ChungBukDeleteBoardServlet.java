package com.nanum.servlet.board.chungbuk;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nanum.dao.BoardChungBukDAO;



/**
 * Servlet implementation class DeleteBoardServlet
 */
@WebServlet("/ChungBukDeleteBoardServlet")
public class ChungBukDeleteBoardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChungBukDeleteBoardServlet() {
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
			// 삭제처리하는 메서드를 호출한다.
			BoardChungBukDAO.deleteBoard(board_idx);
			// 뷰로 이동한다.
			String site = "/board/chungbuk_board/delete_board_chungbuk.jsp";
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
