<%-- 
    Document   : ADMhome
    Created on : Apr 21, 2021, 10:17:00 AM
    Author     : Windows7
--%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashSet"%>
<%@page import="java.util.Random"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin-Home</title>
        <link rel="stylesheet" href="css/admin.css"    >
        <link rel="stylesheet" href="css/admfooter.css">
        
        
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" />
<%-- for pannel--%>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        

    </head>
    <body>
        <script>
            $(document).on('click', '.panel-heading span.clickable', function(e){
          var $this = $(this);
	if(!$this.hasClass('panel-collapsed')) {
		$this.parents('.panel').find('.panel-body').slideUp();
		$this.addClass('panel-collapsed');
		$this.find('i').removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');
		
	} else {
		$this.parents('.panel').find('.panel-body').slideDown();
		$this.removeClass('panel-collapsed');
		$this.find('i').removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');
		
	}
})
        </script>
        
        
        <header>
            <div class="head-main">
                <div class="left-section">
                    <h1>FARMER'S BUDDY</h1>
                </div>
                <div class="right-section">
                    
                    <span><a href="adminupdateprofile.jsp">Profile</a></span>
                    <span><%
                           String uid=(String)session.getAttribute("uids1");
                            if(uid==null)
                            {
                                response.sendRedirect("AdminLogIn.jsp");
                           }
                           Class.forName("com.mysql.jdbc.Driver");
                                      try
                                      {
                                         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
                                         Statement st=con.createStatement();
                                         ResultSet rs=st.executeQuery("select *from admin where uid='"+uid+"'");
                                         if(rs.next())
                                         {
                                             out.println(rs.getString(1));
                                         }
                                      }
                                      catch(Exception e)
                                      {
                                      out.println("Error");
                                      }

                           %></span>
                    
                </div>
                
            </div>
        </header>
        <div class="main">  
            
    
    
    	<div class="side-menu">
		<nav class="navbar navbar-default" role="navigation">
			<!-- Main Menu -->
			<div class="side-menu-container">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#"><span class="glyphicon glyphicon-dashboard"></span> Dashboard</a></li>
					<li><a href="adminupdateprofile.jsp"><span class="glyphicon glyphicon-user"></span> Profile</a></li>
					<li><a href="contactview.jsp"><span class="glyphicon glyphicon-cloud"></span> User Query's</a></li>
                                       
					<!-- Dropdown-->
					<li class="panel panel-default" id="dropdown">
						<a data-toggle="collapse" href="#dropdown-lvl1">
							<span class="glyphicon glyphicon-edit"></span> Manage Product <span class="caret"></span>
						</a>

						<!-- Dropdown level 1 -->
						<div id="dropdown-lvl1" class="panel-collapse collapse">
							<div class="panel-body">
								<ul class="nav navbar-nav">
									<li><a href="addnewproduct.jsp">Add New Product</a></li>
									<li><a href="updateproduct.jsp">Update Product</a></li>
									<li><a href="deleteproduct.jsp">Delete Product</a></li>

									
								</ul>
							</div>
						</div>
					</li>

					<li><a href="adminlogout.jsp"><span class="glyphicon glyphicon-off"></span> Logout</a></li>

				</ul>
			</div>
		</nav>

	</div>
  
        <form> 
        <div class="container" style="background-color: gray;margin-left: 30px; width: 200%;">
    <div class="row">
        
    <div class="col-md-3">
        
      <div class="card-counter primary">
        <i class="fa fa-code-fork"></i>
        <span class="count-name" id="#" name="#">Orders</span>
      </div>
    </div>


  <div class="col-md-3">
      <a href="feedbackview.jsp">
      <div class="card-counter danger">
        <i class="fa fa-ticket"></i>
        <span class="count-name">User Feedbacks</span>
      </div>
  </a> 
  </div> 

    <div class="col-md-3">
        <a href="displayCancelOrder.jsp">
      <div class="card-counter success">
        <i class="fa fa-database"></i>
        <span class="count-name">Cancel Order</span>
      </div>
    </a>
    </div>

    <div class="col-md-3">
        <a href="displayUsers.jsp">
      <div class="card-counter info">
        <i class="fa fa-users"></i>
        <span class="count-name">Users</span>
      </div>
        </a>
    </div>
       
       
               
    </div>
          
            <%-- Collaps Pannel--%>
            
            <div class="row">
		<div class="col-md-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">Employee List Bellow...</h3>
					<span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-down"></i></span>
				</div>
			<%--content modified add product --%>  	
                                <div class="panel-body">Panel content
       
                                </div> <%--content modified add product --%>  
                                
			</div>
		</div>
		<div class="col-md-6">
			<div class="panel panel-success">
				<div class="panel-heading">
					<h3 class="panel-title">Products Information Here...</h3>
					<span class="pull-right clickable"><i class="glyphicon glyphicon-chevron-up"></i></span>
				</div>
				<div class="panel-body">Panel content
                                
                                </div>
		</div>
	</div>
	</div>
            <%-- For Employee Info--%>
            <div>
                
            </div>
            
            
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
