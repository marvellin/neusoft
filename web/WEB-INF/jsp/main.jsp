<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>这是main主页</h1>
        当前用户：${USERNAME.userName}<br><br>
        用户ID：${USERNAME.userID}<br><br>
        <a href="${pageContext.request.contextPath}/logout">退出</a>
    </body>
</html>
