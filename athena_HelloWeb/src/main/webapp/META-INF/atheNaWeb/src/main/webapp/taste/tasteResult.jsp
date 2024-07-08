<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
<% 
	String userName =(String)request.getAttribute("userName");
	String color =(String)request.getAttribute("color");
	String pet =(String)request.getAttribute("pet");
	String food =(String)request.getAttribute("str");
%>
     --%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>개인취향테스트 결과</title>
	</head>
	<body>
		<h1>개인 취향 테스트 결과</h1>
		<p>
		<!--requestScope + 마침표 표기법으로 String userName =(String)request.getAttribute("userName"); 라는 코드 대체  -->
			이름? ${ requestScope.userName } <br>
			좋아하는 색? <span style="color:black;"><b>${color }</b></span><br>
			좋아하는 동물은? ${pet }<br>
			좋아하는 음식은? ${str }<br>
		</p>
	</body>
</html>

