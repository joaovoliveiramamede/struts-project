<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Struts 2 Application - Welcome</title>
    </head>
    <body>
        <h1>Welcome To Struts 2!</h1>
        <s:url action="hello" var="helloLink">
            <s:param name="userName">John</s:param>
        </s:url>

        <p>
            <a href="${helloLink}">Hello</a>
        </p>

        <s:form action="hello">
            <s:textfield name="userName" label="Your name"/>

            <s:submit value="Submit"/>
        </s:form>
    </body>
</html>