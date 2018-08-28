<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="accountCSS.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ATM</title>
        </head>
        <body>
            <div id="d1">
                <%
                  int acc=(Integer)pageContext.getAttribute("Account_no", PageContext.SESSION_SCOPE);
                  out.println("Account No : "+acc);
                  String name=(String)pageContext.getAttribute("name",PageContext.SESSION_SCOPE);
                  out.println("<br>Name : "+name);
                %>
             </div>
         <table align="center" width="100%" cellspacing="60" cellpadding="10" >
            <tr>
                <td>
                    <a class="first" href="withdraw.jsp">Withdraw</a>
                </td>
                 <td>
                    <a class="first" href="BalanceInquiry.jsp" >Balance Inquiry</a>
                </td>
            </tr>
            <tr>
                <td >
                    <a class="first" href="MiniStatement.jsp" >Mini Statement</a>
                </td>
                 <td>
                    <a class="first" href="ChangePin.jsp" >Change PIN</a>
                </td>
            </tr>
            <tr>
                <td>
                    <a class="first" href="Transfer.jsp" >Transfer</a>
                </td>
            </tr>
        </table>
             
      </body>
</html>
