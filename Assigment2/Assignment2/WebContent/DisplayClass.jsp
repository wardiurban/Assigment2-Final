<%@page import="com.bean.Class"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border="1">
	<tr>
		<th>Class ID</th>
		<th>Class Name</th>
	</tr>
<%
Object obj =request.getAttribute("obj");
List<Class> listOfCl = (List<Class>)obj;
Iterator<Class> li = listOfCl.iterator();

while(li.hasNext()){
  Class c  = li.next();
  %>
	<tr>
		<td><%=c.getCid() %> </td>
		<td><%=c.getCname() %> </td>
	</tr>
  <%
}
%>
</table>
</body>
</html>