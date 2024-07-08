<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<h1>마이페이지</h1>
	<fieldset>
	<legend><b>[회원정보]</b></legend>
		<form action="/member/update.do" method="post">
			<input type="hidden" name="memberId" value="${member.memberId }">
			아이디 : <span>${member.memberId }</span><br> 
			이름 : <span>${member.memberName }</span><br>
			성별 : <span>${member.gender }</span><br> 
			나이 : <span>${member.age }</span><br>
			이메일 : <input type="text" name="email" 	value="${member.email }"><br>
			전화번호 : <input type="text" name="phone" 	value="${member.phone }"><br>
			주소 : <input type="text" name="address" 	value="${member.address }"><br>
			취미 : <input type="text" name="hobby" 		value="${member.hobby }"><br>
			가입일자 : <span>${member.regDate }</span><br><br>
			<input type="submit" value="수정하기">
		</form>
	</fieldset>
</body>
</html>