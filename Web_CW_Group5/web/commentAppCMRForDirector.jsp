<%-- 
    Document   : commentAppCMRForDirector
    Created on : Mar 20, 2016, 3:28:07 PM
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
                                <a href="LoadHomeForDirection"><i class="glyphicon glyphicon-home"></i> Home</a>
                            </li>
                            <li><a href="AppCMR">Approved Course Monitoring Reports</a></li>
                            <li><a href="UnAppCMR">UnApprovied Course Monitoring Reports</a></li>
                            <li><a href="ProfileDirector">Profile</a></li>
                            <li><a href="CommentCMR">Comment For Course Monitoring Reports</a></li>
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
                            <h3 class="box-title" style="background-color:#2aabd2; text-align:center">Approved Course Monitor Director</h3>
                        </div>
                        <br>
                        
                        </div>



                    </div><!--end .container-->
                </div>
            <center>
                
                <table border="1">
                                    <tr>
                                        <td colspan="2" style="text-align: center"><h1>COURSE MONITORING REPORT</h1></td>
                                        <td>
                                            <input type="text" name="txtCMRId" value="${requestScope.CMRId}" hidden="true"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Academic Session</td>
                                        <td>
                                            <input readonly="true" type="number" name="academicsession" value="${requestScope.CourseWork.courseWorkId}" />
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>Course Code</td>
                                        <td>
                                            <input readonly="true" type="text" name="coursecode" value="${requestScope.CourseWork.courseId}" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Title</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.Course.title}" name="title" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Year</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.CourseWork.yearMaking}" name="yearmarking" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Semester</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.CourseWork.semester}" name="semester" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Date Create</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.CourseWork.createDate}" name="createdate" />
                                        </td>
                                    </tr>
                                    <%
                                        Cookie cookie = null;
                                        Cookie[] cookies = null;
                                        String lastname = null;
                                        // Get an array of Cookies associated with this domain
                                        cookies = request.getCookies();
                                        if (cookies != null) {
                                            for (int i = 0; i < cookies.length; i++) {
                                                cookie = cookies[i];
                                                if (cookie.getName().equals("lastname")) {
                                                    lastname = cookie.getValue();
                                                }
                                            }
                                        }
                                    %>
                                    <tr>
                                        <td>Course Leader:</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.CourseWork.courseLeader}" name="courseleader" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Student count</td>
                                        <td>
                                            <input readonly="true" type="number" value="${requestScope.CourseWork.studentCount}" name="studentcounnt" />
                                        </td>
                                    </tr>                                   
                                </table>
                                <br/>
                                <table class="table" style="width: 70%">
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
                                        <td><input type="number" name="cw1r1" id="r1" class="r1" value="${requestScope.StaData.cw1r1}" readonly="readonly" /></td>
                                        <td><input type="number" name="cw2r1" id="r1" class="r1" value="${requestScope.StaData.cw2r1}" readonly="readonly" /></td>
                                        <td><input type="number" name="cw3r1" id="r1" class="r1" value="${requestScope.StaData.cw3r1}" readonly="readonly"/></td>
                                        <td><input type="number" name="cw4r1" id="r1" class="r1" value="${requestScope.StaData.cw4r1}" readonly="readonly"/></td>
                                        <td><input type="number" name="examr1" id="r1" class="r1" value="${requestScope.StaData.examr1}" readonly="readonly"/></td>
                                        <td><input type="number" name="overr1" value="${requestScope.StaData.over1r1}" readonly  /></td>
                                    </tr>
                                    <tr>
                                        <td>Median</td>
                                        <td><input type="number" name="cw1r2" class="r2" value="${requestScope.StaData.cw1r2}" readonly="readonly"/></td>
                                        <td><input type="number" name="cw2r2" class="r2" value="${requestScope.StaData.cw2r2}" readonly="readonly"/></td>
                                        <td><input type="number" name="cw3r2" class="r2" value="${requestScope.StaData.cw3r2}" readonly="readonly"/></td>
                                        <td><input type="number" name="cw4r2" class="r2" value="${requestScope.StaData.cw4r2}" readonly="readonly"/></td>
                                        <td><input type="number" name="examr2" class="r2" value="${requestScope.StaData.exam1r2}" readonly="readonly"/></td>
                                        <td><input type="number" name="overr2" readonly  value="${requestScope.StaData.overr2}" readonly="readonly"/></td>
                                    </tr>
                                    <tr>
                                        <td>Standard Deviation</td>
                                        <td><input type="number" name="cw1r3" class="r3" value="${requestScope.StaData.cw1r3}" readonly="readonly"/></td>
                                        <td><input type="number" name="cw2r3" class="r3" value="${requestScope.StaData.cw2r3}" readonly="readonly"/></td>
                                        <td><input type="number" name="cw3r3" class="r3" value="${requestScope.StaData.cw3r3}" readonly="readonly"/></td>
                                        <td><input type="number" name="cw4r3" class="r3" value="${requestScope.StaData.cw4r3}" readonly="readonly"/></td>
                                        <td><input type="number" name="examr3" class="r3" value="${requestScope.StaData.exam1r3}" readonly="readonly"/></td>
                                        <td><input type="number" name="overr3" value="${requestScope.StaData.overr3}" readonly="readonly" /></td>
                                    </tr>
                                </table>
                                <br/>

                               
                                <table class="table" style="width: 70%">
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
                                        <td><input type="number" name="r1c1"  value="${requestScope.GradeData.r1c1}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c2"  value="${requestScope.GradeData.r1c2}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c3"  value="${requestScope.GradeData.r1c3}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c4"  value="${requestScope.GradeData.r1c4}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c5"  value="${requestScope.GradeData.r1c5}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c6"  value="${requestScope.GradeData.r1c6}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c7"  value="${requestScope.GradeData.r1c7}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c8"  value="${requestScope.GradeData.r1c8}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c9"  value="${requestScope.GradeData.r1c9}" readonly="readonly"/></td>
                                        <td><input type="number" name="r1c10"  value="${requestScope.GradeData.r1c10}" readonly="readonly"/></td>
                                    </tr>

                                    <tr>
                                        <td>CW2</td>
                                        <td><input type="number" name="r2c1"  value="${requestScope.GradeData.r2c1}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c2"  value="${requestScope.GradeData.r2c2}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c3"  value="${requestScope.GradeData.r2c3}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c4"  value="${requestScope.GradeData.r2c4}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c5" value="${requestScope.GradeData.r2c5}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c6"  value="${requestScope.GradeData.r2c6}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c7"  value="${requestScope.GradeData.r2c7}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c8"  value="${requestScope.GradeData.r2c8}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c9"  value="${requestScope.GradeData.r2c9}" readonly="readonly"/></td>
                                        <td><input type="number" name="r2c10"  value="${requestScope.GradeData.r2c10}" readonly="readonly"/></td>
                                    </tr>

                                    <tr>
                                        <td>CW3</td>
                                        <td><input type="number" name="r3c1"  value="${requestScope.GradeData.r3c1}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c2"  value="${requestScope.GradeData.r3c2}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c3"  value="${requestScope.GradeData.r3c3}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c4"  value="${requestScope.GradeData.r3c4}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c5"  value="${requestScope.GradeData.r3c5}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c6"  value="${requestScope.GradeData.r3c6}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c7"  value="${requestScope.GradeData.r3c7}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c8"  value="${requestScope.GradeData.r3c8}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c9"  value="${requestScope.GradeData.r3c9}" readonly="readonly"/></td>
                                        <td><input type="number" name="r3c10"  value="${requestScope.GradeData.r3c10}" readonly="readonly"/></td>
                                    </tr>

                                    <tr>
                                        <td>CW4</td>
                                        <td><input type="number" name="r4c1"  value="${requestScope.GradeData.r4c1}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c2"  value="${requestScope.GradeData.r4c2}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c3"  value="${requestScope.GradeData.r4c3}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c4"  value="${requestScope.GradeData.r4c4}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c5"  value="${requestScope.GradeData.r4c5}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c6"  value="${requestScope.GradeData.r4c6}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c7"  value="${requestScope.GradeData.r4c7}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c8"  value="${requestScope.GradeData.r4c8}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c9"  value="${requestScope.GradeData.r4c9}" readonly="readonly"/></td>
                                        <td><input type="number" name="r4c10"  value="${requestScope.GradeData.r4c10}" readonly="readonly"/></td>
                                    </tr>

                                    <tr>
                                        <td>EX</td>
                                        <td><input type="number" name="r5c1"  value="${requestScope.GradeData.r5c1}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c2"  value="${requestScope.GradeData.r5c2}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c3"  value="${requestScope.GradeData.r5c3}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c4"  value="${requestScope.GradeData.r5c4}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c5" value="${requestScope.GradeData.r5c5}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c6"  value="${requestScope.GradeData.r5c6}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c7"  value="${requestScope.GradeData.r5c7}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c8"  value="${requestScope.GradeData.r5c8}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c9" value="${requestScope.GradeData.r5c9}" readonly="readonly"/></td>
                                        <td><input type="number" name="r5c10"  value="${requestScope.GradeData.r5c10}" readonly="readonly"/></td>
                                    </tr>

                                    <tr>
                                        <td>OVERALL</td>
                                        <td><input type="number" readonly name="r6c1"  value="${requestScope.GradeData.r6c1}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c2"  value="${requestScope.GradeData.r6c2}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c3"  value="${requestScope.GradeData.r6c3}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c4"  value="${requestScope.GradeData.r6c4}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c5"  value="${requestScope.GradeData.r6c5}" readonly="readonly"/></td>
                                        <td><input type="number" readonly  name="r6c6"  value="${requestScope.GradeData.r6c6}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c7"  value="${requestScope.GradeData.r6c7}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c8"  value="${requestScope.GradeData.r6c8}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c9"  value="${requestScope.GradeData.r6c9}" readonly="readonly"/></td>
                                        <td><input type="number" readonly name="r6c10"  value="${requestScope.GradeData.r6c10}" readonly="readonly"/></td>
                                    </tr>
                                    </table>
                                    <form action="UpdateCommentCMR">
                                    <table class="table" style="width: 70%">
                                    
                                     <tr>
                                        <td>Comment:</td>
                                        <td >
                                            <input type="text" name="txtCMRId" value="${requestScope.CMR.CMRId}" hidden="true"/>
                                            <textarea name="txtComment" style="width: 100%">${requestScope.CMR.commentContent}</textarea>
                                        </td> 
                                    </tr>

                                    <tr>
                                    
                                        <td colspan="11">
                                            <input type="submit" value="Comment"/>
                                        </td> 
                                    </tr>
                                    
                                </table>
                                       </form> 
                                <br/>
                                <br/>
                                <br>
                                <table>
                                   
                                    <tr>
                                                                     
                                        <td><input value="HOME" onclick="window.location = 'LoadHomeForDirection';" type="button" /></td>
                                    </tr>
                                </table>
               
            </center>
            
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


