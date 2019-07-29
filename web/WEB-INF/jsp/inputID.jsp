<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <script type="text/javascript">
        var msg = "<%=session.getAttribute("msg")%>"
        // alert(msg);
        if (msg != null && msg != "") {
            setTimeout("alert(msg)", 0);
        }
        function check() {
            var id = document.getElementById("userIDId").value;
            if (id == null || id == "") {
                alert("请输入客户ID！")
                return false;
            }
            return true;
        }
        // alert("test");
    </script>
    <body>
        <h1>输入客户ID</h1>
<%--        ${msg}--%>
        <form action="${pageContext.request.contextPath}/findCustomers" method="post" onsubmit="check()">
            用户ID：<input type="text" name="userIDName" id="userIDId"/>
            <input type="submit" >
        </form>
    </body>
</html>
