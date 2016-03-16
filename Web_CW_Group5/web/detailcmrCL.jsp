<%-- 
    Document   : createCMR
    Created on : Feb 25, 2016, 10:59:51 PM
    Author     : Fpt
--%>

<%@page import="entity.Courses"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="shortcut icon" href="ico/favicon.png">
        <title>COURSE MONITOR GROUP 5</title>
        <!-- Bootstrap core CSS -->
        <link href="./templates/css/bootstrap.min.css" rel="stylesheet">
        <script src="templates/js/sum.js"></script>
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
                                <a href=index.html"><i class="glyphicon glyphicon-home"></i> Home</a>
                            </li>
                            <li><a href="createCMR.jsp">Create Course Monitoring Reports</a></li>
                            <li><a href="viewCMR.jsp">View Course Monitoring Reports</a></li>
                            <li><a href="profileCL.html">Profile</a></li>
                            <li><a href="sentCMR.html">Sent Course Monitoring Reports</a></li>
                            <li><a href="logOut.html">Log out</a></li>
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
                            <h3 class="centerBox" style="background-color:#2aabd2; text-align:center">Course Monitor Report ${requestScope.detailcmr.CMRId}</h3>
                        </div>
                        <center>

                            <form action="createCMR" method="GET">
                                <table border="1">
                                    <tr>
                                        <td colspan="2" style="text-align: center"><h1>COURSE MONITORING REPORT</h1></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td>Academic Session</td>
                                        <td>
                                            <input readonly value="${requestScope.detailcmr.academicSession}" type="number" name="academicsession" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Course Code</td>
                                        <td>
                                            <input type="text" value="${requestScope.detailcmr.courseId}" readonly />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Title</td>
                                        <td>
                                            <input type="text" readonly value="${requestScope.detailcmr.title}" name="title" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Course Leader:</td>
                                        <td>
                                            <input readonly value="${requestScope.detailcmr.courseLeader}" type="text" name="courseleader" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Student count</td>
                                        <td>
                                            <input readonly value="${requestScope.detailcmr.studentCount}" type="number" name="studentcounnt" />
                                        </td>
                                    </tr>                                   
                                </table>
                                <br/>
                                <table class="gddtable" style="width: 100%">
                                    <tr>
                                        <td colspan="7" style="text-align: center"><h1>Statistical Data</h1></td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td>CW1</td>
                                        <td>CW2</td>
                                        <td>CW3</td>
                                        <td>CW4</td>
                                        <td>EXAM</td>
                                        <td>OVERALL</td>
                                    </tr>
                                    <tr>
                                        <td>Mean</td>
                                        <td><input type="number"  readonly value="${requestScope.sddetail.cw1r1}" name="cw1r1" id="r1" class="r1" /></td>
                                        <td><input type="number"  readonly value="${requestScope.sddetail.cw2r1}" name="cw2r1" id="r1" class="r1" /></td>
                                        <td><input type="number"  readonly value="${requestScope.sddetail.cw3r1}" name="cw3r1" id="r1" class="r1" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw4r1}" name="cw4r1" id="r1" class="r1" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.examr1}" name="examr1" id="r1" class="r1" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.over1r1}" name="overr1" id="over1" readonly class="over1" /></td>
                                    </tr>
                                    <tr>
                                        <td>Median</td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw1r2}" name="cw1r2" class="r2" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw2r2}" name="cw2r2" class="r2" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw3r2}" name="cw3r2" class="r2" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw4r2}" name="cw4r2" class="r2" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.exam1r2}" name="examr2" class="r2" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.overr2}" name="overr2" readonly class="over2" /></td>
                                    </tr>
                                    <tr>
                                        <td>Standard Deviation</td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw1r3}" name="cw1r3" class="r3" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw2r3}" name="cw2r3" class="r3" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw3r3}" name="cw3r3" class="r3" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.cw3r3}" name="cw4r3" class="r3" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.exam1r3}" name="examr3" class="r3" /></td>
                                        <td><input type="number" readonly value="${requestScope.sddetail.overr3}" name="overr3" readonly class="over3" /></td>
                                    </tr>
                                </table>
                                <br/>

                                <table class="gddtable" style="width: 100%">
                                    <tr>
                                        <td colspan="11" style="text-align: center"><h1>Grade Distribution Data</h1></td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td>0–9</td>
                                        <td>10-19</td>
                                        <td>20-29</td>
                                        <td>30-39</td>
                                        <td>40-49</td>
                                        <td>50-59</td>
                                        <td>60-69</td>
                                        <td>70-79</td>
                                        <td>80-89</td>
                                        <td>90+</td>
                                    </tr>
                                    <tr>
                                        <td>CW1</td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c1}" name="r1c1" class="c1" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c2}" name="r1c2" class="c2" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c3}" name="r1c3" class="c3" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c4}" name="r1c4" class="c4" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c5}" name="r1c5" class="c5" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c6}" name="r1c6" class="c6" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c7}" name="r1c7" class="c7" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c8}" name="r1c8" class="c8" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c9}" name="r1c9" class="c9" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r1c10}" name="r1c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>CW2</td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c1}" name="r2c1" class="c1" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c2}" name="r2c2" class="c2" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c3}" name="r2c3" class="c3" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c4}" name="r2c4" class="c4" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c5}" name="r2c5" class="c5" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c6}" name="r2c6" class="c6" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c7}" name="r2c7" class="c7" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c8}" name="r2c8" class="c8" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c9}" name="r2c9" class="c9" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r2c10}" name="r2c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>CW3</td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c1}" name="r3c1" class="c1" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c2}" name="r3c2" class="c2" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c3}" name="r3c3" class="c3" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c4}" name="r3c4" class="c4" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c5}" name="r3c5" class="c5" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c6}" name="r3c6" class="c6" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c7}" name="r3c7" class="c7" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c8}" name="r3c8" class="c8" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c9}" name="r3c9" class="c9" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r3c10}" name="r3c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>CW4</td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c1}" name="r4c1" class="c1" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c2}" name="r4c2" class="c2" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c3}" name="r4c3" class="c3" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c4}" name="r4c4" class="c4" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c5}" name="r4c5" class="c5" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c6}" name="r4c6" class="c6" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c7}" name="r4c7" class="c7" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c8}" name="r4c8" class="c8" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c9}" name="r4c9" class="c9" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r4c10}" name="r4c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>EX</td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c1}" name="r5c1" class="c1" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c2}" name="r5c2" class="c2" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c3}" name="r5c3" class="c3" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c4}" name="r5c4" class="c4" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c5}" name="r5c5" class="c5" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c6}" name="r5c6" class="c6" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c7}" name="r5c7" class="c7" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c8}" name="r5c8" class="c8" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c9}" name="r5c9" class="c9" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r5c10}" name="r5c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>OVERALL</td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r6c1}"  name="r6c1" class="gddov1" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r6c2}"  name="r6c2" class="gddov2" /></td>
                                        <td><input type="number" readonly value="${requestScope.gdddetail.r6c3}"  name="r6c3" class="gddov3" /></td>
                                        <td><input type="number"  readonly value="${requestScope.gdddetail.r6c4}" name="r6c4" class="gddov4" /></td>
                                        <td><input type="number"  readonly value="${requestScope.gdddetail.r6c5}" name="r6c5" class="gddov5" /></td>
                                        <td><input type="number"  readonly value="${requestScope.gdddetail.r6c6}"  name="r6c6" class="gddov6" /></td>
                                        <td><input type="number"  readonly value="${requestScope.gdddetail.r6c7}" name="r6c7" class="gddov7" /></td>
                                        <td><input type="number"  readonly value="${requestScope.gdddetail.r6c8}" name="r6c8" class="gddov8" /></td>
                                        <td><input type="number"  readonly value="${requestScope.gdddetail.r6c9}" name="r6c9" class="gddov9" /></td>
                                        <td><input type="number"  readonly value="${requestScope.gdddetail.r6c10}" name="r6c10" class="gddov10" /></td>
                                    </tr>
                                </table>
                                <br/>
                                <br/>
                                <table>
                                    <tr>
                                        <td><input value="CANCEL" onclick="window.location='viewCMR.jsp';" type="button" /></td>
                                    </tr>
                                </table>



                            </form>
                        </center>

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

