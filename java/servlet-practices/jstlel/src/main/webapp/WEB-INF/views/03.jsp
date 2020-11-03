<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int count1 = 1;
	pageContext.setAttribute("count2",10);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>JSTL(forEach) Tag</h1>
	길이 : ${fn:length(list)}
	<c:set var='listCount' value='${fn:length(list)}'/> <!--페이지 컨텍스트에 저장  -->
	<ul>
		<c:forEach items="${list}" var="vo" varStatus="status">
			<li>[${listCount-status.index}][${status.index}:${status.count}][no:${vo.no}:${vo.name}]</li>
		</c:forEach>
	</ul>
	<c:set var='count3' value='3'/> <!-- pagecontext에 var라는 이름으로 value를 저장-->
	======${count1 }=======<br>
	======${count2 }=======<br>
	======${count3 }=======<br>
	

</body>
</html>