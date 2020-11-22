<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/14
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="gb2312"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <link href="favicon.ico" rel="shortcut icon" />
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style=" background: url(https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=545455631,4021708622&fm=26&gp=0.jpg) no-repeat center center fixed; background-size: 100%;">


<div class="modal-dialog" style="margin-top: 10%;">
    <div class="modal-content">
        <div class="modal-header">

            <h4 class="modal-title text-center" id="myModalLabel">登录</h4>
        </div>
        <div class="modal-body" id = "model-body">
            <div class="form-group">

                <input type="text" class="form-control"placeholder="手机号" value="前11位为有效位" autocomplete="off">
            </div>
            <div class="form-group">

                <input type="password" class="form-control" placeholder="密码" autocomplete="off">
            </div>
            <div class="form-group">

                <input type="password" class="form-control" placeholder="确认密码" autocomplete="off">
            </div>

        </div>
        <div class="modal-footer">
            <div class="form-group">
                <button type="button" class="btn btn-primary form-control"><a href="/register/login">提交</a></button>
            </div>


        </div>
    </div><!-- /.modal-content -->
</div><!-- /.modal -->

</body>
</html>