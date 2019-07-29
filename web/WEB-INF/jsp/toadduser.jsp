<%--
  Created by IntelliJ IDEA.
  User: 林源彬
  Date: 2019/7/22
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Add User</title>
    <script type="text/javascript">
      function check() {
        var id = document.getElementById("userID").value;
        var name = document.getElementById("userName").value;
        var pwd = document.getElementById("password").value;
        var confirmpwd = document.getElementById("confirmpwd").value;
        if (id == null || id == ""){
          alert("请输入用户ID！");
          return false;
        }
        if (name == null || name == ""){
          alert("请输入用户名！");
          return false;
        }
        if (pwd == null || pwd == ""){
          alert("请输入用户密码！");
          return false;
        }
        if (pwd != confirmpwd){
          alert("两次输入密码不匹配，请确认密码！")
        }
      }
    </script>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/adduser" method="post" onsubmit="check()">
      <p>
        用户ID：<input type="text" name="userID" id="userID"/>
      </p>
      <p>
        用户名：<input type="text" name="userName" id="userName"/>
      </p>
      <p>
        用户密码：<input type="password" name="password" id="password"/>
      </p>
      <p>
        确认密码：<input type="password" name="confirmpwd" id="confirmpwd"/>
      </p>
    </form>
  </body>
</html>
