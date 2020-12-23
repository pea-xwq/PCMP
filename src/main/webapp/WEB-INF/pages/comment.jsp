<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/12/19
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="base.jsp"%>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="<c:url value="/css/comment.css"/>">
    <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<a name="head"></a>
<h3 class="page-title">树洞</h3>
<br>
<ul>

    <a href="#end"><img src="../../image/comment.png" alt="..." align="right" width="500px" height="390px"><br></a>
    <cc:forEach var="comment" items="${comments}">

        <div class="comment-container">
            <div class="comment-group">
                <p class="comment-user_name">${comment.uname}:</p>
                <p class="comment-content">${comment.content}</p>
            </div>
            <div class="comment-info">
                <span class="comment-datatime">${comment.time}
                </span>
            </div>

        </div>
        <hr style="background-color: white;height: 4px" >
    </cc:forEach>

    <br>

</ul>

<br>
<nav style="text-align: center"> </nav>
<h4 class="page-title">发表你的评论</h4>
<a name="end"></a>
<br>
<span>

    </span>

<form action="/class/commentCommit" method="post">
    <div class="form-container">
        <div class="form-content">
            <textarea name="content" rows="5" cols="88" placeholder="请输入您的评论" class="" form-control></textarea>
        </div>
        <br>
<cc:choose>
    <cc:when test="${sessionScope.USER_SESSION.telephone!=null}">
        <div class="form-button">
            <button class="btn btn-primary">提交</button>
        </div>
    </cc:when>
    <cc:otherwise>
        <div class="form-button">
            <button class="btn btn-primary" disabled="disabled" title="评论课程请先登录！" href="#head">提交</button>
        </div>
    </cc:otherwise>
</cc:choose>
    </div>
</form>

</body>
</html>
