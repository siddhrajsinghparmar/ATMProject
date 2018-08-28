<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="Login.css">
    </head>
    <body>
        <form action="login" method="post">
            <div id="d1"> Welcome to AkkiSid Bank</div><br/>
            
            <div id="d2"> Please Enter Your Bank Account Number and PIN Code</div>
            <div id="d3">Note : Wrong Password And Account Number Can Denied Your Transation
            </div>
            <table align="center">
                <tr>
                    <td>
                        Account Number  
                    </td>
                   
                </tr>
                <tr>
                     <td>
                        <input type="text" name="txtUsername" placeholder="Enter Acount No"/>
            
                    </td>
                </tr>
                <tr>
                    <td>
                        PIN CODE  
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="password" name="txtPassword" placeholder="Enter Pin Number"/>
            
                    </td>

                </tr>
                    
                <tr>
                    <td colspan="2">
                    <center><input type="submit" value="Login" ></center>
                    </td>
                </tr>
            </table>        
        </form>
    </body>
</html>
