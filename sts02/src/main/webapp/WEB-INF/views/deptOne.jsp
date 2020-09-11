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
  <h1>입력 페이지!</h1>
</div>
<div class="container">
	<div class="row" id="header">
		<div class="col-md-12">
			<div class="page-header">
				<h1>DEPT ADD <small>DEPT TABLE</small></h1>
			</div>
		</div>
	</div>
	<div class="row" id="context">
		<div class="col-md-12">
			<form class="form-horizontal" method="post">
			  <div class="form-group">
			    <label for="deptno" class="col-sm-2 control-label">deptno</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="deptno" id="deptno" value="${bean.deptno }" } readonly>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="dname" class="col-sm-2 control-label">dname</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="dname" id="dname" value="${bean.dname } " readonly>
			    </div>
			  </div>
			  <div class="form-group">
			    <label for="loc" class="col-sm-2 control-label">loc</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" name="loc" id="loc" value="${bean.loc }" readonly>
			    </div>
			  </div>
			  
			  <div class="form-group">
			    <div class="col-sm-offset-2 col-sm-10">
			      <button type="submit" class="btn btn-default">수 정</button>
			    </div>
			  </div>
			</form>
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