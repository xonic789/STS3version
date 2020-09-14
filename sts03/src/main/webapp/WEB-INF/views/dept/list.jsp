<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/bootstrap.css"/>
	<style type="text/css">
	</style>
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/jquery-1.12.4.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath }/resources/js/bootstrap.js"></script>
	<script type="text/javascript">
		
	</script>
</head>
<body>
	<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${pageContext.request.contextPath}/">비트교육센터</a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li class=""><a href="${pageContext.request.contextPath }">HOME <span class="sr-only">(current)</span></a></li>
        <li><a href="${pageContext.request.contextPath}/login">LOGIN</a></li>
        <li class="dropdown active">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">TABLE <span class="caret"></span></a>
          <ul class="dropdown-menu active">
            <li><a href="${pageContext.request.contextPath}/dept/">DEPT LIST</a></li>
            <li role="separator" class="divider"></li>
            <li><a href="${pageContext.request.contextPath}/emp/">EMP LIST</a></li>
          </ul>
        </li>
      </ul>
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
<div class="container">
	<div class="row" id="header">
		<div class="col-md-12">
			<div class="list-group">
			  <a href="#" class="list-group-item active">
			  	<span class="badge">deptno</span>
			    <h4 class="list-group-item-heading">dname</h4>
			    <p class="list-group-item-text">loc</p>
			  </a>
			  <c:forEach items="${list }" var="bean">
			  <a href="#" class="list-group-item">
			  	<span class="badge">${bean.deptno }</span>
			    <h4 class="list-group-item-heading">${bean.dname }</h4>
			    <p class="list-group-item-text">${bean.loc }</p>
			  </a>
			  </c:forEach>
			  
			</div>
		</div>
	</div>
	<div class="row" id="content">
		<div class="col-md-12">
		
		</div>
	</div>
	<div class="row" id="footer">
		<div class="col-md-12">
			<address>비트캠프 서울시 서초구 강남대로 459 (서초동, 백암빌딩)</address>
			Copyright (c) 비트캠프 All rights reserved.
			
		</div>
	</div>
</div>
</body>
</html>
