<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30 0030
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台欢迎页</title>
    <link rel="stylesheet" href="../../../static/css/reset.css"/>
    <link rel="stylesheet" href="../../../static/css/public.css"/>
    <link rel="stylesheet" href="../../../static/css/content.css"/>
</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="">车辆信息</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>车辆信息</h3>
        </div>
        <div class="public-content-cont">
            <div class="form-group">
                <label for="">自行车id</label>
                <label class="active">${bicycle.bicycleId}</label>
            </div>
            <div class="form-group">
                <label for="">自行车编码</label>
                <label class="active">${bicycle.bicycleCode}</label>
            </div>
            <div class="form-group">
                <label for="">自行车状态</label>
                <label class="active">在桩</label>
            </div>
            <div class="form-group">
                <label for="">车桩编号</label>
                <label class="active">${bicycle.pileId}</label>
            </div>
        </div>
    </div>
</div>
<script src="../kingediter/kindeditor-all-min.js"></script>
<script src="../js/laydate.js"></script>
<script>
    KindEditor.ready(function (K) {
        window.editor = K.create('#editor_id');
    });
</script>
</body>
</html>