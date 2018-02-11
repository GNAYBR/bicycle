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
    <div class="public-nav">您当前的位置：<a href="">车点车辆联合查询</a>><a href="">查询结果</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>车点名称地址联合查询</h3>
        </div>

        <div class="public-content-cont">

            <table class="public-cont-table">
                <tr>
                    <th style="width:10%">车点id</th>
                    <th style="width:10%">车点编号</th>
                    <th style="width:10%">车点名称</th>
                    <th style="width:10%">车桩数量</th>
                    <th style="width:10%">车点地址</th>
                    <th style="width:10%">负责人</th>
                    <th style="width:10%">建造时间</th>
                    <th style="width:10%">运行时间</th>
                    <th style="width:10%">备注</th>
                </tr>

                <c:forEach items="${stations}" var="station">
                    <tr ondblclick="javascript:window.location.href='/stationAndPile/piles.do?stationId=${station.stationId}'">
                        <td>${station.stationId}</td>
                        <td>${station.stationCode}</td>
                        <td>${station.stationName}</td>
                        <td>${station.bicyclePileNum}</td>
                        <td>${station.address}</td>
                        <td>${station.personInCharge}</td>
                        <td>${station.buildTime}</td>
                        <td>${station.runTime}</td>
                        <td>${station.remark}</td>

                    </tr>
                </c:forEach>


            </table>

        </div>
    </div>
</div>
</body>
</html>