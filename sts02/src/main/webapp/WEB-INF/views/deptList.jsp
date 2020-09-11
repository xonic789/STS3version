<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/resources/css/bootstrap.min.css" />
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/resources/js/bootstrap.min.js" ></script>
</head>
<body>
<nav class="navbar navbar-default">
	<div class="container-fluid" id="menu">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">
				비트교육센터
			</a>
		</div>
		<ul class="nav navbar-nav">
			<li><a href="${pageContext.request.contextPath }/">HOME</a></li>
			<li><a href="${pageContext.request.contextPath }/emp/list">EMP</a></li>
			<li class="active"><a href="${pageContext.request.contextPath }/dept/list">DEPT</a></li>
			<li><a href="${pageContext.request.contextPath }/login/">LOGIN</a></li>
		</ul>
	</div>
</nav>
<div class="jumbotron">
  <h1 class="display-4">Hello, world!</h1>
  <p>...</p>
  <a class="btn btn-primary btn-lg" href="#" role="button">Learn more</a>
</div>
<div class="container">
	<div class="row" id="header">
		<div class="col-md-12">
			<h1>DEPT LIST <small>DEPT TABLE</small></h1>
		</div>
	</div>
	<div class="row" id="context">
		<div class="col-md-12">
			<table class="table">
			<thead>
				<tr>
					<th>deptno</th>
					<th>dname</th>
					<th>loc</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${list }" var="bean">
				<tr>
					<td><a href="#">${bean.deptno }</a></td>
					<td><a href="#">${bean.dname }</a></td>
					<td><a href="#">${bean.loc }</a></td>
				</tr>
			</c:forEach>
			</tbody>
			</table>
		</div>
	</div>
	<div class="row" id="footer">
		<div class="col-md-12">
			<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
			Copyright &copy; 비트캠프 All right reserved.
		</div>
	</div>
</div>
</body>
</html>