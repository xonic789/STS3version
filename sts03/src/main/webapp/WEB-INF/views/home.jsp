<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/bootstrap.css"/>
	<style type="text/css">
		.item > img{
			margin: 0px auto;
		}
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
        <li class="active"><a href="${pageContext.request.contextPath }">HOME <span class="sr-only">(current)</span></a></li>
        <li><a href="${pageContext.request.contextPath}/login">LOGIN</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">TABLE <span class="caret"></span></a>
          <ul class="dropdown-menu">
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
		<div class="col-md-12"></div>
	</div>
	<div class="row" id="content">
		<div class="col-md-12">
		<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
		  <!-- Indicators -->
		  <ol class="carousel-indicators">
		    <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="1"></li>
		    <li data-target="#carousel-example-generic" data-slide-to="2"></li>
		  </ol>
		
		  <!-- Wrapper for slides -->
		  <div class="carousel-inner" role="listbox">
		    <div class="item active">
		      <img src="resources/imgs/bigmeet1.jpg" alt="...">
		      <div class="carousel-caption">
		        <h3>한우소고기</h3>
		        <p>한우다</p>
		      </div>
		    </div>
		    <div class="item">
		      <img src="resources/imgs/bigmeet2.jpg" alt="...">
		      <div class="carousel-caption">
		        <h3>미국프라임</h3>
		        <p>그래도 꽤 높은 등급^^</p>
		      </div>
		    </div>
		    <div class="item">
		      <img src="resources/imgs/bigmeet3.jpg" alt="...">
		      <div class="carousel-caption">
		       <h3>와규</h3>
		       <p>와규 ㅈㄴ맛있어</p>
		      </div>
		    </div>
		    <div class="item">
		      <img src="resources/imgs/bigmeet4.jpg" alt="...">
		      <div class="carousel-caption">
		        <h3>소고기</h3>
		        <p>소고기는 항상 옳쥬?</p>
		      </div>
		    </div>
		  </div>
		
		  <!-- Controls -->
		  <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
		    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
		    <span class="sr-only">Previous</span>
		  </a>
		  <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
		    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
		    <span class="sr-only">Next</span>
		  </a>
		</div>
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
