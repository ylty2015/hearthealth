<%@page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>My JSP 'homepage_admin_index.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<style type="text/css">
a{
	text-decoration:none;
	margin-top:15;
	margin-left:5;
	padding-top:15;
	color:#ffffff;
}

.item{
	width:200;height:30;margin-bottom:10;background:#777777;
}
</style>

</head>

<body>
	<div id="userList"
		class="item">
		<a href="homepage_admin_content.jsp" target="mainFrame">用户列表</a>
	</div>
	<div id="addUser"
		class="item">
		<a href="addUser.jsp" target="mainFrame">增加用户</a>
	</div>

</body>
</html>
