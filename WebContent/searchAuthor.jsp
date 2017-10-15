<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="lab2.Search"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>查询作者</title>
</head>
<body>
<a href = "index.jsp">主页</a> <hr>
查询到作者:
<br />
<table  >
<tr bgcolor="#D19275">
<th>AuthorID</th><th>Name</th><th>Age</th>
<th>Country</th>
</tr>
<s:iterator id="u" value="authors"> 
    <tr onmouseover="this.style.backgroundColor='#00FFFF';" onmouseout="this.style.backgroundColor='#EEEEEE';">
    <td><s:property value='#u.AuthorID' /></td>
    <td><s:property value="#u.Name"/></td>
    <td><s:property value='#u.Age'/></td>
    <td><s:property value='#u.Country'/></td>
    <td> <a href='<s:url action="book">
    		<s:param name="authorID" value="#u.AuthorID" /></s:url>'>查看图书</a>
	</td>
	<td><a href='<s:url action="changeAuthorJ">
    		<s:param name="authorID" value="#u.AuthorID" /></s:url>'>编辑</a></td>
    		<td><a href='<s:url action="deleteAuthor">
    		<s:param name="authorID" value="#u.AuthorID" /></s:url>'>删除</a></td>
    </tr>
</s:iterator>

</table>
</body>
</html>
