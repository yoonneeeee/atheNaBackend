package com.athena.calculator;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalculatorServlet() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("num1");
		String operator = request.getParameter("operator");
		String num2 = request.getParameter("num2");
		int result = 0;
//		int num1 = Integer.parseInt(num1);
//		int num2 = Integer.parseInt(num2);
//		미리 선언해주면 아래 케이스문에 각각 형변환 안해줘도 됨..
//		단, 변수명을 바꿔줘야 함....
//		response.setContentType("text/html;charset=utf-8");
//		PrintWriter out = response.getWriter();
		
		switch(operator) {
		case "+" :
			result = Integer.parseInt(num1) + Integer.parseInt(num2);
			break;
		case "-" :
			result = Integer.parseInt(num1) - Integer.parseInt(num2);
			break;
		case "*" :
			result = Integer.parseInt(num1) * Integer.parseInt(num2);
			break;
		case "/" :
			result = Integer.parseInt(num1) / Integer.parseInt(num2);
			break;
		case "%" :
			result = Integer.parseInt(num1) % Integer.parseInt(num2);
			break;
		}
		request.setAttribute("num1", num1);
		request.setAttribute("num2", num2);
		request.setAttribute("operator", operator);
		request.setAttribute("result", result);
		request.getRequestDispatcher("/calculator/resultCalc.jsp").forward(request, response);
	}
}
