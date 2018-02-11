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


    <link rel="stylesheet" type="text/css" href="../../../static/css/dialog.css">


    <script type="text/javascript" src="../../../static/js/jquery-1.8.1.min.js"></script>
    <script type="text/javascript" src="../../../static/js/dialog.js"></script>
    <script type="text/javascript">

        function openDialog(obj1, obj2) {

            //第一个参数：弹窗宽度，第二个参数：弹窗高度，第三个参数：弹窗显示的内容路径，第四个参数：弹窗title
            new dialog(500, 500, '/toPile/choosePile.do?bicycleId=' + obj1 + '&stationId=' + obj2, "车桩").open();


        }


    </script>
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
                    <th style="width:5%">车点id</th>
                    <th style="width:5%">车点编号</th>
                    <th style="width:20%">车点名称</th>
                    <th style="width:10%">地址</th>
                    <th style="width:10%">车点车桩数量</th>
                    <th style="width:10%">负责人</th>
                    <th style="width: 10%">操作</th>
                </tr>
                <c:forEach items="${stations}" var="station">
                    <tr>
                        <td>${station.stationId}</td>
                        <td>${station.stationCode}</td>
                        <td>${station.stationName}</td>
                        <td>${station.address}</td>
                        <td>${station.bicyclePileNum}</td>
                        <td>${station.personInCharge}</td>

                        <td><input type="button" value="选择该车点" onclick="javascript:window.location.href='/toPile/choosePile.do?bicycleId=${bicycleId}&stationId=${station.stationId}';"></td>
                        <%--<td><input type="button" value="选择该车点" onclick="openDialog(${bicycleInfo.bicycleId},${station.stationId})"></td>--%>
                    </tr>
                </c:forEach>

            </table>
        </div>
    </div>
</div>
</body>
</html>