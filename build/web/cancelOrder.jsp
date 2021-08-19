<%-- 
    Document   : cancelOrder
    Created on : May 2, 2021, 3:31:16 PM
    Author     : Windows7
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="css/admfooter.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
         <script>
            function show(){
                
                
                var name=document.forms["cancel"]["name"].value;
                 var gmail=document.forms["cancel"]["inputEmail"].value;
                 var invoice=document.forms["cancel"]["invoice"].value;
                 var reason=document.forms["cancel"]["reason"].value;
                 if(name == "" || gmail== "" || invoice == "" || reason == "")
                 {

                 //alert("please enter values");
                    swal("Warning..!", "Please fill the fields...", "warning");
                 
             }else{ 
                 //alert("submited");
             
              swal("Cancel Order Request submitted!", "Refund will be process within 2 days...", "success");
          }
          }
          </script>
    </head>
<body>
<%-- header --%>
    
      <div class="container-fluid" style="background-color: #24104f">
    
     <div class="row" style="background-color: #24104f">
         <div class="col-8"><h1 style="color: white">FARMER'S BUDDY</h1></div>
         <div class="col-4" style="background-color: #24104f">
             <nav class="navbar navbar-expand-lg navbar-light d-flex" style="background-color: #24104f; float: right">
    
                 <h5> <a class="nav-link" href="index.jsp" style="color: white;">Home</a></h5>
                 <h5> <a class="nav-link" href="updateprofile.jsp" style="color: white;">Profile</a></h5>
                 <h5> <a class="nav-link" href="logout.jsp" style="color: white;">Logout</a></h5>
    
            </nav>
         </div>
     </div>
  </div>
    
<%-- Content --%>
    
<div class="container-sm w-50 p-3">

  <h2> <span class="badge bg-warning text-dark">Order Cancellation Form</span></h2>
  <form name="cancel" class="row g-3" action="cancelOrder.jsp" method="post">
  <div class="col-md-12">
      <label for="name" class="form-label"><b>Name</b></label>
    <input type="text" id="name" name="name" class="form-control" aria-label="Sizing example input" required aria-describedby="inputGroup-sizing-default">
  </div>
  <div class="col-md-6">
      <label for="inputEmail4" class="form-label"><b>Email</b></label>
    <input type="email" class="form-control" name="inputEmail" required id="inputEmail">
  </div>
  <div class="col-md-6">
      <label for="invoice" class="form-label"><b>Invoice No.</b></label>
      <input type="text" id="invoice" name="invoice" class="form-control" required aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default"> 
  </div>
  <div class="col-12">
      <label for="textarea" class="form-label"><b>Reason for cancel</b></label>
    <textarea class="form-control" id="reason" name="reason" required rows="3"></textarea>
  </div>

  <div class="col-12">
      <button type="submit" class="btn btn-success" onclick="show()"><b>Submit</b></button>
  </div>
</form>
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
<%

String name=request.getParameter("name");
String email=request.getParameter("inputEmail");
String invoice=request.getParameter("invoice");
String reason=request.getParameter("reason");

try{
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
    Statement st=conn.createStatement();
    if(name !=null || email!=null || invoice !=null)
    {
        int i=st.executeUpdate("insert into cancelrequest(c_name,c_email,c_invoice,c_reason)values('"+name+"','"+email+"','"+invoice+"','"+reason+"')");
        if(i>0)
            {
    
                 response.sendRedirect("cancelMail.jsp?name="+name+"&uid="+invoice+"&m="+email);
    
                }
  else
  {
  response.sendRedirect("Register.jsp");
  }
}
    else
    {
    out.println("Error");
    }
}
catch(Exception e)
{
    System.out.print(e);
    e.printStackTrace();
}
%>