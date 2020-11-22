<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/18
  Time: 14:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="base.jsp"%>
<html>
<head>
    <title>按课程查询</title>
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<h3 class="page-title" style="text-align: center">课程名字查询</h3>

<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>课程名称</th>
        <th>开课大学</th>
        <th>课程详情</th>
        <th>查看评论</th>
        <th>参与课程</th>
    </tr>
    </thead>
    <tbody>

    <div class="alert alert-warning alert-dismissible" role="alert">
        <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span>
        </button>
        <strong>Warning!</strong> 请先登录再参与课程
    </div>

    <tr>
        <th scope="row"></th>
        <td></td>
        <td><a href="#">课程详情</a></td>
        <td><a href="#">评论</a></td>
        <form action="" method="post">
            <td>
                <input type="button" class="btn btn-primary btn-block" value="参与课程" onclick=alert('已加入参与课程，请到个人中心查看！')>
            </td>
        </form>

    </tr>
    </tbody>

</table>
</body>
</html>
