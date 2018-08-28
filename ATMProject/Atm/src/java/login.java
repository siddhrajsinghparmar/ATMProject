import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
            { 
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            }
            catch (ClassNotFoundException ex) 
            {
                System.out.println(ex.getMessage());
            }
        try
        {
            HttpSession session=request.getSession();
            String user=request.getParameter("txtUsername");
            String pwd=request.getParameter("txtPassword");
            Connection cn=null;
            Statement st=null;
            String dburl="jdbc:derby://localhost:1527/Account";
            String uname="sid";
            String pwdd="sid";
            int acc_no=Integer.parseInt(user);
            
            cn=DriverManager.getConnection(dburl,uname,pwdd);
            st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);         
            String q = "Select * from Account1 where acc_no="+acc_no+"";
            
            ResultSet rs = st.executeQuery(q);
            
            rs.beforeFirst();
                rs.next();
             
            if(rs!=null)
            {
                session.setAttribute("Account_no", acc_no);
                session.setAttribute("name", rs.getString(2));
                response.sendRedirect("account.jsp");
            }
            else
            {
                
            }
        } 
        catch (SQLException ex)
            {
                 System.out.println(ex.getMessage()); 
            }
        finally 
        {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
            processRequest(request, response);
        
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
            processRequest(request, response);
       
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
