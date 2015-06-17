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

<title>My JSP 'addUser.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<style type="text/css">
#frameDiv {
	width: 400;
	height: 500;
	margin-left: 100px;
	margin-top: 30px;
}

.item {
	margin-bottom: 10;
}

#submitBtn {
	width: 155px;
	height: 30px;
}
</style>

<script type="text/javascript">
	function verify(confirmPassword){
		var password = document.getElementById("password").value;
		if(password!=confirmPassword){
			document.getElementById("passwordCheckResult").innerText = "两次密码输入不一致!";
		}
		else{
			document.getElementById("passwordCheckResult").innerText = "";
		}
	}
	
	function submit(){
		document.getElementById("registerForm").submit();
	}
</script>


</head>

<body>
	<form id="registerForm" action="registerUser" method="post">
		<div id="frameDiv">
			<div id="usernameDiv" class="item">
				<label for="username">用户名</label><br> <input id="username" name="username"
					type="text" />
			</div>
			<div id="passwordDiv" class="item">
				<label for="password">密&nbsp;&nbsp;码</label><br> <input name="password"
					id="password" type="password" />
			</div>
			<div id="confirmPasswordDiv" class="item">
				<label for="confirmPassword">确认密码</label><br> <input
					id="confirmPassword" type="password" onblur="verify(this.value)"/>
					<span id="passwordCheckResult" style="color:red;font-style:italic;font-weight:bold"></span>
			</div>
			<div id="realNameDiv" class="item">
				<label for="realName">真实姓名</label><br> <input id="realName" name="realName"
					type="text" />
			</div>
			<div>
				<input id="submitBtn" onclick="submit()" type="button" value="提交" />
			</div>
		</div>
	</form>
</body>
</html>

