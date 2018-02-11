<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30 0030
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>车辆入桩</title>
    <link rel="stylesheet" href="../../../static/css/reset.css"/>
    <link rel="stylesheet" href="../../../static/css/content.css"/>

</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="">管理首页</a>><a href="">车辆采购与入桩</a><a href="">车辆入桩</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>选择车点</h3>
        </div>
        <div class="public-content-cont">
            <table class="public-cont-table">
                <tr>
                    <th style="width:5%">车桩id</th>
                    <th style="width:5%">车桩编号</th>
                    <th style="width:20%">所属车点id</th>
                    <th style="width:10%">安装日期</th>
                    <th style="width: 10%">操作</th>
                </tr>
                <c:forEach items="${piles}" var="pile">
                    <tr>
                        <td>${pile.pileId}</td>
                        <td>${pile.pileCode}</td>
                        <td>${pile.stationId}</td>
                        <td>${pile.installTime}</td>
                        <td><a href="/toPile/intoPile.do?bicycleId=${bicycleId}&pileId=${pile.pileId}">选择此桩</a> </td>
                    </tr>
                </c:forEach>
                <tr>
                    <td colspan="5">
                        <input type="button"  onclick="javascript:history.back(-1);" value="返回上一页">
                    </td>
                </tr>
            </table>

        </div>
    </div>
</div>
</body>
</html>