package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Your Shopping Cart</title>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/product.css\" media=\"screen\" type=\"text/css\" />\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\r\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.shop.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"header\" style=\"display: flex;\">\r\n");
      out.write("          <div class='head-name' style='width: 50%; text-align: left; padding: 10px;'><h1 style=\"color: white; font-weight: bolder;font-size: 30px;\">FARMER'S BUDDY</h1></div>\r\n");
      out.write("          <div class=\"Cart\" style=\"width: 50%;text-align: right\">\r\n");
      out.write("    \r\n");
      out.write("          \r\n");
      out.write("               <a href=\"LogInCustomer.jsp\" class=\"uid\"><li class=\"fa fa-user-circle-o\"></li><b>\r\n");
      out.write("                       ");

                           String uid=(String)session.getAttribute("uids");
                           if(uid==null){
                                response.sendRedirect("index.jsp");
                           }    
                           else if(uid!=null)
                           {
                               out.println("");
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
                        
      out.write("</b></a>\r\n");
      out.write("               <a href=\"index.jsp\"><li class=\"fa fa-home\"></li><b>Home</b></a>\r\n");
      out.write("                </div>\r\n");
      out.write("     </div>               \r\n");
      out.write("<div id=\"site\">\r\n");
      out.write("\t<header id=\"masthead\">\r\n");
      out.write("            <center>  <h1>Farmer's Buddy <span class=\"tagline\"></span></h1></center>\r\n");
      out.write("            <h1><li class=\"fa fa-shopping-cart\"></li>Cart<span class=\"tagline\">Extra Care For Plant's</span></h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("     \r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<form id=\"shopping-cart\" action=\"cart.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t<table class=\"shopping-cart\">\r\n");
      out.write("\t\t\t  <thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\" name=\"\">Item</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Qty</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\" colspan=\"2\">Price</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t  </thead>\r\n");
      out.write("\t\t\t  <tbody>\r\n");
      out.write("\t\t\t  \r\n");
      out.write("\t\t\t  </tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<p id=\"sub-total\">\r\n");
      out.write("\t\t\t\t<strong>Sub Total</strong>: <span id=\"stotal\"></span>\r\n");
      out.write("\t\t\t</p>\r\n");
      out.write("\t\t\t<ul id=\"shopping-cart-actions\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"update\" id=\"update-cart\" class=\"btn\" value=\"Update Cart\" />\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" name=\"delete\" id=\"empty-cart\" class=\"btn\" value=\"Empty Cart\" />\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"fertilizer.jsp\"> <input type=\"button\" value=\"Continue Shopping\" class=\"btn\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"checkout.jsp\"><input type=\"button\" value=\"Go To Checkout\" class=\"btn\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("  \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("               ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\r\n");
      out.write("            <center><h1><span>FARMER'S </span>BUDDY</h1></center>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"myfooter\">\r\n");
      out.write("            <div class=\"info\">\r\n");
      out.write("                <h1>FARMER'S BUDDY</h1>\r\n");
      out.write("                <p>The farmkey is the shopping Website for indian farming community. Easy user interface of the farmkey is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f1\">\r\n");
      out.write("                <ul class=\"foot-list\">\r\n");
      out.write("                    <li><h1>Category</h1></li>\r\n");
      out.write("                    <li><a href=\"fertilizer.jsp\" id=\"foot-hyper\">Fertilizer</a></li>\r\n");
      out.write("                    <li><a href=\"pesticides.jsp\" id=\"foot-hyper\">Pesticide</a></li>\r\n");
      out.write("                    <li><a href=\"seeds.jsp\" id=\"foot-hyper\">Seeds</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f2\">\r\n");
      out.write("                <ul class=\"foot-list\">\r\n");
      out.write("                    <li><h1>Get to Know Us</h1></li>\r\n");
      out.write("                    <li><a href=\"Contact.jsp\" id=\"foot-hyper\">Contact Us</a></li>\r\n");
      out.write("                    <li><a href=\"#\" id=\"foot-hyper\">About Us</a></li>\r\n");
      out.write("                      <li><a href=\"Feedback.jsp\" id=\"foot-hyper\">Feedback</a></li>\r\n");
      out.write("                    <li><a href=\"https://farmerbuddy007.blogspot.com/\" id=\"foot-hyper\">Blogs</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f3\">\r\n");
      out.write("                <ul class=\"foot-list\">\r\n");
      out.write("                    <li><h1>Help & FAQs</h1></li>\r\n");
      out.write("                    <li>Online Ordering</li>\r\n");
      out.write("                    <li>Shipping</li>\r\n");
      out.write("                    <li>Billing</li>\r\n");
      out.write("                    <li>Return & Exchange</li>\r\n");
      out.write("                    <li>Customer Service</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"social\" style=\"height: 20%; background-color: #24104f\">\r\n");
      out.write("            <div class=\"left-social\" style=\"width: 33.33%\">\r\n");
      out.write("                <a href=\"https://www.facebook.com/vinod.shirsath.33\" class=\"soc\"><img src=\"img/fb.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                <a href=\"https://twitter.com/RajuShiraath\" class=\"soc\"><img src=\"img/twiter.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"soc\"><img src=\"img/youtu.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"soc\"><img src=\"img/insta.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mid\"style=\"width: 33.33%\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"mid-links\">Home</a>\r\n");
      out.write("                <a href=\"#\" class=\"mid-links\">Privacy</a>\r\n");
      out.write("                <a href=\"#\" class=\"mid-links\">Terms & Condition</a>\r\n");
      out.write("                <div class='copyright'>\r\n");
      out.write("                    <p style='color: whitesmoke'> Copyright ©2021-22 Farmer's Buddy Ltd. All rights reserved.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-paycards\" style=\"width: 33.33%\">\r\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/paypal.png\" style=\"height: 60px; width: 60px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/master.png\" style=\"height: 60px; width: 60px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/visa.png\" style=\"height: 60px; width: 60px;\"></a>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("             \r\n");
      out.write("               <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\t");
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
