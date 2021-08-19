<%-- 


    Document   : order
    Created on : Apr 10, 2021, 11:45:11 AM
    Author     : Windows10
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%>  
<!DOCTYPE html>
<html>
<head>
<title>Your Order</title>
<meta charset="utf-8" />
        <link rel="stylesheet" href="css/admfooter.css">
<link rel="stylesheet" href="css/product.css" media="screen" type="text/css" />
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
 <script type="text/javascript" src="js/jquery.shop.js"></script>
</head>

<body id="checkout-page">
     
    <div class="header" style="display: flex">
                   <div class='head-name' style='width: 50%; text-align: left; padding: 10px;'>
                       <h1 style="color: white; font-weight: bolder;font-size: 30px;">FARMER'S BUDDY</h1>
                   </div>
        <div class="Cart" style="width: 50%;">
               <a href="LogInCustomer.jsp" class="uid"><li class="fa fa-user-circle-o"></li><b><%
                           String uid=(String)session.getAttribute("uids");
                           if(uid==null)
                           {
                             out.println("LogIn");
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
                           %></b></a>
               <a href="Register.jsp"><li class="fa fa-user-plus"></li><b>Register</b></a>
               <a href="cart.jsp"><li class="fa fa-shopping-cart"></li><b>Cart</b></a>
                </div>
     </div>

<div id="site">
	<header id="masthead">
		<h1>Farmer's Buddy <span class="tagline">Extra Care For Plant's</span></h1>
	</header>
	<div id="content">
		<h1>Your Order</h1>
			<table id="checkout-cart" class="shopping-cart">
			  <thead>
				<tr>
					<th scope="col" id='pname' name='pname'>Item</th>
					<th scope="col" id='pqty' name='pqty'>Qty</th>
					<th scope="col" id='pprice' name='pprice'>Price</th>
				</tr>
			  </thead>
			  <tbody>
			  
			  </tbody>
			</table>
		 <div id="pricing">
			
			<p id="shipping">
                            <strong>Shipping</strong>: <span id="sshipping" name="shipping" id="shipping"></span>
			</p>
			
			<p id="sub-total">
				<strong>Total</strong>: <span id="stotal" name="total" id="total"></span>
			</p>
		 </div>
		 
		 <div id="user-details">
		 	<h2>Your Data</h2>
		 	<div id="user-details-content"></div>
		 </div>
                 
<form id="paypal-form" action="" method="post">
	<input type="hidden" name="cmd" value="_cart" />
	<input type="hidden" name="upload" value="1" />
	<input type="hidden" name="business" value="" />
        
	<input type="hidden" name="currency_code" value="" />
	<input type="submit" id="paypal-btn" class="btn" value="Pay with PayPal" />
 </form>
                    
	</div>
	
</div>

               
               <!-- </footer> -->

 <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>
            <center><h1><span>FARMER'S </span>BUDDY</h1></center>
        </div>
        <div class="myfooter">
            <div class="infoa">
                <h1>FARMER'S BUDDY</h1>
                <p>The Farmer's Buddy is the shopping Website for indian farming community. Easy user interface of the Farmer's Buddy is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>
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


<%@ page import ="java.sql.*,java.util.*"%>
<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String city = request.getParameter("city");
String address = request.getParameter("address");
String  zip = request.getParameter("zip");
String country = request.getParameter("country");
String item = request.getParameter("item_name");
String qty = request.getParameter("quantity_");
String total = request.getParameter("amount_");
String shipping = request.getParameter("shipping_");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
Statement st=con.createStatement();
int i=st.executeUpdate("insert into orders(name,email,city,address,zip,country,item,qty,total,shipping)values('"+name+"','"+email+"','"+city+"','"+address+"','"+zip+"','"+country+"','"+item+"','"+qty+"','"+total+"','"+shipping+"')");
 
  if(i>0)
  {
    out.println("Data Inserted Successfully");
  }
  else
  {
 
  }
  }
  catch(Exception e)
  {
      out.println(e);
  }
%>