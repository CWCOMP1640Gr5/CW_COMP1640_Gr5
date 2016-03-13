<%-- 
    Document   : index
    Created on : Feb 29, 2016, 8:47:45 PM
    Author     : Fpt
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="ico/favicon.png">
        <title>COURSE MONITOR GROUP 5</title>
        <!-- Bootstrap core CSS -->
        <link href="./templates/css/bootstrap.min.css" rel="stylesheet">
        <!-- Custom styles for this template -->
        <link href="./templates/css/StyleSheet.css" rel="stylesheet" />
        <!-- Just for debugging purposes. Don't actually copy this line! -->
        <!--[if lt IE 9]><script src="js/ie8-responsive-file-warning.js"></script><![endif]-->
        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <header>
            <div class="top-bar" style="background-color: #5bc0de   ">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="pull-left">
                                <div class="input-group pull-right">              
                                    <input type="text" class="form-control" placeholder="Search course here">
                                    <span class="input-group-btn">
                                        <button class="btn btn-default" type="button"><i class="glyphicon glyphicon-search"></i></button>
                                    </span>
                                </div>

                            </div>
                            <div class="input-group pull-left">                                    
                                <img style="height:38%;width: 38% " src="templates/img/logo.jpg" alt=""/>
                            </div>
                            <div class="pull-right">

                                <ul class="list-unstyled top-links">
                                    
                                    <c:if test="${not empty sessionScope.user}">
                                        <li><h4 style="color: red"> Hello, ${sessionScope.user}</h4></li>
                                        <li><h4><a href="${sessionScope.linkpages}">Control Pages</a></h4></li>
                                        <li><h4><a href="introduction.jsp">Introduction</a></h4></li>
                                        <li><h4><a href="LogoutProcess">Sign out</a></h4></li>
                                    </c:if>
                                    <c:if test="${empty sessionScope.user}">
                                        <li><h4><a href="ListCourse">List Course</a></h4></li>
                                        <li><h4><a href="introduction.jsp">Introduction</a></h4></li>
                                        <li><h4><a href="login.jsp">Sign in</a></h4></li>
                                    </c:if>
                                </ul>	
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--end .top-bar-->

            <div class="main-nav">
                <div class="container">
                    <div class="row" style="text-align:center">
                        <ul class="nav nav-pills">
                            <li class="active">
                                <a href="homePageForCL.html"><i class="glyphicon glyphicon-home"></i> Home</a>
                            </li>
                            <li><a href="ListCourseWorkForCL">List CourseWork</a></li>
                            <li><a href="getCMRCLServlet">View Course Monitoring Reports</a></li>
                            <li><a href="profileCL.html">Profile</a></li>
                            <li><a href="sentCMR.html">Sent Course Monitoring Reports</a></li>
                        </ul>
                    </div>
                </div>
            </div><!--end .main-nav-->
        </header>



        <section class="content">
            <div class="container">



                <div class="new-lists">
                    <div class="row">
                        <div class="col-sm-12">
                            <h3 class="box-title" style="background-color:#2aabd2; text-align:center">LIST COURSE WORK</h3>
                        </div>

                        <div class="panel panel-default">
                            <!-- Default panel contents -->
                            <div class="panel-heading">Course Work</div>

                            <!-- Table -->
                            <table class="table">
                                <tr>
                                    <th>ID</th>
                                    <th>Course</th>
                                    <th>Title</th>
                                    <th>Yearmaking</th>
                                    <th>Semester</th>
                                    <th>Action</th>
                                </tr>
                                <c:forEach items="${requestScope.listCou}" var="co">
                                    <tr>
                                        <td>${co.courseWorkId}</td>
                                        <td>${co.courseId}</td>
                                        <td>${co.title}</td>
                                        <td>${co.yearMaking}</td>
                                        <td>${co.semester}</td>
                                        <td><a href="PreCreateCMR?courseWorkId=${co.courseWorkId}">Create CMR</a></td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </div>

                    </div>



                </div><!--end .container-->
        </section><!--end .content-->

        <footer class="footer">
            <div class="footer-custom">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-3">
                            <div class="title">
                                <h3>About us</h3>
                                <div class="line"></div>
                            </div>
                            <div class="content">
                                <p>
                                    This is a CMS block edited from admin panel. You can insert any content here. 
                                </p>
                                <p>
                                    nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente
                                </p>
                                <p>
                                    nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente
                                </p>
                            </div>
                        </div>

                        <div class="col-sm-3 contact-us">
                            <div class="title">
                                <h3>Contact Us</h3>
                                <div class="line"></div>
                            </div>
                            <div class="content">
                                <div class="item">
                                    <div class="icon">
                                        <i class="glyphicon glyphicon-map-marker"></i>
                                    </div>
                                    <div class="info">
                                        So 8, Ton That Thuyet,My Dinh,Ha Noi
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="icon">
                                        <i class="glyphicon glyphicon-phone-alt"></i>
                                    </div>
                                    <div class="info">
                                        +84 1425 4587
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="icon">
                                        <i class="glyphicon glyphicon-envelope"></i>
                                    </div>
                                    <div class="info">
                                        <a href="#"> fpteducation@fpt.edu.vn </a>
                                    </div>
                                </div>
                                <div class="item">
                                    <div class="icon">
                                        <i class="glyphicon glyphicon-user"></i>
                                    </div>
                                    <div class="info">
                                        <a href="#">Admin</a>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-3">
                            <div class="title">
                                <h3>Twitter</h3>
                                <div class="line"></div>
                            </div>
                            <div class="content">
                                <div class="tweet-content">
                                    At refreshed 
                                    <a target="_blank" href="#</a>, personalize your profile w/ accent color: 
                                       <a target="_blank" href="#</a> design. 
                                    <a target="_blank" href="#</a> 
                                       <span class="time">
                                       <a target="_blank" title="" href="#"> about 2 days ago</a>
                                        </span>
                                </div>
                            </div>
                        </div>

                        <div class="col-sm-3">
                            <div class="title">
                                <h3>AnyThing</h3>
                                <div class="line"></div>
                            </div>
                            <div class="content">

                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="footer-copyright">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <p>&copy; 2016 | Design by Group 5</p>
                        </div>
                    </div>
                </div>
            </div>
        </footer><!--end .footer-->
        <script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/main.js"></script>
    </body>
</html>
