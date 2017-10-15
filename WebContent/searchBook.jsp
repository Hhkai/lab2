<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="lab2.Search"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>查询图书</title>
</head>
<body>
<a href = "index.jsp">主页</a> <hr>
查询到图书:
<br />
<table  >

<s:iterator id="u" value="books"> 
    <tr onmouseover="this.style.backgroundColor='#00FFFF';" onmouseout="this.style.backgroundColor='#EEEEEE';">
    <td><s:property value='#u.Title'/></td>
    <td> <a href='<s:url action="detail"><s:param name="ISBN" value='#u.ISBN' /></s:url>'>详细信息</a>
	</td>
    </tr>
</s:iterator>

</table>
</body>
</html>
