import java.sql.*;
import java.util.*;

public class DAL
{
        Connection cn=null;
        Statement st;
        void DoConnection()
        {
            String dburl="jdbc:derby://localhost:1527/Account";
            String uname="sid";
            String pwd="sid";
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
            cn=DriverManager.getConnection(dburl,uname,pwd);
            Statement st=cn.createStatement();
        }
        catch (SQLException ex)
        {
             System.out.println(ex.getMessage()); 
        }
    }
}
