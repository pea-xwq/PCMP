<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/14
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>登录注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.8.2/css/all.min.css'>

    <link rel='stylesheet' href='https://ajax.aspnetcdn.com/ajax/bootstrap/4.2.1/css/bootstrap.min.css'>

    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">

</head>
<body>
<div class="container">
    <div class="card-wrap">
        <div class="card border-0 shadow card--welcome is-show" id="welcome">
            <div class="card-body">
                <h2 class="card-title">欢迎光临</h2>
                <p>欢迎进入登录页面</p>
                <div class="btn-wrap"><a class="btn btn-lg btn-register js-btn" data-target="register">注册</a><a class="btn btn-lg btn-login js-btn" data-target="login">登录</a></div>
            </div>
        </div>
        <div class="card border-0 shadow card--register" id="register">
            <div class="card-body">
                <h2 class="card-title">会员注册</h2>
                <p class="card-text">第三方注册</p>
                <p class="badge-wrap"><a class="badge"><i class="fab fa-facebook-f"></i></a><a class="badge"><i class="fab fa-google"></i></a><a class="badge"><i class="fab fa-twitter"></i></a><a class="badge"><i class="fab fa-github"></i></a></p>
                <p>使用您的手机号进行注册</p>
                <form action="/register/registerTest" method="post">
                    <div class="form-group">
                        <input class="form-control" type="text" placeholder="名称" name="userName" required="required" />
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="text" placeholder="手机号码" name="telephone" required="required" />
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="password" placeholder="密码" name="password" required="required" />
                    </div>
                    <button class="btn btn-lg" type="submit">注册</button>
                </form>
            </div>
            <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
        </div>
        <div class="card border-0 shadow card--login" id="login">
            <div class="card-body">
                <h2 class="card-title">欢迎登录！</h2>
                <p>第三方登录</p>
                <p class="badge-wrap"><a class="badge"><i class="fab fa-facebook-f"></i></a><a class="badge"><i class="fab fa-google"></i></a><a class="badge"><i class="fab fa-twitter"></i></a><a class="badge"><i class="fab fa-github"></i></a></p>
                <p>手机号码登录</p>
                <form action="/register/loginTest" method="post">
                    <div class="form-group">
                        <input class="form-control" type="text" placeholder="手机号码" value="前11位为有效位" required="required" name="loginTelephone"/>
                    </div>
                    <div class="form-group">
                        <input class="form-control" type="password" placeholder="密码" name="loginPassword" required="required" />
                    </div>
                    <p><a href="#">忘记密码?</a></p>
                    <button class="btn btn-lg" type="submit">登录</button>

                </form>
            </div>
            <button class="btn btn-back js-btn" data-target="welcome"><i class="fas fa-angle-left"></i></button>
        </div>
    </div>
</div>
<script type="text/javascript" src="<c:url value="/js/index.js"/>"></script>
</body>
</html>
