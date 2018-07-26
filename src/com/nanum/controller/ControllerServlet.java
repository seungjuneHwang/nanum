package com.nanum.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("*.nanum")
public class ControllerServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#HttpServlet()
    */
   public ControllerServlet() {
      super();
      // TODO Auto-generated constructor stub
   }

   /**
    * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub

      String url = request.getRequestURL().toString();

      String[] sub = url.split("/");

      String suburl = sub[4];

      String site = null;
      System.out.println(suburl);

      switch (suburl) {

      case "main.nanum": // 메인 페이지
         site = "main/main.jsp";
         break;

      case "login.nanum": // 로그인 페이지
         site = "login/loginForm.jsp";
         break;

      case "login_proc.nanum": // 로그인 처리
         System.out.println("123a");
         site = "LoginProc";
         break;

      case "logout.nanum": // 로그아웃 처리
         site = "LogoutServlet";
         break;

      case "signUp.nanum": // 회원가입 페이지
         site = "signUp/signUp.jsp";
         break;

      case "signUpProc.nanum": // 회원가입 처리
         site = "SignUpProc";
         break;

      case "agreement.nanum": // 회원가입시 이용약관 페이지
         site = "signUp/agreement.jsp";
         break;

      case "admin.nanum": // 관리자 전용
         System.out.println("1231");
         site = "AdminServlet";
         break;

      case "myPage.nanum": // 마이페이지
         site = "member/myPage.jsp";
         break;

      case "memberModify.nanum": // 개인정보변경 페이지
         site = "member/memberModify.jsp";
         break;

      case "updateInfo.nanum": // 사용자 정보 수정 처리
         site = "UpdateInfoServlet";
         break;

      case "memberDelete.nanum": // 회원탈퇴페이지
         site = "member/memberDelete.jsp";
         System.out.println(site);
         break;

      case "getUserInfoForAdmin.nanum": // 관리자용 사용자 정보 확인
         site = "GetInfoForAdminServlet";
         break;

      case "getUserInfoForUser.nanum": // 유저용 사용자 정보 확인
         site = "GetInfoForUserServlet";
         break;

      case "delInfoForAdmin.nanum": // 관리자용 사용자 정보 삭제 , 회원탈퇴
         site = "DelInfoForAdminServlet";
         System.out.println(site);
         break;

      case "delInfoForUser.nanum": // 유저용 사용자 정보 삭제 , 회원탈퇴
         site = "DelInfoForUserServlet";
         System.out.println(site);
         break;

      case "board.nanum":
         site = "board/board_list.jsp";
         System.out.println(site);
         break;

      case "board_list.nanum":
         site = "BoardListServlet";

         break;
      case "board_write.nanum":
         site = "BoardWriteServlet";

         break;
      case "board_write_pro.nanum":
         site = "BoardWriteProServlet";
         System.out.println(site);
         break;
      case "board_detail.nanum":
         site = "BoardDetailServlet";
         System.out.println(site);
         break;
      case "delete_board.nanum":
         site = "DeleteBoardServlet";

         break;
      case "modify_board.nanum":
         site = "ModifyBoardServlet";

         break;
      case "modify_board_pro.nanum":
         site = "ModifyBoardProServlet";

         break;
      case "add_reply.nanum":
         site = "AddReplyServlet";

         break;
      case "remove_reply.nanum":
         site = "RemoveReplyServlet";

         break;

      case "rating.nanum":
         site = "RatingServlet";
         break;

      case "notice.nanum":
         site = "NoticeBoardListServlet";
         break;

      case "board_list_notice.nanum":
         site = "NoticeBoardListServlet";

         break;
      case "board_write_notice.nanum":
         site = "NoticeBoardWriteServlet";
         break;

      case "board_write_pro_notice.nanum":
         site = "NoticeBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_notice.nanum":
         site = "NoticeBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_notice.nanum":
         site = "NoticeDeleteBoardServlet";
         break;

      case "modify_board_notice.nanum":
         site = "NoticeModifyBoardServlet";
         break;

      case "modify_board_pro_notice.nanum":
         site = "NoticeModifyBoardProServlet";
         break;

      case "add_reply_notice.nanum":
         site = "NoticeAddReplyServlet";
         break;

      case "remove_reply_notice.nanum":
         site = "NoticeRemoveReplyServlet";
         break;

      // 울산
      case "board_list_ulsan.nanum":
         site = "UlsanBoardListServlet";

         break;
      case "board_write_ulsan.nanum":
         site = "UlsanBoardWriteServlet";
         break;

      case "board_write_pro_ulsan.nanum":
         site = "UlsanBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_ulsan.nanum":
         site = "UlsanBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_ulsan.nanum":
         site = "UlsanDeleteBoardServlet";
         break;

      case "modify_board_ulsan.nanum":
         site = "UlsanModifyBoardServlet";
         break;

      case "modify_board_pro_ulsan.nanum":
         site = "UlsanModifyBoardProServlet";
         break;

      case "add_reply_ulsan.nanum":
         site = "UlsanAddReplyServlet";
         break;

      case "remove_reply_ulsan.nanum":
         site = "UlsanRemoveReplyServlet";
         break;

      // 세종
      case "board_list_sejong.nanum":
         site = "SejongBoardListServlet";

         break;
      case "board_write_sejong.nanum":
         site = "SejongBoardWriteServlet";
         break;

      case "board_write_pro_sejong.nanum":
         site = "SejongBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_sejong.nanum":
         site = "SejongBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_sejong.nanum":
         site = "SejongDeleteBoardServlet";
         break;

      case "modify_board_sejong.nanum":
         site = "SejongModifyBoardServlet";
         break;

      case "modify_board_pro_sejong.nanum":
         site = "SejongModifyBoardProServlet";
         break;

      case "add_reply_sejong.nanum":
         site = "SejongAddReplyServlet";
         break;

      case "remove_reply_sejong.nanum":
         site = "SejongRemoveReplyServlet";
         break;

      // 경기도
      case "board_list_gyeonggi.nanum": // 게시판 리스트
         site = "GyeonggiBoardListServlet";

         break;
      case "board_write_gyeonggi.nanum": // board/board_write.jsp
         site = "GyeonggiBoardWriteServlet";
         break;

      case "board_write_pro_gyeonggi.nanum": // board/board_write_pro.jsp
         site = "GyeonggiBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_gyeonggi.nanum": // board/board_detail.jsp
         site = "GyeonggiBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_gyeonggi.nanum": // board/delete_board.jsp
         site = "GyeonggiDeleteBoardServlet";
         break;

      case "modify_board_gyeonggi.nanum": // board/modify_board.jsp
         site = "GyeonggiModifyBoardServlet";
         break;

      case "modify_board_pro_gyeonggi.nanum": // board/modify_board_pro.jsp
         site = "GyeonggiModifyBoardProServlet";
         break;

      case "add_reply_gyeonggi.nanum": // board/add_reply.jsp
         site = "GyeonggiAddReplyServlet";
         break;

      case "remove_reply_gyeonggi.nanum": // board/remove_reply.jsp
         site = "GyeonggiRemoveReplyServlet";
         break;
      // 경상남도

      case "board_list_gyeongnam.nanum": // 게시판 리스트
         site = "GyeongnamBoardListServlet";

         break;
      case "board_write_gyeongnam.nanum": // board/board_write.jsp
         site = "GyeongnamBoardWriteServlet";
         break;

      case "board_write_pro_gyeongnam.nanum": // board/board_write_pro.jsp
         site = "GyeongnamBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_gyeongnam.nanum": // board/board_detail.jsp
         site = "GyeongnamBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_gyeongnam.nanum": // board/delete_board.jsp
         site = "GyeongnamDeleteBoardServlet";
         break;

      case "modify_board_gyeongnam.nanum": // board/modify_board.jsp
         site = "GyeongnamModifyBoardServlet";
         break;

      case "modify_board_pro_gyeongnam.nanum": // board/modify_board_pro.jsp
         site = "GyeongnamModifyBoardProServlet";
         break;

      case "add_reply_gyeongnam.nanum": // board/add_reply.jsp
         site = "GyeongnamAddReplyServlet";
         break;

      case "remove_reply_gyeongnam.nanum": // board/remove_reply.jsp
         site = "GyeongnamRemoveReplyServlet";
         break;

      // 경상북도
      case "board_list_gyeongbuk.nanum":
         site = "GyeongbukBoardListServlet";

         break;
      case "board_write_gyeongbuk.nanum":
         site = "GyeongbukBoardWriteServlet";
         break;

      case "board_write_pro_gyeongbuk.nanum":
         site = "GyeongbukBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_gyeongbuk.nanum":
         site = "GyeongbukBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_gyeongbuk.nanum":
         site = "GyeongbukDeleteBoardServlet";
         break;

      case "modify_board_gyeongbuk.nanum":
         site = "GyeongbukModifyBoardServlet";
         break;

      case "modify_board_pro_gyeongbuk.nanum":
         site = "GyeongbukModifyBoardProServlet";
         break;

      case "add_reply_gyeongbuk.nanum":
         site = "GyeongbukAddReplyServlet";
         break;

      case "remove_reply_gyeongbuk.nanum":
         site = "GyeongbukRemoveReplyServlet";
         break;

      // 충청북도
      case "board_list_chungbuk.nanum":
         site = "ChungBukBoardListServlet";
         break;

      case "board_write_chungbuk.nanum":
         site = "ChungBukBoardWriteServlet";
         break;

      case "board_write_pro_chungbuk.nanum":
         site = "ChungBukBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_chungbuk.nanum":
         site = "ChungBukBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_chungbuk.nanum":
         site = "ChungBukDeleteBoardServlet";
         break;

      case "modify_board_chungbuk.nanum":
         site = "ChungBukModifyBoardServlet";
         break;

      case "modify_board_pro_chungbuk.nanum":
         site = "ChungBukModifyBoardProServlet";
         break;

      case "add_reply_chungbuk.nanum":
         site = "ChungBukAddReplyServlet";
         break;

      case "remove_reply_chungbuk.nanum":
         site = "ChungBukRemoveReplyServlet";
         break;

      // 충청남도
      case "board_list_chungnam.nanum":
         site = "ChungNamBoardListServlet";
         break;

      case "board_write_chungnam.nanum":
         site = "ChungNamBoardWriteServlet";
         break;

      case "board_write_pro_chungnam.nanum":
         site = "ChungNamBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_chungnam.nanum":
         site = "ChungNamBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_chungnam.nanum":
         site = "ChungNamDeleteBoardServlet";
         break;

      case "modify_board_chungnam.nanum":
         site = "ChungNamModifyBoardServlet";
         break;

      case "modify_board_pro_chungnam.nanum":
         site = "ChungNamModifyBoardProServlet";
         break;

      case "add_reply_chungnam.nanum":
         site = "ChungNamAddReplyServlet";
         break;

      case "remove_reply_chungnam.nanum":
         site = "ChungNamRemoveReplyServlet";
         break;

      // 전라북도
      case "board_list_jyeonbuk.nanum":
         site = "JyeonBukBoardListServlet";
         break;

      case "board_write_jyeonbuk.nanum":
         site = "JyeonBukBoardWriteServlet";
         break;

      case "board_write_pro_jyeonbuk.nanum":
         site = "JyeonBukBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_jyeonbuk.nanum":
         site = "JyeonBukBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_jyeonbuk.nanum":
         site = "JyeonBukDeleteBoardServlet";
         break;

      case "modify_board_jyeonbuk.nanum":
         site = "JyeonBukModifyBoardServlet";
         break;

      case "modify_board_pro_jyeonbuk.nanum":
         site = "JyeonBukModifyBoardProServlet";
         break;

      case "add_reply_jyeonbuk.nanum":
         site = "JyeonBukAddReplyServlet";
         break;

      case "remove_reply_jyeonbuk.nanum":
         site = "JyeonBukRemoveReplyServlet";
         break;

      // 전라남도
      case "board_list_jeollanamdo.nanum":
         site = "JeollanamdoBoardListServlet";

         break;
      case "board_write_jeollanamdo.nanum":
         site = "JeollanamdoBoardWriteServlet";
         break;

      case "board_write_pro_jeollanamdo.nanum":
         site = "JeollanamdoBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_jeollanamdo.nanum":
         site = "JeollanamdoBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_jeollanamdo.nanum":
         site = "JeollanamdoDeleteBoardServlet";
         break;

      case "modify_board_jeollanamdo.nanum":
         site = "JeollanamdoModifyBoardServlet";
         break;

      case "modify_board_pro_jeollanamdo.nanum":
         site = "JeollanamdoModifyBoardProServlet";
         break;

      case "add_reply_jeollanamdo.nanum":
         site = "JeollanamdoAddReplyServlet";
         break;

      case "remove_reply_jeollanamdo.nanum":
         site = "JeollanamdoRemoveReplyServlet";
         break;

      // 서울
      case "board_list_seoul.nanum":
         site = "SeoulBoardListServlet";

         break;
      case "board_write_seoul.nanum":
         site = "SeoulBoardWriteServlet";
         break;

      case "board_write_pro_seoul.nanum":
         site = "SeoulBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_seoul.nanum":
         site = "SeoulBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_seoul.nanum":
         site = "SeoulDeleteBoardServlet";
         break;

      case "modify_board_seoul.nanum":
         site = "SeoulModifyBoardServlet";
         break;

      case "modify_board_pro_seoul.nanum":
         site = "SeoulModifyBoardProServlet";
         break;

      case "add_reply_seoul.nanum":
         site = "SeoulAddReplyServlet";
         break;

      case "remove_reply_seoul.nanum":
         site = "SeoulRemoveReplyServlet";
         break;

      // 부산
      case "board_list_busan.nanum":
         site = "BusanBoardListServlet";

         break;
      case "board_write_busan.nanum":
         site = "BusanBoardWriteServlet";
         break;

      case "board_write_pro_busan.nanum":
         site = "BusanBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_busan.nanum":
         site = "BusanBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_busan.nanum":
         site = "BusanDeleteBoardServlet";
         break;

      case "modify_board_busan.nanum":
         site = "BusanModifyBoardServlet";
         break;

      case "modify_board_pro_busan.nanum":
         site = "BusanModifyBoardProServlet";
         break;

      case "add_reply_busan.nanum":
         site = "BusanAddReplyServlet";
         break;

      case "remove_reply_busan.nanum":
         site = "BusanRemoveReplyServlet";
         break;

      // 대구
      case "board_list_daegu.nanum":
         site = "DaeguBoardListServlet";

         break;
      case "board_write_daegu.nanum":
         site = "DaeguBoardWriteServlet";
         break;

      case "board_write_pro_daegu.nanum":
         site = "DaeguBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_daegu.nanum":
         site = "DaeguBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_daegu.nanum":
         site = "DaeguDeleteBoardServlet";
         break;

      case "modify_board_daegu.nanum":
         site = "DaeguModifyBoardServlet";
         break;

      case "modify_board_pro_daegu.nanum":
         site = "DaeguModifyBoardProServlet";
         break;

      case "add_reply_daegu.nanum":
         site = "DaeguAddReplyServlet";
         break;

      case "remove_reply_daegu.nanum":
         site = "DaeguRemoveReplyServlet";
         break;

      // 인천
      case "board_list_incheon.nanum":
         site = "IncheonBoardListServlet";

         break;
      case "board_write_incheon.nanum":
         site = "IncheonBoardWriteServlet";
         break;

      case "board_write_pro_incheon.nanum":
         site = "IncheonBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_incheon.nanum":
         site = "IncheonBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_incheon.nanum":
         site = "IncheonDeleteBoardServlet";
         break;

      case "modify_board_incheon.nanum":
         site = "IncheonModifyBoardServlet";
         break;

      case "modify_board_pro_incheon.nanum":
         site = "IncheonModifyBoardProServlet";
         break;

      case "add_reply_incheon.nanum":
         site = "IncheonAddReplyServlet";
         break;

      case "remove_reply_incheon.nanum":
         site = "IncheonRemoveReplyServlet";
         break;

      // 광주
      case "board_list_gwangju.nanum":
         site = "GwangjuBoardListServlet";

         break;
      case "board_write_gwangju.nanum":
         site = "GwangjuBoardWriteServlet";
         break;

      case "board_write_pro_gwangju.nanum":
         site = "GwangjuBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_gwangju.nanum":
         site = "GwangjuBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_gwangju.nanum":
         site = "GwangjuDeleteBoardServlet";
         break;

      case "modify_board_gwangju.nanum":
         site = "GwangjuModifyBoardServlet";
         break;

      case "modify_board_pro_gwangju.nanum":
         site = "GwangjuModifyBoardProServlet";
         break;

      case "add_reply_gwangju.nanum":
         site = "GwangjuAddReplyServlet";
         break;

      case "remove_reply_gwangju.nanum":
         site = "GwangjuRemoveReplyServlet";
         break;

      // 대전
      case "board_list_daejeon.nanum":
         site = "DaejeonBoardListServlet";

         break;
      case "board_write_daejeon.nanum":
         site = "DaejeonBoardWriteServlet";
         break;

      case "board_write_pro_daejeon.nanum":
         site = "DaejeonBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_daejeon.nanum":
         site = "DaejeonBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_daejeon.nanum":
         site = "DaejeonDeleteBoardServlet";
         break;

      case "modify_board_daejeon.nanum":
         site = "DaejeonModifyBoardServlet";
         break;

      case "modify_board_pro_daejeon.nanum":
         site = "DaejeonModifyBoardProServlet";
         break;

      case "add_reply_daejeon.nanum":
         site = "DaejeonAddReplyServlet";
         break;

      case "remove_reply_daejeon.nanum":
         site = "DaejeonRemoveReplyServlet";
         break;

      // 제주도
      case "board_list_jejuIsland.nanum":
         site = "JejuIslandBoardListServlet";

         break;
      case "board_write_jejuIsland.nanum":
         site = "JejuIslandBoardWriteServlet";
         break;

      case "board_write_pro_jejuIsland.nanum":
         site = "JejuIslandBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_jejuIsland.nanum":
         site = "JejuIslandBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_jejuIsland.nanum":
         site = "JejuIslandDeleteBoardServlet";
         break;

      case "modify_board_jejuIsland.nanum":
         site = "JejuIslandModifyBoardServlet";
         break;

      case "modify_board_pro_jejuIsland.nanum":
         site = "JejuIslandModifyBoardProServlet";
         break;

      case "add_reply_jejuIsland.nanum":
         site = "JejuIslandAddReplyServlet";
         break;

      case "remove_reply_jejuIsland.nanum":
         site = "JejuIslandRemoveReplyServlet";
         break;

      // 강원도
      case "board_list_gangwondo.nanum":
         site = "GangwondoBoardListServlet";

         break;
      case "board_write_gangwondo.nanum":
         site = "GangwondoBoardWriteServlet";
         break;

      case "board_write_pro_gangwondo.nanum":
         site = "GangwondoBoardWriteProServlet";
         System.out.println(site);
         break;

      case "board_detail_gangwondo.nanum":
         site = "GangwondoBoardDetailServlet";
         System.out.println(site);
         break;

      case "delete_board_gangwondo.nanum":
         site = "GangwondoDeleteBoardServlet";
         break;

      case "modify_board_gangwondo.nanum":
         site = "GangwondoModifyBoardServlet";
         break;

      case "modify_board_pro_gangwondo.nanum":
         site = "GangwondoModifyBoardProServlet";
         break;

      case "add_reply_gangwondo.nanum":
         site = "GangwondoAddReplyServlet";
         break;

      case "remove_reply_gangwondo.nanum":
         site = "GangwondoRemoveReplyServlet";
         break;
         
         // 별점 평가
//         case "rating.nanum": 
//            site = "RatingServlet";
//            break;
         case "add_rating.nanum":
            site = "AddRatingServlet";
            break;
         case "rating_list.nanum":
            site = "GetRatingServlet";
            break;
         case "rating_detail.nanum":
            site = "GetRatingDetailServlet";
            break;
         case "board_mylist.nanum":
 			site = "BoardMyListServlet";
 			System.out.println(site);
 			
 			break;
      default:
         response.getWriter().append("error page");
         break;
      }
      // 서버내에서 페이지 이동
      RequestDispatcher dis = request.getRequestDispatcher(site);
      dis.forward(request, response);
   }

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
    *      response)
    */
   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // TODO Auto-generated method stub
      doGet(request, response);
   }

}