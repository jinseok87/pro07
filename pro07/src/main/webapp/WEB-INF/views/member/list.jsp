<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원목록</title>
</head>
<body>
	<dl>
		<dt>회원목록</dt>
		<c:forEach items="${ memberList}" var="member">
		<dd><a href="./detail?id=${member.id}"> ${member.id }</a></dd>
		<dd>${member.name }</dd>
		<dd>${member.address }</dd>
		<dd>
			<fmt:parseDate value="${member.regdate }" var="memberdate" pattern="yyyy-MM-dd HH:mm"/>
			<fmt:formatDate value="${memberdate }" pattern="yy-MM-dd"/>
		
		</dd>
		</c:forEach>
		<dd></dd>
	</dl>
</body>
</html>