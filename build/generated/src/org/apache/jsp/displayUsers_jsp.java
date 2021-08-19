package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class displayUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<HTML>\n");
      out.write("       <HEAD>\n");
      out.write("       <TITLE>The View Of Register Users </TITLE>\n");
      out.write("       </HEAD>\n");
      out.write("       <BODY>\n");
      out.write("       <center> <H1>Register Users </H1></CENTER>\n");
      out.write("       ");

           Class.forName("com.mysql.jdbc.Driver");
           Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
           Statement statement = connection.createStatement() ;
          ResultSet resultset = statement.executeQuery("SELECT * FROM register") ;
       
      out.write("\n");
      out.write("      <TABLE BORDER=\"2\" style=\"width:80%;\" align=\"center\">\n");
      out.write("       <tr style=\"background-color: grey; height: 50px;\">\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Mobile.No</th>\n");
      out.write("                <th>User Id</th>\n");
      out.write("                <th>Password</th>\n");
      out.write("            </tr>\n");
      out.write("          ");
while(resultset.next()){ 
      out.write("\n");
      out.write("      <TR style=\"background-color: ghostwhite; height: 30px;\">\n");
      out.write("       <TD> ");
      out.print( resultset.getString(1) );
      out.write("</td>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(2) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(3) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(4) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(5) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(6) );
      out.write("</TD>\n");
      out.write("       <TD> ");
      out.print( resultset.getString(7) );
      out.write("</TD>\n");
      out.write("      </TR>\n");
      out.write("      ");
 } 
      out.write("\n");
      out.write("     </TABLE>\n");
      out.write("     </BODY>\n");
      out.write("</HTML>\n");
      out.write("\n");
      out.write("\n");
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
