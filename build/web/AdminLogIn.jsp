<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%> 

<html>
    <head>
        <title>Admin LogIn </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
         <link rel="stylesheet" type="text/css" href="css/CustomerLogin.css">
          <link rel="stylesheet" href="css/footer.css" media="screen" type="text/css" />
              <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
         <script>
            function show(){
                
                
                var uid=document.forms["Alogin"]["uid"].value;
                 var pass=document.forms["Alogin"]["pass"].value;
                 if(uid == "" || pass == "")
                 {

                 //alert("please enter values");
                    swal("Warning..!", "Please fill the fields...", "warning");
                 
             }
          }         
        </script>
    </head>
    <body> 
        <form name="Alogin" method="post" action="AdminLogIn.jsp">
              <div class="header" style='display: flex'>
                  <div class="head-name" style="width: 30%;color: white;">
                      <h2 style="margin-left: 10px;color: white;">FARMER'S BUDDY</h2>
                  </div>
                  <div class="Cart" style="width: 70%;">
              
               <a href="index.jsp"><li class="fa fa-home"></li><b>Home</b></a>
              </div>
              </div>  
        <Center><h1><b>Admin LogIn </b></h1></Center>
        <center>   <div class="row"></div>

    <div class="container">

        <div class="row">
          <div class="col-50">
            <table>
            <label for="cname"><b>LogIn ID:</b> </label>
            <input type="text" id="uid" name="uid" placeholder="LogIn ID"maxlength="10" ></br>
            <label for="ccnum"><b>Password:</b></label>
            <input type="password" id="pass" name="pass" placeholder=" Your Password"maxlength="8"  ><br>
            
            </table>
           
          </div>
        </div>
        <input type="submit" value="LogIn"   onclick="show()" class="btn">

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
              <p>The Farmer's Buddy is the Online shopping Website for indian farming community. Easy user interface of the Farmer's Buddy is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>
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
             
               <script src="js/main.js"></script>
    </body>
</html>

<%
 
  String uid = request.getParameter("uid");
  String pass = request.getParameter("pass");
  
  Class.forName("com.mysql.jdbc.Driver");
  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
  Statement st=con.createStatement();
  ResultSet rs;
  rs=st.executeQuery("select * from admin where uid='"+uid+"'and pass='"+pass+"'");
    session.setAttribute("uids1",uid);
  if(rs.next())
  {
    response.sendRedirect("AdminHome.jsp");
  }
  else
  {
   // response.sendRedirect("AdminLogIn.jsp");
  }
%>