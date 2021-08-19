package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Random;
import java.sql.*;
import java.util.*;

public final class AdminHome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin-Home</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admin.css\"    >\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admfooter.css\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\" />\n");
      out.write("\n");
      out.write("<script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("<script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            $(document).on('click', '.panel-heading span.clickable', function(e){\n");
      out.write("          var $this = $(this);\n");
      out.write("\tif(!$this.hasClass('panel-collapsed')) {\n");
      out.write("\t\t$this.parents('.panel').find('.panel-body').slideUp();\n");
      out.write("\t\t$this.addClass('panel-collapsed');\n");
      out.write("\t\t$this.find('i').removeClass('glyphicon-chevron-down').addClass('glyphicon-chevron-up');\n");
      out.write("\t\t\n");
      out.write("\t} else {\n");
      out.write("\t\t$this.parents('.panel').find('.panel-body').slideDown();\n");
      out.write("\t\t$this.removeClass('panel-collapsed');\n");
      out.write("\t\t$this.find('i').removeClass('glyphicon-chevron-up').addClass('glyphicon-chevron-down');\n");
      out.write("\t\t\n");
      out.write("\t}\n");
      out.write("})\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <div class=\"head-main\">\n");
      out.write("                <div class=\"left-section\">\n");
      out.write("                    <h1>FARMER'S BUDDY</h1>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"right-section\">\n");
      out.write("                    \n");
      out.write("                    <span><a href=\"adminupdateprofile.jsp\">Profile</a></span>\n");
      out.write("                    <span>");

                           String uid=(String)session.getAttribute("uids1");
                            if(uid==null)
                            {
                                response.sendRedirect("AdminLogIn.jsp");
                           }
                           Class.forName("com.mysql.jdbc.Driver");
                                      try
                                      {
                                         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
                                         Statement st=con.createStatement();
                                         ResultSet rs=st.executeQuery("select *from admin where uid='"+uid+"'");
                                         if(rs.next())
                                         {
                                             out.println(rs.getString(1));
                                         }
                                      }
                                      catch(Exception e)
                                      {
                                      out.println("Error");
                                      }

                           
      out.write("</span>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"main\">  \n");
      out.write("            \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \t<div class=\"side-menu\">\n");
      out.write("\t\t<nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t\t\t<!-- Main Menu -->\n");
      out.write("\t\t\t<div class=\"side-menu-container\">\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li class=\"active\"><a href=\"#\"><span class=\"glyphicon glyphicon-dashboard\"></span> Dashboard</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"adminupdateprofile.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Profile</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"displayUsers.jsp\"><span class=\"glyphicon glyphicon-cloud\"></span> User Data</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Dropdown-->\n");
      out.write("\t\t\t\t\t<li class=\"panel panel-default\" id=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<a data-toggle=\"collapse\" href=\"#dropdown-lvl1\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"glyphicon glyphicon-edit\"></span> Manage Product <span class=\"caret\"></span>\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- Dropdown level 1 -->\n");
      out.write("\t\t\t\t\t\t<div id=\"dropdown-lvl1\" class=\"panel-collapse collapse\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"addnewproduct.jsp\">Add New Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"updateproduct.jsp\">Update Product</a></li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"deleteproduct.jsp\">Delete Product</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\n");
      out.write("\t\t\t\t\t<li><a href=\"adminlogout.jsp\"><span class=\"glyphicon glyphicon-off\"></span> Logout</a></li>\n");
      out.write("\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</nav>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("  \n");
      out.write("        <form> \n");
      out.write("        <div class=\"container\" style=\"background-color: gray;margin-left: 30px; width: 200%;\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        \n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"card-counter primary\">\n");
      out.write("        <i class=\"fa fa-code-fork\"></i>\n");
      out.write("        <span class=\"count-numbers\">12</span>\n");
      out.write("        <span class=\"count-name\" id=\"#\" name=\"#\">Orders</span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("  <div class=\"col-md-3\">\n");
      out.write("      <a href=\"feedbackview.jsp\">\n");
      out.write("      <div class=\"card-counter danger\">\n");
      out.write("        <i class=\"fa fa-ticket\"></i>\n");
      out.write("        <span class=\"count-name\">User Feedbacks</span>\n");
      out.write("      </div>\n");
      out.write("  </a> \n");
      out.write("  </div> \n");
      out.write("\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("      <div class=\"card-counter success\">\n");
      out.write("        <i class=\"fa fa-database\"></i>\n");
      out.write("        <span class=\"count-numbers\">6875</span>\n");
      out.write("        <span class=\"count-name\">Total Products</span>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"col-md-3\">\n");
      out.write("        <a href=\"displayUsers.jsp\">\n");
      out.write("      <div class=\"card-counter info\">\n");
      out.write("        <i class=\"fa fa-users\"></i>\n");
      out.write("        <span class=\"count-name\">Users</span>\n");
      out.write("      </div>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <a href=\"contactview.jsp\">\n");
      out.write("      <div class=\"card-counter info\">\n");
      out.write("        <i class=\"fa fa-users\"></i>\n");
      out.write("        <span class=\"count-name\">User Query</span>\n");
      out.write("      </div>\n");
      out.write("        </a>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("          \n");
      out.write("            ");
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<div class=\"panel panel-primary\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<h3 class=\"panel-title\">Employee List Bellow...</h3>\n");
      out.write("\t\t\t\t\t<span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-down\"></i></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t");
      out.write("  \t\n");
      out.write("                                <div class=\"panel-body\">Panel content\n");
      out.write("       \n");
      out.write("                                </div> ");
      out.write("  \n");
      out.write("                                \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t<div class=\"panel panel-success\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<h3 class=\"panel-title\">Products Information Here...</h3>\n");
      out.write("\t\t\t\t\t<span class=\"pull-right clickable\"><i class=\"glyphicon glyphicon-chevron-up\"></i></span>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"panel-body\">Panel content\n");
      out.write("                                \n");
      out.write("                                </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("            ");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("            </form>\n");
      out.write("    </div>\n");
      out.write("            \n");
      out.write("            \n");
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
