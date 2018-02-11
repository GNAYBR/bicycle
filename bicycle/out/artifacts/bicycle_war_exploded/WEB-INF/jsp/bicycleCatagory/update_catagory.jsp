<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/27 0027
  Time: 17:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改车辆信息</title>
    <link rel="stylesheet" href="../../../static/css/reset.css" />
    <link rel="stylesheet" href="../../../static/css/content.css" />
</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="/msphase/main.do">车辆购入与入桩</a>>   修改车辆信息</div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>修改车辆信息</h3>
        </div>
        <div class="public-content-cont">
            <form action="/bicycleCatagory/update.do" method="post">
                <input type="hidden" name="catagoryId" value="${bicycleCatagory.catagoryId}">
                <div class="form-group">
                    <label for="">类型名称</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.catagoryName}" name="catagoryName"/>
                </div>
                <div class="form-group">
                    <label for="">车架类型</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.frameType}" name="frameType"/>
                </div>
                <div class="form-group">
                    <label for="">车胎类型</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.tireType}" name="tireType"/>
                </div>
                <div class="form-group">
                    <label for="">车重</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.weight}" name="weight"/>
                </div>
                <div class="form-group">
                    <label for="">车高</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.height}" name="height"/>
                </div>
                <div class="form-group">
                    <label for="">车长</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.length}" name="length"/>
                </div>
                <div class="form-group">
                    <label for="">铃铛类型</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.ringType}" name="ringType"/>
                </div>
                <div class="form-group">
                    <label for="">前篮</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.basket}" name="basket"/>
                </div>
                <div class="form-group">
                    <label for="">后座</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.backseat}" name="backseat"/>
                </div>
                <div class="form-group">
                    <label for="">车座</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.bicycleSeat}" name="bicycleSeat"/>
                </div>
                <div class="form-group">
                    <label for="">手刹</label>
                    <input class="form-input-txt" type="text" value="${bicycleCatagory.handBrake}" name="handBrake"/>
                </div>
                <div class="form-group">
                    <label for="">备注</label>
                    <textarea class="form-input-textara" value="${bicycleCatagory.remark}" type="text" name="remark"></textarea>
                </div>

                <div class="clearfix"></div>

                <div class="form-group" style="margin-left:150px;">
                    <input type="submit" class="sub-btn" value="提  交" />
                    <input type="reset" class="sub-btn" value="重  置" />
                </div>
            </form>
        </div>
    </div>
</div>
<script src="../kingediter/kindeditor-all-min.js"></script>
<script>
    KindEditor.ready(function(K) {
        window.editor = K.create('#editor_id');
    });
</script>
</body>
</html>