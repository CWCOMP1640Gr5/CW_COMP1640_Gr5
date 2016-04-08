<%-- 
    Document   : home
    Created on : Mar 1, 2016, 12:37:33 PM
    Author     : Fpt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Dashboard Template for Bootstrap</title>
        <!-- Bootstrap core CSS -->
        <link href="templates/css/StyleSheet.css" rel="stylesheet" type="text/css"/>
        <link href="templates/css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="templates/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="templates/css/dashboard.css" rel="stylesheet" type="text/css"/>
    </head>

    <body>

        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Admin Manager</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">

                    <form class="navbar-form navbar-right">
                        <input type="text" class="form-control" placeholder="Search...">
                    </form>
                </div>
            </div>
        </nav>

        <div class="container-fluid">
            <div class="row">
                <div class="col-sm-3 col-md-2 sidebar">
                    <ul class="nav nav-sidebar">

                        <li class="active"><a href="#"><span class="glyphicon glyphicon-user" aria-hidden="true"></span> Account <span class="sr-only">(current)</span></a></li>
                        <li><a href="addAccount.jsp">Add Account</a></li>
                        <li><a href="LoadHomeAdmin">List Account</a></li>

                    </ul>
                    <ul class="nav nav-sidebar">
                        <li class="active"><a href="#"><span class="glyphicon glyphicon-list-alt" aria-hidden="true"></span> Courser Work <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListCourseWorkAdmin">List Course Work</a></li>
                        <li><a href="PreAddCourseWork">Add New Course Work</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li class="active"><a href="#"><span class="glyphicon glyphicon-file" aria-hidden="true"></span> Course <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListCourseAdmin">List Course</a></li>
                        <li><a href="addNewCourse.jsp">Add New Course</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li class="active"><a href="#"><span class="glyphicon glyphicon-briefcase" aria-hidden="true"></span> Department <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListDepartmentAdmin">List Department</a></li>
                        <li><a href="addNewDepartment.jsp">Add New Department</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">

                        <li class="active"><a href="#"><span class="glyphicon glyphicon-comment" aria-hidden="true"></span> FeedBack <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListFeedBack">List FeedBack</a></li>

                    </ul>
                    <ul class="nav nav-sidebar">

                        <li class="active"><a href="#"><span class="glyphicon glyphicon-book" aria-hidden="true"></span> News <span class="sr-only">(current)</span></a></li>
                        <li><a href="addNews.jsp">Add News</a></li>
                        <li><a href="ListNews">List News</a></li>
                        <li><h4><a href="LogoutProcess"><span class="glyphicon glyphicon-off" aria-hidden="true"></span> Sign out</a></h4></li>
                    </ul>

                </div>
                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                    

                    <h2 class="sub-header">Course</h2>
                    <h1 style="color: red">${requestScope.deleteStatus}</h1>
                    <h3 style="color: red">${requestScope.updateStatus}</h3>
                    <h3 style="color: red">${requestScope.insertStatus}</h3>
                    <div class="table-responsive">

                        <center>
                            <h1>INSERT NEW COURSE</h1>
                            <h3 style="color: red">${requestScope.insertStatus}</h3>

                            <form action="AddNewCourse">
                                <table class="table" border="1">
                                    <tr>
                                        <td><b>Courser Code:</b></td>
                                        <td>
                                            <input required="required" type="text" name="courseId" value="${param.courseId}"/>
                                            <span style="color: red">${requestScope.courseIdErr}</span>
                                        </td>
                                    </tr>                                  
                                    <tr>
                                        <td><b>Title:</b></td>
                                        <td>
                                            <input required="required" type="text" name="txtTitle" value="${param.txtTitle}"/>
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Description:</b></td>
                                        <td>
                                            <input required="required" type="text" name="txtdescription" value="${param.txtdescription}"/>
                                            
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>
                                            <a href="LoadHomeAdmin">Home</a>
                                        </td>
                                        <td>
                                            <button type="submit" class="btn btn-default navbar-btn">Add New</button>
                                            <button type="reset" class="btn btn-default navbar-btn">Reset</button>
                                        </td>
                                    </tr>
                                </table>
                            </form>                     
                        </center>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->

    </body>
</html>

