package com.athena.taste;

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
 * Servlet implementation class TasteServlet
 */
@WebServlet("/TasteServlet")
public class TasteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TasteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName = request.getParameter("user-name");
		String color = request.getParameter("color");
		String pet = request.getParameter("pet");
		String [] foods = request.getParameterValues("foods");
	
//	response.setContentType("text/html;charset=utf-8");
//	PrintWriter out = response.getWriter();

	Map<String, String> colorMap = new HashMap<String, String>();
	colorMap.put("red", "빨강");
	colorMap.put("blue", "파랑");
	colorMap.put("yellow", "노랑");
	colorMap.put("green", "초록");
	
	Map<String, String> petMap = new HashMap<String, String>();
	petMap.put("puppy", "강아지");
	petMap.put("kitty", "고양이");
	petMap.put("elephant", "코끼리");
	petMap.put("lion", "사자");
	
	Map<String, String> foodMap = new HashMap<String, String>();
	foodMap.put("jjm", "짜장면");
	foodMap.put("jb", "짬뽕");
	foodMap.put("tsy", "탕수육");
	foodMap.put("mpdb", "마파두부");
	foodMap.put("pbc", "팔보채");
	
	String str = "";
	for(String food : foods) {
		str+=foodMap.get(food) +" ";
		}
	request.setAttribute("userName", userName);
	request.setAttribute("color", colorMap.get(color));
	request.setAttribute("pet", petMap.get(pet));
	request.setAttribute("str", str);
	request.getRequestDispatcher("/taste/tasteResult.jsp").forward(request, response);
	
	}
	
}
	
	
//	out.println("<html><head><title>개인 취향 테스트</title>");
//	out.println("</heade><body>");
//	out.println("<h1>개인 취향 테스트 결과</h1>");
//	out.println("<p>이름 : "+ userName +"</p>");
//	out.println("좋아하는 색 ? <span style='color:"+color+";'><b>"+colorMap.get(color)+"</b></span><br>");
//	out.println("좋아하는 동물은 ? "+petMap.get(pet)+"<br>");
//	out.println("좋아하는 음식은? ? "+str);
//	out.println("</p>");
//	out.println("</body></html>");

// if문을 사용해서 한글로 출력되도록 수정
//	if("red".equals(color)) {
//		color = "<span style = 'color:red;'>빨강</span>";
//	}else if("blue".equals(color)) {
//		color = "<span style = 'color:blue;'>파랑</span>";
//	}else if("yello".equals(color)) {
//		color = "<span style = 'color:yellow;'>노랑</span>";
//	}else if("green".equals(color)) {
//		color = "<span style = 'color:green;'>초록</span>";
//	}
// Map을 이용해 출력	