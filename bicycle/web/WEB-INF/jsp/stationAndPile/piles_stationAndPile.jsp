<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台欢迎页</title>
    <link rel="stylesheet" href="../../../static/css/reset.css"/>
    <link rel="stylesheet" href="../../../static/css/content.css"/>


    <link rel="stylesheet" type="text/css" href="../../../static/css/dialog.css">


    <script type="text/javascript" src="../../../static/js/jquery-1.8.1.min.js"></script>
    <script type="text/javascript" src="../../../static/js/dialog.js"></script>
    <script type="text/javascript">

        function openDialog(obj){
            //第一个参数：弹窗宽度，第二个参数：弹窗高度，第三个参数：弹窗显示的内容路径，第四个参数：弹窗title
            new dialog(200,300,'/stationAndPile/bicycle.do?bicycleId='+obj,"车辆信息").open();

            //closeDialog();关闭弹窗的方法
        }


    </script>
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
                    <th style="width:10%">车桩id</th>
                    <th style="width:10%">车桩编号</th>
                    <th style="width:10%">车点id</th>
                    <th style="width:10%">车桩状态</th>
                    <th style="width:10%">安装时间</th>
                    <th style="width:10%">备注</th>
                </tr>

                <c:forEach items="${piles}" var="pile">
                    <tr>
                        <td>${pile.pileId}</td>
                        <td>${pile.pileCode}</td>
                        <td>${pile.stationId}</td>
                        <c:if test="${pile.status == 2}">
                            <td><span style="color: green">无车</span></td>
                        </c:if>
                        <c:if test="${pile.status == 1}">
                            <td onclick="openDialog(${pile.bicycleId})"><span style="color: red">有车</span></td>
                        </c:if>
                        <td>${pile.installTime}</td>
                        <td>${pile.remark}</td>

                    </tr>
                </c:forEach>


            </table>
            <input type="button" value="返回" onclick="javascript:history.back(-1);">

        </div>
    </div>
</div>
</body>
</html>