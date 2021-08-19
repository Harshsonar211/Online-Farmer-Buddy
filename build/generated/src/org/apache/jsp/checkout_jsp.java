package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>@Checkout</title>\n");
      out.write("<meta charset=\"utf-8\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"css/product.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("<script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.shop.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"checkout-page\">\n");
      out.write("    <div class=\"header\">\n");
      out.write("                <div class=\"Cart\">\n");
      out.write("                    \n");
      out.write("               <a href=\"LogInCustomer.jsp\" class=\"uid\"><li class=\"fa fa-user-circle-o\"></li><b>");

                           String uid=(String)session.getAttribute("uids");
                           if(uid==null){
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
      out.write("  \n");
      out.write("               <a href=\"cart.jsp\"><li class=\"fa fa-shopping-cart\"></li><b>Cart</b></a>\n");
      out.write("                <a href=\"index.jsp\"><li class=\"fa fa-home\"></li><b>Home</b></a>\n");
      out.write("                </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("<div id=\"site\">\n");
      out.write("\t<header id=\"masthead\">\n");
      out.write("            <h1>Farmer's Buddy <span class=\"tagline\">Extra Care For Plant's</span></h1>\n");
      out.write("\t</header>\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t<h1>Checkout</h1>\n");
      out.write("\t\t\t<table id=\"checkout-cart\" class=\"shopping-cart\">\n");
      out.write("\t\t\t  <thead>\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Item</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Qty</th>\n");
      out.write("\t\t\t\t\t<th scope=\"col\">Price</th>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t  </thead>\n");
      out.write("\t\t\t  <tbody>\n");
      out.write("\t\t\t  \n");
      out.write("\t\t\t  </tbody>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t <div id=\"pricing\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<p id=\"shipping\">\n");
      out.write("\t\t\t\t<strong>Shipping</strong>: <span id=\"sshipping\"></span>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<p id=\"sub-total\">\n");
      out.write("\t\t\t\t<strong>Total</strong>: <span id=\"stotal\"></span>\n");
      out.write("\t\t\t</p>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t \n");
      out.write("\t\t <form action=\"order.jsp\" method=\"post\" id=\"checkout-order-form\">\n");
      out.write("\t\t \t<h2>Your Details</h2>\n");
      out.write("\t\t \t\n");
      out.write("\t\t \t<fieldset id=\"fieldset-billing\">\n");
      out.write("\t\t \t\t<legend>Billing</legend>\n");
      out.write("\t\t \t\t<div>\n");
      out.write("\t\t \t\t\t<label for=\"name\">Name</label>\n");
      out.write("\t\t \t\t\t<input type=\"text\" name=\"name\" id=\"name\" data-type=\"string\" data-message=\"This field cannot be empty\" />\n");
      out.write("\t\t \t\t</div>\n");
      out.write("\t\t \t\t<div>\n");
      out.write("\t\t \t\t\t<label for=\"email\">Email</label>\n");
      out.write("\t\t \t\t\t<input type=\"text\" name=\"email\" id=\"email\" data-type=\"expression\" data-message=\"Not a valid email address\" />\n");
      out.write("\t\t \t\t</div>\n");
      out.write("\t\t \t\t<div>\n");
      out.write("\t\t \t\t\t<label for=\"city\">City</label>\n");
      out.write("\t\t \t\t\t<input type=\"text\" name=\"city\" id=\"city\" data-type=\"string\" data-message=\"This field cannot be empty\" />\n");
      out.write("\t\t \t\t</div>\n");
      out.write("\t\t \t\t<div>\n");
      out.write("\t\t \t\t\t<label for=\"address\">Address</label>\n");
      out.write("\t\t \t\t\t<input type=\"text\" name=\"address\" id=\"address\" data-type=\"string\" data-message=\"This field cannot be empty\" />\n");
      out.write("\t\t \t\t</div>\n");
      out.write("\t\t \t\t<div>\n");
      out.write("\t\t \t\t\t<label for=\"zip\">ZIP Code</label>\n");
      out.write("\t\t \t\t\t<input type=\"text\" name=\"zip\" id=\"zip\" data-type=\"string\" data-message=\"This field cannot be empty\" />\n");
      out.write("\t\t \t\t</div>\n");
      out.write("\t\t \t\t<div>\n");
      out.write("\t\t \t\t\t<label for=\"country\">Country</label>\n");
      out.write("\t\t \t\t\t<select name=\"country\" id=\"country\" data-type=\"string\" data-message=\"This field cannot be empty\">\n");
      out.write("\t\t \t\t\t\t<option value=\"\">Select</option>\n");
      out.write("\t\t \t\t\t\t<option value=\"India\">India</option>\n");
      out.write("\t\t \t\t\t\t\n");
      out.write("\t\t \t\t\t</select>\n");
      out.write("\t\t \t\t</div>\n");
      out.write("\n");
      out.write("\t\t \t</fieldset>\n");
      out.write("\t\t \t\n");
      out.write("\t\t \n");
      out.write("\t\t \t\n");
      out.write("\t\t \t<p><input type=\"submit\" id=\"submit-order\" value=\"Confirm\" class=\"btn\" /></p>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("\t\t \n");
      out.write("\t\t </form>\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- <footer id=\"site-info\">\n");
      out.write("\t\tCopyright &copy; Winery\n");
      out.write("\t</footer> -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\t\n");
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
