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
        <script src="sum.js"></script>
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
                            <h3 class="centerBox" style="background-color:#2aabd2; text-align:center">CREATE NEW CMR</h3>
                       
                        <center>

                            <form action="InsertCMR" method="GET">
                                <table border="1">
                                    <tr>
                                        <td colspan="2" style="text-align: center"><h1>COURSE MONITORING REPORT</h1></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td>Academic Session</td>
                                        <td>
                                            <input readonly="true" type="number" name="academicsession" value="${requestScope.createCMR.courseWorkId}" />
                                        </td>
                                    </tr>

                                    <tr>
                                        <td>Course Code</td>
                                        <td>
                                            <input readonly="true" type="text" name="coursecode" value="${requestScope.createCMR.courseId}" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Title</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.createCMR.title}" name="title" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Year</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.createCMR.yearMaking}" name="yearmarking" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Semester</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.createCMR.semester}" name="semester" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Date Create</td>
                                        <td>
                                            <input readonly="true" type="text" value="${requestScope.createCMR.createDate}" name="createdate" />
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
                                            <input readonly="true" type="text" value="${lastname}" name="courseleader" />
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Student count</td>
                                        <td>
                                            <input readonly="true" type="number" value="${requestScope.createCMR.studentCount}" name="studentcounnt" />
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
                                        <td><input type="number" value="0" name="cw1r1" id="r1" class="r1" /></td>
                                        <td><input type="number" value="0" name="cw2r1" id="r1" class="r1" /></td>
                                        <td><input type="number" value="0" name="cw3r1" id="r1" class="r1" /></td>
                                        <td><input type="number" value="0" name="cw4r1" id="r1" class="r1" /></td>
                                        <td><input type="number" value="0" name="examr1" id="r1" class="r1" /></td>
                                        <td><input type="number" value="0" name="overr1" id="over1" readonly class="over1" /></td>
                                    </tr>
                                    <tr>
                                        <td>Median</td>
                                        <td><input type="number" value="0" name="cw1r2" class="r2" /></td>
                                        <td><input type="number" value="0" name="cw2r2" class="r2" /></td>
                                        <td><input type="number" value="0" name="cw3r2" class="r2" /></td>
                                        <td><input type="number" value="0" name="cw4r2" class="r2" /></td>
                                        <td><input type="number" value="0" name="examr2" class="r2" /></td>
                                        <td><input type="number" value="0" name="overr2" readonly class="over2" /></td>
                                    </tr>
                                    <tr>
                                        <td>Standard Deviation</td>
                                        <td><input type="number" value="0" name="cw1r3" class="r3" /></td>
                                        <td><input type="number" value="0" name="cw2r3" class="r3" /></td>
                                        <td><input type="number" value="0" name="cw3r3" class="r3" /></td>
                                        <td><input type="number" value="0" name="cw4r3" class="r3" /></td>
                                        <td><input type="number" value="0" name="examr3" class="r3" /></td>
                                        <td><input type="number" value="0" name="overr3" readonly class="over3" /></td>
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
                                        <td><input type="number" value="0" name="r1c1" class="c1" /></td>
                                        <td><input type="number" value="0" name="r1c2" class="c2" /></td>
                                        <td><input type="number" value="0" name="r1c3" class="c3" /></td>
                                        <td><input type="number" value="0" name="r1c4" class="c4" /></td>
                                        <td><input type="number" value="0" name="r1c5" class="c5" /></td>
                                        <td><input type="number" value="0" name="r1c6" class="c6" /></td>
                                        <td><input type="number" value="0" name="r1c7" class="c7" /></td>
                                        <td><input type="number" value="0" name="r1c8" class="c8" /></td>
                                        <td><input type="number" value="0" name="r1c9" class="c9" /></td>
                                        <td><input type="number" value="0" name="r1c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>CW2</td>
                                        <td><input type="number" value="0" name="r2c1" class="c1" /></td>
                                        <td><input type="number" value="0" name="r2c2" class="c2" /></td>
                                        <td><input type="number" value="0" name="r2c3" class="c3" /></td>
                                        <td><input type="number" value="0" name="r2c4" class="c4" /></td>
                                        <td><input type="number" value="0" name="r2c5" class="c5" /></td>
                                        <td><input type="number" value="0" name="r2c6" class="c6" /></td>
                                        <td><input type="number" value="0" name="r2c7" class="c7" /></td>
                                        <td><input type="number" value="0" name="r2c8" class="c8" /></td>
                                        <td><input type="number" value="0" name="r2c9" class="c9" /></td>
                                        <td><input type="number" value="0" name="r2c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>CW3</td>
                                        <td><input type="number" value="0" name="r3c1" class="c1" /></td>
                                        <td><input type="number" value="0" name="r3c2" class="c2" /></td>
                                        <td><input type="number" value="0" name="r3c3" class="c3" /></td>
                                        <td><input type="number" value="0" name="r3c4" class="c4" /></td>
                                        <td><input type="number" value="0" name="r3c5" class="c5" /></td>
                                        <td><input type="number" value="0" name="r3c6" class="c6" /></td>
                                        <td><input type="number" value="0" name="r3c7" class="c7" /></td>
                                        <td><input type="number" value="0" name="r3c8" class="c8" /></td>
                                        <td><input type="number" value="0" name="r3c9" class="c9" /></td>
                                        <td><input type="number" value="0" name="r3c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>CW4</td>
                                        <td><input type="number" value="0" name="r4c1" class="c1" /></td>
                                        <td><input type="number" value="0" name="r4c2" class="c2" /></td>
                                        <td><input type="number" value="0" name="r4c3" class="c3" /></td>
                                        <td><input type="number" value="0" name="r4c4" class="c4" /></td>
                                        <td><input type="number" value="0" name="r4c5" class="c5" /></td>
                                        <td><input type="number" value="0" name="r4c6" class="c6" /></td>
                                        <td><input type="number" value="0" name="r4c7" class="c7" /></td>
                                        <td><input type="number" value="0" name="r4c8" class="c8" /></td>
                                        <td><input type="number" value="0" name="r4c9" class="c9" /></td>
                                        <td><input type="number" value="0" name="r4c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>EX</td>
                                        <td><input type="number" value="0" name="r5c1" class="c1" /></td>
                                        <td><input type="number" value="0" name="r5c2" class="c2" /></td>
                                        <td><input type="number" value="0" name="r5c3" class="c3" /></td>
                                        <td><input type="number" value="0" name="r5c4" class="c4" /></td>
                                        <td><input type="number" value="0" name="r5c5" class="c5" /></td>
                                        <td><input type="number" value="0" name="r5c6" class="c6" /></td>
                                        <td><input type="number" value="0" name="r5c7" class="c7" /></td>
                                        <td><input type="number" value="0" name="r5c8" class="c8" /></td>
                                        <td><input type="number" value="0" name="r5c9" class="c9" /></td>
                                        <td><input type="number" value="0" name="r5c10" class="c10" /></td>
                                    </tr>

                                    <tr>
                                        <td>OVERALL</td>
                                        <td><input type="number" value="0" readonly name="r6c1" class="gddov1" /></td>
                                        <td><input type="number" value="0" readonly name="r6c2" class="gddov2" /></td>
                                        <td><input type="number" value="0" readonly name="r6c3" class="gddov3" /></td>
                                        <td><input type="number" value="0" readonly name="r6c4" class="gddov4" /></td>
                                        <td><input type="number" value="0" readonly name="r6c5" class="gddov5" /></td>
                                        <td><input type="number" value="0" readonly  name="r6c6" class="gddov6" /></td>
                                        <td><input type="number" value="0" readonly name="r6c7" class="gddov7" /></td>
                                        <td><input type="number" value="0" readonly name="r6c8" class="gddov8" /></td>
                                        <td><input type="number" value="0" readonly name="r6c9" class="gddov9" /></td>
                                        <td><input type="number" value="0" readonly name="r6c10" class="gddov10" /></td>
                                    </tr>
                                </table>
                                <br/>
                                <br/>
                                <table>
                                    <tr>
                                        <td><input value="CREATE" type="submit" /></td>
                                        <td><input value="RESET" type="reset" /> </td>
                                        <td><input value="CANCEL" onclick="window.location = 'homePageForCL.jsp';" type="button" /></td>
                                    </tr>
                                </table>



                            </form>
                        </center>
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
                    <script src="js/sum.js"></script>
                    <script type=text/javascript>
                                            /* 
                                             * To change this license header, choose License Headers in Project Properties.
                                             * To change this template file, choose Tools | Templates
                                             * and open the template in the editor.
                                             */


                                            $(document).ready(function () {
                                                $(".r1").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSum1()
                                                                    });
                                                        });
                                                $(".r2").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSum2()
                                                                    });
                                                        });
                                                $(".r3").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSum3()
                                                                    });
                                                        });
                                                $(".c1").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc1()
                                                                    });
                                                        });
                                                $(".c2").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc2()
                                                                    });
                                                        });
                                                $(".c3").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc3()
                                                                    });
                                                        });
                                                $(".c4").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc4()
                                                                    });
                                                        });
                                                $(".c5").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc5()
                                                                    });
                                                        });
                                                $(".c6").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc6()
                                                                    });
                                                        });
                                                $(".c7").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc7()
                                                                    });
                                                        });
                                                $(".c8").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc8()
                                                                    });
                                                        });
                                                $(".c9").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc9()
                                                                    });
                                                        });
                                                $(".c10").each(
                                                        function () {
                                                            $(this).keyup(
                                                                    function () {
                                                                        calculateSumc10()
                                                                    });
                                                        });
                                            });

                                            function calculateSum1() {
                                                var sum1 = 0;
                                                $(".r1").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vl1 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vl1);
                                                            if (!isNaN(vl1) && vl1.length != 0) {
                                                                sum1 += parseFloat(vl1);
                                                            }
                                                        });

                                                $(".over1").val(sum1.toFixed(0));
                                            }

                                            $(document).ready(function () {
                                                $('input.r1').keyup(function (event) {
                                                    // skip for arrow keys
                                                    if (event.which >= 37 && event.which <= 40) {
                                                        event.preventDefault();
                                                    }
                                                    var $this = $(this);
                                                    var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

                                                    var num2 = float2int(RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join("")));

                                                    console.log(num2);


                                                    // the following line has been simplified. Revision history contains original.
                                                    $this.val(num2);
                                                });
                                            });

                                            function float2int(value) {
                                                return value | 0;
                                            }

                                            function RemoveRougeChar(convertString) {


                                                if (convertString.substring(0, 1) == ",") {

                                                    return convertString.substring(1, convertString.length)

                                                }
                                                return convertString;

                                            }

// row 2


                                            function calculateSum2() {
                                                var sum2 = 0;
                                                $(".r2").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vl2 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vl2);
                                                            if (!isNaN(vl2) && vl2.length != 0) {
                                                                sum2 += parseFloat(vl2);
                                                            }
                                                        });

                                                $(".over2").val(sum2.toFixed(0));
                                            }

                                            $(document).ready(function () {
                                                $('.r2').on('keyup', function (event) {
                                                    // skip for arrow keys
                                                    if (event.which >= 37 && event.which <= 40) {
                                                        event.preventDefault();
                                                    }
                                                    var $this = $(this);
                                                    var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

                                                    var num2 = float2int(RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join("")))

                                                    console.log(num2);


                                                    // the following line has been simplified. Revision history contains original.
                                                    $this.val(num2);
                                                });
                                            });


//r3



                                            function calculateSum3() {
                                                var sum3 = 0;
                                                $(".r3").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vl3 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vl3);
                                                            if (!isNaN(vl3) && vl3.length != 0) {
                                                                sum3 += parseFloat(vl3);
                                                            }
                                                        });

                                                $(".over3").val(sum3.toFixed(0));
                                            }

                                            $(document).ready(function () {
                                                $('input.r3').keyup(function (event) {
                                                    // skip for arrow keys
                                                    if (event.which >= 37 && event.which <= 40) {
                                                        event.preventDefault();
                                                    }
                                                    var $this = $(this);
                                                    var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

                                                    var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

                                                    console.log(num2);


                                                    // the following line has been simplified. Revision history contains original.
                                                    $this.val(num2);
                                                });
                                            });

                                            function calculateSumc1() {
                                                var sum1 = 0;
                                                $(".c1").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vl1 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vl1);
                                                            if (!isNaN(vl1) && vl1.length != 0) {
                                                                sum1 += parseFloat(vl1);
                                                            }
                                                        });

                                                $(".gddov1").val(sum1.toFixed(0));
                                            }

                                            function calculateSumc2() {
                                                var sumc2 = 0;
                                                $(".c2").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vl1 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vl1);
                                                            if (!isNaN(vl1) && vl1.length != 0) {
                                                                sumc2 += parseFloat(vl1);
                                                            }
                                                        });

                                                $(".gddov2").val(sumc2.toFixed(0));
                                            }

                                            function calculateSumc3() {
                                                var sumc3 = 0;
                                                $(".c3").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vl1 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vl1);
                                                            if (!isNaN(vl1) && vl1.length != 0) {
                                                                sumc3 += parseFloat(vl1);
                                                            }
                                                        });

                                                $(".gddov3").val(sumc3.toFixed(0));
                                            }

                                            function calculateSumc4() {
                                                var sumc4 = 0;
                                                $(".c4").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vlc4 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vlc4);
                                                            if (!isNaN(vlc4) && vlc4.length != 0) {
                                                                sumc4 += parseFloat(vlc4);
                                                            }
                                                        });

                                                $(".gddov4").val(sumc4.toFixed(0));
                                            }

                                            function calculateSumc5() {
                                                var sumc5 = 0;
                                                $(".c5").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vlc5 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vlc5);
                                                            if (!isNaN(vlc5) && vlc5.length != 0) {
                                                                sumc5 += parseFloat(vlc5);
                                                            }
                                                        });

                                                $(".gddov5").val(sumc5.toFixed(0));
                                            }

                                            function calculateSumc6() {
                                                var sumc6 = 0;
                                                $(".c6").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vlc6 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vlc6);
                                                            if (!isNaN(vlc6) && vlc6.length != 0) {
                                                                sumc6 += parseFloat(vlc6);
                                                            }
                                                        });

                                                $(".gddov6").val(sumc6.toFixed(0));
                                            }

                                            function calculateSumc7() {
                                                var sumc7 = 0;
                                                $(".c7").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vlc7 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vlc7);
                                                            if (!isNaN(vlc7) && vlc7.length != 0) {
                                                                sumc7 += parseFloat(vlc7);
                                                            }
                                                        });

                                                $(".gddov7").val(sumc7.toFixed(0));
                                            }

                                            function calculateSumc8() {
                                                var sumc8 = 0;
                                                $(".c8").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vlc8 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vlc8);
                                                            if (!isNaN(vlc8) && vlc8.length != 0) {
                                                                sumc8 += parseFloat(vlc8);
                                                            }
                                                        });

                                                $(".gddov8").val(sumc8.toFixed(0));
                                            }

                                            function calculateSumc9() {
                                                var sumc9 = 0;
                                                $(".c9").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vlc9 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vlc9);
                                                            if (!isNaN(vlc9) && vlc9.length != 0) {
                                                                sumc9 += parseFloat(vlc9);
                                                            }
                                                        });

                                                $(".gddov9").val(sumc9.toFixed(0));
                                            }

                                            function calculateSumc10() {
                                                var sumc10 = 0;
                                                $(".c10").each(
                                                        function () {
                                                            console.log(this.value);
                                                            var vlc10 = this.value.split(',').join('');
                                                            console.log('Replaced: ' + vlc10);
                                                            if (!isNaN(vlc10) && vlc10.length != 0) {
                                                                sumc10 += parseFloat(vlc10);
                                                            }
                                                        });

                                                $(".gddov10").val(sumc10.toFixed(0));
                                            }

                                            $(document).ready(function () {
                                                $('input.c1', 'input.c2', 'input.c3', 'input.c4', 'input.c5', 'input.c6', 'input.c7', 'input.c8', 'input.c9', 'input.c10').keyup(function (event) {
                                                    // skip for arrow keys
                                                    if (event.which >= 37 && event.which <= 40) {
                                                        event.preventDefault();
                                                    }
                                                    var $this = $(this);
                                                    var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

                                                    var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

                                                    console.log(num2);


                                                    // the following line has been simplified. Revision history contains original.
                                                    $this.val(num2);
                                                });
                                                $('input.c2').keyup(function (event) {
                                                    // skip for arrow keys
                                                    if (event.which >= 37 && event.which <= 40) {
                                                        event.preventDefault();
                                                    }
                                                    var $this = $(this);
                                                    var num = $this.val().replace(/,/gi, "").split("").reverse().join("");

                                                    var num2 = RemoveRougeChar(num.replace(/(.{3})/g, "$1,").split("").reverse().join(""));

                                                    console.log(num2);


                                                    // the following line has been simplified. Revision history contains original.
                                                    $this.val(num2);
                                                });
                                            });


                    </script>
                    <script type="text/javascript" src=""
                            </body>
                        </html>

