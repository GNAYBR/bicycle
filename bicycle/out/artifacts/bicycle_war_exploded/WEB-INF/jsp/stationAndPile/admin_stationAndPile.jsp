<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台欢迎页</title>
    <link rel="stylesheet" href="../../../static/css/reset.css"/>
    <link rel="stylesheet" href="../../../static/css/content.css"/>
    <script type="text/javascript" src="../../../static/js/jquery-1.8.1.min.js"></script>

    <script type="text/javascript">

        function sub() {
            var stationName = $('#stationName').val();
            var address = $('#address').val();
            window.open('/stationAndPile/find.do?stationName='+stationName+'&address='+address);
        }
    </script>
</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="">车点车辆联合查询</a>><a href="">查询页面</a></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>车点名称地址联合查询</h3>
        </div>
        <div class="form-group">
                <input class="form-input-txt" placeholder="车点名称"  type="text" id="stationName" name="stationName" style="margin-left:500px"/>
                <input class="form-input-txt" placeholder="车点地址"  type="text" id="address" name="address" style="margin-left:500px"/>
                <input type="button" align="center" class="sub-btn" value="查询" onclick="sub()">
        </div>
    </div>
</div>
</body>
</html>