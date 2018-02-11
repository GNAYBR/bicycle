<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台欢迎页</title>
    <link rel="stylesheet" href="../../../static/css/reset.css"/>
    <link rel="stylesheet" href="../../../static/css/content.css"/>
</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="">组织机构信息</a>><a href="">角色管理</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>角色信息</h3>
        </div>
        <div class="form-group">
            <form method="post" action="/role/find.do">
                <input class="form-input-txt" placeholder="角色名称" type="text" name="rolename" style="margin-left:500px"/>
                <%--<input type="submit" value="查询" class="sub-btn" style="margin-left:700px;margin-top: 10px">--%>
            </form>

        </div>
        <div class="public-content-cont">
            <table class="public-cont-table">
                <tr>
                    <th style="width:10%">编号</th>
                    <th style="width:10%">角色名称</th>
                    <th style="width:20%">角色描述</th>
                    <th style="width: 40%">权限</th>
                    <th style="width: 40%">操作</th>
                </tr>

                <c:forEach items="${syRoleVos}" var="syRoleVo">
                    <tr>
                        <td>${syRoleVo.syRole.roleId}</td>
                        <td>${syRoleVo.syRole.roleName}</td>
                        <td>${syRoleVo.syRole.roleDescribe}</td>
                        <td>
                            <c:forEach items="${syRoleVo.msphases}" var="msphase">
                                <label>${msphase.url}&nbsp;</label>
                            </c:forEach>
                        </td>
                        <td>
                            <div class="table-fun">
                                <a href="/role/toUpdate.do?roleId=${syRoleVo.syRole.roleId}">修改</a>
                                <a href="/role/delete.do?roleId=${syRoleVo.syRole.roleId}">删除</a>
                            </div>
                        </td>

                    </tr>
                </c:forEach>


            </table>
            <div class="table-fun" style="margin-left:40%;margin-top: 20px">

                <a href="/role/toInsert.do">新增</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>