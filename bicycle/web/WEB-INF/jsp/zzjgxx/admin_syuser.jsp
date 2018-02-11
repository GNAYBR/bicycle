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
    <div class="public-nav">您当前的位置：<a href="">组织机构信息</a>><a href="">人员登记和角色分配</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>人员登记和角色分配</h3>
        </div>
        <div class="form-group">
            <form method="post" action="/syuser/find.do">
                <input class="form-input-txt" placeholder="用户姓名" type="text" name="userName" style="margin-left:300px"/>
                <input type="hidden" name="currentPage" value="1">
                <select name="roleId" style="height: 35px" class="form-select">
                    <option value="">请选择角色</option>
                    <c:forEach items="${syRoles}" var="syRole">
                        <option value="${syRole.roleId}">${syRole.roleName}</option>
                    </c:forEach>
                </select>
                <input type="submit" style="height: 35px">
                <%--<input type="submit" value="查询" class="sub-btn" style="margin-left:700px;margin-top: 10px">--%>
            </form>

        </div>
        <div class="public-content-cont">
            <table class="public-cont-table">
                <tr>
                    <th style="width:10%">编号</th>
                    <th style="width:10%">角色</th>
                    <th style="width:10%">账户名</th>
                    <th style="width: 10%">用户名</th>
                    <th style="width: 10%">密码</th>
                    <th style="width: 10%">活跃标志</th>
                    <th style="width: 10%">办公电话</th>
                    <th style="width: 10%">手机</th>
                    <th style="width: 10%">邮箱</th>
                    <th style="width: 10%">操作</th>
                </tr>

                <c:forEach items="${pageBean.syUsers}" var="user">
                    <tr>
                        <td>${user.userId}</td>
                        <c:forEach items="${syRoles}" var="role">
                            <c:if test="${role.roleId == user.roleId}">
                                <td>${role.roleName}</td>
                            </c:if>
                        </c:forEach>
                        <td>${user.loginname}</td>
                        <td>${user.username}</td>
                        <td>${user.password}</td>
                        <td>${user.activeFlag}</td>
                        <td>${user.officePhone}</td>
                        <td>${user.mobilePhone}</td>
                        <td>${user.email}</td>
                        <td>
                            <div class="table-fun">
                                <a href="/syuser/toUpdate.do?userId=${user.userId}">修改</a>
                                <a href="/syuser/signOut.do?userId=${user.userId}">注销</a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>


            </table>



            <div class="page">
                        <c:if test="${pageBean.currentPage==1}"><</c:if>
                        <c:if test="${pageBean.currentPage!=1}"><a href="/syuser/main.do?currentPage=${pageBean.currentPage-1}"><</a></c:if>
                        <c:forEach begin="1" end="${pageBean.totalPage}" step="1" varStatus="s">
                            <c:if test="${s.index == pageBean.currentPage}">${s.index}</c:if>
                            <c:if test="${s.index != pageBean.currentPage}"><a href="/syuser/main.do?currentPage=${s.index}">${s.index}</a></c:if>
                        </c:forEach>
                        <c:if test="${pageBean.currentPage==pageBean.totalPage}">></c:if>
                        <c:if test="${pageBean.currentPage!=pageBean.totalPage}"><a href="/syuser/main.do?currentPage=${pageBean.currentPage+1}">></a>
                        </c:if>
            </div>

            <div class="table-fun" style="margin-left:48%;margin-top: 20px">
                <a href="/syuser/toInsert.do">新增</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>