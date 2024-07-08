<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원가입</title>
	</head>
	<body>
	<!-- http://127.0.0.1/member/join.do -->
		<h1>회원가입</h1>
		<h3>회원정보를 입력하세요</h3>
		<fieldset>
			<legend>회원가입</legend>
			<form action="/member/join.do" method="post">
				아이디 : <input type = "text" name = "member-id"><br> 
				비밀번호 : <input type = "password" name = "member-pw"><br>
				이름 : <input type = "text" name = "member-name"><br>
				성별 : 
					남자 <input type = "radio" name = "gender" value = "M">
					여자 <input type = "radio" name = "gender" value = "F"> <br>
				나이 : <input type = "number" name = "age"><br>
				이메일 : <input type = "text" name = "email"><br>
				전화번호 : <input type = "text" name = "phone"><br>
				주소 : <input type = "text" name = "address"><br>
				취미 : <input type = "text" name = "hobby"><br>
				<input type = "submit" value = "회원가입">
			</form>
		</fieldset>
	</body>
</html>

<!-- 
[get]
<form action="/member/join.do" method="get"></form> 추가하는 이유?
	1. action="/member/join.do"
		사용자가 폼에 입력한 데이터를 처리할 서버의 URL을 지정합니다. 
		이 경우, /member/join.do URL로 데이터를 전송합니다. 
	2. method="get"
		폼 데이터를 서버로 전송할 때 GET 메서드를 사용하도록 지정합니다. 
		GET 메서드는 데이터를 URL의 쿼리 문자열로 전송합니다.
	=> 해당 코드 안에 입력받을 코드를 넣어줘야 서버로 전달 할 수 있다. 
	=> 사용자가 회원가입 폼을 작성하고 제출하면, 
		입력한 데이터가 /member/join.do URL로 GET 메서드를 통해 전송됩니다.
	=> 쿼리 스트링이 보이는 방식
[post]로 변경, 
	=> 이유 : 회원가입과 같은 중요한 정보(비밀번호, 개인 정보 등)를 처리할 때는 
			보안과 데이터의 무결성을 위해 POST 메서드를 사용하는 것이 더 적절합니다.
	1. 보안 : 보안: GET 메서드는 데이터를 URL에 쿼리 문자열로 포함하여 전송합니다. 
			이 경우, 사용자가 입력한 정보(아이디, 비밀번호 등)가 URL에 그대로 노출되어 보안에 취약합니다. 
			POST 메서드는 데이터를 HTTP 요청의 본문(body)에 포함하여 전송하므로, 
			상대적으로 더 안전합니다.
	2. 데이터 길이 제한
	3. 캐싱 문제 
	-->