<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<style>
body {font-family: Arial;}

/* Style the tab */
h2,h1{
    font-size: 65px;
}
.tab {
    display: block;
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}
</style>
</head>
<body>
<center>
<h2><b>Orders</b></h2>
<p> Check Your Order Now</p>

<div class="tab">
  <button class="tablinks" onclick="openCity(event, 'London')">All Orders</button>
  <button class="tablinks" onclick="openCity(event, 'Paris')">Delivered Orders</button>
  <button class="tablinks" onclick="openCity(event, 'Tokyo')">Pending Orders</button>
</div>

<div id="London" class="tabcontent">
			                    <form>
						<div class="order-detail">
						<div class="panel panel-default">
							<div class="panel-heading">
							<h1>All Order Detail</h1>
                                                        	<label>#1</label>
							</div>
							<table class="table" border="0"  cellpadding="0">
									
									
									<tr class="heading">
										<th>Title</th>
										<th>Unit Price</th>
										<th>Quantity</th>
										<th>Total Price</th>
									</tr>
									
									<tr class="row1">
										<td><span>item name</span></td>
										<td><span>2500.00 rs</span></td>
										<td><span>*2</span></td>
										<td><span>5000.00 rs</span></td>
										
									</tr>
									<tr>
										<td><span><b>Sub-total</b></span></td>
										<td><span></span></td>
										<td><span></span></td>
										<td><span><b>5000.00 rs</b></span></td>
									</tr>
									<tr>
										<td><span>Shipping Charges</span></td>
										<td><span></span></td>
										<td><span></span></td>
										<td><span>40.00 rs</span></td>
									</tr>
									<tr>
										<td><span><b>Total</b></span></td>
										<td><span></span></td>
										<td><span></span></td>
				         	<td><span><b>5040.00 rs</b></span></td>
						</tr>
						</table>	
						<div clASS="panel-footer footer"> 
						<div class="left"> <b><label>Shipping/Billing Address:</label><b>
						<label name="address">At shahada,225 Gandhi nagar,dist.Nandurbar,Maharashtra</label>
						</div>
						<div class="right"><label> <b>Contact information<b></label><br>
						<label name="mob no">8459633692</label><br>
						<label name="email">vinod1712@gmail.com</label>
						</div>
						</div>
						<div clASS="footer-btn-primary">
                                                <center><a href="index.jsp"><button type="button" class="btn-success">Accept</button></a></center>
						</div>					
				</div>

				</div>
			</form>	
</div>

<div id="Paris" class="tabcontent">
 <form>
						<div class="order-detail">
						<div class="panel panel-default">
							<div class="panel-heading">
							<h1>Delivered Order Detail</h1>
                                                        	<label>#2</label>
							</div>
							<table class="table" border="0"  cellpadding="0">
									
									
									<tr class="heading">
										<th>Title</th>
										<th>Unit Price</th>
										<th>Quantity</th>
										<th>Total Price</th>
									</tr>
									
									<tr class="row1">
										<td><span>item name</span></td>
										<td><span>2500.00 rs</span></td>
										<td><span>*2</span></td>
										<td><span>5000.00 rs</span></td>
										
									</tr>
									<tr>
										<td><span><b>Sub-total</b></span></td>
										<td><span></span></td>
										<td><span></span></td>
										<td><span><b>5000.00 rs</b></span></td>
									</tr>
									<tr>
										<td><span>Shipping Charges</span></td>
										<td><span></span></td>
										<td><span></span></td>
										<td><span>40.00 rs</span></td>
									</tr>
									<tr>
										<td><span><b>Total</b></span></td>
										<td><span></span></td>
										<td><span></span></td>
				         	<td><span><b>5040.00 rs</b></span></td>
						</tr>
						</table>	
						<div clASS="panel-footer footer"> 
						<div class="left"> <b><label>Shipping/Billing Address:</label><b>
						<label name="address">At shahada,225 Gandhi nagar,dist.Nandurbar,Maharashtra</label>
						</div>
						<div class="right"><label> <b>Contact information<b></label><br>
						<label name="mob no">8459633692</label><br>
						<label name="email">vinod1712@gmail.com</label>
						</div>
						</div>
						<div clASS="footer-btn-primary">
                                                <center><a href="index.jsp"><button type="button" class="btn-success">Accept</button></a></center>
						</div>					
				</div>

				</div>
			</form>	
</div>
</div>

<div id="Tokyo" class="tabcontent">
  <form>
						<div class="order-detail">
						<div class="panel panel-default">
							<div class="panel-heading">
							<h1>Pending Order Detail</h1>
                                                        	<label>#3</label>
							</div>
							<table class="table" border="0"  cellpadding="0">
									
									
									<tr class="heading">
										<th>Title</th>
										<th>Unit Price</th>
										<th>Quantity</th>
										<th>Total Price</th>
									</tr>
									
									<tr class="row1">
										<td><span>item name</span></td>
										<td><span>2500.00 rs</span></td>
										<td><span>*2</span></td>
										<td><span>5000.00 rs</span></td>
										
									</tr>
									<tr>
										<td><span><b>Sub-total</b></span></td>
										<td><span></span></td>
										<td><span></span></td>
										<td><span><b>5000.00 rs</b></span></td>
									</tr>
									<tr>
										<td><span>Shipping Charges</span></td>
										<td><span></span></td>
										<td><span></span></td>
										<td><span>40.00 rs</span></td>
									</tr>
									<tr>
										<td><span><b>Total</b></span></td>
										<td><span></span></td>
										<td><span></span></td>
				         	<td><span><b>5040.00 rs</b></span></td>
						</tr>
						</table>	
						<div clASS="panel-footer footer"> 
						<div class="left"> <b><label>Shipping/Billing Address:</label><b>
						<label name="address">At shahada,225 Gandhi nagar,dist.Nandurbar,Maharashtra</label>
						</div>
						<div class="right"><label> <b>Contact information<b></label><br>
						<label name="mob no">8459633692</label><br>
						<label name="email">vinod1712@gmail.com</label>
						</div>
						</div>
						<div clASS="footer-btn-primary">
                                                <center><a href="index.jsp"><button type="button" class="btn-success">Accept</button></a></center>
						</div>					
				</div>

				</div>
			</form>	
</div>
</div>


<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}
</script>
</center>
</body>
</html> 
