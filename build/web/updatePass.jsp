<%-- 
    Document   : updatePass
    Created on : May 3, 2021, 8:43:34 PM
    Author     : Windows7
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%

String pass=request.getParameter("newpass");
String userid=request.getParameter("uid");

try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
   PreparedStatement ps=conn.prepareStatement("update register set pass=? where uid=?");
   ps.setString(2,userid);
	ps.setString(1,pass);
	int i=ps.executeUpdate();
       
	
		response.sendRedirect("index.jsp");
	
}
catch(Exception e)
{
    System.out.print(e);
    e.printStackTrace();
}
%>
    </body>
</html>
