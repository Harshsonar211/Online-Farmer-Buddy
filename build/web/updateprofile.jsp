<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%>    
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://code.jquery.com/jquery-2.2.4.min.js"></script>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
          <link rel="stylesheet" href="css/footer.css" media="screen" type="text/css" />
        <title>User Profile</title>
         <link rel="stylesheet" type="text/css" href="css/pro.css">
    </head>
    <body>
         <form method="POST" action="updateprofile.jsp">  
             <div class="header" style="display: flex;">
                   <div class='head-name' style='width: 50%; text-align: left; padding: 10px;'>
                        <h1 style="color: white; font-weight: bolder;font-size: 30px; margin-bottom: 10px;">FARMER'S BUDDY</h1>
                    </div>
                 <div class="Cart" style='width: 50%;'>
               
               <a href="logout.jsp"><li class="fa fa-lock"></li><b>LogOut</b></a>
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
                        <h1>Welcome,<%out.println(rs.getString(6));%></center>
                     
				<div class="show">
				<label><b>Name:</b></label><br>
                                <input type="text" name="name" class="data" id="field1" disabled value="<%out.println(rs.getString(1));%>">
				</div>
				
				<div class="show">
				<label><b>Address:</b></label><br>
				<input type="text" class="data" id="field2" name="add" disabled value="<%out.println(rs.getString(3));%>" >
				</div>
				
				<div class="show">
				<label><b>Contact No.:</b></label><br>
				<input type="text" class="data" id="field3" name="mob" disabled value="<%out.println(rs.getString(5));%>" >
				</div>
				
				<div class="show">
				<label><b>Email-id:</b></label><br>
				<input type="text" class="data" id="field4" name="email" disabled value="<%out.println(rs.getString(4));%>"><br>
				</div>
				<div class="btn-edit">
				<center><button class="btn" onclick="letDisable()"  id="field5" value="Edit">Edit Profile                                    
                                    </button>
                                       
                                         
                                     <button class="btn" id="field6" value="Edit" disabled >Save Profile
                                         <%                 
                                    // String uid=(String)session.getAttribute("uids");                      Class.forName("com.mysql.jdbc.Driver");   
                                   try
                                      {
                                         if(user!=null)
                                         {
                                         st.executeUpdate("update register set name='"+user+"',address='"+add+"',email='"+email+"', mobile='"+mob+"'where uid='"+uid+"'");      
                                         response.sendRedirect("profile.jsp");
                                         }
                                      }
                                   catch(Exception e)
                                   {
                                   }
                                                                 
                                    %></button>
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
            
         
	<%--footer--%>
        
        <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 70px;'>
            <center><h1 style="justify-content: center"><span>FARMER'S </span>BUDDY</h1></center>
        </div>
        <div class="myfooter">
            <div class="info">
                <h1>FARMER'S BUDDY</h1>
               <p>The Farmer's Buddy is the Online shopping Website for indian farming community. 
               Easy user interface of the Farmer's Buddy is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>
             </div>
            <div class="f1">
                <ul class="foot-list">
                    <li><h1>Category</h1></li>
                    <li><a href="fertilizer.jsp" id="foot-hyper">Fertilizer</a></li>
                    <li><a href="pesticides.jsp" id="foot-hyper">Pesticide</a></li>
                    <li><a href="seeds.jsp" id="foot-hyper">Seeds</a></li>
                </ul>
            </div>
            <div class="f2">
                <ul class="foot-list">
                    <li><h1>Get to Know Us</h1></li>
                    
                    <li><a href="about_us.jsp" id="foot-hyper">About Us</a></li>
                      <li><a href="Feedback.jsp" id="foot-hyper">Feedback</a></li>
                    <li><a href="https://farmerbuddy007.blogspot.com/" id="foot-hyper">Blogs</a></li>
                </ul>
            </div>
            <div class="f3">
                <ul class="foot-list">
                    <li><h1>Help & FAQs</h1></li>
                    <li><a href="order_shipp_detail.jsp"> Online Ordering</a></li>
                    <li><a href="Contact.jsp" id="foot-hyper">Contact Us</a></li>
                    <li><a href="order_shipp_detail.jsp">Shipping</a></li>
                    <li><a href="https://www.privacypolicies.com/live/136767c1-dfd8-40f2-bae9-3fac9ec9302b">Return & Exchange</a></li>
                </ul>
            </div>
        </div>
        <div class="social" style="height: 20%; background-color: #24104f">
            <div class="left-social" style="width: 33.33%">
                <a href="https://www.facebook.com/vinod.shirsath.33" class="soc"><img src="img/fb.png" style="height: 35px; width: 35px;"></a>
                <a href="https://twitter.com/RajuShiraath" class="soc"><img src="img/twiter.png" style="height: 35px; width: 35px;"></a>
                <a href="#" class="soc"><img src="img/youtu.png" style="height: 35px; width: 35px;"></a>
                <a href="#" class="soc"><img src="img/insta.png" style="height: 35px; width: 35px;"></a>
                
            </div>
            <div class="mid"style="width: 33.33%">
                <a href="index.jsp" class="mid-links">Home</a>
                <a href="#" class="mid-links">Privacy</a>
                <a href="#" class="mid-links">Terms & Condition</a>
                <div class='copyright'>
                    <p style='color: whitesmoke'> Copyright ©2021-22 Farmer's Buddy Ltd. All rights reserved.</p>
                </div>
            </div>
            <div class="right-paycards" style="width: 33.33%">
                <a href="#" class="pay"><img src="img/paypal.png" style="height: 60px; width: 60px;"></a>
                <a href="#" class="pay"><img src="img/master.png" style="height: 60px; width: 60px;"></a>
                <a href="#" class="pay"><img src="img/visa.png" style="height: 60px; width: 60px;"></a>
                
            </div>
        </div>
      
    </body>
</html> 
 
 