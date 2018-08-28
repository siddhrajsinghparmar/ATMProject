<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="withdrawCSS.css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ATM</title>
    </head>
    <body>
        <h1 align="center"> Withdraw </h1>
        <form action="withdraw" method="post">
            <table align="center">
                <tr>
                    <td>
                        Enter Amount
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="text" name="txtAmt">
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="Withdraw">
                    </td>
                </tr>
            </table> 
        </form>
    </body>
</html>
