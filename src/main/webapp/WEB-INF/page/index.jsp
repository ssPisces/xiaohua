<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/taglibs.jsp"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin登录</title>
</head>
<body>
<%-- 用户名： ${user.userName}<br>
 密码：${user.userPassword}<br> --%>
 <form action="${pageContext.request.contextPath}/admin/login" method="get">
  <p>用户名: <input type="text" name="userName" /></p>
  <p>密码: <input type="text" name="paword" /></p>
  <input type="submit" value="登录" />
  <input type="checkbox" name="checkbox"/>是否记住密码
</form>
<a href="${ctx}/admin/login/login.jsp">login</a>
</body>
</html>