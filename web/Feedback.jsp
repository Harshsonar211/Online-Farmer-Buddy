<%-- 
    Document   : Feedback
    Created on : Apr 1, 2021, 10:22:17 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" type="text/css" href="css/feedbackcss.css">
        <title>Feedback Page</title>
         <link rel="stylesheet" href="css/footer.css" media="screen" type="text/css" />
          <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
         <script>
            function show(){
                
                
                var name=document.forms["feedback"]["name"].value;
                 var gmail=document.forms["feedback"]["gmail"].value;
                 var message=document.forms["feedback"]["message"].value;
                 if(name == "" || gmail== "" || message== "")
                 {

                 //alert("please enter values");
                    swal("Warning..!", "Please fill the fields...", "warning");
                 
             }else{ 
                 //alert("submited");
             
              swal("Feedback submitted!", "Thanks for your feedback...", "success");
          }
          }
          </script>
          
          <style>
              body{
                  margin: 0;
                  padding: 0;
              }
              .left-section h2{
    padding-left: 5%;
    padding-bottom: 2%;
    text-decoration: blink;
   color: white;
}
.head-main{
    height: 80px;
    display: flex;
    background-color: #24104f;
}
.left-section{
    justify-content: center;
    width:60%;
    background-color:#24104f;
    align-items: center;
  
}
.left-section h2{
    padding-bottom:  20%;
}
.right-section{
    width: 30%;
    display: flex;
    background-color: #24104f;
    justify-content: center;
    align-items: center;
    padding-left: 20%;
}
.right-section span{
    padding-left: 5%;
    color: white;
    font-size: 20px;
    font-family: sans-serif;
}
.right-section a{
    color:white;
}
    
          </style>
          
    </head>
    <body> 
        
        
        
         <header>
            <div class="head-main">
                <div class="left-section">
                    <h2 style="font-size: 30px; ">FARMER'S BUDDY</h2>
                </div>
                <div class="right-section" style='text-align: right'>
                    
                    <span><a href="updateprofile.jsp">Profile</a></span>
                    <span><a href="index.jsp">Home</a></span>
                    
                </div>
                
            </div>
        </header>
        
        <form name="feedback" method="post" action="Feedback.jsp">
          <Center><h1> <b>Feedback</b></h1></Center>
    <center><div class="container">
    <table>
    <label for="fname"><b>Full Name</b></label>
    <input type="text" name="name" id="name" placeholder="Your name.." required>

    <label for="lname"><b>Email</b></label>
    <input type="email" id="gmail" name="email" placeholder="Email" required>
    
    <label class="radio-inline"><b>Experience:</br><br> </b><input type="radio" name="experience" value="Bad" id="Bad" >Bad</label>
    
    <label class="radio-inline"><input type="radio" name="experience" value="Average" id="Average" >Average</label>
    <label class="radio-inline"><input type="radio" name="experience" value="Good" id="Good">Good</label>

    <label for="subject"></label>
    <textarea  id="message" name="message" placeholder="Write message.." style="height:170px" ></textarea>

    <input type="submit" onclick="show()" value="Submit">
    </table>
</div>
        </center>
          </form>
        
          <%--footer--%>
        
        <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>
            <center><h1><span>FARMER'S </span>BUDDY</h1></center>
        </div>
        <div class="myfooter">
            <div class="info">
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
String experience = request.getParameter("experience");
String message = request.getParameter("message");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
Statement st=con.createStatement();
int i=st.executeUpdate("insert into feedback(name,email,experience,message) values('"+name+"','"+email+"','"+experience+"','"+message+"')");

if(i>0)
{
     out.println("Data Inserted Successfully");
     response.sendRedirect("index.jsp");
}
else
{
   out.println("Error...!");
   response.sendRedirect("Feedback.jsp");
}
}
catch(Exception e)
{
    
}
%>
 
