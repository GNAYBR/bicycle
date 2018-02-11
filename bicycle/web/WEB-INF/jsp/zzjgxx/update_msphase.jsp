<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/27 0027
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台欢迎页</title>
    <link rel="stylesheet" href="../../../static/css/reset.css" />
    <link rel="stylesheet" href="../../../static/css/content.css" />
</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="/msphase/main.do">权限管理</a>>   权限修改</div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>修改权限</h3>
        </div>
        <div class="public-content-cont">
            <form action="/msphase/update.do" method="post">
                <input type="hidden" name="phaseid" value="${updateMsphase.phaseid}">
                <div class="form-group">
                    <label for="">权限url</label>
                    <input class="form-input-txt" type="text" value="${updateMsphase.url}" name="url"/>
                </div>
                <div class="form-group">
                    <label for="">权限描述</label>
                    <input type="text" class="form-input-textara" value="${updateMsphase.description}" type="text" name="description"></input>
                </div>

                <div class="clearfix"></div>

                <div class="form-group" style="margin-left:150px;">
                    <input type="submit" class="sub-btn" value="提  交" />
                    <input type="reset" class="sub-btn" value="重  置" />
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../kingediter/kindeditor-all-min.js"></script>
<script>
    KindEditor.ready(function(K) {
        window.editor = K.create('#editor_id');
    });
</script>
</body>
</html>