<%-- 
    Document   : displayCancelOrder
    Created on : May 2, 2021, 11:07:16 PM
    Author     : Windows7
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cancel Request</title>
        <link rel="stylesheet" href="css/admfooter.css">
        
        <%-- bootstrap 5 for nav --%>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    </head>
    <body>
        <button><a href="AdminHome.jsp">Home</a></button>
        

    <!--<div class="container-fluid" style="background-color: #24104f">
    
     <div class="row" style="background-color: #24104f">
         <div class="col-8"><h1 style="color: white">FARMER'S BUDDY</h1></div>
         <div class="col-4" style="background-color: #24104f">
             <nav class="navbar navbar-expand-lg navbar-light d-flex" style="color: white;background-color: #24104f; float: right">
    
                 <h5> <a class="nav-link" href="AdminHome.jsp" style="color: white;">Home</a></h5>
                 <h5> <a class="nav-link" href="#" style="color: white;">Profile</a></h5>
                 <h5> <a class="nav-link" href="#" style="color: white;">Logout</a></h5>
    
            </nav>
         </div>
     </div>
  </div>-->

        
        
        
        <div class="container" style="background-color: ghostwhite">
    <center>   <h2 style="margin-top: 20px; margin-bottom: 30px;"> <span class="badge bg-warning text-dark">Order Cancellation Request</span></h2></center>
        
        <div class="table-responsive" style="margin-top: 20px; margin-bottom: 30px;">
  <table class="table">
     <thead>
    <tr>
      <th scope="col">Request ID</th>
      <th scope="col">Name</th>
      <th scope="col">Email</th>
      <th scope="col">Invoice No.</th>
     <th scope="col">Reason for cancellation</th>
      <th scope="col">Action</th>
       
    </tr>
    </thead>
  <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM cancelrequest";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) 
                {
                     int id =Integer.parseInt( rs.getString("cid"));
                    String name = rs.getString("c_name");
                    String email = rs.getString("c_email");
                    String invoice = rs.getString("c_invoice");
                    String reason = rs.getString("c_reason");
        %>
  <tbody>
   <tr>
      <th scope="row"><%=id%></th>
      <td><%=name%></td>
                <td><%=email%></td>
                <td><%=invoice%></td>
                <td><%=reason%></td>
                <td><button type="button" class="btn btn-primary">Accept</button></td>
    </tr>
  </tbody>
  
   <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
  
  </table>
</div>
</div>
        
    </body>
</html>
