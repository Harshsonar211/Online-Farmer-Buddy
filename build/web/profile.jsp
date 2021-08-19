<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%>    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
         
        <title>User Profile</title>
         <link rel="stylesheet" type="text/css" href="css/pro.css">
          <link rel="stylesheet" href="css/footer.css" media="screen" type="text/css" />
    </head>
   
    <body>
         <form method="POST" action="updateprofile.jsp">  
              <div class="header" style="display: flex">
                  <h1>FARMER'S BUDDY</h1>
                  <div class="Cart" style="width: 50%;">
               
               <a href="index.jsp"><li class="fa fa-lock"></li><b>LogOut</b></a>
               <a href="index.jsp"><li class="fa fa-home"></li><b>Home</b></a>
              </div>
              </div> 
        <div class="main">

		<div class="first">
		<center><h2>To <br>FARMER'S</h2></center>
		<center><p class="line">"A good farmer<br> is
		nothing
		more nor less <br>than a
		handy man <br>with
		a sense of 
		humus."</p></center>
		</div>
		<div class="second">
                       <%                 
                             String uid=(String)session.getAttribute("uids");
                            if(uid==null)
                              {
                                response.sendRedirect("index.jsp");
                              }
                             else if(uid!=null)
                             {
                                response.sendRedirect("updateprofile.jsp");
                             }
                                      Class.forName("com.mysql.jdbc.Driver");   
                                      try
                                      {
                                          
                                            String user = request.getParameter("name");
                                            String add = request.getParameter("add");
                                            String email = request.getParameter("email");
                                            String mob = request.getParameter("mob");
                                         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
                                         Statement st=con.createStatement();
                                         //st.executeUpdate("update register set name='"+user+"',address='"+add+"',email='"+email+"', mobile='"+mob+"'");
                                         ResultSet rs=st.executeQuery("select *from register where uid='"+uid+"'");
                                         if(rs.next())
                                         {
                                    %>
                    <center><h1>Profile</h1> 
                        <h1>Welcome,<%out.println(rs.getString(6));%></h1>
                        </center>
				<div class="show">
				<label><b>Name:</b></label><br>
                                <input type="text" name="name" class="data" id="field1" disabled value=<%out.println(rs.getString(1));%>>
				</div>
				
				<div class="show">
				<label><b>Address:</b></label><br>
				<input type="text" class="data" id="field2" name="add" disabled value=<%out.println(rs.getString(3));%> >
				</div>
				
				<div class="show">
				<label><b>Contact No.:</b></label><br>
				<input type="text" class="data" id="field3" name="mob" disabled value=<%out.println(rs.getString(5));%> >
				</div>
				
				<div class="show">
				<label><b>Email-id:</b></label><br>
				<input type="text" class="data" id="field4" name="email" disabled value=<%out.println(rs.getString(4));%>><br>
				</div>
				<div class="btn-edit">
				<center><a href="updateprofile.jsp"><button class="btn" onclick="letDisable()" id="field5" value="Edit">Edit Profile                                    
                                    </button></a>
                                      </center>  
                                    
                                    
                                    
                                    
	
                                <%
                                }
}
catch(Exception e)
{
}
                                %>
                                </div>
	</div>
        </div>
        </form>
    <script>
       
        function letDisable() {
		  document.getElementById("field1").disabled = false;
		  document.getElementById("field2").disabled = false;
		  document.getElementById("field3").disabled = false;
		  document.getElementById("field4").disabled = false;
		  document.getElementById("field5").disabled = true;
                  document.getElementById("field6").disabled = false;
		}
    </script>
    
    </body>
</html> 
 
 