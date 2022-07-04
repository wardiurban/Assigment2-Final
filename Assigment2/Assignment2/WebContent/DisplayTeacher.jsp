<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Teacher"%>
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
		<th>Teacher ID</th>
		<th>Teacher Name</th>
	</tr>
<%
Object obj =request.getAttribute("obj");
List<Teacher> listOfTc = (List<Teacher>)obj;
Iterator<Teacher> li = listOfTc.iterator();

while(li.hasNext()){
  Teacher t  = li.next();
%>
	<tr>
		<td><%=t.getTid() %> </td>
		<td><%=t.getTname() %> </td>
	</tr>
  <%
}
%>
</table>
</body>
</html>