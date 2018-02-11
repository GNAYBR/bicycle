<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link rel="stylesheet" href="../../static/css/reset.css">
    <link rel="stylesheet" href="../../static/css/public.css">
</head>
<body>
<div class="public-header-warrp">
    <div class="public-header">
        <div class="content">
            <div class="public-header-logo"><a href=""><i>LOGO</i>
                <h3>自行车管理系统</h3></a></div>
            <div class="public-header-admin fr">
                <p class="admin-name">${username},${syRole.roleName}</p>
                <div class="public-header-fun fr">
                    <a href="" class="public-header-man">管理</a>
                    <a href="/user/logout.do" class="public-header-loginout">安全退出</a>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="clearfix"></div>

<div class="public-ifame mt20" >
    <div class="content">

    <div class="public-ifame-leftnav">
        <div class="public-title-warrp">
            <div class="public-ifame-title ">
                <a href="">首页</a>
            </div>
        </div>
        <ul class="left-nav-list">
            <li class="public-ifame-item">
                <a href="javascript:;">组织机构信息</a>
                <div class="ifame-item-sub">
                    <ul>
                        <li class="active"><a href="/msphase/main.do" target="content">权限管理</a></li>
                        <li><a href="/role/main.do" target="content">角色管理</a></li>
                        <li><a href="/syuser/main.do?currentPage=1" target="content">人员登记和角色分配</a></li>
                    </ul>
                </div>
            </li>
            <li class="public-ifame-item">
                <a href="javascript:;">车辆购入与入桩</a>
                <div class="ifame-item-sub">
                    <ul>
                        <li><a href="/bicycleCatagory/main.do" target="content">车辆类型管理</a>|<a href="/bicycleCatagory/toInsert.do"
                                                                                            target="content">添加</a></li>
                        <li><a href="/purchase/toInsert.do" target="content">车辆采购</a></li>
                        <li><a href="/toPile/main.do?currentPage=1" target="content">车辆入桩</a></li>
                    </ul>
                </div>
            </li>

            <li class="public-ifame-item">
                <a href="javascript:;">车点车辆联合查询</a>
                <div class="ifame-item-sub">
                    <ul>
                        <li><a href="/stationAndPile/main.do" target="content">查询车点</a></li>
                    </ul>
                </div>
            </li>

        </ul>
    </div>
    <!-- 右侧内容展示部分 -->
    <div class="public-ifame-content">
        <iframe name="content" src="../../main.jsp" frameborder="0" id="mainframe" scrolling="yes" marginheight="0"
                marginwidth="0" width="100%" style="height: 700px;"></iframe>
    </div>
</div>
</div>
<script src="../../static/js/jquery.min.js"></script>
<script>
    $().ready(function () {
        var item = $(".public-ifame-item");

        for (var i = 0; i < item.length; i++) {
            $(item[i]).on('click', function () {
                $(".ifame-item-sub").hide();
                if ($(this.lastElementChild).css('display') == 'block') {
                    $(this.lastElementChild).hide()
                    $(".ifame-item-sub li").removeClass("active");
                } else {
                    $(this.lastElementChild).show();
                    $(".ifame-item-sub li").on('click', function () {
                        $(".ifame-item-sub li").removeClass("active");
                        $(this).addClass("active");
                    });
                }
            });
        }
    });
</script>
</body>
</html>