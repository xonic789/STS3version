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
	<h1>dept list page</h1>
	<div>
		<c:forEach items="${list }" var="bean">
		<div>
			<span>${bean.deptno }</span>
			<span>${bean.dname }</span>
			<span>${bean.loc }</span>
		</div>
		</c:forEach>
	</div>
</body>
</html>