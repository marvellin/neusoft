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
    <title>fileupload</title>
  </head>
  <script type="text/javascript">
    function check() {
      var name = document.getElementById("name").value;
      var file = document.getElementById("file").value;
      alert(name);
      alert(file);
      if (name=="") {
        alert("请填写上传人！");
        return false;
      }
      if (file.length==0 || file=="") {
        alert("请选择上传文件！");
        return false;
      }
      return true;
    }
  </script>
  <body>
    <h1>文件上传案例</h1>
    <form action="${pageContext.request.contextPath}/fileUpload" method="post" enctype="multipart/form-data" onsubmit="return check()">
      上传人：<input type="text" name="name" id="name"/><br/><br/>
      选择文件：<input type="file" name="uploadfile" id="file" multiple="multiple"/><br/><br/>
      <input type="submit" value="上传"/>
    </form>
  </body>
</html>
