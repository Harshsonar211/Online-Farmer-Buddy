<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ page import ="java.sql.*,java.util.*"%> 
<html lang="en">
<head>
	<meta charset="UTF-8"><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Farmer's Buddy</title>

	<link rel="preconnect" href="https://fonts.gstatic.com" />
	<link href="https://fonts.googleapis.com/css2?family=Fira+Sans:ital,wght@0,400;0,600;0,700;0,900;1,400;1,600;1,700&display=swap" rel="stylesheet" />
        <link rel="stylesheet" href="css/admfooter.css" >
	<link rel="stylesheet" href="homecss.css" >
        <script src="js/script.js">
            </script>
        
               <style>
.dropdown {
  position: relative;
  display: inline-block;
  color:inherit;
  font-size:20px;
text-decoration:none;
  font-family:'Fira Sans', sans-serif;
}

.dropdown-content {
    
    border-radius: 5px;
  display: none;
  position: absolute;
  background-color:#24104f;
  opacity: 0.9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  padding: 12px 16px;
  z-index: 1;
}
.dropdown li{
    padding: 3px;
    font-weight: 100;
    border-bottom: 1px black;
}

.dropdown:hover .dropdown-content {
  display: block;
  
}
</style>
     
</head>
<body>
   
	<header>
		<div class="container">
			<h2><span>Farmer's</span> Buddy</h2>
			<nav>
                            <b><a href="index.jsp">Home</a>  </b>             
                                 <!--<a href="cart.jsp">Cart</a> -->
                                 <b> <a href="updateprofile.jsp">Profile</a></b>
                                
                                
                                <div class="dropdown">
                                    <b><span><%
                           String uid=(String)session.getAttribute("uids");
                           if(uid==null)
                           {
                               out.print("Login");
                                }
                                    Class.forName("com.mysql.jdbc.Driver");
                                      try
                                      {
                                         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
                                         Statement st=con.createStatement();
                                         ResultSet rs=st.executeQuery("select *from register where uid='"+uid+"'");
                                         if(rs.next())
                                         {
                                             out.println(rs.getString(6));
                                         }
                                      }
                                      catch(Exception e)
                                      {
                                      out.println("Error");
                                      }

                                    %></span></b>
                                    <div class="dropdown-content">
                                        <ul style="list-style:none;">
                                               
                          <li><a href="LogInCustomer.jsp"><%
                          
                           if(uid==null){
                               out.print("login");
                           }
                           
                           Class.forName("com.mysql.jdbc.Driver");
                                      try
                                      {
                                         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
                                         Statement st=con.createStatement();
                                         ResultSet rs=st.executeQuery("select *from register where uid='"+uid+"'");
                                         if(rs.next())
                                         {
                                             out.println(rs.getString(6));
                                         }
                                      }
                                      catch(Exception e)
                                      {
                                      out.println("Error");
                                      }

                           %></a></li>
                                <li><a href="AdminLogIn.jsp" >Admin Login</a></li>
                                <li><a href="logout.jsp" >LogOut</a></li>
                                        </ul>
                                    </div>
                                </div>

                                <b><a href="Register.jsp">Register</a></b>
                                    
			</nav>
			<button class="hamburger">
				<div class="bar"></div>
			</button>
		</div>
	</header>
	<nav class="mobile-nav">
		<a href="index.jsp">Home</a>
		<a href="fertilizer.jsp">Services</a>
		<a href="cart.jsp">My Cart</a>
		<a href="LogInCustomer.jsp">Log In</a>
	</nav>
	<main>
		<section class="banner">
			<div class="container">
				<h1>
					Farmer's Buddy <br class="hide-mob" />
					<span>Extra care</span> for Plant's...
				</h1>

				<h3>Extra Care for Plant's</h3>

				<a href="#" style="background-image:url(img/logo.png);height: 90px; width: 250px;" class="button"></a>
			</div>
		</section>

		<section id="services" class="services">
			<div class="container">
				<h2>Services</h2>
				
                                <div class="services-grid" style="margin-left: 250px;">

					 <div class="service">
						<figure class="img-box">
							<img src="img/cust-service.jpg" alt="Website Service" class="img" />
						</figure>
						<div class="content">
							<h3>24 X 7 Customer Service</h3>
							<p>
								we also provide 24/7 customer service, if customer has any queries regarding products or delivery then he can simply
                                                                contact us by filling contact us form.
							</p>
						</div>
					</div> 

					<div class="service">
						<figure class="img-box">
							<img src="img/speed-deliver.jpg" alt="App Service" class="img" />
						</figure>
						<div class="content">
							<h3>Speed Delivery</h3>
							<p>
                                                                we provide speed delivery of product at your specified destination will be reach within 24 hours.
							</p>
						</div>
					</div>
					
					<div class="service">
						<figure class="img-box">
							<img src="img/paysecure.jpg" alt="Games Service" class="img" />
						</figure>
						<div class="content">
							<h3>Pay Online</h3>
							<p>
								We accept multiple modes of payment such as Credit Cards, Debit Cards. 
                                                                Besides these payment modes Currently, we prefer Pay-pal international payment Gateway.
							</p>
						</div>
					</div>

					<%--<div class="service">
						<figure class="img-box">
							<img src="img/cash-on-delivery.jpg" alt="Mentoring Service" class="img" />
						</figure>
						<div class="content">
							<h3>Cash On Delivery</h3>
							<p>
								Lorem ipsum dolor, sit amet consectetur adipisicing elit. Officiis beatae, cumque mollitia laudantium fugiat
								perspiciatis saepe. Delectus praesentium numquam quas?
							</p>
						</div>
					</div> --%>

				</div>
			</div>
		</section>

		<section class="projects" id="projects">
			<div class="container">
				<h2>Category</h2>
				
				<div class="projects-grid">
					<div class="project">
						<div class="content">
							<h3>Fertilizer</h3>
							<p> Fertilizer is a natural or synthetic substance that is applied to the soil or the plants to improve growth and productivity. They provide nutrients to the plants.</p>
							<a href="fertilizer.jsp" class="button">Shop Now</a>
						</div>
					</div>
					<div class="project2">
						<div class="content">
							<h3>Pesticides</h3>
							<p>Pesticides are chemical compounds that are used to kill pests, including insects, rodents, fungi and unwanted plants (weeds). Over 1000 different pesticides are used around the world.</p>
							<a href="pesticides.jsp" class="button">Shop Now</a>
						</div>
					</div>
					<div class="project3">
						<div class="content">
							<h3>Seeds</h3>
							<p>Seeds are the primary basis for human sustenance. They are the repository of the genetic potential of crop species and their varieties resulting from the continuous improvement and selection over time.</p>
							<a href="seeds.jsp" class="button">Shop Now</a>
						</div>
					</div>
				
				</div>

				<div class="center">
					<a href="#" class="button"></a>
				</div>
			</div>
		</section>

	<%--footer--%>
        
        <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>
            <center><h1><span>FARMER'S </span>BUDDY</h1></center>
        </div>
        <div class="myfooter">
            <div class="info">
                <h1>FARMER'S BUDDY</h1>
               <p>The FarmerBuddy is the Online shopping Website for indian farming community. 
               Easy user interface of the FarmerBuddy is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>
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
                <a href="https://www.privacypolicies.com/live/3d5057cf-8805-40af-b65e-06383e5936f4" class="mid-links">Privacy</a>
                <a href="https://www.privacypolicies.com/live/c9f94ba0-c63b-41c5-8460-0099716bcbd7" class="mid-links">Terms & Condition</a>
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
               <script src="js/main.js"></script>
</body>
</html>
