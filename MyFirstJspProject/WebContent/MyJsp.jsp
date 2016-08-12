<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
for(int i=1;i<=5;i++)
{
	out.println(i);
}
%>
<%!int j; %>
<% for(j=6;j<=10;j++)
	{%>
	<%=j %>
	<%} %> 
	<%!int instanceVar=1; %>
	<% int localvar=1;
	out.println("instance="+instanceVar);
	out.println("local="+instanceVar);
	localvar++;
	instanceVar++;
	
	%>
</body>
</html>