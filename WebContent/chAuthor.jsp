<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="lab2.Change"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>欢迎访问</title>
</head>
<body>
<a href = "index.jsp">主页</a> <hr>
<table>
<s:form action="changeAuthor">
	<tr>
    <s:textfield name="AuthorID" label="AuthorID"/>
    <s:textfield name="Name" label="Name" />
    <s:textfield name="Age" label="Age" />
    <s:textfield name="Country" label="Country" />
    </tr>
    <tr>
    <td>Insert or Update:</td>
    <td>
    <select name="addOrCh" > 
	<option value="0">修改</option> 
	<option value="1">新增</option> 
	</select></td>
	</tr>
	<tr> 
    <s:submit value = "提交" method = "changeAuthor" />
    </tr>
</s:form>
</table>
<br />
<p style="font-family:times;color:red;font-size:12px">
修改时不能修改AuthorID, 但你可以删除作者</p>
</body>
</html> 