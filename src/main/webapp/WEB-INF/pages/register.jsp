<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/5/19
  Time: 21:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<%@ include file="base.jsp"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册</title>

    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/css/background.css"/>">
    <link rel="stylesheet" href="<c:url value="/css/login.css"/>">
</head>
<body>
<br><br><br>
<h3 class="page-title">注册</h3><br>
<br><br>
<form  method="post" action="${pageContext.request.contextPath}/registerController/register">
    <div class="form-container">
        <div class="form-group">
            <input name="telephone" class="form-control" type="text" placeholder="手机号码" required="required" />
        </div>
        <div class="form-group">
            <input name="email" class="form-control" type="email" placeholder="邮箱" required="required" />
        </div>
        <div class="form-group">
            <input name="username" class="form-control" type="text" placeholder="名称" required="required" />
        </div>
        <div class="form-group">
            <input name="password" class="form-control" type="password" placeholder="密码" required="required" />
            <p class="message">6~16位字符（数字、字母、下划线），区分大小写</p>
        </div>

        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block"> 立即注册</button>
        </div>
    </div>
</form>
</body>
</html>