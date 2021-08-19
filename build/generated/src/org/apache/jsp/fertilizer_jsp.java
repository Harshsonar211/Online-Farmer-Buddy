package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.util.*;

public final class fertilizer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Products</title>\n");
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/product.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.3/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/jquery.shop.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admfooter.css\" media=\"screen\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("    <script>\n");
      out.write("/* When the user clicks on the button, \n");
      out.write("toggle between hiding and showing the dropdown content */\n");
      out.write("function myFunction() {\n");
      out.write("  document.getElementById(\"myDropdown\").classList.toggle(\"show\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Close the dropdown if the user clicks outside of it\n");
      out.write("window.onclick = function(event) {\n");
      out.write("  if (!event.target.matches('.dropbtn')) {\n");
      out.write("    var dropdowns = document.getElementsByClassName(\"dropdown-content\");\n");
      out.write("    var i;\n");
      out.write("    for (i = 0; i < dropdowns.length; i++) {\n");
      out.write("      var openDropdown = dropdowns[i];\n");
      out.write("      if (openDropdown.classList.contains('show')) {\n");
      out.write("        openDropdown.classList.remove('show');\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    <div class=\"out\">\n");
      out.write("    <div class=\"logo\">\n");
      out.write("        <a href=\"index.jsp\"><button class=\"btn-home\">FARMER'S BUDDY</button></a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"top-nav\">\n");
      out.write("        <input type=\"search\" placeholder=\"search\" class=\"search-field\" name=\"search\" id=\"search\">\n");
      out.write("        <input type=\"button\" class=\"btn-search\" value=\"Search\">\n");
      out.write("        <a href=\"cart.jsp\"><button  class=\"dropbtn\" value=\"Cart\"> Cart </button></a>\n");
      out.write("        <div class=\"dropdown\">\n");
      out.write("             <button onclick=\"myFunction()\" class=\"dropbtn\" value=\"Category\">Category</button>\n");
      out.write("            <div id=\"myDropdown\" class=\"dropdown-content\">\n");
      out.write("          \n");
      out.write("            <a href=\"pesticides.jsp\">pesticides</a>\n");
      out.write("            <a href=\"seeds.jsp\">Seeds</a>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write(" \t\n");
      out.write("<div class=\"main\">\n");
      out.write("\n");
      out.write("<div id=\"site\">\n");
      out.write("\t<header id=\"masthead\">\n");
      out.write("            <h1>Fertilizer's<span class=\"tagline\">Extra care for plants...</span></h1>\n");
      out.write("\t</header>\n");
      out.write("\t\n");
      out.write("\t<div id=\"content\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- For Products -->\n");
      out.write("                \n");
      out.write("                ");

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
                Statement st = con.createStatement();
                String sql = "SELECT * FROM fertilizer";
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
        
      out.write("\n");
      out.write("\n");
      out.write("\t\t<div id=\"products\" class=\"container\">\n");
      out.write("                    \n");
      out.write("                        <li class=\"filterDiv\" id=\"search\">\n");
      out.write("                            <div class=\"product-image\">\n");
      out.write("                                <img src=\"img/");
      out.print(filename);
      out.write("\" width=\"500\" height=\"250\" halt=\"\" />\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"product-description\" data-name=\"");
      out.print(title);
      out.write("\" data-price=\" ");
      out.print(price);
      out.write("\">\n");
      out.write("                                <h3 class=\"product-name\"> <b>");
      out.print(title);
      out.write("</b></h3>\n");
      out.write("\t\t\t\t<p>");
      out.print(desc);
      out.write("</p>\n");
      out.write("\t\t\t\t<p class=\"about\">Packaging: ");
      out.print(packtype);
      out.write("</p>\n");
      out.write("\t\t\t\t<div class=\"product-mrp\">\n");
      out.write("\t\t\t\t\t<label for=\"mrp\">MRP: </label><b>");
      out.print(oldprice);
      out.write("</b>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("                                <form class=\"add-to-cart\" action=\"cart.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t<label for=\"p-price\">Price ");
      out.print(disco);
      out.write("% off </label>\n");
      out.write("\t\t\t\t<p class=\"product-price\" id=\"p-price\">&#8360; ");
      out.print(price);
      out.write("</p>\n");
      out.write("\t\t\t\t\t<div>\n");
      out.write("\t\t\t\t\t<label for=\"qty-1\">Quantity</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"qty-1\" id=\"qty-1\" class=\"qty\" value=\"1\" />\n");
      out.write("\t\t\t\t\t<p><input type=\"submit\" value=\"Add to cart\" class=\"btn\" /></p>\n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t \n");
      out.write("                                </form>\n");
      out.write("                             \n");
      out.write("\t\t\t</div>\t\n");
      out.write("                    \t\n");
      out.write("                  ");

                }
             } 
            catch (Exception e) 
            {
                out.println(e);
            }
           
      out.write("\n");
      out.write("\t        </li>     \n");
      out.write("                </div>\n");
      out.write("        </div>\n");
      out.write("</div></div>\n");
      out.write(" <script>\n");
      out.write("    let search = document.getElementById('search');\n");
      out.write("\n");
      out.write("search.addEventListener('input',()=>{\n");
      out.write("    let search = document.getElementById('search').value.toLowerCase();\n");
      out.write("    console.log(search);\n");
      out.write("    let name = document.getElementsByClassName('filterDiv');\n");
      out.write("    // console.log(name);\n");
      out.write("    Array.from(name).forEach((element,index)=>{\n");
      out.write("        let text = document.getElementsByTagName('h3')[index].innerText.toLowerCase();\n");
      out.write("        console.log(text);\n");
      out.write("        if(text.includes(search)){\n");
      out.write("            element.style.display = 'block'\n");
      out.write("        }\n");
      out.write("        else{\n");
      out.write("            element.style.display = 'none'\n");
      out.write("\n");
      out.write("        }\n");
      out.write("    })\n");
      out.write("    \n");
      out.write("    \n");
      out.write("})\n");
      out.write("  </script>  \n");
      out.write("  ");
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
      out.write("</body>\n");
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
