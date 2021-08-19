<%-- 
    Document   : about_us
    Created on : Apr 25, 2021, 10:10:13 PM
    Author     : Windows7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link rel="stylesheet" href="css/about_us.css">
    </head>
    <body>
         <header>
            <div class="head-main">
                <div class="left-section">
                    <h1>FARMER'S BUDDY</h1>
                </div>
                <div class="right-section">
                    
                    <span><a href="updateprofile.jsp">Profile</a></span>
                    <span><a href="#">Home</a></span>
                    
                </div>
                
            </div>
        </header>
        
        <div class="main-body">
            <div class="about-us">
                <h1>About Us</h1>
                <p>The Farmer's Buddy (Registered Business Name- Farmer's Buddy Agri Services)  is the shopping Website for indian farming community. 
                    Easy user interface of the Farmer's Buddy is farmer friendly and doorstep delivery of the products save the precious time of farmers. 
                    Shop on Farmer's Buddy for hybrid seeds, genetically modified seeds, fertilizers, fungicides, pesticides, insecticides and more.               
                    The Farmer's Buddy gives you an amazing shopping experience even in low bandwidth areas. 
                Get the detailed product description and best agriculture practices by the Agricultural specialists. You have got the powers to share the information on WhatsApp, Facebook, Twitter, and through other media to your friends and family.</p>
            </div>
            <div class='mid-info'>
                <h2>The products available on Farmer's Buddy are...</h2>
                <span>Fertilizers</span><br>
                <ul>
                    <li>Sprayer Fertilizer</li>
                    <li>Liquid Concentrated Fertilizer</li>
                    <li>Inorganic Fertilizer</li>
                    <li>Organic Fertilizer</li>
                   
                </ul>
                <span>Pesticides</span><br>
                 <ul>
                    <li>Insecticides</li>
                    <li>Fungicides</li>
                    <li>Weedicides</li>
                    
                </ul>
                <span>Seeds</span><br>
                 <ul>
                    <li>Vegetable seeds</li>
                    <li>Flower seeds</li>
                    <li>Fruits seeds</li>
                    <li>Crop seeds</li>
                    
                </ul>
            </div>
            <div class="about-last">
                <h2>Safe and secure shopping.</h2>
                <p>Farmer's Buddy is complete safe and secure, we are soon going to integrate paypal payment gateways on our website. 
                    With world wide use payment gateway there is no risk of leakages of your important banking information.</p>
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
