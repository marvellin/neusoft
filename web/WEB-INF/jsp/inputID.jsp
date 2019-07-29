<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <script type="text/javascript">
        alert(${msg});
    </script>
        <h1>输入客户ID</h1>
        <%--<table width="80%" border="1" action="${pageContext.}">
            <tr>
                <td>ID：</td>
                <td>
                    <input type="text" id="userID" name="UserIDName"/>
                </td>
            </tr>
        </table>--%>
    <form action="${pageContext.request.contextPath}/findCustomers" method="post">
        用户ID：<input type="text" name="userIDName" id="userIDId"/>
    </form>
    </body>
</html>
