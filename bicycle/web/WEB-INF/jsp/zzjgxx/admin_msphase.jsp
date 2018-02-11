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
    <div class="public-nav">您当前的位置：<a href="">组织机构信息</a>><a href="">权限管理</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>修改网站配置</h3>
        </div>
        <div class="form-group">
            <form method="post" action="/msphase/find.do">
                <input class="form-input-txt" placeholder="功能名称" type="text" name="description" style="margin-left:500px"/>
                <%--<input type="submit" value="查询" class="sub-btn" style="margin-left:700px;margin-top: 10px">--%>
            </form>

        </div>
        <div class="public-content-cont">
            <table class="public-cont-table">
                <tr>
                    <th style="width:10%">编号</th>
                    <th style="width:10%">权限url</th>
                    <th style="width:20%">权限描述</th>
                    <th style="width: 40%">操作</th>
                </tr>

                <c:forEach items="${msphases}" var="msphase">
                    <tr>
                        <td>${msphase.phaseid}</td>
                        <td>${msphase.url}</td>
                        <td>${msphase.description}</td>
                        <td>
                            <div class="table-fun">
                                <a href="/msphase/toUpdate.do?phaseId=${msphase.phaseid}">修改</a>
                                <a href="/msphase/delete.do?phaseId=${msphase.phaseid}">删除</a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>


            </table>
            <div class="table-fun" style="margin-left:40%;margin-top: 20px">
                <a href="/msphase/toInsert.do">新增</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>