<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContex.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원정보수정</title>
</head>
<body>
	<h2>회원정보수정</h2>
	<form action="${path1 }/member/edit" method="post" onsubmit="return updateCheck(this)">
				<div class="table_form_wrap">
					<table class="table_form">
						<tbody>
							<tr>
								<th><label for="userid">아이디</label></th>
								<td><input type="text" name="id" id="id" size="100" class="single100" value="${dto.id }" readonly required>
								</td>
							</tr>				
							<tr>
								<th><label for="userpw">비밀번호</label></th>
								<td><input type="password" name="pw" id="pw"  class="single100" value="${dto.pw }" required>
									<p>(최소 8자리에서 최대 16자리까지, 숫자, 영문 대소문자, 특수문자가 각 1 문자 이상 포함되어야 함)</p>
								</td>
							</tr>
							<tr>
								<th><label for="userpw2">비밀번호 확인</label></th>
								<td><input type="password" name="pw2" id="pw2"  class="single100" value="${dto.pw }" required></td>
							</tr>
							<tr>
								<th><label for="username">이름</label></th>
								<td><input type="text" name="name" id="name" class="single100"  value="${dto.name }" required></td>
							</tr>
							<tr>
								<th><label for="email">이메일</label></th>
								<td><input type="email" name="email" id="email" class="single100" value="${dto.email }" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" required></td>
							</tr>
							<tr>
								<th><label for="tel">전화번호</label></th>
								<td><input type="tel" name="tel" id="tel" class="single100"  value="${dto.tel }" pattern="[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}" required></td>
							</tr>
							<tr>
								<th><label for="address" onclick="findAddr()">주소</label></th>
								<td>
									<input type="text" name="address" id="address" class="single100" value="${dto.address }"><br>
								</td>
							</tr>
							<tr>
								<td colspan="2">
									<input type="submit" class="button btn-writer" value="회원정보수정">
									<input type="reset" class="button btn-primary" value="취소">
								</td>
							</tr>	
						</tbody>
					</table>
				</div>
				</form>

</body>
</html>