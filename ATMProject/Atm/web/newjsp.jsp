<%-- 
    Document   : newjsp
    Created on : 29 Sep, 2017, 9:02:55 AM
    Author     : siddhrajsingh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                  int acc=(Integer)pageContext.getAttribute("Account_no", PageContext.SESSION_SCOPE);
                  out.println("Your Account No is : "+acc);
                  String name=(String)pageContext.getAttribute("name",PageContext.SESSION_SCOPE);
                  out.println("<br>Your Name is : "+name);
        %>
    </body>
</html>
