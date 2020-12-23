<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/21
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp"%>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<c:url value="/css/base.css"/>">
    <title>个人中心</title>
</head>
<body>
<h3 class="page-title" style="text-align: center">个人中心</h3><br>
<div style="position: relative; width: 600px; height: 150px;">
    <img class="logo" src="<c:url value="/image/touxiang.jpg"/>" alt="..." style="left: 0;top: 10px;width: 108px;height: 108px">
    <span style="position: absolute; top: 0; left: 123px;">用户名：${sessionScope.USER_NAME}</span>
    <span style="position: absolute; top: 30px; left: 123px;">手机号码：${sessionScope.USER_TALE}</span>
    <span style="position: absolute; top: 90px; left: 123px;"></font> 更新账户信息：<a href="/user/changeName">修改用户名</a>&nbsp;&nbsp;<a href="/user/changePhone">更新手机号</a>&nbsp;&nbsp;<a href="/user/changePwd">修改密码</a></span>
</div>

<%--<form class="form-inline" action="attendSearch" method="get">--%>
<%--    <div class="form-group">--%>
<%--        <label for="exampleInputName2">课程名称</label>--%>
<%--        <input name="q" type="text" class="form-control" id="exampleInputName2" placeholder="请输入课程名称">--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-default">查找</button>--%>
<%--</form>>--%>
<br>
<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>参与课程</th>
        <th>学校名称</th>
        <th>专业名称</th>
        <th>课程详情</th>
        <th>取消参与</th>
    </tr>
    </thead>
    <tbody>
    <tr>

        <th scope="row"></th>
        <td></td>
        <td></td>
        <td><a href="#">课程详情 </a></td>
        <form action="#" method="post">
            <td>

                <button class="btn btn-primary btn-block" id="btn" onclick=alert('课程已经取消')>
                    取消参与
                </button>
            </td>
        </form>
    </tr>
    </tbody>
</table>
</body>
</html>
