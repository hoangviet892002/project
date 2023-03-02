<%-- 
    Document   : register
    Created on : 28-02-2023, 11:21:44
    Author     : visao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<h2>register</h2>

<form>
    <table>
        <tr>
            <td><label for="firstname">First name: </label></td>
            <td><input type="text" name="firstname" id="firstname"></td>
        </tr>
        <tr>
            <td><label for="lastname">Last name: </label></td>
            <td><input type="text" name="lastname" id="lastname"></td>
        </tr>
        <tr>
            <td><label for="firstname">Phone: </label></td>
            <td><input type="text" name="phone" id="phone"></td>
        </tr>
        <tr>
            <td><label for="email">Email: </label></td>
            <td><input type="email" name="email" id="email"></td>
        </tr>
        <tr>
            <td><label for="lastname">Address: </label></td>
            <td><input type="text" name="address" id="address"></td>
        </tr>
        <tr>
            <td><label for="username">User name: </label></td>
            <td><input type="text" name="username" id="username"></td>
        </tr>
        <tr>
            <td><label for="psw">Password: </label></td>
            <td><input type="password" name="psw" id="psw"></td>
        </tr>
        <tr>
            <td><label for="psw">Enter your password: </label></td>
            <td><input type="password" name="psw" id="psw"></td>
        </tr>
    </table>
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    <label for="ngaysinh">birthday</label>
    <input type="date" name="ngaysinh" id="ngaysinh" value="2000-11-20">

    <input type="submit" value="register">

</form>