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
    <div class="public-nav">您当前的位置：<a href="/msphase/main.do">人员登记和角色分配</a>>       新增用户</div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>新增用户</h3>
        </div>
        <div class="public-content-cont">
            <form action="/syuser/insert.do" method="post">

                <div class="form-group">
                    <label for="">角色名称</label>
                    <c:forEach items="${syRoles}" var="syRole">
                        <c:if test="${syRole.roleId == 1}">
                            <input type="radio" value="${syRole.roleId}" checked="checked" name="roleId" >${syRole.roleName}&nbsp;
                        </c:if>
                        <c:if test="${syRole.roleId != syUser.roleId}">
                            <input type="radio" value="${syRole.roleId}" name="roleId" >${syRole.roleName}&nbsp;
                        </c:if>
                    </c:forEach>
                </div>
                <br/>

                <div class="form-group">
                    <label for="">登录账户</label>
                    <input class="form-input-txt" placeholder="必填" type="text" name="loginname"/>
                </div><br/>
                <div class="form-group">
                    <label for="">用户名</label>
                    <input class="form-input-txt" placeholder="必填" type="text" name="username"/>
                </div><br/>
                <div class="form-group">
                    <label for="">密码</label>
                    <input class="form-input-txt" placeholder="必填" type="text" name="password"/>
                </div><br/>
                <div class="form-group">
                    <label for="">办公电话</label>
                    <input class="form-input-txt" placeholder="选填" type="text" name="officePhone"/>
                </div><br/>
                <div class="form-group">
                    <label for="">移动电话</label>
                    <input class="form-input-txt" placeholder="选填" type="text" name="mobilePhone"/>
                </div><br/>
                <div class="form-group">
                    <label for="">E-Mail</label>
                    <input class="form-input-txt" placeholder="选填" type="text" name="email"/>
                </div><br/>

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