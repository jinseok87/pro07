<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<c:set var="path1" value="${pageContex.request.ContextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>게시판 상세보기</title>
</head>
<body>
 	<h2>공지사항</h2>
 	<div class="table">
 	<table>
 		<tr>
 			<th>글번호</th>
 			<td>${dto.no }</td>
 		</tr>
 		<tr>
 			<th>제목</th>
 			<td>${dto.title }</td>
 		</tr>
 		<tr>
 			<th>내용</th>
 			<td>${dto.content }</td>
 		</tr>
 		<tr>
 			<th>작성자</th>
 			<td>${dto.writer }</td>
 		</tr>
 		<tr>
 			<th>등록일</th>
 			<td>
 				<fmt:parseDate value="${dto.regdate }" var="boardDate" pattern="yyyy-MM-dd HH:mm:ss"/>
 				<fmt:formatDate value="${boardDate }" pattern="yy-MM-dd"/>
 			</td>
 		</tr>
 	</table>
 	</div>
</body>
</html>