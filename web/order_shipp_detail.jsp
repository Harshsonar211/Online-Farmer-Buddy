<%-- 
    Document   : order_shipp_detail
    Created on : Apr 25, 2021, 11:00:52 PM
    Author     : Windows7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online ordering and Shipping</title>
        <link rel="stylesheet" href="css/header_footer.css">
        <link rel="stylesheet" href="css/order_shipp.css">
        
    </head>
    <body>
        
         <header>
            <div class="head-main">
                <div class="left-section">
                    <h1>FARMER'S BUDDY</h1>
                </div>
                <div class="right-section">
                    
                    <span><a href="updateprofile.jsp">Profile</a></span>
                    <span><a href="index.jsp">Home</a></span>
                    
                </div>
                
                
            </div>
        </header>
        
          <%-- Body--%>
          <div class='main-body'>
              <div class="order-guide-head">
                  <h1>Guidelines for Order & Shipping</h1>
                  <p>There are some guidelines and steps to be aware with the Farmer' Buddy.
                  you can buy the various products as it's category. </p>
              </div>
              <div class='order-steps'>
                    <h2>Steps to Order & Purchase </h2>
                   <h3>Step 1 :  <span>First Register to our Website and Login</span></h3>
                   <h3>Step 2 :  <span>Go to Category at below and you can click as your wish.</span></h3>
                   <h3>Step 3 :  <span>You can search products as you want.</span></h3>
                   <h3>Step 4 :  <span>Click on Add to cart</span></h3>
                   <h3>Step 5 :  <span>Click on Check-out Button</span></h3>
                   <h3>Step 6 :  <span>Fill the Shipping/delivery details.</span></h3>
                   <h3>Step 7 :  <span>Click on pay-pal button for online payment and once payment is done ,your order will be placed.</span></h3>
              </div>
              <div class="shipping-details">
                  <h2>Shipping & Delivery</h2>
                  <p>After placing order shipping and delivery of product are done by delivery boy. The order will be deliver within 24 hour's
                  The product will be delivered at customer specified address.</p>
              </div>
              
              <div class="shipping-details">
                  <h2>Return & Exchange</h2>
                  <p>After delivery of product, customer have any problem with order like damaged product, another product receive or any other queries then the customer can easily fill the "contact us" form likewise, Admin /owner
                  can solve customer queries and fulfill the customer requirements.</p>
              </div>
              <div class="shipping-details">
                  <h2>Cancel Order</h2>
                  <p>If customer has cancel the order for any reason then he can fill "Order cancellation" at cart page likewise, Admin /owner
                  can view cancel orders and refund will be process in 2 working days.</p>
              </div>
          </div>
        
       
            <%-- Footer--%>
            
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
