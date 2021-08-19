<%-- 
    Document   : Register
    Created on : 10 Mar, 2021, 6:22:03 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%>
 
<html>
    <head>
        <title>Register</title>
          <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/logcss.css">
         <link rel="stylesheet" href="css/footer.css" media="screen" type="text/css" />
          <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
         <script>
            function show(){
                
                
                var name=document.forms["register"]["name"].value;
                 var add=document.forms["register"]["add"].value;
                 var email=document.forms["register"]["email"].value;
                 var mob=document.forms["register"]["mob"].value;
                 var uid=document.forms["register"]["uid"].value;
                 var pass=document.forms["register"]["pass"].value;
                 var pswrepeat=document.forms["register"]["pswrepeat"].value;
                 if(name == "" || add == "" || email == "" ||  mob == "" || uid == "" || pass == "" || pswrepeat == "")
                 {
                    swal("Warning..!", "Please fill the fields...", "warning");
                }else
                {
                    swal("submited", "you are successfully Registered...", "success");
                }
             }
             </script>
            
             <script>
                 function check()
                 {
                  var pass=document.forms["register"]["pass"].value;
                  var pswrepeat=document.forms["register"]["pswrepeat"].value;
                   if(pass !== pswrepeat)
                  {
                    swal("Warning..!", "password dosent match...", "warning");
                  }
                 }
             </script>
             <script>
                 function validmob()
                 {
                     var phone=document.forms['register']['mob'];
                     if(isNaN(phone.value) || phone.value.length != 10)
                     {
                         alert("Invalid phone number");
                         return false;
                     }
                     return true;
                 }
             </script>
              
<script>
   function testInput(event) {
   var value = String.fromCharCode(event.which);
   var pattern = new RegExp(/[a-zåäö ]/i);
   return pattern.test(value);
}
$('#my-field').bind('keypress', testInput);</script>
    </head>
    <body>
        <form name="register" method="POST" action="Register.jsp" onsubmit="return validmob()">
        <center>
            <div class="header" style="display: flex;">
                <div class='head-name' style='width: 50%; text-align: left;'>
                    <h1 style="color: white; font-size: 30px; margin-left: 10px; ">FARMER'S BUDDY</h1></div>
                 
                 <div class="Cart"  style='width: 50%; text-align: right'>
              <a href="LogInCustomer.jsp"><li class="fa fa-user-plus"></li><b>Log In</b></a>
               <a href="Cart.jsp"><li class="fa fa-shopping-cart"></li><b>Cart</b></a>
               <a href="index.jsp"><li class="fa fa-home"></li><b>Home</b></a>
              </div>
              </div>   
            <div class="main">
             <h1>Register</h1>
            <div class="second">
                 <label for="name"><b>Enter Full Name</b></label>
                 <input type="text" placeholder="Name" onkeypress="return testInput(event);" name="name" id="name" required>
             
                 <div id="radio" name="radio">
                    <label><b> Gender</b></label>
                   <input type="radio" name="gender" value="male" id="Male">Male 
                   <input type="radio" name="gender" value="female" id="Female"> Female
                 <input type="radio" name="gender" value="other" id="Other"> Other
              </div>                 
                  <label for="name"><b>Address</b></label>
                 <input type="text" placeholder="Address (Village, city, dist.)" name="add" id="add" required>
                 
                  <label for="name"><b>Enter Email</b></label>
                 <input type="email" placeholder="Enter Email" name="email" id="email" required>
           
                <label for="mobilenum"><b>Mobile Number</b></label>
                <input type="text" placeholder="Mobile Number" name="mob" id="mob" onsubmit="validmob()" pattern="[6-9]\d{9}" title="Enter valid phone number" maxlength="10" required>
                
                  <label for="name"><b>User ID</b></label>
                 <input type="text" placeholder="User ID" name="uid" id="uid" maxlength="8" required>
            
                <label for="psw"><b>Password</b></label>
                <input type="password" placeholder="Password" name="pass" id="pass" maxlength="8" required>
            
                <label for="psw-repeat"><b>Repeat Password</b></label>
                <input type="password" placeholder="Repeat Password" name="pswrepeat" maxlength="8" id="pswrepeat" required>
                <center><p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p></center>
            <button type="submit" class="registerbtn" onclick="show(),check(),validmob()">Register</button>
            </div>
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

<%
String user = request.getParameter("name");
String gender = request.getParameter("gender");
String add = request.getParameter("add");
String email = request.getParameter("email");
String mob = request.getParameter("mob");
String uid = request.getParameter("uid");
String pass = request.getParameter("pass");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
Statement st=con.createStatement();
int i=st.executeUpdate("insert into register(name,gender,address,email,mobile,uid,pass)values('"+user+"','"+gender+"','"+add+"','"+email+"','"+mob+"','"+uid+"','"+pass+"')");
//out.println("Data Inserted Successfully");
  if(i>0)
  {
    //out.println("Registration Successful...!");
    response.sendRedirect("mail.jsp?name="+user+"&uid="+uid+"&pass="+pass+"&m="+email);
    //response.sendRedirect("LogInCustomer.jsp");
  }
  else
  {
  response.sendRedirect("Register.jsp");
  }
  }
  catch(Exception e)
  {
     // out.println(e);
  }
%>