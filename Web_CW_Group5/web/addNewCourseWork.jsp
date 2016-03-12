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

                        <li class="active"><a href="#">Account <span class="sr-only">(current)</span></a></li>
                        <li><a href="addAccount.jsp">Add Account</a></li>
                        <li><a href="LoadHomeAdmin">List Account</a></li>

                    </ul>
                     <ul class="nav nav-sidebar">
                        <li class="active"><a href="#">Courser Work <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListCourseWorkAdmin">List Course Work</a></li>
                        <li><a href="PreAddCourseWork">Add New Course Work</a></li>
                    </ul>
                     <ul class="nav nav-sidebar">
                        <li class="active"><a href="#">Courser <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListCourseAdmin">List Course</a></li>
                        <li><a href="addNewCourse.jsp">Add New Course</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">
                        <li class="active"><a href="#">Department <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListDepartmentAdmin">List Department</a></li>
                        <li><a href="addNewDepartment">Add New Department</a></li>
                    </ul>
                    <ul class="nav nav-sidebar">

                        <li class="active"><a href="#">FeedBack <span class="sr-only">(current)</span></a></li>
                        <li><a href="ListFeedBack">List Account</a></li>

                    </ul>
                    <ul class="nav nav-sidebar">

                        <li class="active"><a href="#">News <span class="sr-only">(current)</span></a></li>
                        <li><a href="addNews.jsp">Add News</a></li>
                        <li><a href="ListNews">List News</a></li>
                        <li><h4><a href="LogoutProcess">Sign out</a></h4></li>
                    </ul>

                </div>
                <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
                   

                    <h2 class="sub-header">Add Course Work</h2>
                    <h1 style="color: red">${requestScope.deleteStatus}</h1>
                    <h3 style="color: red">${requestScope.updateStatus}</h3>
                    <h3 style="color: red">${requestScope.insertStatus}</h3>
                    <div class="table-responsive">

                        <center>
                            <h1>INSERT NEW COURSEWORK</h1>
                            <h3 style="color: red">${requestScope.insertStatus}</h3>

                            <form action="AddCourseWork">
                                <table border="1">
                                    <tr>
                                        <td><b>Course:</b></td>
                                        <td>
                                            
                                            <select name="courseId">
                                                
                                            <c:forEach items="${requestScope.Course}" var="co">
                                                <option value="${co.courseId}">${co.courseId} - ${co.title}</option>
                                            </c:forEach>
                                            </select>
                                            <span style="color: red">${requestScope.coureIdErr}</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Department:</b></td>
                                        <td>
                                            <select name="department" required>                                                   
                                                <option value="1" selected="selected">Software Engineering</option>
                                                <option value="2">Communications And Computer Networks</option>
                                                <option value="3">Computer Science</option>
                                                <option value="4">Computer Engineering</option>
                                                <option value="5">Information Systems</option>
                                                <option value="6">Graphics</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Course Leader:</b></td>
                                        <td>
                                            <select name="courseLeader">
                                                
                                            <c:forEach items="${requestScope.ListCL}" var="cl">
                                                <option value="${cl.lastName}">${cl.lastName}</option>
                                            </c:forEach>
                                            </select>
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Courser Moderator:</b></td>
                                        <td>                                           
                                             <select name="courserModerator">
                                                
                                            <c:forEach items="${requestScope.ListCM}" var="cm">
                                                <option value="${cm.lastName}">${cm.lastName}</option>
                                            </c:forEach>
                                            </select>
                                        </td>
                                    </tr>

                                    <tr>
                                        <td><b>Start Date:</b></td>
                                        <td>
                                            <input required="required"t type="text" name="createDate" value="${param.createDate}"/>
                                            <span style="color: red">${requestScope.dateErr}</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Year Making:</b></td>
                                        <td>
                                            <input type="number" name="yearmaking" value="${param.yearmaking}"/>
                                            <span style="color: red">${requestScope.yearErr}</span>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Semeter:</b></td>
                                        <td>
                                            <input required="required" type="number" name="semester" value="${param.semester}"/>
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Student Count:</b></td>
                                        <td>
                                            <input required="required" type="number" name="studentCount" value="${param.studentCount}"/>
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Courser Unit(Credits):</b></td>
                                        <td>
                                            <input required="required" type="number" name="courserUnits" value="${param.courserUnits}"/>
                                            
                                        </td>
                                    </tr>
                                    <tr>
                                        <td><b>Courser Duration:</b></td>
                                        <td>
                                            <select name="costUnit">                                                   
                                                <option value="hours" selected="selected">Hours</option>
                                                <option value="months">Months</option>
                                                <option value="years">Years</option>
                                                <option value="weeks">Weeks</option>
                                            </select>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <a href="LoadHomeAdmin">Home</a>
                                        </td>
                                        <td>
                                            <input type="submit" value="Insert"/>
                                            <input type="reset" value="Reset"/>
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

