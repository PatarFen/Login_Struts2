<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="tutorials/getTutorial">
    <s:textfield label = "Enter the language you want to search for" key="language" />
    <s:submit />
</s:form>
</body>
</html>