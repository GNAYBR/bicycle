<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>修改用户</title>
    <link rel="stylesheet" href="../../../static/css/reset.css" />
    <link rel="stylesheet" href="../../../static/css/content.css" />
</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="/msphase/main.do">人员登记和角色分配</a>>   用户修改</div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>用户修改</h3>
        </div>
        <div class="public-content-cont">
            <form action="/syuser/update.do" method="post">
                <input type="hidden" name="userId" value="${syUser.userId}">
                <div class="form-group">
                    <label for="">用户名称</label>
                    <input class="form-input-txt" type="text" value="${syUser.username}" name="username"/>
                </div>
                <div class="form-group">
                    <label for="">角色</label>
                    <c:forEach items="${syRoles}" var="syRole">
                        <c:if test="${syRole.roleId == syUser.roleId}">
                            <input type="radio" value="${syRole.roleId}" checked="checked" name="roleId" >${syRole.roleName}&nbsp;
                        </c:if>
                        <c:if test="${syRole.roleId != syUser.roleId}">
                            <input type="radio" value="${syRole.roleId}" name="roleId" >${syRole.roleName}&nbsp;
                        </c:if>
                    </c:forEach>
                </div>
                <div class="form-group">
                    <label for="">办公电话</label>
                    <input class="form-input-txt" type="text" value="${syUser.officePhone}" name="officePhone"/>
                </div>
                <div class="form-group">
                    <label for="">移动电话</label>
                    <input class="form-input-txt" type="text" value="${syUser.mobilePhone}" name="mobilePhone"/>
                </div>
                <div class="form-group">
                    <label for="">E-Mail</label>
                    <input class="form-input-txt" type="text" value="${syUser.email}" name="email"/>
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