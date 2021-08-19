package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class displayCancelOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cancel Request</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admfooter.css\">\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("         <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\" style=\"background-color: #24104f\">\n");
      out.write("    \n");
      out.write("     <div class=\"row\" style=\"background-color: #24104f\">\n");
      out.write("         <div class=\"col-8\"><h1 style=\"color: white\">FARMER'S BUDDY</h1></div>\n");
      out.write("         <div class=\"col-4\" style=\"background-color: #24104f\">\n");
      out.write("             <nav class=\"navbar navbar-expand-lg navbar-light d-flex\" style=\"color: white;background-color: #24104f; float: right\">\n");
      out.write("    \n");
      out.write("                 <h5> <a class=\"nav-link\" href=\"AdminHome.jsp\" style=\"color: white;\">Home</a></h5>\n");
      out.write("                 <h5> <a class=\"nav-link\" href=\"#\" style=\"color: white;\">Profile</a></h5>\n");
      out.write("                 <h5> <a class=\"nav-link\" href=\"#\" style=\"color: white;\">Logout</a></h5>\n");
      out.write("    \n");
      out.write("            </nav>\n");
      out.write("         </div>\n");
      out.write("     </div>\n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\" style=\"background-color: ghostwhite\">\n");
      out.write("    <center>   <h2 style=\"margin-top: 20px; margin-bottom: 30px;\"> <span class=\"badge bg-warning text-dark\">Order Cancellation Form</span></h2></center>\n");
      out.write("        \n");
      out.write("        <div class=\"table-responsive\" style=\"margin-top: 20px; margin-bottom: 30px;\">\n");
      out.write("  <table class=\"table\">\n");
      out.write("     <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Request ID</th>\n");
      out.write("      <th scope=\"col\">Name</th>\n");
      out.write("      <th scope=\"col\">Email</th>\n");
      out.write("      <th scope=\"col\">Invoice No.</th>\n");
      out.write("     <th scope=\"col\">Reason for cancellation</th>\n");
      out.write("      <th scope=\"col\">Action</th>\n");
      out.write("       \n");
      out.write("    </tr>\n");
      out.write("    </thead>\n");
      out.write("  ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM order_cancel_request";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) 
                {
                     int id =Integer.parseInt( rs.getString("cid"));
                    String name = rs.getString("c_name");
                    String email = rs.getString("c_email");
                    String invoice = rs.getString("c_invoice");
                    String reason = rs.getString("c_reason");
        
      out.write("\n");
      out.write("  <tbody>\n");
      out.write("   <tr>\n");
      out.write("      <th scope=\"row\">");
      out.print(id);
      out.write("</th>\n");
      out.write("      <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(invoice);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(reason);
      out.write("</td>\n");
      out.write("                <td><button type=\"button\" class=\"btn btn-primary\">Accept</button></td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("  \n");
      out.write("   ");

                }
            } catch (Exception e) {
                out.println(e);
            }
        
      out.write("\n");
      out.write("  \n");
      out.write("  </table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("     ");
      out.write("\n");
      out.write("            \n");
      out.write("             <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\n");
      out.write("            <center><h1><span>FARMER'S </span>BUDDY</h1></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"myfooter\">\n");
      out.write("            <div class=\"infoa\">\n");
      out.write("                <h1>FARMER'S BUDDY</h1>\n");
      out.write("                <p>The Farmer's Buddy is the shopping Website for indian farming community. Easy user interface of the Farmer's Buddy is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>\n");
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
      out.write("\n");
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
