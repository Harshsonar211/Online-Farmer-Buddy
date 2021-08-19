package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class order_005fshipp_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Online ordering and Shipping</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/header_footer.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/order_shipp.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         <header>\n");
      out.write("            <div class=\"head-main\">\n");
      out.write("                <div class=\"left-section\">\n");
      out.write("                    <h1>FARMER'S BUDDY</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right-section\">\n");
      out.write("                    \n");
      out.write("                    <span><a href=\"adminupdateprofile.jsp\">Profile</a></span>\n");
      out.write("                    <span><a href=\"#\">Home</a></span>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("          ");
      out.write("\n");
      out.write("          <div class='main-body'>\n");
      out.write("              <div class=\"order-guide-head\">\n");
      out.write("                  <h1>Guidelines for Order & Shipping</h1>\n");
      out.write("                  <p>There are some guidelines and steps to be aware with the Farmer' Buddy.\n");
      out.write("                  you can buy the various products as it's category. </p>\n");
      out.write("              </div>\n");
      out.write("              <div class='order-steps'>\n");
      out.write("                    <h2>Steps to Order & Purchase </h2>\n");
      out.write("                   <h3>Step 1 :  <span>First Register to our Website and Login</span></h3>\n");
      out.write("                   <h3>Step 2 :  <span>Go to Category at below and you can click as your wish.</span></h3>\n");
      out.write("                   <h3>Step 3 :  <span>You can search products as you want.</span></h3>\n");
      out.write("                   <h3>Step 4 :  <span>Click on Add to cart</span></h3>\n");
      out.write("                   <h3>Step 5 :  <span>Click on Check-out Button</span></h3>\n");
      out.write("                   <h3>Step 6 :  <span>Fill the Shipping/delivery details.</span></h3>\n");
      out.write("                   <h3>Step 7 :  <span>Click on pay-pal button for online payment and once payment is done ,your order will be placed.</span></h3>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"shipping-details\">\n");
      out.write("                  <h2>Shipping & Delivery</h2>\n");
      out.write("                  <p>After placing order shipping and delivery of product are done by delivery boy. The order will be deliver within 24 hour's\n");
      out.write("                  The product will be delivered at customer specified address.</p>\n");
      out.write("              </div>\n");
      out.write("              \n");
      out.write("              <div class=\"shipping-details\">\n");
      out.write("                  <h2>Return & Exchange</h2>\n");
      out.write("                  <p>After delivery of product, customer have any problem with order like damaged product, another product receive or any other queries then the customer can easily fill the \"contact us\" form likewise, Admin /owner\n");
      out.write("                  can solve customer queries and fulfill the customer requirements.</p>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("             <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\n");
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
      out.write("                    \n");
      out.write("                    <li><a href=\"about_us.jsp\" id=\"foot-hyper\">About Us</a></li>\n");
      out.write("                      <li><a href=\"Feedback.jsp\" id=\"foot-hyper\">Feedback</a></li>\n");
      out.write("                    <li><a href=\"https://farmerbuddy007.blogspot.com/\" id=\"foot-hyper\">Blogs</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"f3\">\n");
      out.write("                <ul class=\"foot-list\">\n");
      out.write("                    <li><h1>Help & FAQs</h1></li>\n");
      out.write("                    <li><a href=\"order_shipp_detail.jsp\"> Online Ordering</a></li>\n");
      out.write("                    <li><a href=\"Contact.jsp\" id=\"foot-hyper\">Contact Us</a></li>\n");
      out.write("                    <li><a href=\"order_shipp_detail.jsp\">Shipping</a></li>\n");
      out.write("                    <li><a href=\"https://www.privacypolicies.com/live/136767c1-dfd8-40f2-bae9-3fac9ec9302b\">Return & Exchange</a></li>\n");
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
      out.write("    </body>\n");
      out.write("</html>\n");
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
