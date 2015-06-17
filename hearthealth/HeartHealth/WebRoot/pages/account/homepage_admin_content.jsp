<%@ page language="java" import="java.util.*,com.hearthealth.run.bo.User" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
<head>
	 <base href="<%=basePath%>">

    <title id='Description'>Admin homepage</title>
    <link rel="stylesheet" href="jqwidgets/styles/jqx.base.css" type="text/css" />
    <script type="text/javascript" src="scripts/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="jqwidgets/jqxcore.js"></script>
    <script type="text/javascript" src="jqwidgets/jqxdata.js"></script> 
    <script type="text/javascript" src="jqwidgets/jqxbuttons.js"></script>
    <script type="text/javascript" src="jqwidgets/jqxscrollbar.js"></script>
    <script type="text/javascript" src="jqwidgets/jqxmenu.js"></script>
    <script type="text/javascript" src="jqwidgets/jqxgrid.js"></script>
    <script type="text/javascript" src="jqwidgets/jqxgrid.selection.js"></script> 
    <script type="text/javascript" src="jqwidgets/jqxgrid.columnsresize.js"></script> 
    <script type="text/javascript" src="jqwidgets/jqxlistbox.js"></script>
    <script type="text/javascript" src="jqwidgets/jqxdropdownlist.js"></script>
    <script type="text/javascript" src="scripts/demos.js"></script>
    <style>
        html, body{width: 100%; height: 100%; overflow: hidden;}
    </style>
    <script type="text/javascript">
        $(document).ready(function () {
            // prepare the data
            var data = new Array();
            
            
            var users = window.parent.users;
            var userArr = eval(users);

            for (var i = 0; i < userArr.length; i++) {
                var row = {};
            	row["username"]=userArr[i].username;
            	row["realName"]=userArr[i].realName;
                data[i] = row;
            }

            var source =
            {
                localdata: data,
                datafields:
                [
                    { name: 'username', type: 'string' },
                    { name: 'realName', type: 'string' }
                ],
                datatype: "array"
            };

            var dataAdapter = new $.jqx.dataAdapter(source);

            $("#jqxgrid").jqxGrid(
            {
                width: '99%',
                height: '99%',
                source: dataAdapter,
                columnsresize: true,
                columns: [
                  { text: '用户名', dataField: 'username', width: 100 },
                  { text: '真实姓名', dataField: 'realName', width: 100 }
                ]
            });
        });
    </script>
</head>
<body class='default'>
      <div id="jqxgrid"></div>
  </body>
</html>
