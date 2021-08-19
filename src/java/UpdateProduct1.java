import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns = {"/UpdateProduct1"})
@MultipartConfig(fileSizeThreshold=1024*1024*2,
        maxFileSize=1024*1024*10,
        maxRequestSize=1024*1024*50)
public class UpdateProduct1 extends HttpServlet {
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
          
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateProduct1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateProduct1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
         String id = request.getParameter("id");
        String productname = request.getParameter("title");
        String description = request.getParameter("description");
        String packing = request.getParameter("package");
        String  discount = request.getParameter("discount");
        String  dprice = request.getParameter("price");
        String  mrp = request.getParameter("oldprice");
        
        String cat = request.getParameter("cat");
        
        String sql ="";
        
        Part part = request.getPart("file");//
        String filename;//file name
        filename = extractFileName(part);
         String savepath="C:\\Users\\HP\\Desktop\\my project\\New folder\\Online Farmer Buddy\\Online Farmer Buddy\\web\\img"+File.separator+ filename;
         File fileSaverDir=new File(savepath);
         
         part.write(savepath + File.separator);
         
         if(cat.equals("Fertilizer"))
         {
            sql=" UPDATE fertilizer SET  productname=?, description=?, filename=?, packing=?, mrp=?, discount=?, dprice=?, path=? WHERE  id=?";
            
         }   
         else if(cat.equals("Pesticides")){
             sql="UPDATE Pesticides SET  productname=?, description=?, filename=?, packing=?, mrp=?, discount=?, dprice=? path=? WHERE  id=?";
            
         }
         else{
             sql="UPDATE Seeds SET productname=?, description=?, filename=?, packing=?, mrp=?, discount=?, dprice=?, path=? WHERE  id=?";
         }
         
          try 
          {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, productname);
            pst.setString(2, description);
            pst.setString(3, filename);
            pst.setString(4, packing);
            pst.setString(5, mrp);
            pst.setString(6, discount);
            pst.setString(7, dprice);
            pst.setString(8, savepath);
            pst.setString(9, id);
            pst.executeUpdate();
             response.sendRedirect("updateproduct.jsp");
           }
          catch (Exception e) {
            out.println(e);
        }

    }

    private String extractFileName(Part part) {//This method will print the file name.
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }
        return "";
    }
}
