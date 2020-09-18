<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="utf-8" %>
<html>

<head>
	<title>Home</title>
<meta charset="utf-8">
<%@ include file="template/head.jspf" %>
</head>
<body>
<%@ include file="template/header.jspf" %>
<div class="jumbotron">
<h1>Hello world!</h1>
<P>  The time on the server is ${serverTime}. </P>

</div>

<%@ include file="template/footer.jspf" %>
</body>
</html>
