<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/18
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp"%>
<html>
<head>
    <title>按专业查询</title>
</head>
<link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<body>
<h3 class="page-title" style="text-align: center">专业大类查询</h3><br>
<form class="form-inline" action="" method="get">

    <div class="form-group">
        <label for="exampleInputName2">专业大类</label>
        <input name="q" type="text" class="form-control" id="exampleInputName2" placeholder="请输入专业名称">
    </div>
    <button type="submit" class="btn btn-default">查找</button>
</form><br>

<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>专业大类</th>
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
        <td></td>
        <td><a href="#">课程详情</a></td>
        <td><a href="#">评论(</a></td>

        <form action="#" method="post">
            <td>
                <button class="btn btn-primary btn-block" id="btn" onclick=alert('已加入参与课程，请到个人中心查看！')>
                    参与课程
                </button>
            </td>
        </form>



    </tr>
    </tbody>
</table>
</body>
</html>
