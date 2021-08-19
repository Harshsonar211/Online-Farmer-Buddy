<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%>
<%
 
  String uid = request.getParameter("uid");
  String pass = request.getParameter("pass");
  
  Class.forName("com.mysql.jdbc.Driver");
  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
  Statement st=con.createStatement();
  ResultSet rs;
  rs=st.executeQuery("select * from register where uid='"+uid+"'and pass='"+pass+"'");
  
  if(rs.next())
  {
      session.setAttribute("uids",uid);
    response.sendRedirect("index.jsp");
  }
  else
  {
    response.sendRedirect("LogInCustomer.jsp");
  }
%>