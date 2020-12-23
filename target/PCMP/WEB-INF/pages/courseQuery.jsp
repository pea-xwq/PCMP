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
        <th>参与课程</th>
    </tr>
    </thead>
    <tbody>
<cc:choose>
    <cc:when test="${sessionScope.USER_SESSION.telephone==null}">
        <div class="alert alert-warning alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span>
            </button>
            <strong>Warning!</strong> 请先登录再参与课程
        </div>
    </cc:when>

</cc:choose>

<cc:forEach var="course" items="${courses}">
    <tr>

        <td name="cname">${course.cName}</td>
        <td name="school">${course.sName}</td>
        <td><a href="${course.cInfo}">课程详情</a></td>
        <cc:choose>
            <cc:when test="${sessionScope.USER_SESSION.telephone==null}">
                <form action="#" method="post">
                    <td>
                        <button class="btn btn-primary btn-block" disabled="disabled" title="参与课程请先登录！">
                            参与课程
                        </button>
                    </td>
                </form>
            </cc:when>
            <cc:otherwise>
                <form action="#" method="post">
                    <td>
                        <button class="btn btn-primary btn-block" id="btn" onclick=alert('参与课程成功，请到个人中心查看')>
                            参与课程
                        </button>
                    </td>
                </form>
            </cc:otherwise>
        </cc:choose>
    </tr>
</cc:forEach>

    </tbody>

</table>
</body>
</html>
