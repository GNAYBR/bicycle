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

        function openDialog(obj){
            //第一个参数：弹窗宽度，第二个参数：弹窗高度，第三个参数：弹窗显示的内容路径，第四个参数：弹窗title
//            new dialog(500,500,'/toPile/chooseStation.do?bicycleId='+obj,"车点").open();
            window.open('/toPile/chooseStation.do?bicycleId='+obj.val());
            //closeDialog();
        }


    </script>

</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="">管理首页</a>><a href="">车辆采购与入桩</a><a href="">车辆入桩</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>车辆入桩</h3>
        </div>
        <div class="public-content-cont">
            <table class="public-cont-table">
                <tr>
                    <th style="width:5%">车辆id</th>
                    <th style="width:5%">车辆编号</th>
                    <th style="width:20%">创建日期</th>
                    <th style="width:10%">操作</th>

                </tr>
                <c:forEach items="${bicycleInfoPage.bicycleInfos}" var="bicycleInfo">
                    <tr>
                        <td>${bicycleInfo.bicycleId}</td>
                        <td>${bicycleInfo.bicycleCode}</td>
                        <td>${bicycleInfo.operatorTime}</td>
                        <td><input type="button" value="选择车桩"  onclick="javascript:window.open('/toPile/chooseStation.do?bicycleId=${bicycleInfo.bicycleId}');"></td>
                    </tr>
                </c:forEach>

            </table>

            <div class="page">
                共<span>${bicycleInfoPage.countRows}</span>辆新车
                <span>${bicycleInfoPage.totalPage}</span>页
                <a href="/toPile/main.do?currentPage=1">首页</a>

                <c:if test="${bicycleInfoPage.currentPage!=1}">
                    <a href="/toPile/main.do?currentPage=${bicycleInfoPage.currentPage-1}"><</a>
                </c:if>
                <c:if test="${bicycleInfoPage.currentPage==1}">
                    <
                </c:if>

                <c:forEach begin="1" end="${bicycleInfoPage.totalPage}" step="1" varStatus="t">
                    <c:if test="${t.index == bicycleInfoPage.currentPage}">
                        ${t.index}
                    </c:if>
                    <c:if test="${t.index != bicycleInfoPage.currentPage}">
                        <a href="/toPile/main.do?currentPage=${t.index}"> ${t.index}</a>
                    </c:if>
                </c:forEach>


                <c:if test="${bicycleInfoPage.currentPage!=bicycleInfoPage.totalPage}">
                    <a href="/toPile/main.do?currentPage=${bicycleInfoPage.currentPage+1}">></a>
                </c:if>
                <c:if test="${bicycleInfoPage.currentPage==bicycleInfoPage.totalPage}">
                    >
                </c:if>


                <a href="/toPile/main.do?currentPage=${bicycleInfoPage.totalPage}">末页</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>