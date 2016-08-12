<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int a=Integer.parseInt(request.getParameter("num1"));
int b=Integer.parseInt(request.getParameter("num2"));

if(request.getParameter("Calculate").equals("Add"))
{
	out.println("sum="+(a+b));
	
}
else if(request.getParameter("Calculate").equals("subtract"))
{out.println("Difference="+(a-b));
	
}
else if(request.getParameter("Calculate").equals("Multiply"))
{out.println("Product="+(a*b));
	
}
else if(request.getParameter("Calculate").equals("Division"))
{
	out.println("Division="+(a/b));
	
}

%>
</body>
</html>