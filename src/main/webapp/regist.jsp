<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- HTML5文档-->
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>添加用户</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <%--表单校验--%>
    <script>

        window.onload = function () {

            document.getElementById("form").onsubmit = function () {

                var flag = checkUsername() && checkPassword();
                if (!flag) {
                    alert("账号或密码有误")
                }
                return flag;
            }
        }


        //校验用户名
        function checkUsername() {
            var username = document.getElementById("username").value;
            var reg_username = /^[0-9a-zA-Z]{1,10}$/;
            var flag = reg_username.test(username);
            return flag;

        }

        function checkPassword() {
            var username = document.getElementById("password").value;
            var reg_username = /^[0-9a-zA-Z]{1,10}$/;
            var flag = reg_username.test(username);
            return flag;

        }
    </script>
</head>
<body>
<div class="container" style="width: 400px;padding: 20px;margin-top: 100px;border: #0f0f0f 1px solid">
    <h3 style="margin: 20px auto;text-align: center">注册页面</h3>
    <form action="/user/regist" method="post" id="form">
        <div class="form-group">
            <label for="username">账号：</label>
            <input type="text" class="form-control" id="username" name="username" placeholder="账号只能由数字和字母组成,不能为空">
        </div>


        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="密码只能由数字和字母组成,不能为空">
        </div>


        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交"/>
            <input class="btn btn-default" type="reset" value="重置"/>
        </div>
    </form>
</div>
</body>
</html>