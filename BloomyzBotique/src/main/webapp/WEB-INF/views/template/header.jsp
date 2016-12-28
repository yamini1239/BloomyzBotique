<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">

    <title>BLOOMYZBOTIQUE</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <!-- Carousel CSS -->
    <link href="<c:url value="/resources/css/carousel.css" />" rel="stylesheet">

    <!-- Main CSS -->
    <link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">

   
</head>
<!-- NAVBAR
================================================== -->
<body>
<nav class="navbar navbar-inverse w3-blue">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BLOOMYZBOTIQUE</a>
    </div>
    <ul class="nav navbar-nav ">
      <li><a class="w3-hover-purple" href="<c:url value="/" /> ">Home</a></li>
       <li><a class="w3-hover-red" href="<c:url value="/product/productList/all" />">Products</a></li>
       <li><a class="w3-hover-green" href="<c:url value="/about" />">About Us</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right ">
     <c:if test="${pageContext.request.userPrincipal.name != null}">
       <li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
        <li><a href="<c:url value="/j_spring_security_logout" />">Logout</a></li>
                            <c:if  test="${pageContext.request.userPrincipal.name  == 'admin'}">
                                <li><a href="<c:url value="/admin" />">Admin</a></li>
                            </c:if>
                        </c:if>
                        <c:if test="${pageContext.request.userPrincipal.name  == null}">
                        <li><a class="w3-hover-pink" href="<c:url value="/login/" />">Login</a></li>
                        <li><a class="w3-hover-orange" href="<c:url value="/register" />">Sign-Up</a></li>
                        </c:if>
    </ul>
  </div>
</nav>
  

</body>
