<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>后台欢迎页</title>
    <link rel="stylesheet" href="../../../static/css/public.css"/>
    <link rel="stylesheet" href="../../../static/css/reset.css"/>
    <link rel="stylesheet" href="../../../static/css/content.css"/>

    <link rel="stylesheet" type="text/css" href="../../../static/css/dialog.css">


    <script type="text/javascript" src="../../../static/js/jquery.min.js"></script>
    <script type="text/javascript" src="../../../static/js/dialog.js"></script>
    <script type="text/javascript">
        function deleteRow(r)
        {
            var i=r.parentNode.parentNode.rowIndex;
            if(i == 1){
                return;
            }else {
                document.getElementById('details').deleteRow(i);
            }
        }
        var ref = setInterval(fun(),200);

        var newRow = $("#cloneRow").html();
        function fun() {
            var newRow = document.getElementById("cloneRow").cloneNode(true);
            document.getElementById("details").appendChild(newRow);
        }

        function subOrder(){
            var re1 = /^[0-9]+.?[0-9]*$/;
            var re2 = /^[1-9]+[0-9]*]*$/;

            var prices = document.getElementsByName("price");
            for (var i =0;i<prices.length;i++){
                var price = prices[i].value;
                if (!re1.test(price)) {
                    alert("价格必须为数字");
                    return;
                }
            }

            var nums = document.getElementsByName("num");
            for (var i =0;i<nums.length;i++){
                var num = nums[i].value;
                if (!re2.test(num)) {
                    alert("数量必须为正整数");
                    return;
                }
            }

            var createDates = document.getElementsByName("createDate");
            for (var i =0;i<createDates.length;i++){
                var createDate = createDates[i].value;
                if (createDate.replace(/(^s*)|(s*$)/g, "").length ==0)
                {
                    alert('生产日期不能为空');
                    return;

                }
            }

            var batchNos = document.getElementsByName("batchNo");
            for (var i =0;i<batchNos.length;i++){
                var batchNo = batchNos[i].value;
                if (batchNo.replace(/(^s*)|(s*$)/g, "").length ==0)
                {
                    alert('生产批次不能为空');
                    return;
                }
            }
            $("#f").submit();
        }

    </script>
</head>
<body marginwidth="0" marginheight="0">
<div class="container">
    <div class="public-nav">您当前的位置：<a href="">采购</a>></div>
    <div class="public-content">
        <div class="public-content-header">
            <h3>自行车采购</h3>
        </div>
        <div class="public-content-cont">
            <form action="/purchase/insert.do" id="f" method="post">
                <div class="form-group">
                    <label for="">供应商</label>
                    <select name="bicycleOrder.venderId" class="form-select" style="height: 30px;">
                        <c:forEach items="${venders}" var="vender">
                            <option value="${vender.venderId}">${vender.venderName}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group">
                    <label for="">购入日期</label>
                    <input name="bicycleOrder.buyDate" class="form-input-txt"
                           onclick="laydate({istime: true, format: 'YYYY-MM-DD'})">
                </div>
                <div class="form-group">
                    <label for="">负责人</label>
                    <select name="bicycleOrder.personInCharge" class="form-select" style="height: 30px;">
                        <c:forEach items="${personsInCharge}" var="syUser">
                            <option value="${syUser.userId}">${syUser.username}</option>
                        </c:forEach>
                    </select>
                </div>

                <div class="form-group">
                    <label for="">发票号码</label>
                    <input class="form-input-txt" type="text" name="bicycleOrder.invoiceNo" value=""/>
                </div>

                <div class="form-group">
                    <label for="">备注</label>
                    <textarea class="form-input-textara" type="text" name="bicycleOrder.remark"></textarea>
                </div>
                <div class="form-group">
                    <label for="">单据状态</label>
                    <input class="form-input-radius" checked="checked" type="radio" name="bicycleOrder.status"
                           value="1"/>录入
                    <input class="form-input-radius" type="radio" name="bicycleOrder.status" value="2"/>确认
                </div>
                <div class="form-group">
                    <label for="">明细</label>
                    <table id="details">
                        <tr>
                            <th>车辆类型编号</th>
                            <th>总价</th>
                            <th>数量</th>
                            <th>备注</th>
                            <th>生产日期</th>
                            <th>生产批次</th>
                            <th>操作</th>
                        </tr>
                        <tr id="cloneRow">
                            <td>
                                <select name="catagoryId" class="form-select" style="height: 30px;">
                                    <c:forEach items="${catagories}" var="catagory">
                                        <option value="${catagory.catagoryId}">${catagory.catagoryName}</option>
                                    </c:forEach>
                                </select>
                            </td>
                            <td>
                                <input class="form-input-txt" type="text" name="price" value=""/>
                            </td>
                            <td>
                                <input class="form-input-txt" type="text" name="num" value=""/>
                            </td>
                            <td>
                                <input class="form-input-txt" type="text" name="remark" value=""/>
                            </td>
                            <td>
                                <input name="createDate" class="form-input-txt" style="width:100px"
                                       onclick="laydate({istime: true, format: 'YYYYMMDD'})">
                            </td>
                            <td>
                                <input class="form-input-txt" type="text" name="batchNo" value=""/>
                            </td>
                            <td>
                                <input type="button" value="删除" onclick="deleteRow(this)">
                            </td>
                        </tr>
                    </table>

                    <input type="button" value="新增明细" onclick="fun()">
                </div>

                <div class="form-group" style="margin-left:150px;">
                    <input type="button" onclick="subOrder()" class="sub-btn" value="提  交"/>
                    <input type="reset" class="sub-btn" value="重  置"/>
                </div>
            </form>

        </div>
    </div>
</div>
<script src="../../../static/kingediter/kindeditor-all-min.js"></script>
<script src="../../../static/js/laydate.js"></script>
<script>
    KindEditor.ready(function (K) {
        window.editor = K.create('#editor_id');
    });
</script>
</body>
</html>