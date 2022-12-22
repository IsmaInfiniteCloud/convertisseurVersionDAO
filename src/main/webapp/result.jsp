<%-- 
    Document   : result
    Created on : 22 déc. 2022, 17 h 16 min 56 s
    Author     : Ismail
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Temperature Converter</title>
        <!-- Bootstrap & CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="style.css">
    </head>
    <body>
        <div class="row">
            <div class="col-md-4">
                <div class="card">
                    <div class="container mt-5">
                        <h1 class="text-center" style="color: navy">Temperature Converter</h1>

                        <p class="text-center"style="color: navy">The converted temperature is: <strong> <%
                // Retrieve the converted temperature from the request object
                double convertedTemperature = (Double) request.getAttribute("convertedTemperature");
                                %>
                                <p><%= convertedTemperature%></p></strong></p>
                        <br>
                        <img src="Images/convert.JPG" alt="logo"/>
                    </div>
                </div>
            </div>
        </div>  
    </body>
</html>
