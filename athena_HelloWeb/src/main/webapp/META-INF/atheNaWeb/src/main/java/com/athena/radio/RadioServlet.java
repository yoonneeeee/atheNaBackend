package com.athena.radio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioServlet
 */
@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RadioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String gender = request.getParameter("gender");
	String mail = request.getParameter("mail-check");
	// 한글을 쓰려면 아래의 코딩을 추가해줘야함.
	response.setContentType("text/html;charset=utf-8");
	PrintWriter out = response.getWriter();
	out.println("<h1>선택 정보</h1>");
	out.println("<h2> 셩별 : "+gender+"</h2>");
	out.println("<h2> 메일 수신 여부 : "+mail+"</h2>");
	
	out.println("<html><head><title>라디오 체크 결과</title>");
	out.println("</head><body>");
	out.println("<h1>라디오 체크 결과</h1>");
	out.println("성별 : "+gender+"<br>");
	out.println("메일 수신여부 : "+mail+"<br>");
	out.println("</body></html>");
	}
}
