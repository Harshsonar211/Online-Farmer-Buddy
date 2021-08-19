package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/feedbackcss.css\">\n");
      out.write("        <title>Feedback Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/footer.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("          <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("            function show(){\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var name=document.forms[\"feedback\"][\"name\"].value;\n");
      out.write("                 var gmail=document.forms[\"feedback\"][\"gmail\"].value;\n");
      out.write("                 var message=document.forms[\"feedback\"][\"message\"].value;\n");
      out.write("                 if(name == \"\" || gmail== \"\" || message== \"\")\n");
      out.write("                 {\n");
      out.write("\n");
      out.write("                 //alert(\"please enter values\");\n");
      out.write("                    swal(\"Warning..!\", \"Please fill the fields...\", \"warning\");\n");
      out.write("                 \n");
      out.write("             }else{ \n");
      out.write("                 //alert(\"submited\");\n");
      out.write("             \n");
      out.write("              swal(\"Feedback submitted!\", \"Thanks for your feedback...\", \"success\");\n");
      out.write("          }\n");
      out.write("          }\n");
      out.write("          </script>\n");
      out.write("          \n");
      out.write("          <style>\n");
      out.write("              body{\n");
      out.write("                  margin: 0;\n");
      out.write("                  padding: 0;\n");
      out.write("              }\n");
      out.write("              .left-section h2{\n");
      out.write("    padding-left: 5%;\n");
      out.write("    padding-bottom: 2%;\n");
      out.write("    text-decoration: blink;\n");
      out.write("   color: white;\n");
      out.write("}\n");
      out.write(".head-main{\n");
      out.write("    height: 70px;\n");
      out.write("    display: flex;\n");
      out.write("    background-color: #24104f;\n");
      out.write("}\n");
      out.write(".left-section{\n");
      out.write("    justify-content: center;\n");
      out.write("    width:60%;\n");
      out.write("    background-color:#24104f;\n");
      out.write("    align-items: center;\n");
      out.write("}\n");
      out.write(".right-section{\n");
      out.write("    width: 30%;\n");
      out.write("    display: flex;\n");
      out.write("    background-color: #24104f;\n");
      out.write("    justify-content: center;\n");
      out.write("    align-items: center;\n");
      out.write("    padding-left: 20%;\n");
      out.write("}\n");
      out.write(".right-section span{\n");
      out.write("    padding-left: 5%;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 25px;\n");
      out.write("    font-family: sans-serif;\n");
      out.write("}\n");
      out.write(".right-section a{\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("          </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <header>\n");
      out.write("            <div class=\"head-main\">\n");
      out.write("                <div class=\"left-section\">\n");
      out.write("                    <h2>FARMER'S BUDDY</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right-section\" style='text-align: right'>\n");
      out.write("                    \n");
      out.write("                    <span><a href=\"adminupdateprofile.jsp\">Profile</a></span>\n");
      out.write("                    <span><a href=\"#\">Home</a></span>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        \n");
      out.write("        <form name=\"feedback\" method=\"post\" action=\"Feedback.jsp\">\n");
      out.write("          <Center><h1> <b>Feedback</b></h1></Center>\n");
      out.write("    <center><div class=\"container\">\n");
      out.write("    <table>\n");
      out.write("    <label for=\"fname\"><b>Full Name</b></label>\n");
      out.write("    <input type=\"text\" name=\"name\" id=\"name\" placeholder=\"Your name..\" required>\n");
      out.write("\n");
      out.write("    <label for=\"lname\"><b>Email</b></label>\n");
      out.write("    <input type=\"email\" id=\"gmail\" name=\"email\" placeholder=\"Email\" required>\n");
      out.write("    \n");
      out.write("    <label class=\"radio-inline\"><b>Experience:</br> </b><input type=\"radio\" name=\"experience\" value=\"Bad\" id=\"Bad\" >Bad</label>\n");
      out.write("    <label class=\"radio-inline\"><input type=\"radio\" name=\"experience\" value=\"Average\" id=\"Average\" >Average</label>\n");
      out.write("    <label class=\"radio-inline\"><input type=\"radio\" name=\"experience\" value=\"Good\" id=\"Good\">Good</label>\n");
      out.write("\n");
      out.write("    <label for=\"subject\"></label>\n");
      out.write("    <textarea  id=\"message\" name=\"message\" placeholder=\"Write message..\" style=\"height:170px\" ></textarea>\n");
      out.write("\n");
      out.write("    <input type=\"submit\" onclick=\"show()\" value=\"Submit\">\n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("        </center>\n");
      out.write("          </form>\n");
      out.write("        \n");
      out.write("          ");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\n");
      out.write("            <center><h1><span>FARMER'S </span>BUDDY</h1></center>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"myfooter\">\n");
      out.write("            <div class=\"info\">\n");
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
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("</html>\n");
      out.write("\n");

String name = request.getParameter("name");
String email = request.getParameter("email");
String experience = request.getParameter("experience");
String message = request.getParameter("message");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
Statement st=con.createStatement();
int i=st.executeUpdate("insert into feedback(name,email,experience,message) values('"+name+"','"+email+"','"+experience+"','"+message+"')");

if(i>0)
{
     out.println("Data Inserted Successfully");
     response.sendRedirect("index.jsp");
}
else
{
   out.println("Error...!");
   response.sendRedirect("Feedback.jsp");
}
}
catch(Exception e)
{
    
}

      out.write("\n");
      out.write(" \n");
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
