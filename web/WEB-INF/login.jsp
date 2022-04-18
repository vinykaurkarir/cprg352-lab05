<%-- 
    Document   : login
    Created on : 15 Apr, 2022, 8:05:40 PM
    Author     : viny kaur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
       <h1>Login</h1>
        <form action="login" method="post">
            <label>UserName:</label>
            <input type="text" name="username" value="">
            <br
             <label>Password:</label>
            <input type="password" name="password" value="">
            <br>
            <input type="submit" value="login">
            <br>
            <p>${invalid}</p>
            <p>${logout}</p>
        </form>
</html>
