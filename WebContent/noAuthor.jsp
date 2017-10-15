<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="style.css"/>
<title>没有找到作者</title>
</head>
<body>
<a href = "index.jsp">主页</a> <hr>
你输入的AuthorID不在数据库中,请先加入作者
<s:form action="changeAuthorJ">
    <s:submit value = "新增作者"/>
</s:form>
</body>
</html>