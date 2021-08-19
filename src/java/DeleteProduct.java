import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/DeleteProduct"})
public class DeleteProduct extends HttpServlet {

     
protected void processRequest(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DeleteProduct</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DeleteProduct at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } 
        finally
        {
            out.close();
        }
    }
   @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //int id = Integer.parseInt(request.getParameter("id"));
        
        String id = request.getParameter("id");
        String cat = request.getParameter("cat");
        
        String sql ="";
        
         if(cat.equals("Fertilizer"))
         {
             sql = "delete from fertilizer where id= '"+id+"'";
         }   
         else if(cat.equals("Pesticides"))
         {
            sql = "delete from Pesticides where id= '"+id+"'";
         }
         else
         {
             sql = "delete from Seeds where id= '"+id+"'";
         }
          try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmerbuddy", "root", "");
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, id);
            pst.executeUpdate();
            response.sendRedirect("deleteproduct.jsp");
           }
          catch (Exception e) 
          {
            out.println(e);
          }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
