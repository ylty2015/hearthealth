<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>登录页面</title>

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
	<form method="get" action="loginAction">
		<div id="loginFrame"
			style="
  	width:200px;
  	height:200px;
  	margin-left:500px;
  	margin-top:170px;
  	padding-left:50;
  	padding-top:50;
  	border:1px dotted;
  	border-color:#777777">
			<div>
				<label for="username">
					用户名：
				</label>
				<input type="text" id="username" name="username" width="150"
					size="10" />
			</div>

			<div>
				<label for="password">
					密&nbsp;&nbsp;码：
				</label>
				<input type="password" id="password" name="password" width="150"
					size="10" />
			</div>
			<div style="margin-left:30px;
						margin-top:20px;">
				<input style="width:100px;height:40px;" type="submit" id="loginBtn" value="登&nbsp;&nbsp;录"/>
			</div>
			
		</div>
		</form>
	</body>
</html>
