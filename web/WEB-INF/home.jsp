<%-- 
    Document   : home
    Created on : 15 Apr, 2022, 8:05:50 PM
    Author     : viny kaur
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Homepage</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.username}</h2>
        <h4>Welcome to login page,<h2>${user.username}.</h2> </h4>
        <a href="home?logout">Log Out</a>
    </body>
</html>
