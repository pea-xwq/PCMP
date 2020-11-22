<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/21
  Time: 12:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改用户名</title>
    <link rel="stylesheet" href="<c:url value="/css/change.css"/>">
    <style>
        body{
            background-image:url("../../image/pika.jpg");
            background-repeat: no-repeat;
            background-position: center;
        }</style>
</head>
<body>
<br><br><br><br><br>
<h3 class="page-title">修改用户名</h3><br>
<form action="/user/updateName" method="post">
    <div class="form-container">
        <div class="form-group">
            <input type="text" class="form-control" placeholder="请输入新的用户名" name="username">
        </div>

        <div>
            <button class="btn btn-primary btn-block">确认修改用户名</button>
        </div>
    </div>
</form>
</body>
</html>
