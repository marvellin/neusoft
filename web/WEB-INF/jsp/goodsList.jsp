<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>--%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>商品名</td>
			<td>商品详情</td>
			<td>商品价格</td>
			<td>创建日期</td>
		</tr>
		<c:forEach items="${goodsList }" var="goods">
			<tr>
				<td>${goods.gname }</td>
				<td>${goods.gdescription }</td>
				<td>${goods.gprice }</td>
				<td>${goods.gdate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>