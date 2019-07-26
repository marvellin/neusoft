<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>date</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/date" method="post">
    请输入日期（格式为“yyyy-MM-dd HH:mm:ss”）：<input type="text" name="date" id="date"/>
    <input type="submit" value="确认"/>
  </form>
  </body>
</html>
