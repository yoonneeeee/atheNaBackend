package com.athena.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.athena.member.model.service.MemberService;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/member/remove.do")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 회원탈퇴 기능을 실현하려면
		// 1. 제일먼저 쿼리문을 어떻게 작성할 지 생각해보기
		//		 DELETE FROM MEMBER_TBL WHERE MEMBER_ID = '로그인한 ID';
		// 쿼리 스트링의 
		String memberId = request.getParameter("memberId");
		MemberService mService = new MemberService();
		int result = mService.deleteMember(memberId);
		if(result>0) {
			// 로그아웃 후 메인으로 이동
			// 1. 세선을 가져온 후 
//			HttpSession session = request.getSession();
			// 2. 세션을 파괴하고
//			if(session != null) session.invalidate();
			// 3. 메인으로 이동하기
			response.sendRedirect("/member/logout.do");
		}else {
			request.setAttribute("msg", "회원탈퇴가 완료되지 않았습니다. ");
			// 실패시 에러페이지로 이동			
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/common/error/errorPage.jsp");
			view.forward(request, response);
		}
	}
}
