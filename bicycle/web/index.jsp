<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
    <link rel="stylesheet" href="../../static/css/reset.css" />
    <link rel="stylesheet" href="../../static/css/login.css" />
</head>
<body>
<div class="page">
    <div class="loginwarrp">
        <div class="logo">杭州公共自行车后台管理系统</div>
        <div class="login_form">
            <form id="Login" name="Login" onsubmit="" method="post" action="/user/login.do">
                <li class="login-item">
                    <span>用户名：</span>
                    <input type="text" name="loginname" class="login_input">
                </li>
                <li class="login-item">
                    <span>密　码：</span>
                    <input type="password" name="password" class="login_input">
                </li>
                <li>
                    <span style="color: red;font-size: 16px;margin: auto">${message}</span>
                </li>
                <div class="clearfix"></div>
                <li class="login-sub">
                    <input type="submit" name="Submit" value="登录" />
                </li>
            </form>
        </div>
    </div>
</div>
</body>
</html>