<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>用户登录界面</h1>
        ${msg}
        <form action="${pageContext.request.contextPath}/login" method="post">
            用户名：<input type="text" name="userName" id="userName" /><br><br>
            密&nbsp;&nbsp;码<input type="password" name="password" id="password" /><br><br>
            <input type="submit" value="登录" />
        </form>
    </body>
</html>
