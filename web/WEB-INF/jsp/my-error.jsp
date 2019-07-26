<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>自定义异常错误：</h1><%=exception%>
        <h2>错误的内容：</h2>
        <%
            exception.printStackTrace(response.getWriter());
            %>
    </body>
</html>
