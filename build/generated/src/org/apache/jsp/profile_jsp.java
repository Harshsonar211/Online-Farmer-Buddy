package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         \n");
      out.write("        <title>User Profile</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"css/pro.css\">\n");
      out.write("          <link rel=\"stylesheet\" href=\"css/footer.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("         <form method=\"POST\" action=\"updateprofile.jsp\">  \n");
      out.write("              <div class=\"header\" style=\"display: flex\">\n");
      out.write("                  <h1>FARMER'S BUDDY</h1>\n");
      out.write("                  <div class=\"Cart\" style=\"width: 50%;\">\n");
      out.write("               \n");
      out.write("               <a href=\"cart.jsp\"><li class=\"fa fa-lock\"></li><b>LogOut</b></a>\n");
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
      out.write("                       ");
                 
                             String uid=(String)session.getAttribute("uids");
                            if(uid==null)
                              {
                                response.sendRedirect("index.jsp");
                              }
                             else if(uid!=null)
                             {
                                response.sendRedirect("updateprofile.jsp");
                             }
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
out.println(rs.getString(6));
      out.write("</h1>\n");
      out.write("                        </center>\n");
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
      out.write("\t\t\t\t<center><a href=\"updateprofile.jsp\"><button class=\"btn\" onclick=\"letDisable()\" id=\"field5\" value=\"Edit\">Edit Profile                                    \n");
      out.write("                                    </button></a>\n");
      out.write("                                      </center>  \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("                                    \n");
      out.write("\t\n");
      out.write("                                ");

                                }
}
catch(Exception e)
{
}
                                
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\t</div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("    <script>\n");
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
      out.write("    \n");
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
