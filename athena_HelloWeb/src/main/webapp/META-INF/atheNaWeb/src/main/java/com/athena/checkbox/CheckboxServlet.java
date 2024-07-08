package com.athena.checkbox;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
@WebServlet("/CheckboxServlet")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckboxServlet() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 하나의 값만 받을 수 있는 것
//		String place = request.getParameter("place");
// 여러개를 받으려면 배열로 해서 받아야 함.
		String [] places = request.getParameterValues("place");
		String str = "";
		for(String place : places)
			str += place + ", ";
//			System.out.println(place);
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>관광지 선택 결과</h1>");
		out.println("<h2>"+str+"</h2>");
//		response.sendRedirect("/checkbox/checkResult.html");
	}

}
