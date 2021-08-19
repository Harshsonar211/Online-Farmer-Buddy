import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet(name = "AddProduct", urlPatterns = {"/AddProduct"})
@MultipartConfig(fileSizeThreshold=1024*1024*2,
        maxFileSize=1024*1024*10,
        maxRequestSize=1024*1024*50)

public class AddProduct extends HttpServlet {
    
        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
          try {
            // TODO output your page here. You may use following sample code. 
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FileUploadServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileUploadServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
     }  
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        int id = Integer.parseInt(request.getParameter("id"));
        String productname = request.getParameter("title");
        String description = request.getParameter("description");
        String packing = request.getParameter("package");
        String  discount = request.getParameter("discount");
        String  dprice = request.getParameter("price");
        String  mrp = request.getParameter("oldprice");
        
        String cat = request.getParameter("cat");
        
        String sql ="";
        
        Part part = request.getPart("file");//
        String filename = extractFileName(part);//file name
         String savepath="C:\\Users\\HP\\Desktop\\my project\\New folder\\Online Farmer Buddy\\Online Farmer Buddy\\web\\img"+File.separator+ filename;
         File fileSaverDir=new File(savepath);
         
         part.write(savepath + File.separator);
         
         if(cat.equals("Fertilizer"))
         {
             sql = "insert into fertilizer values(?,?,?,?,?,?,?,?,?)";
         }   
         else if(cat.equals("Pesticides")){
            sql = "insert into Pesticides values(?,?,?,?,?,?,?,?,?)";
         }
         else{
             sql = "insert into Seeds values(?,?,?,?,?,?,?,?,?)";
         }
         
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, productname);
            pst.setString(3, description);
            pst.setString(4, filename);
            pst.setString(5, packing);
            pst.setString(6, mrp);
            pst.setString(7, discount);
            pst.setString(8, dprice);
            pst.setString(9, savepath); 
            pst.executeUpdate();
             response.sendRedirect("addnewproduct.jsp");
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