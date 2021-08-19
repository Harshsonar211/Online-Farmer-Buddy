package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class pesticides_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write(" \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Products</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/product.css\" media=\"screen\" type=\"text/css\" />\r\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.shop.js\"></script>\r\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/admfooter.css\" media=\"screen\" type=\"text/css\" />\r\n");
      out.write("        ");
      out.write(" \r\n");
      out.write("    </head>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("/* When the user clicks on the button, \r\n");
      out.write("toggle between hiding and showing the dropdown content */\r\n");
      out.write("function myFunction() {\r\n");
      out.write("  document.getElementById(\"myDropdown\").classList.toggle(\"show\");\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("// Close the dropdown if the user clicks outside of it\r\n");
      out.write("window.onclick = function(event) {\r\n");
      out.write("  if (!event.target.matches('.dropbtn')) {\r\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\r\n");
      out.write("    var i;\r\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\r\n");
      out.write("      var openDropdown = dropdowns[i];\r\n");
      out.write("      if (openDropdown.classList.contains('show')) {\r\n");
      out.write("        openDropdown.classList.remove('show');\r\n");
      out.write("      }\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("    <div class=\"out\">\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("        <a href=\"index.jsp\"><button class=\"btn-home\">FARMER'S BUDDY</button></a>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"top-nav\">\r\n");
      out.write("        <input type=\"search\" placeholder=\"search\" class=\"search-field\" name=\"search\" id=\"search\">\r\n");
      out.write("        <input type=\"button\" class=\"btn-search\" value=\"Search\">\r\n");
      out.write("        <a href=\"cart.jsp\"><button  class=\"dropbtn\" value=\"Cart\"> Cart </button></a>\r\n");
      out.write("        <div class=\"dropdown\">\r\n");
      out.write("             <button onclick=\"myFunction()\" class=\"dropbtn\" value=\"Category\">Category</button>\r\n");
      out.write("              \r\n");
      out.write("            <div id=\"myDropdown\" class=\"dropdown-content\">\r\n");
      out.write("             <a href=\"fertilizer.jsp\">Fertilizers</a>\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"seeds.jsp\">Seeds</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"main\">\r\n");
      out.write("<!-- <div class=\"left-nav\">\r\n");
      out.write("<h2>head</h2>\r\n");
      out.write("</div> -->\r\n");
      out.write("<div id=\"site\">\r\n");
      out.write("\t<header id=\"masthead\">\r\n");
      out.write("            <h1>Pestisides's <span class=\"tagline\">Extra care for plants...</span></h1>\r\n");
      out.write("\t</header>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- For Products -->\r\n");
      out.write("                \r\n");
      out.write("                ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM pesticides";
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String title = rs.getString("productname");
                    String desc = rs.getString("description");
                    String filename = rs.getString("filename");
                    String packtype = rs.getString("packing");
                    String price = rs.getString("mrp");
                    String disco = rs.getString("discount");
                    String oldprice = rs.getString("dprice");
                    String path = rs.getString("path");
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"products\" class=\"container\">\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"filterDiv\" id=\"search\">\r\n");
      out.write("                            <div class=\"product-image\">\r\n");
      out.write("                                <img src=\"img/");
      out.print(filename);
      out.write("\" width=\"500\" height=\"250\" halt=\"\" />\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"product-description\" data-name=\"");
      out.print(title);
      out.write("\" data-price=\"");
      out.print(price);
      out.write("\">\r\n");
      out.write("                                <h3 class=\"product-name\"> <b>");
      out.print(title);
      out.write("</b></h3>\r\n");
      out.write("\t\t\t\t<p>");
      out.print(desc);
      out.write("</p>\r\n");
      out.write("\t\t\t\t<p class=\"about\">Packaging: ");
      out.print(packtype);
      out.write("</p>\r\n");
      out.write("\t\t\t\t<div class=\"product-mrp\">\r\n");
      out.write("\t\t\t\t\t<label for=\"mrp\">MRP: </label><b>");
      out.print(oldprice);
      out.write("</b>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("                                <form class=\"add-to-cart\" action=\"cart.jsp\" method=\"post\">\r\n");
      out.write("\t\t\t\t<label for=\"p-price\">Price ");
      out.print(disco);
      out.write("% off </label>\r\n");
      out.write("\t\t\t\t<p class=\"product-price\" id=\"p-price\">&#8360; ");
      out.print(price);
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t<label for=\"qty-1\">Quantity</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"qty-1\" id=\"qty-1\" class=\"qty\" value=\"1\" />\r\n");
      out.write("\t\t\t\t\t<p><input type=\"submit\" value=\"Add to cart\" class=\"btn\" /></p>\r\n");
      out.write("\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\t \r\n");
      out.write("                                </form>\r\n");
      out.write("                             \r\n");
      out.write("\t\t\t</div>\t\r\n");
      out.write("                    \t\r\n");
      out.write("                  ");

                }
             } 
            catch (Exception e) 
            {
                out.println(e);
            }
           
      out.write("\r\n");
      out.write("\t        </li>     \r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </div>\r\n");
      out.write("    <script>\r\n");
      out.write("    let search = document.getElementById('search');\r\n");
      out.write("\r\n");
      out.write("search.addEventListener('input',()=>{\r\n");
      out.write("    let search = document.getElementById('search').value.toLowerCase();\r\n");
      out.write("    console.log(search);\r\n");
      out.write("    let name = document.getElementsByClassName('filterDiv');\r\n");
      out.write("    // console.log(name);\r\n");
      out.write("    Array.from(name).forEach((element,index)=>{\r\n");
      out.write("        let text = document.getElementsByTagName('h3')[index].innerText.toLowerCase();\r\n");
      out.write("        console.log(text);\r\n");
      out.write("        if(text.includes(search)){\r\n");
      out.write("            element.style.display = 'block'\r\n");
      out.write("        }\r\n");
      out.write("        else{\r\n");
      out.write("            element.style.display = 'none'\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write(" ");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("             <div class='foot-heading' style='background-color: #24104f; opacity: 0.9;height: 50px;'>\r\n");
      out.write("            <center><h1><span>FARMER'S </span>BUDDY</h1></center>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"myfooter\">\r\n");
      out.write("            <div class=\"infoa\">\r\n");
      out.write("                <h1>FARMER'S BUDDY</h1>\r\n");
      out.write("                <p>The farmkey is the shopping Website for indian farming community. Easy user interface of the farmkey is farmer friendly and doorstep delivery of the products save the precious time of farmers.</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f1\">\r\n");
      out.write("                <ul class=\"foot-list\">\r\n");
      out.write("                    <li><h1>Category</h1></li>\r\n");
      out.write("                    <li><a href=\"fertilizer.jsp\" id=\"foot-hyper\">Fertilizer</a></li>\r\n");
      out.write("                    <li><a href=\"pesticides.jsp\" id=\"foot-hyper\">Pesticide</a></li>\r\n");
      out.write("                    <li><a href=\"seeds.jsp\" id=\"foot-hyper\">Seeds</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f2\">\r\n");
      out.write("                <ul class=\"foot-list\">\r\n");
      out.write("                    <li><h1>Get to Know Us</h1></li>\r\n");
      out.write("                    <li><a href=\"Contact.jsp\" id=\"foot-hyper\">Contact Us</a></li>\r\n");
      out.write("                    <li><a href=\"#\" id=\"foot-hyper\">About Us</a></li>\r\n");
      out.write("                      <li><a href=\"Feedback.jsp\" id=\"foot-hyper\">Feedback</a></li>\r\n");
      out.write("                    <li><a href=\"https://farmerbuddy007.blogspot.com/\" id=\"foot-hyper\">Blogs</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"f3\">\r\n");
      out.write("                <ul class=\"foot-list\">\r\n");
      out.write("                    <li><h1>Help & FAQs</h1></li>\r\n");
      out.write("                    <li>Online Ordering</li>\r\n");
      out.write("                    <li>Shipping</li>\r\n");
      out.write("                    <li>Billing</li>\r\n");
      out.write("                    <li>Return & Exchange</li>\r\n");
      out.write("                    <li>Customer Service</li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"social\" style=\"height: 20%; background-color: #24104f\">\r\n");
      out.write("            <div class=\"left-social\" style=\"width: 33.33%\">\r\n");
      out.write("                <a href=\"https://www.facebook.com/vinod.shirsath.33\" class=\"soc\"><img src=\"img/fb.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                <a href=\"https://twitter.com/RajuShiraath\" class=\"soc\"><img src=\"img/twiter.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"soc\"><img src=\"img/youtu.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"soc\"><img src=\"img/insta.png\" style=\"height: 35px; width: 35px;\"></a>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"mid\"style=\"width: 33.33%\">\r\n");
      out.write("                <a href=\"index.jsp\" class=\"mid-links\">Home</a>\r\n");
      out.write("                <a href=\"#\" class=\"mid-links\">Privacy</a>\r\n");
      out.write("                <a href=\"#\" class=\"mid-links\">Terms & Condition</a>\r\n");
      out.write("                <div class='copyright'>\r\n");
      out.write("                    <p style='color: whitesmoke'> Copyright ©2021-22 Farmer's Buddy Ltd. All rights reserved.</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-paycards\" style=\"width: 33.33%\">\r\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/paypal.png\" style=\"height: 60px; width: 60px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/master.png\" style=\"height: 60px; width: 60px;\"></a>\r\n");
      out.write("                <a href=\"#\" class=\"pay\"><img src=\"img/visa.png\" style=\"height: 60px; width: 60px;\"></a>\r\n");
      out.write("                \r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
