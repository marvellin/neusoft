<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>显示客户信息</h1>
        <table width="80%" border="1">
            <tr>
                <td>编号</td>
                <td>名称</td>
                <td>年龄</td>
            </tr>
            <tr>
                <td>${customer.userId}</td>
                <td>${customer.userName}</td>
                <td>${customer.age}</td>
            </tr>
        </table>
    </body>
</html>
