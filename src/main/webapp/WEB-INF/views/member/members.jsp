<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Members.jsp</h1>
	size : ${list.size() }
	<table border="1">
		<tr>
			<td>id</td> <td>password</td> <td>name</td>
		</tr>
		<c:choose>
			<c:when test="${list.size()==0 }">
				<tr>
					<th colspan="3">데이터 없음</th>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach var="i" items="${list }">
					<tr>
						<td>${i.id }</td><td>${i.pwd }</td><td>${i.name }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
		<tr>
			<td colspan="3"><a href="index">index</a></td>
		</tr>
	</table>
</body>
</html>