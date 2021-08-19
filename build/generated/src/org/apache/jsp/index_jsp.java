package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\"><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\t<title>Farmer's Buddy</title>\n");
      out.write("\n");
      out.write("\t<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" />\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css2?family=Fira+Sans:ital,wght@0,400;0,600;0,700;0,900;1,400;1,600;1,700&display=swap\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admfooter.css\" >\n");
      out.write("\t<link rel=\"stylesheet\" href=\"homecss.css\" >\n");
      out.write("        <script src=\"js/script.js\">\n");
      out.write("            </script>\n");
      out.write("        \n");
      out.write("               <style>\n");
      out.write(".dropdown {\n");
      out.write("  position: relative;\n");
      out.write("  display: inline-block;\n");
      out.write("  color:inherit;\n");
      out.write("  font-size:20px;\n");
      out.write("text-decoration:none;\n");
      out.write("  font-family:'Fira Sans', sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown-content {\n");
      out.write("    \n");
      out.write("    border-radius: 5px;\n");
      out.write("  display: none;\n");
      out.write("  position: absolute;\n");
      out.write("  background-color:#24104f;\n");
      out.write("  opacity: 0.9;\n");
      out.write("  min-width: 160px;\n");
      out.write("  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\n");
      out.write("  padding: 12px 16px;\n");
      out.write("  z-index: 1;\n");
      out.write("}\n");
      out.write(".dropdown li{\n");
      out.write("    padding: 3px;\n");
      out.write("    font-weight: 100;\n");
      out.write("    border-bottom: 1px black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dropdown:hover .dropdown-content {\n");
      out.write("  display: block;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("     \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("\t<header>\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h2><span>Farmer's</span> Buddy</h2>\n");
      out.write("\t\t\t<nav>\n");
      out.write("                            <b><a href=\"index.jsp\">Home</a>  </b>             \n");
      out.write("                                 <!--<a href=\"cart.jsp\">Cart</a> -->\n");
      out.write("                                 <b> <a href=\"updateprofile.jsp\">Profile</a></b>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                                <div class=\"dropdown\">\n");
      out.write("                                    <b><span>");

                           String uid=(String)session.getAttribute("uids");
                           if(uid==null)
                           {
                               out.print("Login");
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

                                    
      out.write("</span></b>\n");
      out.write("                                    <div class=\"dropdown-content\">\n");
      out.write("                                        <ul style=\"list-style:none;\">\n");
      out.write("                                               \n");
      out.write("                          <li><a href=\"LogInCustomer.jsp\">");

                          
                           if(uid==null){
                               out.print("login");
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

                           
      out.write("</a></li>\n");
      out.write("                                <li><a href=\"AdminLogIn.jsp\" >Admin Login</a></li>\n");
      out.write("                                <li><a href=\"logout.jsp\" >LogOut</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <b><a href=\"Register.jsp\">Register</a></b>\n");
      out.write("                                    \n");
      out.write("\t\t\t</nav>\n");
      out.write("\t\t\t<button class=\"hamburger\">\n");
      out.write("\t\t\t\t<div class=\"bar\"></div>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t</header>\n");
      out.write("\t<nav class=\"mobile-nav\">\n");
      out.write("\t\t<a href=\"index.jsp\">Home</a>\n");
      out.write("\t\t<a href=\"fertilizer.jsp\">Services</a>\n");
      out.write("\t\t<a href=\"cart.jsp\">My Cart</a>\n");
      out.write("\t\t<a href=\"LogInCustomer.jsp\">Log In</a>\n");
      out.write("\t</nav>\n");
      out.write("\t<main>\n");
      out.write("\t\t<section class=\"banner\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<h1>\n");
      out.write("\t\t\t\t\tFarmer's Buddy <br class=\"hide-mob\" />\n");
      out.write("\t\t\t\t\t<span>Extra care</span> for Plant's...\n");
      out.write("\t\t\t\t</h1>\n");
      out.write("\n");
      out.write("\t\t\t\t<h3>Extra Care for Plant's</h3>\n");
      out.write("\n");
      out.write("\t\t\t\t<a href=\"#\" style=\"background-image:url(img/logo.png);height: 90px; width: 250px;\" class=\"button\"></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<section id=\"services\" class=\"services\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<h2>Services</h2>\n");
      out.write("\t\t\t\t\n");
      out.write("                                <div class=\"services-grid\" style=\"margin-left: 250px;\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t <div class=\"service\">\n");
      out.write("\t\t\t\t\t\t<figure class=\"img-box\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/cust-service.jpg\" alt=\"Website Service\" class=\"img\" />\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<h3>24 X 7 Customer Service</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\twe also provide 24/7 customer service, if customer has any queries regarding products or delivery then he can simply\n");
      out.write("                                                                contact us by filling contact us form.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> \n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"service\">\n");
      out.write("\t\t\t\t\t\t<figure class=\"img-box\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/speed-deliver.jpg\" alt=\"App Service\" class=\"img\" />\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Speed Delivery</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("                                                                we provide speed delivery of product at your specified destination will be reach within 24 hours.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"service\">\n");
      out.write("\t\t\t\t\t\t<figure class=\"img-box\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/paysecure.jpg\" alt=\"Games Service\" class=\"img\" />\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Pay Online</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tWe accept multiple modes of payment such as Credit Cards, Debit Cards. \n");
      out.write("                                                                Besides these payment modes Currently, we prefer Pay-pal international payment Gateway.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t\t<section class=\"projects\" id=\"projects\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<h2>Category</h2>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"projects-grid\">\n");
      out.write("\t\t\t\t\t<div class=\"project\">\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Fertilizer</h3>\n");
      out.write("\t\t\t\t\t\t\t<p> Fertilizer is a natural or synthetic substance that is applied to the soil or the plants to improve growth and productivity. They provide nutrients to the plants.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"fertilizer.jsp\" class=\"button\">Shop Now</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"project2\">\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Pesticides</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Pesticides are chemical compounds that are used to kill pests, including insects, rodents, fungi and unwanted plants (weeds). Over 1000 different pesticides are used around the world.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"pesticides.jsp\" class=\"button\">Shop Now</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"project3\">\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<h3>Seeds</h3>\n");
      out.write("\t\t\t\t\t\t\t<p>Seeds are the primary basis for human sustenance. They are the repository of the genetic potential of crop species and their varieties resulting from the continuous improvement and selection over time.</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"seeds.jsp\" class=\"button\">Shop Now</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"center\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"button\"></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</section>\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\n");
      out.write("            <center><h1><span>FARMER'S </span>BUDDY</h1></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"myfooter\">\n");
      out.write("            <div class=\"info\">\n");
      out.write("                <h1>FARMER'S BUDDY</h1>\n");
      out.write("               <p>The FarmerBuddy is the Online shopping Website for indian farming community. \n");
      out.write("               Easy user interface of the FarmerBuddy is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>\n");
      out.write("             </div>\n");
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
      out.write("                <a href=\"https://www.privacypolicies.com/live/3d5057cf-8805-40af-b65e-06383e5936f4\" class=\"mid-links\">Privacy</a>\n");
      out.write("                <a href=\"https://www.privacypolicies.com/live/c9f94ba0-c63b-41c5-8460-0099716bcbd7\" class=\"mid-links\">Terms & Condition</a>\n");
      out.write("                <div class='copyright'>\n");
      out.write("                    <p style='color: whitesmoke'> Copyright ©2021-22 Farmer's Buddy Ltd. All rights reserved.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-paycards\" style=\"width: 33.33%\">\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/paypal.png\" style=\"height: 60px; width: 60px;\"></a>\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/master.png\" style=\"height: 60px; width: 60px;\"></a>\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/visa.png\" style=\"height: 60px; width: 60px;\"></a>  \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("               <script src=\"js/main.js\"></script>\n");
      out.write("</body>\n");
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
