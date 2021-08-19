 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%>
<%
  String fname = request.getParameter("fname");
  String mobno = request.getParameter("mobno");
  String uid = request.getParameter("uid");
  String subject = request.getParameter("subject");

  try
  {
  Class.forName("com.mysql.jdbc.Driver");
  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
  Statement st=con.createStatement();
  int i=st.executeUpdate("insert into contact(fname,mobno,uid,subject)values('"+fname+"','"+mobno+"','"+uid+"','"+subject+"')");
  //out.println("Data Inserted Successfully");
  if(i>0)
  {
    response.sendRedirect("index.jsp");
    //System.out.println("Registration Successful!"+"<a href='Cart.jsp'>You Can Buy Now</a>");
  }
  else
  {
  response.sendRedirect("LogInCustomer.jsp");
  }
  }
  catch(Exception e)
  {out.println(e);
  }
%>