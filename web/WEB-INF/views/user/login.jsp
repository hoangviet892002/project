<%-- 
    Document   : login
    Created on : 28-02-2023, 11:21:21
    Author     : visao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link href="<c:url value="/css/styleLogin.css" />" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<h2 class="header">Login</h2>
<form class="login"> 
    <label for="name">Username: </label><br>
    <input id="name" name="name" type="text" value=""><br>

    <label>Password: </label><br>
    
    <input name="pass" type="password" value=""><br>
    <input type="submit" name="submit" value="Login" />
</form>
