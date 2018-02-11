<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div class="public-nav">您当前的位置：<a href="/msphase/main.do">权限管理</a>>       新增权限</div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>新增权限</h3>
        </div>
        <div class="public-content-cont">
            <form action="/role/insert.do" method="post">
                <div class="form-group">
                    <label for="">角色名称</label>
                    <input class="form-input-txt" type="text" name="syRole.roleName"/>
                </div>
                <div class="form-group">
                    <label for="">角色描述</label>
                    <textarea class="form-input-textara" type="text" name="syRole.roleDescribe"></textarea>

                </div><br/>
                <c:forEach items="${msphases}" var="item" varStatus="step">
                        <input type="checkbox" value="${item.phaseid}" name="msphases[${step.index}].phaseid">
                        ${item.url}&nbsp;&nbsp;&nbsp;
                </c:forEach>
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