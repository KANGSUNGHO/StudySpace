<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>값 받아보기 </h1>
	${iVal  } <br>
	${lVal  } <br>
	${fVal  } <br>
	${bVal  } <br>
	${sVal  } <br>
	---${obj }--<br>
	${userVo.no } <br>
	${userVo.name} <br>
	
	<h1>map로 값 받아오기</h1>
	${map.i }<br>
	${map.s }<br>
	${map.l }<br>
	
	<h1>산술 연산</h1>
	${3 + 10 * 20 } <br>
	${iVal+ 20 }<br>
	
	<h1>관계 연산</h1>
	${iVal == 10 } <br>
	${iVal < 5 } <br>
	${object == null } <br><!-- null 보다는 empty나 not empty를 써주는 것이 좋 -->
	${empty obj } <br>
	${vo != null} <br>
	${not empty vo }
	
	<h1>논리 연산</h1>
	${iVal + 10 == 10 || lVal < 123456789 } <br>
	${iVal + 10 == 12 && lVal < 123456789 } <br>
	
	<h1>요청 파라미터</h1>
	<%-- <%= request.getParameter("a") %> --%>
	${param.a}<br>
	${param.email}<br>
	
	
</body>
</html>