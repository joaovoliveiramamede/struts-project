<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
  <head><title>Hello World</title></head>
  <body>
    <h2>Message:</h2>
    <s:property value="messageStore.message"/>
  </body>
</html>