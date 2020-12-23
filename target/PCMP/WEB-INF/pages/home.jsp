<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/17
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="cc" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="base.jsp"%>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" href="<c:url value="/css/home.css"/>">
</head>
<body>
<div class="wrap">
    <ul class="list">
        <li class="item active"></li>
        <li class="item"></li>
        <li class="item"><a href="#"></a></li>
        <li class="item"><a href="#"></a></li>
        <li class="item"><a
                href="https://www.icourse163.org/member/login.htm?returnUrl=aHR0cHM6Ly93d3cuaWNvdXJzZTE2My5vcmcvaW5kZXguaHRt#"></a>
        </li>
    </ul>
    <ul class="pointList">
        <li class="point active" data-index='0'></li>
        <li class="point" data-index='1'></li>
        <li class="point" data-index='2'></li>
        <li class="point" data-index='3'></li>
        <li class="point" data-index='4'></li>
    </ul>
    <button type="button" class="btnForGo btn" id="goPre"><h4><</h4></button>
    <button type="button" class="btnForGo btn" id="goNext"><h4>></h4></button>
</div>

<script type="text/javascript">
    const items = document.getElementsByClassName('item'); //图片
    const points = document.getElementsByClassName('point'); //点
    const goPreBtn = document.getElementById('goPre');
    const goNextBtn = document.getElementById('goNext');
    let index = 0;
    let time = 0;//定时器图片跳转参数

    const clearActive = function () {
        let i;
        for (i = 0; i < items.length; i++) {
            items[i].className = 'item';
        }
        for (i = 0; i < points.length; i++) {
            points[i].className = 'point';
        }
    };

    const goIndex = function () {
        clearActive();
        console.log(index)
        points[index].className = 'point active';
        items[index].className = 'item active';
    };

    const goNext = function () {
        if (index < 4) {
            index++;
        } else {
            index = 0;
        }
        goIndex();
        time = 0;
    };

    const goPre = function () {
        if (index == 0) {
            index = 4;
        } else {
            index--;
        }
        goIndex();
        time = 0;
    };

    goNextBtn.addEventListener('click', function () {
        goNext();
    })
    goPreBtn.addEventListener('click', function () {
        goPre();
    })

    for (let i = 0; i < points.length; i++) {
        points[i].addEventListener('click', function () {
            const pointIndex = this.getAttribute('data-index');
            index = pointIndex;
            goIndex();
            time = 0;
        })
    }

    //2000ms跳转一次

    setInterval(function () {
        time++;
        if (time == 20) {
            goNext();
        }
        if (time > 20) {
            time = 0;
            goNext();
        }
    }, 200)
</script>

<br><br><br><br><br>
<h3 class="page-title" style="text-align: center">热点课程TOP5</h3>

<table class="table table-striped table-bordered">
    <thead>
    <tr>
        <th>课程名称</th>
        <th>学校名称</th>
        <th>专业名称</th>
        <th>课程详情</th>
        <th>参与人数</th>
    </tr>
    </thead>
    <tbody>
<cc:forEach var="course" items="${courses}">
    <tr>
    <th scope="row" name="cname">${course.cName}</th>
    <td name="school">${course.sName}</td>
    <td name="majors">${course.mName}</td>
    <td name="cinfo"><a href="${course.cInfo}"> 课程详情 </a></td>
    <td name="attend">${course.attend}</td>
    </tr>
</cc:forEach>

    </tbody>
</table>
</body>
</html>
