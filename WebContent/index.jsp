<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>密码</th>
		</tr>
		<%-- <s:debug></s:debug> --%>
		
		<s:iterator value="list" var="user">
			<tr>
				<td><s:property value="id"/></td>
				<td><s:property value="username"/></td>
				<td><s:property value="password"/></td>
			</tr>
		</s:iterator>
		
		<%-- <c:forEach var="usr" items="${list }">
			<tr>
				<td>${usr.id }</td>
				<td>${usr.name }</td>
				<td>${usr.password }</td>
			</tr>
		</c:forEach> --%>
	</table>
</body>
</html>