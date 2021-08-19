package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Register</title>\n");
      out.write("          <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/logcss.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/footer.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("          <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("            function show(){\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var name=document.forms[\"register\"][\"name\"].value;\n");
      out.write("                 var add=document.forms[\"register\"][\"add\"].value;\n");
      out.write("                 var email=document.forms[\"register\"][\"email\"].value;\n");
      out.write("                 var mob=document.forms[\"register\"][\"mob\"].value;\n");
      out.write("                 var uid=document.forms[\"register\"][\"uid\"].value;\n");
      out.write("                 var pass=document.forms[\"register\"][\"pass\"].value;\n");
      out.write("                 var pswrepeat=document.forms[\"register\"][\"pswrepeat\"].value;\n");
      out.write("                 if(name == \"\" || add == \"\" || email == \"\" ||  mob == \"\" || uid == \"\" || pass == \"\" || pswrepeat == \"\")\n");
      out.write("                 {\n");
      out.write("                    swal(\"Warning..!\", \"Please fill the fields...\", \"warning\");\n");
      out.write("                }else\n");
      out.write("                {\n");
      out.write("                    swal(\"submited\", \"you are successfully Registered...\", \"success\");\n");
      out.write("                }\n");
      out.write("             }\n");
      out.write("             </script>\n");
      out.write("            \n");
      out.write("             <script>\n");
      out.write("                 function check()\n");
      out.write("                 {\n");
      out.write("                  var pass=document.forms[\"register\"][\"pass\"].value;\n");
      out.write("                  var pswrepeat=document.forms[\"register\"][\"pswrepeat\"].value;\n");
      out.write("                   if(pass !== pswrepeat)\n");
      out.write("                  {\n");
      out.write("                    swal(\"Warning..!\", \"password dosent match...\", \"warning\");\n");
      out.write("                  }\n");
      out.write("                 }\n");
      out.write("             </script>\n");
      out.write("             <script>\n");
      out.write("                 function validmob()\n");
      out.write("                 {\n");
      out.write("                     var phone=document.forms['register']['mob'];\n");
      out.write("                     if(isNaN(phone.value) || phone.value.length != 10)\n");
      out.write("                     {\n");
      out.write("                         alert(\"Invalid phone number\");\n");
      out.write("                         return false;\n");
      out.write("                     }\n");
      out.write("                     return true;\n");
      out.write("                 }\n");
      out.write("             </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"register\" method=\"POST\" action=\"Register.jsp\" onsubmit=\"return validmob()\">\n");
      out.write("        <center>\n");
      out.write("            <div class=\"header\" style=\"display: flex;\">\n");
      out.write("                <div class='head-name' style='width: 50%; text-align: left;'>\n");
      out.write("                    <h1 style=\"color: white; font-size: 30px; margin-left: 10px; \">FARMER'S BUDDY</h1></div>\n");
      out.write("                 \n");
      out.write("                 <div class=\"Cart\"  style='width: 50%; text-align: right'>\n");
      out.write("              <a href=\"LogInCustomer.jsp\"><li class=\"fa fa-user-plus\"></li><b>Log In</b></a>\n");
      out.write("               <a href=\"Cart.jsp\"><li class=\"fa fa-shopping-cart\"></li><b>Cart</b></a>\n");
      out.write("               <a href=\"index.jsp\"><li class=\"fa fa-home\"></li><b>Home</b></a>\n");
      out.write("              </div>\n");
      out.write("              </div>   \n");
      out.write("            <div class=\"main\">\n");
      out.write("             <h1>Register</h1>\n");
      out.write("            <div class=\"second\">\n");
      out.write("                 <label for=\"name\"><b>Enter Full Name</b></label>\n");
      out.write("                 <input type=\"text\" placeholder=\"Name\" name=\"name\" id=\"name\" required>\n");
      out.write("             \n");
      out.write("                 <div id=\"radio\" name=\"radio\">\n");
      out.write("                    <label><b> Gender</b></label>\n");
      out.write("                   <input type=\"radio\" name=\"gender\" value=\"male\" id=\"Male\">Male \n");
      out.write("                   <input type=\"radio\" name=\"gender\" value=\"female\" id=\"Female\"> Female\n");
      out.write("                 <input type=\"radio\" name=\"gender\" value=\"other\" id=\"Other\"> Other\n");
      out.write("              </div>                 \n");
      out.write("                  <label for=\"name\"><b>Address</b></label>\n");
      out.write("                 <input type=\"text\" placeholder=\"Address (Village, city, dist.)\" name=\"add\" id=\"add\" required>\n");
      out.write("                 \n");
      out.write("                  <label for=\"name\"><b>Enter Email</b></label>\n");
      out.write("                 <input type=\"email\" placeholder=\"Enter Email\" name=\"email\" id=\"email\" required>\n");
      out.write("           \n");
      out.write("                <label for=\"mobilenum\"><b>Mobile Number</b></label>\n");
      out.write("                <input type=\"text\" placeholder=\"Mobile Number\" name=\"mob\" id=\"mob\" pattern=\"[6-9]\\d{9}\" title=\"Enter valid phone number\" maxlength=\"10\" required>\n");
      out.write("                \n");
      out.write("                  <label for=\"name\"><b>User ID</b></label>\n");
      out.write("                 <input type=\"text\" placeholder=\"User ID\" name=\"uid\" id=\"uid\" maxlength=\"8\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"psw\"><b>Password</b></label>\n");
      out.write("                <input type=\"password\" placeholder=\"Password\" name=\"pass\" id=\"pass\" maxlength=\"8\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"psw-repeat\"><b>Repeat Password</b></label>\n");
      out.write("                <input type=\"password\" placeholder=\"Repeat Password\" name=\"pswrepeat\" maxlength=\"8\" id=\"pswrepeat\" required>\n");
      out.write("                <center><p>By creating an account you agree to our <a href=\"#\">Terms & Privacy</a>.</p></center>\n");
      out.write("            <button type=\"submit\" class=\"registerbtn\" onclick=\"show(),check(),validmob()\">Register</button>\n");
      out.write("            </div>\n");
      out.write("        </div>       \n");
      out.write("       </center>\n");
      out.write("       \n");
      out.write("        </form>\n");
      out.write("        \n");
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
      out.write("                    \n");
      out.write("                    <li><a href=\"about_us.jsp\" id=\"foot-hyper\">About Us</a></li>\n");
      out.write("                     <li><a href=\"Feedback.jsp\" id=\"foot-hyper\">Feedback</a></li>\n");
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
      out.write("     </body>\n");
      out.write("</html>\n");
      out.write("\n");

String user = request.getParameter("name");
String gender = request.getParameter("gender");
String add = request.getParameter("add");
String email = request.getParameter("email");
String mob = request.getParameter("mob");
String uid = request.getParameter("uid");
String pass = request.getParameter("pass");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
Statement st=con.createStatement();
int i=st.executeUpdate("insert into register(name,gender,address,email,mobile,uid,pass)values('"+user+"','"+gender+"','"+add+"','"+email+"','"+mob+"','"+uid+"','"+pass+"')");
//out.println("Data Inserted Successfully");
  if(i>0)
  {
    //out.println("Registration Successful...!");
    response.sendRedirect("mail.jsp?name="+user+"&uid="+uid+"&pass="+pass+"&m="+email);
    //response.sendRedirect("LogInCustomer.jsp");
  }
  else
  {
  response.sendRedirect("Register.jsp");
  }
  }
  catch(Exception e)
  {
     // out.println(e);
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
