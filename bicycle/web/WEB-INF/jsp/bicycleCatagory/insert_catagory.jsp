<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div class="public-nav">您当前的位置：<a href="/msphase/main.do">车辆信息管理</a>> 新增车辆类型</div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>新增车辆类型</h3>
        </div>
        <div class="public-content-cont">
            <form action="/bicycleCatagory/insert.do" method="post">
                <div class="form-group">
                    <label for="">类型名称</label>
                    <input class="form-input-txt" type="text" name="catagoryName"/>

                    <div class="form-group">
                        <label for="">车架类型</label>
                        <input class="form-input-txt" type="text" name="frameType"/>
                    </div>
                    <div class="form-group">
                        <label for="">车胎类型</label>
                        <input class="form-input-txt" type="text" name="tireType"/>
                    </div>
                    <div class="form-group">
                        <label for="">车重</label>
                        <input class="form-input-txt" type="text" name="weight"/>
                    </div>
                    <div class="form-group">
                        <label for="">车高</label>
                        <input class="form-input-txt" type="text" name="height"/>
                    </div>
                    <div class="form-group">
                        <label for="">车长</label>
                        <input class="form-input-txt" type="text" name="length"/>
                    </div>
                    <div class="form-group">
                        <label for="">铃铛类型</label>
                        <input class="form-input-txt" type="text" name="ringType"/>
                    </div>
                    <div class="form-group">
                        <label for="">前篮</label>
                        <input class="form-input-txt" type="text" name="basket"/>
                    </div>
                    <div class="form-group">
                        <label for="">后座</label>
                        <input class="form-input-txt" type="text" name="backseat"/>
                    </div>
                    <div class="form-group">
                        <label for="">车座</label>
                        <input class="form-input-txt" type="text" name="bicycleSeat"/>
                    </div>
                    <div class="form-group">
                        <label for="">手刹</label>
                        <input class="form-input-txt" type="text" name="handBrake"/>
                    </div>
                    <div class="form-group">
                        <label for="">备注</label>
                        <textarea class="form-input-textara" type="text" name="remark"></textarea>
                    </div>

                    <div class="clearfix"></div>

                    <div class="form-group" style="margin-left:150px;">
                        <input type="submit" class="sub-btn" value="提  交"/>
                        <input type="reset" class="sub-btn" value="重  置"/>
                    </div>
            </form>
        </div>
    </div>
</div>
<script src="../kingediter/kindeditor-all-min.js"></script>
<script>
    KindEditor.ready(function (K) {
        window.editor = K.create('#editor_id');
    });
</script>
</body>
</html>