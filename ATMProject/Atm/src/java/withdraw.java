import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "withdraw", urlPatterns = {"/withdraw"})
public class withdraw extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try 
        {
            String amt1 = request.getParameter("txtAmt");
            int amt = Integer.parseInt(amt1);
            try 
            { 
                Class.forName("org.apache.derby.jdbc.ClientDriver");
            }
            catch (ClassNotFoundException ex) 
            {
                System.out.println(ex.getMessage());
            }
        
            HttpSession session=request.getSession();
            String user=request.getParameter("txtUsername");
            int acc_no=Integer.parseInt(user);
            Connection cn=null;
            Statement st=null;
            String dburl="jdbc:derby://localhost:1527/Account";
            String uname="sid";
            String pwdd="sid";
            
            cn=DriverManager.getConnection(dburl,uname,pwdd);
            String q = "Select balance from Account1 where acc_no='"+acc_no+"'";
            ResultSet rs = st.executeQuery(q);
            rs.next();
            if(rs!=null)
            {
                int bal = rs.getInt(7);
                bal = bal - amt;
                String q1 = "update account1 set balance='"+bal+"',withdraw='"+amt+"' where acc_no='"+acc_no+"'";
                out.println("Successful withdraw");
                response.sendRedirect(".jsp");
            }
            else
            {
                
            }
        } 
        finally {            
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(withdraw.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(withdraw.class.getName()).log(Level.SEVERE, null, ex);
        }
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
