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
                    

                    <h2 class="sub-header">Update Account ID :${requestScope.Account.accountId}</h2>
                    <h1 style="color: red">${requestScope.deleteStatus}</h1>
                    <div class="table-responsive">

                        <form action="UpdateAccount">
                            <table class="table" border="1">
                                <tr>
                                    <td style="width: 15%"><span class="input-group-addon" id="basic-addon1">ID</span></td>
                                    <td>
                                        <input type="text" name="txtAccountId" class="form-control" aria-describedby="basic-addon1" value="${requestScope.Account.accountId}" readonly="true">
                                    </td>
                                </tr>
                                <tr>
                                    <td><b><span class="input-group-addon" id="basic-addon1">First Name</span></b></td>
                                    <td>
                                        <input required="required" type="text" name="txtFirstName" value="${requestScope.Account.firtsName}" class="form-control" aria-describedby="basic-addon1">
                                    </td>
                                </tr>
                                <tr>
                                    <td><b><span class="input-group-addon" id="basic-addon1">Last Name</span></b></td>
                                    <td>
                                        <input required="required" type="text" name="txtLastName" value="${requestScope.Account.lastName}" class="form-control" aria-describedby="basic-addon1">
                                    </td>
                                </tr>
                                <tr>
                                    <td><b><span class="input-group-addon" id="basic-addon1">Address</span></b></td>
                                    <td>
                                        <input required="required" type="text" name="txtAddress" value="${requestScope.Account.address}" class="form-control" aria-describedby="basic-addon1">
                                    </td>
                                </tr>
                                <tr>
                                    <td><b> <span class="input-group-addon" id="basic-addon1">Department</span></b></td>
                                    <td>
                                        
                                        <select id="department" name="department">
                                            
                                            <option selected="selected" value="${requestScope.Department.departmentId}">${requestScope.Department.departmentName}</option>
                                            <option value="1">Software Engineering</option>
                                            <option value="2">Communications And Computer Networks</option>
                                            <option value="3">Computer Science</option>
                                            <option value="4">Computer Engineering</option>
                                            <option value="5">Information Systems</option>
                                            <option value="6">Graphics</option>
                                            
                                        </select>
                                    </td>
                                </tr>

                                <tr>
                                    <td><b> <span class="input-group-addon" id="basic-addon1">StaffPossition</span></b></td>
                                    <td>
                                        <select name="staff">
                                            <option selected="selected" value="${requestScope.Account.staffId}">${requestScope.Staff.position}</option>
                                            <option value="1">Course Leader</option>
                                            <option value="2">Course Moderator</option>
                                            <option value="3">Pro-Vice Chancellor</option>
                                            <option value="4">Director of Learning and Quality</option>
                                            <option value="5">Admin</option>
                                            <option value="6">Teacher</option>
                                        </select>
                                    </td>
                                </tr>




                                <tr>
                                    <td><b><span class="input-group-addon" id="basic-addon1">Phone</span></b></td>
                                    <td>
                                        <input required="required" type="number" name="txtPhone" value="${requestScope.Account.phone}" class="form-control" aria-describedby="basic-addon1">
                                    </td>
                                </tr>
                                <tr>
                                    <td><b><span class="input-group-addon" id="basic-addon1">Permission</span></b></td>
                                    <td>
                                        
                                        <select name="permission">
                                            <option selected="selected" value="${requestScope.Account.permission}">${requestScope.Account.permission}</option>
                                            <option value="CL">Course Leader</option>
                                            <option value="CM">Course Moderator</option>
                                            <option value="PVC">Pro-Vice Chancellor</option>
                                            <option value="DTL">Director of Learning and Quality</option>
                                            <option value="ADM">Admin</option>
                                            <option value="GU">Teacher</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td></td>
                                    <td >
                                        <button type="submit" class="btn btn-default navbar-btn">Update</button>
                                        <button type="reset" class="btn btn-default navbar-btn">Reset</button>
                                        
                                    </td>
                                </tr>
                            </table>
                        </form>
                                    <a href="LoadHomeAdmin">BACK</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->

    </body>
</html>

