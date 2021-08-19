<%-- 
    Document   : addproduct1
    Created on : 22 Apr, 2021, 11:47:09 PM
    Author     : HP
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>
        <script src='https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js'></script>
        <link href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.0.3/css/font-awesome.css'>
           <link rel="stylesheet" href="css/admfooter.css">
        <link rel="stylesheet" href="css/animate.css">
        
          <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js" integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf" crossorigin="anonymous"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
        
         <style>
             
             body{
    margin: 0;
    padding: 0;
}
.left-section h1{
    padding-left: 5%;
    padding-bottom: 2%;
    text-decoration: blink;
   color: white;
}
.head-main{
    display: flex;
    background-color: #24104f;
}
.left-section{
    padding-top: 1%;
    justify-content: center;
    width:40%;
    background-color:#24104f;
    align-items: center;
}
.left-section h1{
    font-weight: bold;
        font-size:30px;
}
.right-section{
    
    width: 60%;
    display: flex;
    background-color: #24104f;
    justify-content: center;
    align-items: center;
    padding-left: 20%;
}
.right-section span{
    padding-left: 5%;
    color: white;
    font-size: 25px;
    font-family: sans-serif;
}
.right-section a{
    color:white;
}

            * {
                margin: 0;
                padding: 0
            }

            html {
                height: 100%
            }

            .modal {
                display: none; /* Hidden by default */
                position: fixed; /* Stay in place */
                z-index: 1; /* Sit on top */
                left: 0;
                top: 0;
                width: 100%; /* Full width */
                height: 100%; /* Full height */
                overflow: auto; /* Enable scroll if needed */
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
            }
            .close{
                background-color:#f30;
                width:40px;
                height:40px;
                color:#fff;
                border-radius:50px;
            }

            #grad1 {
                background-color: #9C27B0;
                background-image: linear-gradient(120deg, #FF4081, #81D4FA)
            }

            #msform {
                text-align: center;
                position: relative;
                margin-top: 20px
            }

            #msform fieldset .form-card {
                background: white;
                border: 0 none;
                border-radius: 0px;
                box-shadow: 0 2px 2px 2px rgba(0, 0, 0, 0.2);
                padding: 20px 40px 30px 40px;
                box-sizing: border-box;
                width: 94%;
                margin: 0 3% 20px 3%;
                position: relative
            }

            #msform fieldset {
                background: white;
                border: 0 none;
                border-radius: 0.5rem;
                box-sizing: border-box;
                width: 100%;
                margin: 0;
                padding-bottom: 10px;
                position: relative
            }

            #msform fieldset:not(:first-of-type) {
                display: none
            }

            #msform fieldset .form-card {
                text-align: left;
                color: #9E9E9E
            }

            #msform input,
            #msform textarea {
                padding: 0px 8px 4px 8px;
                border: none;
                border-bottom: 1px solid #ccc;
                border-radius: 0px;
                margin-bottom: 25px;
                margin-top: 2px;
                width: 100%;
                box-sizing: border-box;
                font-family: montserrat;
                color: #2C3E50;
                font-size: 16px;
                letter-spacing: 1px
            }

            #msform input:focus,
            #msform textarea:focus {
                -moz-box-shadow: none !important;
                -webkit-box-shadow: none !important;
                box-shadow: none !important;
                border: none;
                font-weight: bold;
                border-bottom: 2px solid green;
                outline-width: 0
            }

            #msform .action-button {
                width: 100px;
                background: rgb(2, 211, 141);
                font-weight: bold;
                color: white;
                border: 0 none;
                border-radius: 0px;
                cursor: pointer;
                padding: 10px 5px;
                margin: 10px 5px
            }

            #msform .action-button:hover,
            #msform .action-button:focus {
                box-shadow: 0 0 0 2px white, 0 0 0 3px skyblue
            }

            #msform .action-button-previous {
                width: 100px;
                background: #616161;
                font-weight: bold;
                color: white;
                border: 0 none;
                border-radius: 0px;
                cursor: pointer;
                padding: 10px 5px;
                margin: 10px 5px
            }

            #msform .action-button-previous:hover,
            #msform .action-button-previous:focus {
                box-shadow: 0 0 0 2px white, 0 0 0 3px #616161
            }

            select.list-dt {
                border: none;
                outline: 0;
                border-bottom: 1px solid #ccc;
                padding: 2px 5px 3px 5px;
                margin: 2px
            }

            select.list-dt:focus {
                border-bottom: 2px solid skyblue
            }

            .card {
                z-index: 0;
                border: none;
                border-radius: 0.5rem;
                position: relative
            }

            .fs-title {
                font-size: 25px;
                color: #2C3E50;
                margin-bottom: 10px;
                font-weight: bold;
                text-align: left
            }

            #progressbar {
                margin-bottom: 30px;
                overflow: hidden;
                color: lightgrey
            }

            #progressbar .active {
                color: #000000
            }

            #progressbar li {
                list-style-type: none;
                font-size: 14px;
                width: 25%;
                float: left;
                position: relative
            }

            #progressbar #bookd:before {
                font-family: FontAwesome;
                content: "1"
            }

            #progressbar #pick:before {
                font-family: FontAwesome;
                content: "2"
            }

            #progressbar #mored:before {
                font-family: FontAwesome;
                content: "3"
            }

            #progressbar #confirm:before {
                font-family: FontAwesome;
                content: "4"
            }

            #progressbar li:before {
                width: 50px;
                height: 50px;
                line-height: 45px;
                display: block;
                font-size: 18px;
                color: #ffffff;
                background: #45474e;
                border-radius: 50%;
                margin: 0 auto 10px auto;
                padding: 2px
            }

            #progressbar li:after {
                content: '';
                width: 100%;
                height: 2px;
                background: lightgray;
                position: absolute;
                left: 0;
                top: 25px;
                z-index: -1
            }

            #progressbar li.active:before,
            #progressbar li.active:after {
                background: rgb(2, 211, 141);
            }


            .fit-image {
                width: 100%;
                object-fit: cover
            }

        </style>
        </head>
        <body>
        <header>
            <div class="head-main">
                <div class="left-section">
                    <h1>FARMER'S BUDDY</h1>
                </div>
                <div class="right-section">
                    
                    <span style="padding-left:50%;"><a href="AdminHome.jsp">Home</a></span>
                    <span><a href="adminupdateprofile.jsp">Profile</a></span>
                    
                </div>
                
            </div>
        </header>
    
                <div class="row justify-content-center mt-0">
                    <div class="col-11 col-sm-9 col-md-7 col-lg-6 text-center p-0 mt-2 mb-2">
                       
                        <div class="card px-0 pt-2 pb-0 mt-3 mb-3">
                            <h3><strong>Add Product</strong></h3>
                              <div class="row">
                                <div class="col-md-12 mx-0">
                                    <form id="msform" action="AddProduct" method="post" enctype="multipart/form-data">
                                        <fieldset>
                                            <div class="form-card p-4">
                                                <h2 class="fs-title pb-2">Product Details</h2> 
                                                <div class="row">
                                                    
                                                   
                                                    <div class="col-12"><input type="text" id="name" name="id" placeholder="Enter ID" required=""/> </div>
                                                </div>
                                                <div class="row">
                                                    <div class="col-12"><input type="text" name="title" placeholder="Enter Title"/> </div>
                                                    <div class="col-12"> <input type="text" name="description" placeholder="Enter Description"/> </div>
	                                     <div class="col-12"> <input type="text" name="package" placeholder="Package Type"/> </div>
	                                     <div class="col-12"> <input type="text" name="discount" placeholder="Discount"/> </div>
		                              <div class="col-12"> <input type="text" name="oldprice" placeholder="MRP"/> </div>
					      <div class="col-12"> <input type="text" name="price" placeholder="After Discount"/> </div>
					      <div class="col-6"> <input type="file" name="file"/> </div>
                                                </div>
                                                <div class="row">
                                                    
                                                    <div class="col-6"> <label class="pay">Select Category</label> 
                                                        <select class="col-12 list-dt" name="cat">
                                                            <option value="Fertilizer">Fertilizer</option>
                                                            <option value="Pesticides">Pesticides</option>
                                                            <option value="Seeds">Seeds</option>
                                                        </select>
                                                    </div>
                                                </div>
                                            </div> 
                                            <input type="submit" name="next" class="next action-button" value="Submit">
                                        </fieldset>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div> 
            
            
             <%-- Table Content Tab --%>
            
     <div class="overflow-scroll">
            <div class="col-16" style="border: 1px solid; margin-bottom: 20px; padding: 10px;">
                  <nav>
  <div class="nav nav-tabs" id="nav-tab" role="tablist">
      <button class="nav-link active" id="nav-home-tab" data-bs-toggle="tab" data-bs-target="#nav-home" type="button" role="tab" aria-controls="nav-home" aria-selected="true" >PESTICIDES</button>
    <button class="nav-link" id="nav-profile-tab" data-bs-toggle="tab" data-bs-target="#nav-profile" type="button" role="tab" aria-controls="nav-profile" aria-selected="false">SEEDS</button>
    <button class="nav-link" id="nav-contact-tab" data-bs-toggle="tab" data-bs-target="#nav-contact" type="button" role="tab" aria-controls="nav-contact" aria-selected="false">FERTILIZERS</button>
  </div>
</nav>
<div class="tab-content" id="nav-tabContent">
  <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
     
        <div class="table-responsive">
  <table class="table">
     <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">File_Name</th>
     <th scope="col">Packing</th>
      <th scope="col">MRP</th>
        <th scope="col">%Discount</th>
    </tr>
    </thead>
  <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM pesticides";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) 
                {
                     int name =Integer.parseInt( rs.getString("id"));
                    String gender = rs.getString("productname");
                    String address = rs.getString("description");
                    String email = rs.getString("filename");
                    String mob = rs.getString("packing");
                    String uid = rs.getString("mrp");
                    String pass = rs.getString("discount");
        %>
  <tbody>
   <tr>
      <th scope="row"><%=name%></th>
      <td><%=gender%></td>
                <td><%=address%></td>
                <td><%=email%></td>
                <td><%=mob%></td>
                <td><%=uid%></td>
                <td><%=pass%></td>
    </tr>
  </tbody>
  
   <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
  
  </table>
</div>
  </div>
  
  
  
  <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
      Mr.Paresh   
    <div class="table-responsive">
  <table class="table">
     <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">File_Name</th>
     <th scope="col">Packing</th>
      <th scope="col">MRP</th>
        <th scope="col">%Discount</th>
    </tr>
    </thead>
  <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM seeds";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) 
                {
                     int name =Integer.parseInt( rs.getString("id"));
                    String gender = rs.getString("productname");
                    String address = rs.getString("description");
                    String email = rs.getString("filename");
                    String mob = rs.getString("packing");
                    String uid = rs.getString("mrp");
                    String pass = rs.getString("discount");
        %>
  <tbody>
   <tr>
      <th scope="row"><%=name%></th>
      <td><%=gender%></td>
                <td><%=address%></td>
                <td><%=email%></td>
                <td><%=mob%></td>
                <td><%=uid%></td>
                <td><%=pass%></td>
    </tr>
  </tbody>
  
   <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
  
  </table>
</div>
      
  </div>
  <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">Mr.Harsh   
  
  <div class="table-responsive">
  <table class="table">
     <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">File_Name</th>
     <th scope="col">Packing</th>
      <th scope="col">MRP</th>
        <th scope="col">%Discount</th>
    </tr>
    </thead>
  <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM fertilizer";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) 
                {
                     int name =Integer.parseInt( rs.getString("id"));
                    String gender = rs.getString("productname");
                    String address = rs.getString("description");
                    String email = rs.getString("filename");
                    String mob = rs.getString("packing");
                    String uid = rs.getString("mrp");
                    String pass = rs.getString("discount");
        %>
  <tbody>
   <tr>
      <th scope="row"><%=name%></th>
      <td><%=gender%></td>
                <td><%=address%></td>
                <td><%=email%></td>
                <td><%=mob%></td>
                <td><%=uid%></td>
                <td><%=pass%></td>
    </tr>
  </tbody>
  
   <%
                }
            } catch (Exception e) {
                out.println(e);
            }
        %>
  
  </table>
</div>
      
  </div>
</div>
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
               
