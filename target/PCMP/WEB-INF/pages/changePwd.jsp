<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/21
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改密码</title>
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
<h3 class="page-title">修改密码</h3><br>
<form action="/registerController/userCenter" method="post">
    <div class="form-container">
        <div class="form-group">
            <input type="password" class="form-control ipt" placeholder="新密码" name="password">
            <p class="message">6~16位字符（数字、字母、下划线），区分大小写</p>
            <input type="password" class="form-control" placeholder="确认新密码" name="password2">
        </div>

        <div>
            <button class="btn btn-primary btn-block">确认密码</button>
        </div>
    </div>
</form>
</body>
</html>
