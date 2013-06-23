<%-- 
    Document   : search
    Created on : May 29, 2013, 12:38:56 PM
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
        <script src="js/jquery-1.10.0.js" type="text/javascript"></script>
        <script rel="text/javascript">
           
            $(function(){
       
                $(' #Add_new_contact').click(function(e){  
                    e.preventDefault();
                    $('#form2').hide();
                    $('#form3').show(); 
                });
                 
            });
          
        </script>
        <title>Search Page</title>
    </head>
    <body style="background-image:none;">
        <div class="navbar navbar-fixed-top">  
            <div class="navbar-inner">  
                <div class="container">  
                    <ul class="nav">  
                        <li class="active">  
                            <a class="brand" href="#">Washing Windows</a>  
                        </li>  
                        <li><a href="index.jsp"><i class="icon-home"></i>Home</a></li>  
                        <li><a href="#"></a></li>  
                        <li><a href="#"><i class="icon-user"></i>Contact</a></li>  
                    </ul>  
                    <form class="navbar-search pull-right">  
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-plus"></i></span><button type="submit" class="btn" id="Add_new_contact">Add New Contact</button>
                            <span class="add-on"><i class="icon-search"></i></span><input name="url" type="text" class="span3" placeholder="Search">
                        </div>

                </div>
            </div>
        </div>
        <div class="container-fluid"style="background-color: white; ">

            <div class="form-horizontal" id="form2">  
                <fieldset>  
                    <legend>Client Form</legend>  
                    <div class="control-group">  
                        <label class="control-label" for="input01">Name</label>  
                        <div class="controls">  
                            <input type="text" class="input-large" id="input01">  
                        </div>  
                    </div>  
                    <div class="control-group">  
                        <label class="control-label" for="input01">Email</label>  
                        <div class="controls">  
                            <input type="text" class="input-large" id="input01">  
                        </div>  
                    </div>  
                    <div class="control-group">  
                        <label class="control-label" for="input01">Phone</label>  
                        <div class="controls">  
                            <input type="text" class="input-large" id="input01">  
                        </div>  
                    </div> 
                    <h2>Address</h2>
                    <div class="control-group">  
                        <label class="control-label" for="multiSelect">Home Descripition</label>  
                        <div class="controls">  
                            <select multiple="multiple" id="multiSelect">  
                                <option>Front</option>  
                                <option>Back</option>  
                                <option>Side</option>  
                                <option>Side</option>  

                            </select>  
                        </div>  
                    </div>  
                    <div class="control-group">  
                        <label class="control-label" for="input01">Quantity</label>  
                        <div class="controls">  
                            <input type="text" class="input-large" id="input01">  
                        </div>  
                    </div> 
                    <div class="control-group">  
                        <label class="control-label" for="input01">Price</label>  
                        <div class="controls">  
                            <input type="text" class="input-large" id="input01">  
                        </div>  
                    </div> 

                    <div class="control-group">  
                        <label class="control-label" for="textarea">Equiptment Notes</label>  
                        <div class="controls">  
                            <textarea class="input-large" id="textarea" rows="3"></textarea>  
                        </div>  
                    </div> 
                    <div class="control-group">  
                        <label class="control-label" for="textarea">Special Notes</label>  
                        <div class="controls">  
                            <textarea class="input-large" id="textarea" rows="3"></textarea>  
                        </div>  
                    </div>  
                    <div class="form-actions">  
                        <button type="submit" class="btn btn-primary">Save changes</button>  
                        <button class="btn">Cancel</button>  
                    </div>  
                </fieldset>  
            </div>  

            <div class="form-horizontal"id="form3">
                <div class="control-group">
                    <label class="control-label" for="inputEmail">First Name</label>
                    <div class="controls">
                        <input type="text" id="inputEmail" placeholder="Client First Name">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputEmail">Last Name</label>
                    <div class="controls">
                        <input type="text" id="inputEmail" placeholder="Client Last Name">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputEmail">Email</label>
                    <div class="controls">
                        <input type="text" id="inputEmail" placeholder="Email">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputEmail">Phone No.</label>
                    <div class="controls">
                        <input type="text" id="inputEmail" placeholder="Client phone Number">
                    </div>
                </div>
                <div class="control-group">
                    <label class="control-label" for="inputEmail">Address1</label>
                    <div class="controls">
                        <input type="text" id="streetname" class="input-large" placeholder="Street No./Street Name">
                    </div>
                    </div>
                  <div class="control-group">
                    <label class="control-label" for="inputEmail">Address2</label>
                    <div class="controls">
                        <input type="text" id="streetname" class="input-Large" placeholder="Postal Code/State/City">
                    </div>
                    </div>
                  <div class="control-group">
                    <label class="control-label" for="inputEmail">Country</label>
                    <div class="controls">
                        <input type="text" id="streetname" class="input-small" placeholder="">
                    </div>
                    </div>
                <div class="form-actions">  
                    <button type="submit" class="btn btn-primary">Add</button>  
                    <button class="btn">Cancel</button>  
                </div>
            </div>
        </div>
    </body>
</html>
