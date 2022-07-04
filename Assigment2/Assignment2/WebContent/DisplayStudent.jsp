<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Student"%>
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
		<th>Student ID</th>
		<th>Student Name</th>
		<th>Class</th>
		
	</tr>
<%
Object obj =request.getAttribute("obj");
List<Object[]> listOfSt = (List<Object[]>)obj;
Iterator<Object[]> li = listOfSt.iterator();

while(li.hasNext()){
  Object s[]  = li.next();
  %>
	<tr>
		<td><%=s[0]%> </td>
		<td><%=s[1] %> </td>
		<td><%=s[2] %> </td>
	</tr>
  <%
}
%>
</table>
</body>
</html>