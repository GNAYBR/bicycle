<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

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
    <div class="public-nav">您当前的位置：<a href="">管理首页</a>><a href="">车辆购入与入桩</a><a href="">车辆类型管理</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>车辆类型管理</h3>
        </div>
        <div class="public-content-cont">
            <table class="public-cont-table">
                <tr>
                    <th style="width:5%">类型编号</th>
                    <th style="width:5%">类型名称</th>
                    <th style="width:5%">车架类型</th>
                    <th style="width:5%">车胎类型</th>
                    <th style="width:5%">车重</th>
                    <th style="width:5%">车高</th>
                    <th style="width:5%">车长</th>
                    <th style="width:5%">铃铛类型</th>
                    <th style="width:5%">前篮</th>
                    <th style="width:5%">后座</th>
                    <th style="width:5%">车座</th>
                    <th style="width:5%">手刹</th>
                    <th style="width:5%">备注</th>
                    <th style="width:5%">操作人</th>
                    <th style="width:5%">操作日期</th>
                    <th style="width:5%">操作</th>
                </tr>
                <c:forEach items="${bicycleCatagories}" var="bicycleCatagory">
                    <tr>
                        <td>${bicycleCatagory.catagoryId}</td>
                        <td>${bicycleCatagory.catagoryName}</td>
                        <td>${bicycleCatagory.frameType}</td>
                        <td>${bicycleCatagory.tireType}</td>
                        <td>${bicycleCatagory.weight}</td>
                        <td>${bicycleCatagory.height}</td>
                        <td>${bicycleCatagory.length}</td>
                        <td>${bicycleCatagory.ringType}</td>
                        <td>${bicycleCatagory.basket}</td>
                        <td>${bicycleCatagory.backseat}</td>
                        <td>${bicycleCatagory.bicycleSeat}</td>
                        <td>${bicycleCatagory.handBrake}</td>
                        <td>${bicycleCatagory.remark}</td>
                        <td>${bicycleCatagory.userId}</td>
                        <td>${bicycleCatagory.operatorTime}</td>
                        <td>
                            <div class="table-fun">
                                <a href="/bicycleCatagory/toUpdate.do?catagoryId=${bicycleCatagory.catagoryId}">修改</a>
                                <a href="/bicycleCatagory/delete.do?catagoryId=${bicycleCatagory.catagoryId}">删除</a>
                            </div>
                        </td>
                    </tr>
                </c:forEach>

            </table>

        </div>
    </div>
</div>
</body>
</html>