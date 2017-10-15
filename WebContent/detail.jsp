<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@page import="lab2.Details"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>详细信息</title>
</head>
<body>
<a href = "index.jsp">主页</a> <hr>
<table >
<caption align="top">作者</caption>
  <tr>
   <td>AuthorID:</td>
  <td><s:property value='author.AuthorID'/></td>
</tr>
 <tr>
   <td>Name:</td>
  <td><s:property value='author.Name'/></td>
</tr>
<tr>
   <td>Age:</td>
  <td><s:property value='author.Age'/></td>
</tr>
<tr>
   <td>Country:</td>
  <td><s:property value='author.Country'/></td>
</tr>
<tr>
 </tr>
</table>
<hr>
<table >
<caption align="top">图书</caption>
  <tr>
   <td>ISBN:</td>
  <td><s:property value='book.ISBN'/></td>
</tr>
 <tr>
   <td>Title:</td>
  <td><s:property value='book.Title'/></td>
</tr>
<tr>
   <td>AuthorID:</td>
  <td><s:property value='book.AuthorID'/></td>
</tr>
<tr>
   <td>Publisher:</td>
  <td><s:property value='book.Publisher'/></td>
</tr>
<tr>
   <td>PublishDate:</td>
  <td><s:property value='book.PublishDate'/></td>
</tr>
<tr>
   <td>Price:</td>
  <td><s:property value='book.Price'/></td>
  <td></td>
</tr>
<tr>
<td></td><td></td><td><a href='<s:url action="changeBookJ">
    		<s:param name="ISBN" value="book.ISBN" /></s:url>'>编辑</a></td>
    		<td><a href='<s:url action="deleteBook">
    		<s:param name="ISBN" value="book.ISBN" /></s:url>'>删除</a></td>
 </tr>
</table>
</body>
</html>