<%@ page language="java" import="java.util.*,com.hearthealth.run.bo.User" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>My JSP 'homepage_admin.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<script type="text/javascript">
var users = '<%=request.getAttribute("userList_json")%>';
</script>

</head>

<frameset cols="200,*">
	<frame name="index" src="pages/account/homepage_admin_index.jsp">
	<frame name="mainFrame" src="pages/account/homepage_admin_content.jsp">
</frameset>
</html>
