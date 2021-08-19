package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class updateprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-2.2.4.min.js\"></script>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\" crossorigin=\"anonymous\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/footer.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("        <title>User Profile</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/pro.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form method=\"POST\" action=\"updateprofile.jsp\">  \n");
      out.write("             <div class=\"header\" style=\"display: flex;\">\n");
      out.write("                   <div class='head-name' style='width: 50%; text-align: left; padding: 10px;'>\n");
      out.write("                        <h1 style=\"color: white; font-weight: bolder;font-size: 30px; margin-bottom: 10px;\">FARMER'S BUDDY</h1>\n");
      out.write("                    </div>\n");
      out.write("                 <div class=\"Cart\" style='width: 50%;'>\n");
      out.write("               \n");
      out.write("               <a href=\"logout.jsp\"><li class=\"fa fa-lock\"></li><b>LogOut</b></a>\n");
      out.write("               <a href=\"index.jsp\"><li class=\"fa fa-home\"></li><b>Home</b></a>\n");
      out.write("              </div>\n");
      out.write("              </div> \n");
      out.write("        <div class=\"main\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"first\">\n");
      out.write("\t\t<center><h2>To <br>FARMER'S</h2></center>\n");
      out.write("\t\t<center><p class=\"line\">\"A good farmer<br> is\n");
      out.write("\t\tnothing\n");
      out.write("\t\tmore nor less <br>than a\n");
      out.write("\t\thandy man <br>with\n");
      out.write("\t\ta sense of \n");
      out.write("\t\thumus.\"</p></center>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"second\">\n");
      out.write("                    ");
                 
                             String uid=(String)session.getAttribute("uids");
                             
                                      Class.forName("com.mysql.jdbc.Driver");   
                                      try
                                      {
                                            String user = request.getParameter("name");
                                            String add = request.getParameter("add");
                                            String email = request.getParameter("email");
                                            String mob = request.getParameter("mob");
                                         Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy","root","");
                                         Statement st=con.createStatement();
                                         //st.executeUpdate("update register set name='"+user+"',address='"+add+"',email='"+email+"', mobile='"+mob+"'");
                                         ResultSet rs=st.executeQuery("select *from register where uid='"+uid+"'");
                                        
                                         if(rs.next())
                                         {
                                    
      out.write("\n");
      out.write("                    <center><h1>Profile</h1> \n");
      out.write("                        <h1>Welcome,");
out.println(rs.getString(1));
      out.write("</center>\n");
      out.write("                     \n");
      out.write("\t\t\t\t<div class=\"show\">\n");
      out.write("\t\t\t\t<label><b>Name:</b></label><br>\n");
      out.write("                                <input type=\"text\" name=\"name\" class=\"data\" id=\"field1\" disabled value=");
out.println(rs.getString(1));
      out.write(">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"show\">\n");
      out.write("\t\t\t\t<label><b>Address:</b></label><br>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"data\" id=\"field2\" name=\"add\" disabled value=");
out.println(rs.getString(3));
      out.write(" >\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"show\">\n");
      out.write("\t\t\t\t<label><b>Contact No.:</b></label><br>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"data\" id=\"field3\" name=\"mob\" disabled value=");
out.println(rs.getString(5));
      out.write(" >\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"show\">\n");
      out.write("\t\t\t\t<label><b>Email-id:</b></label><br>\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"data\" id=\"field4\" name=\"email\" disabled value=");
out.println(rs.getString(4));
      out.write("><br>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"btn-edit\">\n");
      out.write("\t\t\t\t<center><button class=\"btn\" onclick=\"letDisable()\"  id=\"field5\" value=\"Edit\">Edit Profile                                    \n");
      out.write("                                    </button>\n");
      out.write("                                       \n");
      out.write("                                         \n");
      out.write("                                     <button class=\"btn\" id=\"field6\" value=\"Edit\" disabled >Save Profile\n");
      out.write("                                         ");
                 
                                    // String uid=(String)session.getAttribute("uids");                      Class.forName("com.mysql.jdbc.Driver");   
                                   try
                                      {
                                         if(user!=null)
                                         {
                                         st.executeUpdate("update register set name='"+user+"',address='"+add+"',email='"+email+"', mobile='"+mob+"'where uid='"+uid+"'");      
                                         response.sendRedirect("profile.jsp");
                                         }
                                      }
                                   catch(Exception e)
                                   {
                                   }
                                                                 
                                    
      out.write("</button>\n");
      out.write("                                    </center>  \n");
      out.write("                                 ");

 }
}
catch(Exception e)
{

}     
  
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("        </div>\n");
      out.write("      </form>\n");
      out.write("        <script>\n");
      out.write("       \n");
      out.write("        function letDisable() {\n");
      out.write("\t\t  document.getElementById(\"field1\").disabled = false;\n");
      out.write("\t\t  document.getElementById(\"field2\").disabled = false;\n");
      out.write("\t\t  document.getElementById(\"field3\").disabled = false;\n");
      out.write("\t\t  document.getElementById(\"field4\").disabled = false;\n");
      out.write("\t\t  document.getElementById(\"field5\").disabled = true;\n");
      out.write("                  document.getElementById(\"field6\").disabled = false;\n");
      out.write("\t\t}\n");
      out.write("    </script>\n");
      out.write("            \n");
      out.write("         \n");
      out.write("\t");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 70px;'>\n");
      out.write("            <center><h1 style=\"justify-content: center\"><span>FARMER'S </span>BUDDY</h1></center>\n");
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
      out.write("      \n");
      out.write("    </body>\n");
      out.write("</html> \n");
      out.write(" \n");
      out.write(" ");
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
