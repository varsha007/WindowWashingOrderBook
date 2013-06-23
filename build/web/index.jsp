<%-- 
    Document   : index
    Created on : May 23, 2013, 11:57:12 AM
    Author     : abhinav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap-responsive.css" rel="stylesheet"> 
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/main.css">
        <title>First Page</title>


        <script src="js/jquery-1.10.0.js" type="text/javascript"></script>
        <script rel="text/javascript">
           
            $(function(){
                $('body').hover(function(){                   
                    $('#header').animate({'width':'250px'},4000); 
                });
            });
        </script>
    </head>
    <body>
        <div class="container-fluid">
            <div class="row-fluid" id="header">
                <h1>Welcome to </h1>
                <h1>Washing</h1> 
                <h1>Windows</h1>
            </div>
            <div class="row-fluid" id="reg">
                <div id="login">
                    <a href="../david/search.jsp" id="facebook">Sign Up with Gmail</a>
                    <a href="" id="facebook">Sign Up with Facebook</a>
                </div>
            </div><!.. row..>

        </div><!..container...>
    </body>
</html>
