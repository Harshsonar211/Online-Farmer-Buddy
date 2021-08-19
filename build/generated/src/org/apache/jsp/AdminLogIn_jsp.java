package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class AdminLogIn_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Admin LogIn </title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/CustomerLogin.css\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/footer.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("              <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("            function show(){\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var uid=document.forms[\"Alogin\"][\"uid\"].value;\n");
      out.write("                 var pass=document.forms[\"Alogin\"][\"pass\"].value;\n");
      out.write("                 //var message=document.forms[\"feedback\"][\"message\"].value;\n");
      out.write("                 if(uid == \"\" || pass== \"\")\n");
      out.write("                 {\n");
      out.write("\n");
      out.write("                 //alert(\"please enter values\");\n");
      out.write("                    swal(\"Warning..!\", \"Please fill the fields...\", \"warning\");\n");
      out.write("                 \n");
      out.write("             }\n");
      out.write("          }         \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <form name=\"Alogin\" method=\"post\" action=\"AdminLogIn.jsp\">\n");
      out.write("              <div class=\"header\" style='display: flex'>\n");
      out.write("                  <div class=\"head-name\" style=\"width: 30%;color: white;\">\n");
      out.write("                      <h2 style=\"margin-left: 10px;color: white;\">FARMER'S BUDDY</h2>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"Cart\" style=\"width: 70%;\">\n");
      out.write("               <a href=\"cart.jsp\"><li class=\"fa fa-shopping-cart\"></li><b>Cart</b></a>\n");
      out.write("               <a href=\"index.jsp\"><li class=\"fa fa-home\"></li><b>Home</b></a>\n");
      out.write("              </div>\n");
      out.write("              </div>  \n");
      out.write("        <Center><h1><b>Admin LogIn </b></h1></Center>\n");
      out.write("        <center>   <div class=\"row\"></div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-50\">\n");
      out.write("            <table>\n");
      out.write("            <label for=\"cname\"><b>LogIn ID:</b> </label>\n");
      out.write("            <input type=\"text\" id=\"uid\" name=\"uid\" placeholder=\"LogIn ID\"maxlength=\"10\" ></br>\n");
      out.write("            <label for=\"ccnum\"><b>Password:</b></label>\n");
      out.write("            <input type=\"password\" id=\"pass\" name=\"pass\" placeholder=\" Your Password\"maxlength=\"8\"  ><br>\n");
      out.write("            \n");
      out.write("            </table>\n");
      out.write("           \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <input type=\"submit\" value=\"LogIn\"   onclick=\"show()\" class=\"btn\">\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("      </center>\n");
      out.write("      </form>\n");
      out.write("        ");
      out.write("\n");
      out.write("         <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\n");
      out.write("            <center><h1><span>FARMER'S </span>BUDDY</h1></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"myfooter\">\n");
      out.write("            <div class=\"info\">\n");
      out.write("                <h1>FARMER'S BUDDY</h1>\n");
      out.write("              <p>The FarmerBuddy is the Online shopping Website for indian farming community. Easy user interface of the FarmerBuddy is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>\n");
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
      out.write("             \n");
      out.write("               <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");

 
  String uid = request.getParameter("uid");
  String pass = request.getParameter("pass");
  
  Class.forName("com.mysql.jdbc.Driver");
  Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
  Statement st=con.createStatement();
  ResultSet rs;
  rs=st.executeQuery("select * from admin where uid='"+uid+"'and pass='"+pass+"'");
    session.setAttribute("uids1",uid);
  if(rs.next())
  {
    response.sendRedirect("AdminHome.jsp");
  }
  else
  {
   // response.sendRedirect("AdminLogIn.jsp");
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
