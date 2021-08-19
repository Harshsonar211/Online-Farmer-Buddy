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
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
       <TITLE>The View Of User Feedback </TITLE>
       </HEAD>
       <BODY>
           <button><a href="AdminHome.jsp">Home</a></button>
           <center>   <h2 style="margin-top: 20px; margin-bottom: 30px;"> <span class="badge bg-warning text-dark">Feedback</span></h2></center>

       <%
           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("SELECT * FROM feedback") ;
       %>
       <div class="container">
       <div class="table-responsive" style="margin-top: 20px; margin-bottom: 30px;">
           <TABLE class="table">
               <THEAD>
       <tr>
           <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col">Experience</th>
                <th scope="col">Message</th>
       </tr></thead>
          <%while(resultset.next()){ %>
               <TBODY> <TR>
       <TD> <%= resultset.getString(1) %></td>
       <TD> <%= resultset.getString(2) %></TD>
       <TD> <%= resultset.getString(3) %></TD>
       <TD> <%= resultset.getString(4) %></TD>
                   </TR><TBODY>
      <% } %>
     </TABLE>
     </BODY>
</HTML>