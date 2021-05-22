<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/5/19
  Time: 21:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<%@ include file="base.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>

    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/css/background.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<body>
<br><br><br><br><br><br>
<h3 class="page-title">登录</h3><br>
<br><br>
<form action="/registerController/login" method="post">
    <div class="form-container">
        <div class="form-group">
            <input name="telephone" type="text" class="form-control" placeholder="请输入手机号" required="required">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" placeholder="密码" name="password" required="required">
        </div>
        <ul class="list-inline">
            <li><a href="/registerController/forgetPwd">找回密码</a></li>
            <li><a href="/registerController/loginToRegister">注册新用户</a></li>
        </ul>
        <div class="form-group">
            <button id="login_btn" class="btn btn-primary btn-block" type="submit" value="登录">登录</button>
        </div>
    </div>
</form>
</body>
</html>
