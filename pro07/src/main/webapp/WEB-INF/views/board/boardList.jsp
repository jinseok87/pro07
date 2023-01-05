<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContex.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>게시판 목록</title>
<style type="text/css">
.title {
	text-align: center;
	font-size: 2vw;
}

.table-wrap {
	text-align: center;
	margin: auto;
}

.board-table {
	margin: auto;
	font-size: 2vw;
	margin-top: 4vw;
}
</style>
</head>
<body>

	<h2 class="title">게시판 목록</h2>
	<div class="table-wrap">
		<table class="board-table">
			<thead>
				<tr>
					<th width="80">no</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성일자</th>
					<th>조회수</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${boardList}" var="board">
					<tr>
						<td>${board.no }</td>
						<td>${board.title }</td>
						<td>${board.writer }</td>
						<td><fmt:parseDate value="${board.regdate }" var="regDate" pattrtn="yy-MM-dd HH:mm:ss" /> <fmt:parseDate value="${regDate }" pattern="yyyy-MM-dd" /></td>
						<td>${board.visited }</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>