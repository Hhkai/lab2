<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>欢迎访问</title>
</head>
<body>
<a href = "index.jsp">主页</a> <hr>
<s:form action="searchAuthor">
    <s:textfield name="authorName" label="作者名字" />
    <s:submit value = "搜索"/>
</s:form>
<br />
<s:form action="searchAllAuthor">
    <s:submit value = "查询全部作者"/>
</s:form>
<s:form action="changeAuthorJ">
    <s:submit value = "新增作者"/>
</s:form>
<s:form action="changeBookJ">
    <s:submit value = "新增图书"/>
</s:form>
</body>
</html> 