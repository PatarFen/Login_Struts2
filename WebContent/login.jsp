<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<s:property value = "message"/>
<s:form action="login">
    <s:textfield label = "Username" key="user" />
    <s:password label = "Password" key="password" />
    <s:submit />
</s:form>
</body>
</html>