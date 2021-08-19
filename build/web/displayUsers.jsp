<%-- 
    Document   : displayUsers
    Created on : 24 Apr, 2021, 11:04:19 PM
    Author     : HP
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<HTML>
       <HEAD>
       <TITLE>The View Of Register Users </TITLE>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
       </HEAD>
       <BODY>
           <button><a href="AdminHome.jsp">Home</a></button>
       <center>   <h2 style="margin-top: 20px; margin-bottom: 30px;"> <span class="badge bg-warning text-dark">Register User Detail</span></h2></center>
       <%
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("SELECT * FROM register") ;
       %>
        <div class="container" style="background-color: ghostwhite">
            <div class="table-responsive" style="margin-top: 20px; margin-bottom: 30px;">
      <TABLE class="table">
          <thead>  
       <tr>
                <th scope="col">Name</th>
                <th scope="col">Gender</th>
                <th scope="col">Address</th>
                <th scope="col">Email</th>
                <th scope="col">Mobile.No</th>
                <th scope="col">User Id</th>
                <th scope="col">Password</th>
            </tr>
          </THEAD>
          <%while(resultset.next()){ %>
          <TBODY>
      <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
       <TD> <%= resultset.getString(5) %></TD>
       <TD> <%= resultset.getString(6) %></TD>
       <TD> <%= resultset.getString(7) %></TD>
      </TR></TBODY>
      <% } %>
     </TABLE>
        </DIV>
        </DIV>
     </BODY>
</HTML>


 