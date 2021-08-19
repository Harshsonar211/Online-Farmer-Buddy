<%-- 
    Document   : products
    Created on : Apr 8, 2021, 8:03:14 PM
    Author     : Windows7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*,java.util.*"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Products</title>
      
        <link rel="stylesheet" href="css/product.css" media="screen" type="text/css" />
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="js/jquery.shop.js"></script>
        <link rel="stylesheet" href="css/admfooter.css" media="screen" type="text/css" />
        
        <%--for top nav */--%>
        
        
    </head>
<body>
    <script>
/* When the user clicks on the button, 
toggle between hiding and showing the dropdown content */
function myFunction() {
  document.getElementById("myDropdown").classList.toggle("show");
}

// Close the dropdown if the user clicks outside of it
window.onclick = function(event) {
  if (!event.target.matches('.dropbtn')) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.classList.contains('show')) {
        openDropdown.classList.remove('show');
      }
    }
  }
}
</script>
    <div class="out">
        <div class="logo" >
            <a href="index.jsp" ><button class="btn-home" style="font-size: 30px;font-weight: bold;">FARMER'S BUDDY</button></a>
    </div>
    <div class="top-nav">
        <input type="search" placeholder="search" class="search-field" name="search" id="search">
        <input type="button" class="btn-search" value="Search">
        <a href="cart.jsp"><button  class="dropbtn" value="Cart"> Cart </button></a>
        <div class="dropdown">
             <button onclick="myFunction()" class="dropbtn" value="Category">Category</button>
            <div id="myDropdown" class="dropdown-content">
          
            <a href="pesticides.jsp">pesticides</a>
            <a href="seeds.jsp">Seeds</a>
        </div>
        </div>
    </div>
    </div>
 	
<div class="main">

<div id="site">
	<header id="masthead">
            <h1>Fertilizer's<span class="tagline">Extra care for plants...</span></h1>
	</header>
	
	<div id="content">
		
		<!-- For Products -->
                
                <%
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM fertilizer";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String title = rs.getString("productname");
                    String desc = rs.getString("description");
                    String filename = rs.getString("filename");
                    String packtype = rs.getString("packing");
                    String price = rs.getString("mrp");
                    String disco = rs.getString("discount");
                    String oldprice = rs.getString("dprice");
                    String path = rs.getString("path");
        %>

		<div id="products" class="container">
                    
                        <li class="filterDiv" id="search">
                            <div class="product-image">
                                <img src="img/<%=filename%>" width="500" height="250" halt="" />
                            </div>
                            <div class="product-description" data-name="<%=title%>" data-price=" <%=price%>">
                                <h3 class="product-name"> <b><%=title%></b></h3>
				<p><%=desc%></p>
				<p class="about">Packaging: <%=packtype%></p>
				<div class="product-mrp">
					<label for="mrp">MRP: </label><b><%=oldprice%></b>
				</div>
                                <form class="add-to-cart" action="cart.jsp" method="post">
				<label for="p-price">Price <%=disco%>% off </label>
				<p class="product-price" id="p-price">&#8360; <%=price%></p>
					<div>
					<label for="qty-1">Quantity</label>
					<input type="text" name="qty-1" id="qty-1" class="qty" value="1" />
					<p><input type="submit" value="Add to cart" class="btn" /></p>
					</div>	
				 
                                </form>
                             
			</div>	
                    	
                  <%
                }
             } 
            catch (Exception e) 
            {
                out.println(e);
            }
           %>
	        </li>     
                </div>
        </div>
</div></div>
 <script>
    let search = document.getElementById('search');

search.addEventListener('input',()=>{
    let search = document.getElementById('search').value.toLowerCase();
    console.log(search);
    let name = document.getElementsByClassName('filterDiv');
    // console.log(name);
    Array.from(name).forEach((element,index)=>{
        let text = document.getElementsByTagName('h3')[index].innerText.toLowerCase();
        console.log(text);
        if(text.includes(search)){
            element.style.display = 'block'
        }
        else{
            element.style.display = 'none'

        }
    })
    
    
})
  </script>  
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
