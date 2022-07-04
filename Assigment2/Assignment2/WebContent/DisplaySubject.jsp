<%@page import="com.bean.Subject"%>
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
		<th>Subject ID</th>
		<th>Subject Name</th>
		<th>Class</th>
		<th>Teacher</th>
		
	</tr>
<%
Object obj =request.getAttribute("obj");
List<Object[]> listOfSu = (List<Object[]>)obj;
Iterator<Object[]> li = listOfSu.iterator();

while(li.hasNext()){
  Object s[]  = li.next();
  %>
	<tr>
		<td><%=s[0] %> </td>
		<td><%=s[1] %> </td>
		<td><%=s[2] %> </td>
		<td><%=s[3] %> </td>
	</tr>
  <%
}
%>
</table>
</body>
</html>