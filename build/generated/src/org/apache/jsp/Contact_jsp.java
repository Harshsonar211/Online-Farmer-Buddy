package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Contact Us</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/contact.css\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/footer.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("          <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("         <script>\n");
      out.write("            function show(){\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                var fname=document.forms[\"contact1\"][\"fname\"].value;\n");
      out.write("                 var mobno=document.forms[\"contact1\"][\"mobno\"].value;\n");
      out.write("                 var uid=document.forms[\"contact1\"][\"uid\"].value;\n");
      out.write("                 var subject=document.forms[\"contact1\"][\"subject\"].value;\n");
      out.write("                 if(fname == \"\" || mobno== \"\" || uid == \"\" || subject == \"\" )\n");
      out.write("                 {\n");
      out.write("                    swal(\"Warning..!\", \"Please fill the fields...\", \"warning\");\n");
      out.write("                }else\n");
      out.write("                {\n");
      out.write("                    swal(\"submited\", \"We will contact you soon...\", \"success\");\n");
      out.write("                }\n");
      out.write("             }          \n");
      out.write("        </script> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"contact1\" method=\"post\" action=\"contac.jsp\">\n");
      out.write("             <div class=\"header\" style='display: flex'>\n");
      out.write("                 <div class=\"head-name\" style=\"width: 30%;color: white;\">\n");
      out.write("                      <h2 style=\"margin-left: 10px;color: white; font-size: 30px;\">FARMER'S BUDDY</h2>\n");
      out.write("                  </div>\n");
      out.write("             <div class=\"Cart\" style='width: 70%; text-align: right;'>\n");
      out.write("              <a href=\"LogInCustomer.jsp\" class=\"uid\"><li class=\"fa fa-user-circle-o\"></li><b>LogIn</b></a>\n");
      out.write("              <a href=\"Register.jsp\"><li class=\"fa fa-user-plus\"></li><b>Register</b></a>\n");
      out.write("              <a href=\"Cart.jsp\"><li class=\"fa fa-shopping-cart\"></li><b>Cart</b></a>\n");
      out.write("              <a href=\"index.jsp\"><li class=\"fa fa-home\"></li><b>Home</b></a>\n");
      out.write("              </div>\n");
      out.write("              </div> \n");
      out.write("    <Center><h1> <b>Contact Us...!</b></h1></Center>\n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("     <div class=\"container\">\n");
      out.write("    <table>\n");
      out.write("    <label for=\"fname\"><b>First Name</b></label>\n");
      out.write("    <input type=\"text\" id=\"fname\" name=\"fname\" placeholder=\"Your name..\" maxlength=\"10\" required>\n");
      out.write("\n");
      out.write("    <label for=\"lname\"><b>Mobile Number</b></label>\n");
      out.write("    <input type=\"text\" id=\"mobno\" name=\"mobno\" placeholder=\"Mobile Number\" maxlength=\"10\" required=\"number\">\n");
      out.write("\n");
      out.write("    <label for=\"lname\"><b>User-ID</b></label>\n");
      out.write("    <input type=\"text\" id=\"uid\" name=\"uid\" placeholder=\"UserID\" maxlength=\"9\" required>\n");
      out.write("\n");
      out.write("    <label for=\"subject\"><b>Subject</b></label>\n");
      out.write("    <textarea id=\"subject\" name=\"subject\" placeholder=\"Write something..\" style=\"height:170px\" required></textarea>\n");
      out.write("\n");
      out.write("    <input type=\"submit\" value=\"Submit\" onclick=\"show()\">\n");
      out.write("    </table>\n");
      out.write(" </div>\n");
      out.write("         \n");
      out.write(" </center>\n");
      out.write(" </form>\n");
      out.write("              \n");
      out.write("              \n");
      out.write("              ");
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
      out.write("       \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
