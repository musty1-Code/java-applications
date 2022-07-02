<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Date"%> <%@page import="java.text.DateFormat"%> <html> 
<head><title>Today’s Date </title></head> 
<body style="background-color:blue"> 

<% 
DateFormat dateFormat =DateFormat.getDateInstance(DateFormat.LONG); 

String s = dateFormat.format(new Date()); 

out.println("Today is " + s); 
%>
</body>
</html>
