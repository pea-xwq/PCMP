<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/13
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>-大学公共课程共享资源管理平台</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://cdn.bootcdn.net/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/base.css">

</head>

<body>
<nav class="navbar navbar-default">
    <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">
                <img class="logo" src="image/pika.jpg" alt="...">
            </a>

        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="/class/home">首页 <span class="sr-only">(current)</span></a></li>
                <li><a href="/class/recommend">课程</a></li>
                <li><a href="/class/comment">树洞</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true"
                       aria-expanded="false">检索方式 <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/class/schoolQuery">按学校专业查询</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="/class/catQuery">按专业大类查询</a></li>
                                           <li role="separator" class="divider"></li>

                    </ul>
                </li>
            </ul>
            <form class="navbar-form navbar-left" action="${pageContext.request.contextPath}/class/courseQueryResult" method="get">
                <div class="form-group">
                    <input name="q" type="text" class="form-control" placeholder="请输入关键字">
                </div>
                <button type="submit" class="btn btn-default">查找</button>
            </form>

            <ul class="nav navbar-nav navbar-right" id="show">
                <li><a href="/class/user">你好</a></li>
                <li><a href="/registerController/registerAndLogin">登录</a></li>
                <li></li>
            </ul>
            <!-- <button id="hide"  style="margin-right:10px;margin-top:10px">退出登录</button>-->
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="main">

    <a href="/registerController/registerAndLogin"><img src="image/Home.jpg" alt="..." ><br></a>

</div>
<script src="./try.js"></script>
</body>
</html>
