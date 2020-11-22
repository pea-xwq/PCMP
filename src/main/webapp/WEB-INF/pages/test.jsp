<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/13
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<<<<<<< HEAD
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
=======
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<%
     String path = request.getContextPath();
     String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
>>>>>>> origin
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
</head>
<body>
<h3>这是一个测试页面</h3>
<form class="form-inline" action="/class/schoolQueryResult" method="get">
    <button type="submit" class="btn btn-default">查找</button>
</form>

${message} <br/>
<cr:forEach items="${bookList}" var="node">
    <cr:out value="${node}"></cr:out>
</cr:forEach>
</body>
</html>
