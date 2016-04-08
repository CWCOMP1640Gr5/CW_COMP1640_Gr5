<%-- 
    Document   : viewCMRForCM
    Created on : Mar 19, 2016, 10:18:16 PM
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

                            <div class="row">
                                <div class="col-lg-6">
                                    
                                </div><!-- /.col-lg-6 -->
                                <div class="col-lg-6">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="Search for...">
                                        <span class="input-group-btn">
                                            <button class="btn btn-default" type="button">Go!</button>
                                        </span>
                                    </div><!-- /input-group -->
                                </div><!-- /.col-lg-6 -->
                            </div><!-- /.row -->
                            
                            <div class="input-group pull-left">                                    
                                <img style="height:50%;width: 38% " src="templates/img/logo.jpg" alt=""/>
                            </div>
                            <div class="pull-right">

                                <ul class="list-unstyled top-links">

                                    <c:if test="${not empty sessionScope.user}">
                                        <li><h4 style="color:#ffffff"> Hello, ${sessionScope.user}</h4></li>
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
                                <a href="homePageForCM.jsp"><i class="glyphicon glyphicon-home"></i> Home</a>
                            </li>
                            <li><a href="listCMRForCM">View Course Monitoring Reports</a></li>
                            <li><a href="profileForCM.html">Profile</a></li>
                            <li><a href="ListAllCMRForCM">List Course Monitoring Reports</a></li>
                        </ul>
                    </div>
                </div>
            </div><!--end .main-nav-->
        </header>



<section class="content">

            <div id="exTab2" class="container">	
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a  href="#1" data-toggle="tab">Course Information</a>
                    </li>
                    <li><a href="#2" data-toggle="tab">Monitor Report</a>
                    </li>
                    <li><a href="#3" data-toggle="tab">Comment</a>
                    </li>
                </ul>

                <div class="tab-content ">
                    <div class="tab-pane active" id="1">

                        <div class="panel panel-blue margin-bottom-40">
                            <div class="panel-body">

                                <div class="form-group">
                                    <label for="title">Title</label>
                                    <input readonly="true" id="title" class="form-control" type="text" value="${cmrDetail.title}" name="title" />
                                </div>
                                <div class="form-group">
                                    <label for="coursecode">Course Code</label>
                                    <input readonly="true" id="coursecode" class="form-control" type="text" name="coursecode" value="${cmrDetail.courseId}" />
                                </div>
                                <div class="form-group">
                                    <label for="coursecode">Courser Moderator</label>
                                    <input readonly="true" id="coursecode" class="form-control" type="text" name="coursecode" value="${cmrDetail.courserModerator}" />
                                </div>
                                <div class="form-group">
                                    <label for="coursecode">Action</label>
                                    <input readonly="true" id="coursecode" class="form-control" type="text" name="coursecode" value="${cmrDetail.action}" />
                                </div>
                                <div class="form-group">
                                    <label for="coursecode">Department</label>
                                    <input readonly="true" id="coursecode" class="form-control" type="text" name="coursecode" value="${cmrDetail.department}" />
                                </div>
                                <div class="form-group">
                                    <label for="coursecode">Courser Units</label>
                                    <input readonly="true" id="coursecode" class="form-control" type="text" name="coursecode" value="${cmrDetail.courserUnits}" />
                                </div>
                                <div class="form-group">
                                    <label for="yearmarking">Year</label>
                                    <input readonly="true" class="form-control" id="yearmarking" type="text" value="${cmrDetail.yearMaking}" name="yearmarking" />
                                </div>
                                <div class="form-group">
                                    <label for="semester">Semester</label>
                                    <input readonly="true" class="form-control" id="yearmarking" type="text" value="${cmrDetail.semester}" name="semester" />
                                </div>
                                <div class="form-group">
                                    <label for="createdate">Date Create</label>
                                    <input readonly="true" id="createdate" class="form-control" type="text" value="${cmrDetail.createDate}" name="createdate" />
                                </div>
                                <div class="form-group">
                                    <label for="studentcounnt">Student count</label>
                                    <input readonly="true" id="studentcounnt" class="form-control" type="number" value="${cmrDetail.studentCount}" name="studentcounnt" />
                                </div>
                            </div>
                        </div>

                    </div>
                    <div class="tab-pane" id="2">
                        <form method="GET" action="EditCMRDetailCL">
                            <div class="form-group">
                                <div class="panel-heading" style="    background-color: yellowgreen;
                                     color: #FFF;
                                     font-size: large;
                                     font-weight: bolder;">Statistical Data</div>
                                <div class="table-responsive">
                                    <table class="table" style="width: 100%">
                                        <thead>
                                            <tr class="success">
                                                <td></td>
                                                <td>CW1</td>
                                                <td>CW2</td>
                                                <td>CW3</td>
                                                <td>CW4</td>
                                                <td>EXAM</td>
                                                <td>OVERALL</td>
                                            </tr>
                                        </thead>
                                        <tr>
                                            <td  style="background: #d9edf7;">Mean</td>
                                            <td><input id="inputnumber" value="${sdDetail.cw1r1}" readonly="true" type="text" name="cw1r1" class="r1" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw2r1}" readonly="true" type="text" name="cw2r1" class="r1" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw3r1}" readonly="true" type="text" name="cw3r1" class="r1" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw4r1}" readonly="true" type="text" name="cw4r1"  class="r1" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.examr1}" readonly="true" type="text" name="examr1" class="r1" /></td>
                                            <td><input readonly="true" value="${sdDetail.over1r1}" type="text" name="overr1" id="over1" readonly class="over1" /></td>
                                        </tr>
                                        <tr>
                                            <td style="background: #d9edf7;">Median</td>
                                            <td><input id="inputnumber" value="${sdDetail.cw1r2}" type="text" name="cw1r2" class="r2" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw2r2}" type="text" name="cw2r2" class="r2" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw3r2}" type="text" name="cw3r2" class="r2" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw4r2}" type="text" name="cw4r2" class="r2" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.exam1r2}" type="text" name="examr2" class="r2" /></td>
                                            <td><input type="text" value="${sdDetail.overr2}" name="overr2" readonly class="over2" /></td>
                                        </tr>
                                        <tr>
                                            <td style="background: #d9edf7;">Standard Deviation</td>
                                            <td><input id="inputnumber" value="${sdDetail.cw1r3}" type="text" name="cw1r3" class="r3" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw2r3}" type="text" name="cw2r3" class="r3" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw3r3}" type="text" name="cw3r3" class="r3" /></td>
                                            <td><input id="inputnumber" value="${sdDetail.cw4r3}" type="text" name="cw4r3" class="r3" /></td>
                                            <td><input  id="inputnumber" value="${sdDetail.exam1r3}" type="text" name="examr3" class="r3" /></td>
                                            <td><input type="text" name="overr3" value="${sdDetail.overr3}" readonly class="over3" /></td>
                                        </tr>
                                    </table>
                                </div>
                                <br/>
                                <div class="panel-heading" style="    background-color: yellowgreen;
                                     color: #FFF;
                                     font-size: large;
                                     font-weight: bolder;">Grade Distribution Data</div>
                                <div class="table-responsive">
                                    <table class="table" style="width: 100%">
                                        <thead>
                                            <tr class="success">
                                                <td></td>
                                                <td >0–9</td>
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
                                        </thead>
                                        <tr>
                                            <td class="tdinfo">CW1</td>
                                            <td><input readonly="true" value="${gddDetail.r1c1}" type="text" id="inputnumber" name="r1c1" class="c1" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c2}"  type="text" id="inputnumber" name="r1c2" class="c2" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c3}"  type="text" id="inputnumber" name="r1c3" class="c3" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c4}"  type="text" id="inputnumber" name="r1c4" class="c4" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c5}"  type="text" id="inputnumber" name="r1c5" class="c5" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c6}"  type="text" id="inputnumber" name="r1c6" class="c6" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c7}"  type="text" id="inputnumber" name="r1c7" class="c7" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c8}"  type="text" id="inputnumber" name="r1c8" class="c8" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c9}"  type="text" id="inputnumber" name="r1c9" class="c9" /></td>
                                            <td><input readonly="true" value="${gddDetail.r1c10}"  type="text" id="inputnumber" name="r1c10" class="c10" /></td>
                                        </tr>

                                        <tr>
                                            <td class="tdinfo">CW2</td>
                                            <td><input readonly="true" value="${gddDetail.r2c1}"  type="text" id="inputnumber" name="r2c1" class="c1" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c2}"  type="text" id="inputnumber" name="r2c2" class="c2" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c3}"  type="text" id="inputnumber" name="r2c3" class="c3" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c4}"  type="text" id="inputnumber" name="r2c4" class="c4" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c5}"  type="text" id="inputnumber" name="r2c5" class="c5" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c6}"  type="text" id="inputnumber" name="r2c6" class="c6" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c7}"  type="text" id="inputnumber" name="r2c7" class="c7" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c8}"  type="text" id="inputnumber" name="r2c8" class="c8" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c9}"  type="text" id="inputnumber" name="r2c9" class="c9" /></td>
                                            <td><input readonly="true" value="${gddDetail.r2c10}"  type="text" id="inputnumber" name="r2c10" class="c10" /></td>
                                        </tr>

                                        <tr>
                                            <td class="tdinfo">CW3</td>
                                            <td><input readonly="true" value="${gddDetail.r3c1}"  type="text" id="inputnumber" name="r3c1" class="c1" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c2}"  type="text" id="inputnumber" name="r3c2" class="c2" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c3}"  type="text" id="inputnumber" name="r3c3" class="c3" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c4}"  type="text" id="inputnumber" name="r3c4" class="c4" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c5}"  type="text" id="inputnumber" name="r3c5" class="c5" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c6}"  type="text" id="inputnumber" name="r3c6" class="c6" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c7}"  type="text" id="inputnumber" name="r3c7" class="c7" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c8}"  type="text" id="inputnumber" name="r3c8" class="c8" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c9}"  type="text" id="inputnumber" name="r3c9" class="c9" /></td>
                                            <td><input readonly="true" value="${gddDetail.r3c10}"  type="text" id="inputnumber" name="r3c10" class="c10" /></td>
                                        </tr>

                                        <tr>
                                            <td class="tdinfo">CW4</td>
                                            <td><input readonly="true" value="${gddDetail.r4c1}"  type="text" name="r4c1" id="inputnumber" class="c1" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c2}"  type="text" name="r4c2" id="inputnumber" class="c2" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c3}"  type="text" name="r4c3" id="inputnumber" class="c3" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c4}"  type="text" name="r4c4" id="inputnumber" class="c4" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c5}"  type="text" name="r4c5" id="inputnumber" class="c5" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c6}"  type="text" name="r4c6" id="inputnumber" class="c6" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c7}"  type="text" name="r4c7" id="inputnumber" class="c7" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c8}"  type="text" name="r4c8" id="inputnumber" class="c8" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c9}" type="text" name="r4c9" id="inputnumber" class="c9" /></td>
                                            <td><input readonly="true" value="${gddDetail.r4c10}" type="text" name="r4c10" id="inputnumber" class="c10" /></td>
                                        </tr>

                                        <tr>
                                            <td class="tdinfo">EX</td>
                                            <td><input readonly="true" value="${gddDetail.r5c1}"  type="text" name="r5c1" id="inputnumber" class="c1" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c2}"  type="text" name="r5c2" id="inputnumber" class="c2" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c3}"  type="text" name="r5c3" id="inputnumber" class="c3" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c4}"  type="text" name="r5c4" id="inputnumber" class="c4" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c5}"  type="text" name="r5c5" id="inputnumber" class="c5" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c6}"  type="text" name="r5c6" id="inputnumber" class="c6" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c7}"  type="text" name="r5c7" id="inputnumber" class="c7" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c8}"  type="text" name="r5c8" id="inputnumber" class="c8" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c9}"  type="text" name="r5c9" id="inputnumber" class="c9" /></td>
                                            <td><input readonly="true" value="${gddDetail.r5c10}"  type="text" name="r5c10" id="inputnumber" class="c10" /></td>
                                        </tr>

                                        <tr>
                                            <td class="tdinfo">OVERALL</td>
                                            <td><input type="text" value="${gddDetail.r6c1}" readonly name="r6c1" class="gddov1" /></td>
                                            <td><input type="text" value="${gddDetail.r6c2}" readonly name="r6c2" class="gddov2" /></td>
                                            <td><input type="text" value="${gddDetail.r6c3}" readonly name="r6c3" class="gddov3" /></td>
                                            <td><input type="text" value="${gddDetail.r6c4}" readonly name="r6c4" class="gddov4" /></td>
                                            <td><input type="text" value="${gddDetail.r6c5}" readonly name="r6c5" class="gddov5" /></td>
                                            <td><input type="text" value="${gddDetail.r6c6}" readonly  name="r6c6" class="gddov6" /></td>
                                            <td><input type="text" value="${gddDetail.r6c7}" readonly name="r6c7" class="gddov7" /></td>
                                            <td><input type="text" value="${gddDetail.r6c8}" readonly name="r6c8" class="gddov8" /></td>
                                            <td><input type="text" value="${gddDetail.r6c9}" readonly name="r6c9" class="gddov9" /></td>
                                            <td><input type="text" value="${gddDetail.r6c10}" readonly name="r6c10" class="gddov10" /></td>
                                        </tr>
                                    </table>
                                </div>
                            </div>
                    </div>
                    <div class="tab-pane" id="3">
                        <div class="form-group">
                            <label for="comment">Comment:</label>
                            <textarea class="form-control" readonly="true" value rows="5" id="comment">
                                ${cmrDetail.commentContent}
                            </textarea>
                        </div>
                    </div>
                    <div class="col-sm-4">
                         <input value="DONE" class="btn btn-warning" onclick="window.location = 'homePageForCM.jsp';" type="button" />
                    </div>
                </div>
                </form>


                <!-- Bootstrap core JavaScript
                    ================================================== -->
                <!-- Placed at the end of the document so the pages load faster -->
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
                <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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

