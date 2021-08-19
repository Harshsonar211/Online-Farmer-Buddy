package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;
import java.sql.*;
import java.util.*;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Your Order</title>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admfooter.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/product.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n");
      out.write(" <script type=\"text/javascript\" src=\"js/jquery.shop.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"checkout-page\">\n");
      out.write("     \n");
      out.write("    <div class=\"header\" style=\"display: flex\">\n");
      out.write("                   <div class='head-name' style='width: 50%; text-align: left; padding: 10px;'>\n");
      out.write("                       <h1 style=\"color: white; font-weight: bolder;font-size: 30px;\">FARMER'S BUDDY</h1>\n");
      out.write("                   </div>\n");
      out.write("        <div class=\"Cart\" style=\"width: 50%;\">\n");
      out.write("               <a href=\"LogInCustomer.jsp\" class=\"uid\"><li class=\"fa fa-user-circle-o\"></li><b>");

                           String uid=(String)session.getAttribute("uids");
                           if(uid==null)
                           {
                             out.println("LogIn");
                           }
                           Class.forName("com.mysql.jdbc.Driver");
                                      try
                                      {
                                         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
                                         Statement st=con.createStatement();
                                         ResultSet rs=st.executeQuery("select *from register where uid='"+uid+"'");
                                         if(rs.next())
                                         {
                                             out.println(rs.getString(6));
                                         }
                                      }
                                      catch(Exception e)
                                      {
                                      out.println("Error");
                                      }
                           
      out.write("</b></a>\n");
      out.write("               <a href=\"Register.jsp\"><li class=\"fa fa-user-plus\"></li><b>Register</b></a>\n");
      out.write("               <a href=\"cart.jsp\"><li class=\"fa fa-shopping-cart\"></li><b>Cart</b></a>\n");
      out.write("                </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("<div id=\"site\">\n");
      out.write("\t<header id=\"masthead\">\n");
      out.write("\t\t<h1>Farmer's Buddy <span class=\"tagline\">Extra Care For Plant's</span></h1>\n");
      out.write("\t</header>\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<h1>Your Order</h1>\n");
      out.write("\t\t\t<table id=\"checkout-cart\" class=\"shopping-cart\">\n");
      out.write("\t\t\t  <thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th scope=\"col\" id='pname' name='pname'>Item</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\" id='pqty' name='pqty'>Qty</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\" id='pprice' name='pprice'>Price</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t  </thead>\n");
      out.write("\t\t\t  <tbody>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  </tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t <div id=\"pricing\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<p id=\"shipping\">\n");
      out.write("                            <strong>Shipping</strong>: <span id=\"sshipping\" name=\"shipping\" id=\"shipping\"></span>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<p id=\"sub-total\">\n");
      out.write("\t\t\t\t<strong>Total</strong>: <span id=\"stotal\" name=\"total\" id=\"total\"></span>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t \n");
      out.write("\t\t <div id=\"user-details\">\n");
      out.write("\t\t \t<h2>Your Data</h2>\n");
      out.write("\t\t \t<div id=\"user-details-content\"></div>\n");
      out.write("\t\t </div>\n");
      out.write("                 \n");
      out.write("<form id=\"paypal-form\" action=\"\" method=\"post\">\n");
      out.write("\t<input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\n");
      out.write("\t<input type=\"hidden\" name=\"upload\" value=\"1\" />\n");
      out.write("\t<input type=\"hidden\" name=\"business\" value=\"\" />\n");
      out.write("        \n");
      out.write("\t<input type=\"hidden\" name=\"currency_code\" value=\"\" />\n");
      out.write("\t<input type=\"submit\" id=\"paypal-btn\" class=\"btn\" value=\"Pay with PayPal\" />\n");
      out.write(" </form>\n");
      out.write("                   <a href=\"success.jsp\"> <input type=\"submit\" id=\"cash on delivery\" class=\"btn\" value=\"Cash On Delivery\"></a>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("               \n");
      out.write("               <!-- </footer> -->\n");
      out.write("\n");
      out.write(" <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\n");
      out.write("            <center><h1><span>FARMER'S </span>BUDDY</h1></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"myfooter\">\n");
      out.write("            <div class=\"infoa\">\n");
      out.write("                <h1>FARMER'S BUDDY</h1>\n");
      out.write("                <p>The farmkey is the shopping Website for indian farming community. Easy user interface of the farmkey is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"f1\">\n");
      out.write("                <ul class=\"foot-list\">\n");
      out.write("                    <li><h1>Category</h1></li>\n");
      out.write("                    <li><a href=\"fertilizer.jsp\" id=\"foot-hyper\">Fertilizer</a></li>\n");
      out.write("                    <li><a href=\"pesticides.jsp\" id=\"foot-hyper\">Pesticide</a></li>\n");
      out.write("                    <li><a href=\"seeds.jsp\" id=\"foot-hyper\">Seeds</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"f2\">\n");
      out.write("                <ul class=\"foot-list\">\n");
      out.write("                    <li><h1>Get to Know Us</h1></li>\n");
      out.write("                    <li><a href=\"Contact.jsp\" id=\"foot-hyper\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"#\" id=\"foot-hyper\">About Us</a></li>\n");
      out.write("                      <li><a href=\"Feedback.jsp\" id=\"foot-hyper\">Feedback</a></li>\n");
      out.write("                    <li><a href=\"https://farmerbuddy007.blogspot.com/\" id=\"foot-hyper\">Blogs</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"f3\">\n");
      out.write("                <ul class=\"foot-list\">\n");
      out.write("                    <li><h1>Help & FAQs</h1></li>\n");
      out.write("                    <li>Online Ordering</li>\n");
      out.write("                    <li>Shipping</li>\n");
      out.write("                    <li>Billing</li>\n");
      out.write("                    <li>Return & Exchange</li>\n");
      out.write("                    <li>Customer Service</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"social\" style=\"height: 20%; background-color: #24104f\">\n");
      out.write("            <div class=\"left-social\" style=\"width: 33.33%\">\n");
      out.write("                <a href=\"https://www.facebook.com/vinod.shirsath.33\" class=\"soc\"><img src=\"img/fb.png\" style=\"height: 35px; width: 35px;\"></a>\n");
      out.write("                <a href=\"https://twitter.com/RajuShiraath\" class=\"soc\"><img src=\"img/twiter.png\" style=\"height: 35px; width: 35px;\"></a>\n");
      out.write("                <a href=\"#\" class=\"soc\"><img src=\"img/youtu.png\" style=\"height: 35px; width: 35px;\"></a>\n");
      out.write("                <a href=\"#\" class=\"soc\"><img src=\"img/insta.png\" style=\"height: 35px; width: 35px;\"></a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"mid\"style=\"width: 33.33%\">\n");
      out.write("                <a href=\"index.jsp\" class=\"mid-links\">Home</a>\n");
      out.write("                <a href=\"#\" class=\"mid-links\">Privacy</a>\n");
      out.write("                <a href=\"#\" class=\"mid-links\">Terms & Condition</a>\n");
      out.write("                <div class='copyright'>\n");
      out.write("                    <p style='color: whitesmoke'> Copyright ©2021-22 Farmer's Buddy Ltd. All rights reserved.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-paycards\" style=\"width: 33.33%\">\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/paypal.png\" style=\"height: 60px; width: 60px;\"></a>\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/master.png\" style=\"height: 60px; width: 60px;\"></a>\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/visa.png\" style=\"height: 60px; width: 60px;\"></a>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("</body>\n");
      out.write("</html>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String name = request.getParameter("name");
String email = request.getParameter("email");
String city = request.getParameter("city");
String address = request.getParameter("address");
String  zip = request.getParameter("zip");
String country = request.getParameter("country");
String item = request.getParameter("item_name");
String qty = request.getParameter("quantity_");
String total = request.getParameter("amount_");
String shipping = request.getParameter("shipping_");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
Statement st=con.createStatement();
int i=st.executeUpdate("insert into orders(name,email,city,address,zip,country,item,qty,total,shipping)values('"+name+"','"+email+"','"+city+"','"+address+"','"+zip+"','"+country+"','"+item+"','"+qty+"','"+total+"','"+shipping+"')");
 
  if(i>0)
  {
    out.println("Data Inserted Successfully");
  }
  else
  {
 
  }
  }
  catch(Exception e)
  {
      out.println(e);
  }

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
