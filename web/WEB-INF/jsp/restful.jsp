<!DOCTYPE html>
<%@ page contentType="text/html" pageEncoding="UTF-8" language="java" %>
<html>
  <head>
    <title>ajax</title>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js" charset="UTF-8"/>
    <script type="text/javascript">
      alert($)
      alert("balabala")
    </script>
  </head>
  <body>
  <script type="text/javascript">
    function search() {
      alert("进入search");
      var id=$("#userID").val();
      $.ajax({
        url:"${pageContext.request.contextPath}/user/"+id,
        type: "get",
        dataType:"json",
        //成功响应结果
        success: function (data) {
          if (data.userName!=null){
            alert("您查询的用户名为："+data.userName+"密码为："+data.password);
          }else {
            alert("您输入的id"+id+"无效！");
          }
        }
      });
    }
  </script>
    <h1>RESTFUL测试</h1>
    <form>
      编号：<input type="text" name="userID" id="userID"/>
      <input type="button" value="搜索" onclick="search()"/>
      <input type="button" value="clickTest" onclick="alter('test')"/>
    </form>
  </body>
</html>
