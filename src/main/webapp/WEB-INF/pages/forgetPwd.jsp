<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2020/11/14
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="gb2312" isELIgnored="false" %>
<%@ include file="base.jsp"%>
<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title>��¼</title>
    <link href="favicon.ico" rel="shortcut icon" />
    <link href="https://cdn.bootcss.com/twitter-bootstrap/3.4.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body style=" background: url(https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=545455631,4021708622&fm=26&gp=0.jpg) no-repeat center center fixed; background-size: 100%;">


<div class="modal-dialog" style="margin-top: 10%;">
    <div class="modal-content">
        <div class="modal-header">

            <h4 class="modal-title text-center" id="myModalLabel">��������</h4>
        </div>
        <form action="/registerController/registerAndLogin" method="post">
        <div class="modal-body" id = "model-body">
            <div class="form-group">

                <input type="text" class="form-control"placeholder="�ֻ���" value="" autocomplete="off">
            </div>
            <div class="form-group">

                <input type="password" class="form-control" placeholder="����" autocomplete="off">
            </div>
            <div class="form-group">

                <input type="password" class="form-control" placeholder="ȷ������" autocomplete="off">
            </div>

        </div>
        <div class="modal-footer">
            <div>
                <button class="btn btn-primary btn-block">�ύ</button>
            </div>
        </div>

        </form>
    </div><!-- /.modal-content -->
</div><!-- /.modal -->

</body>
</html>