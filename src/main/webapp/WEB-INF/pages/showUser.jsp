<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Showuser.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
   <form action="${pageContext.request.contextPath}/user/save.htm?flag=${modify}" method="post" id="formid">
	<table >
			<tr>
				<td class="label">用户名称</td>
				<td><input  type="text" id="userName" name="userName" value="${user.userName}" maxlength="20" /></td>
			</tr>
			<tr>
				<td class="label">用户账号</td>
				<td><input  type="text" id="userAccount" name="userAccount" maxlength="20"  value="${user.password}" /></td>
			</tr>
			
			<tr>
				<td colspan="2" class="center">
				<input id="saveInfo" type="button" value="保存" class="button" onclick="tiJ()"/><input id="goBack" type="button" value="返回" class="button" onclick="back()"/></td>
			</tr>
		</table>
	</form>
  </body>
</html>
