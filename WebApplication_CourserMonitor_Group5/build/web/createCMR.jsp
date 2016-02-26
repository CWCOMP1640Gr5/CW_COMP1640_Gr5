<%-- 
    Document   : createCMR
    Created on : Feb 25, 2016, 10:59:51 PM
    Author     : Fpt
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
            <div class="top-bar">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="pull-left">

                            </div>
                            <div class="pull-right">
                                <ul class="list-unstyled top-links">
                                    <li><h4>Hello,</h4></li>
                                    <li><h4><a href="listCourse.html">List Course</a></h4></li>
                                    <li><h4><a href="introduction.html">Introduction</a></h4></li>
                                    <li><h4><a href="logOut.html">Log out</a></h4></li>
                                </ul>	
                            </div>
                        </div>
                    </div>
                </div>
            </div><!--end .top-bar-->

            <div class="main-header">
                <div class="container">
                    <div class="row">
                        <div class="col-md-4"> <a href="index.html"><img src="./templates/img/logo.jpg" /></a>  

                        </div>
                        <div class="col-md-4 ">
                            <div class="banner text-center">
                                <a href="index.html"><img src="./templates/img/PRADOTEC_LOGO-Copy-185x45.jpg" alt="Banner" /></a>
                            </div>
                        </div>

                        <div class="col-lg-4  search-w">
                            <div class="input-group pull-right">
                                <input type="text" class="form-control" placeholder="Search course here">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button"><i class="glyphicon glyphicon-search"></i></button>
                                </span>
                            </div>
                        </div>
                    </div>                                                              		



                </div>
            </div><!--end .header-header-->

            <div class="main-nav">
                <div class="container">
                    <div class="row" style="text-align:center">
                        <ul class="nav nav-pills">
                            <li class="active">
                                <a href=index.html"><i class="glyphicon glyphicon-home"></i> Home</a>
                            </li>
                            <li><a href="createNewCMR.html">Create Course Monitoring Reports</a></li>
                            <li><a href="viewCMP.html">View Course Monitoring Reports</a></li>
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
                <div class="jumbotron">
                    <h1>Hello, world!</h1>
                    <p>...</p>
                    <p><a class="btn btn-primary btn-lg" href="introduction.html" role="button">Learn more</a></p>
                </div>


                <div class="new-lists">
                    <div class="row">
                        <div class="col-sm-12">
                            <h3 class="centerBox" style="background-color:#2aabd2; text-align:center">CREATE NEW CMR</h3>
                        </div>
                        <center>

                            <form action="CreateCMR" method="post">
                                <table border="1">
                                    <tr>
                                        <td colspan="2" style="text-align: center"><h1>COURSE MONITORING REPORT</h1></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td>Academic Session</td>
                                        <td>
                                            <input type="text" name="txtacademicSession" size="100%"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Course Code</td>
                                        <td>
                                            <input type="text" name="txtCourseId" size="100%"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Title</td>
                                        <td>
                                            <input type="text" name="txtTitle" size="100%"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Course Leader:</td>
                                        <td>
                                            <input type="text" name="txtCourseLeader" size="100%"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>Student count</td>
                                        <td>
                                            <input type="text" name="txtStudentCount" size="100%"/>
                                        </td>
                                    </tr>                                   

                                </table>
                                <br>
                                <table border="1">
                                    <tr>
                                        <td colspan="7"><h3>Statistical Data</h3></td>
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
                                    <script type="text/javascript">
                                        function AVG(a, b, c, d)
                                        {
                                            return parseFloat(a) + parseFloat(b) + parseFloat(c) + parseFloat(d) / 4;
                                        }
                                        function test()
                                        {
                                            return 3"3";
                                        }
                                    </script>
                                    <td>Mean</td>
                                    <td><input type="text" name="txtCW1" size="12%" id="CW1"/></td>
                                    <td><input type="text" name="txtCW2"size="12%"id="CW2"/></td>
                                    <td><input type="text" name="txtCW3"size="12%"id="CW3"/></td>
                                    <td><input type="text" name="txtCW4"size="12%"id="CW4"/></td>
                                    <td><input type="text" name="txtExamSD1"size="12%" id="ExamSD"/></td>
                                    <td><input type="text" name="txtOverallSD1"size="12%"/></td>
                                    </tr>
                                    <tr>
                                        <td>Median</td>
                                        <td><input type="text" name="txtCW1" size="12%"/></td>
                                        <td><input type="text" name="txtCW2"size="12%"/></td>
                                        <td><input type="text" name="txtCW3"size="12%"/></td>
                                        <td><input type="text" name="txtCW4"size="12%"/></td>
                                        <td><input type="text" name="txtExamSD2"size="12%"/></td>
                                        <td><input type="text" name="txtOverallSD2"size="12%"/></td>
                                    </tr>
                                    <tr>
                                        <td>Standard Deviation</td>
                                        <td><input type="text" name="txtCW1" size="12%"/></td>
                                        <td><input type="text" name="txtCW1"size="12%"/></td>
                                        <td><input type="text" name="txtCW1"size="12%"/></td>
                                        <td><input type="text" name="txtCW1"size="12%"/></td>
                                        <td><input type="text" name="txtExamSD3"size="12%"/></td>
                                        <td><input type="text" name="txtOverallSD3"size="12%"/></td>
                                    </tr>

                                </table>
                                <br>
                                <table border="1">
                                    <tr>
                                        <td colspan="11"><h3>Grade Distribution Data</h3></td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td>0-9</td>
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
                                        <td><input type="text" name="txtQuant1" size="7%"/></td>
                                        <td><input type="text" name="txtQuant2"size="7%"/></td>
                                        <td><input type="text" name="txtQuant3"size="7%"/></td>
                                        <td><input type="text" name="txtQuant4"size="7%"/></td>
                                        <td><input type="text" name="txtQuant5"size="7%"/></td>
                                        <td><input type="text" name="txtQuant6"size="7%"/></td>
                                        <td><input type="text" name="txtQuant7"size="7%"/></td>
                                        <td><input type="text" name="txtQuant8"size="7%"/></td>
                                        <td><input type="text" name="txtQuant9"size="7%"/></td>
                                        <td><input type="text" name="txtQuant10"size="7%"/></td>
                                    </tr>
                                    <tr>
                                        <td>CW2</td>
                                        <td><input type="text" name="txtQuant1" size="7%"/></td>
                                        <td><input type="text" name="txtQuant2"size="7%"/></td>
                                        <td><input type="text" name="txtQuant3"size="7%"/></td>
                                        <td><input type="text" name="txtQuant4"size="7%"/></td>
                                        <td><input type="text" name="txtQuant5"size="7%"/></td>
                                        <td><input type="text" name="txtQuant6"size="7%"/></td>
                                        <td><input type="text" name="txtQuant7"size="7%"/></td>
                                        <td><input type="text" name="txtQuant8"size="7%"/></td>
                                        <td><input type="text" name="txtQuant9"size="7%"/></td>
                                        <td><input type="text" name="txtQuant10"size="7%"/></td>
                                    </tr>
                                    <tr>
                                        <td>CW3</td>
                                       <td><input type="text" name="txtQuant1" size="7%"/></td>
                                        <td><input type="text" name="txtQuant2"size="7%"/></td>
                                        <td><input type="text" name="txtQuant3"size="7%"/></td>
                                        <td><input type="text" name="txtQuant4"size="7%"/></td>
                                        <td><input type="text" name="txtQuant5"size="7%"/></td>
                                        <td><input type="text" name="txtQuant6"size="7%"/></td>
                                        <td><input type="text" name="txtQuant7"size="7%"/></td>
                                        <td><input type="text" name="txtQuant8"size="7%"/></td>
                                        <td><input type="text" name="txtQuant9"size="7%"/></td>
                                        <td><input type="text" name="txtQuant10"size="7%"/></td>
                                    </tr>
                                    <tr>
                                        <td>CW4</td>
                                        <td><input type="text" name="txtQuant1" size="7%"/></td>
                                        <td><input type="text" name="txtQuant2"size="7%"/></td>
                                        <td><input type="text" name="txtQuant3"size="7%"/></td>
                                        <td><input type="text" name="txtQuant4"size="7%"/></td>
                                        <td><input type="text" name="txtQuant5"size="7%"/></td>
                                        <td><input type="text" name="txtQuant6"size="7%"/></td>
                                        <td><input type="text" name="txtQuant7"size="7%"/></td>
                                        <td><input type="text" name="txtQuant8"size="7%"/></td>
                                        <td><input type="text" name="txtQuant9"size="7%"/></td>
                                        <td><input type="text" name="txtQuant10"size="7%"/></td>
                                    </tr>
                                    <tr>
                                        <td>EX</td>
                                        <td><input type="text" name="txtQuant1" size="7%"/></td>
                                        <td><input type="text" name="txtQuant2"size="7%"/></td>
                                        <td><input type="text" name="txtQuant3"size="7%"/></td>
                                        <td><input type="text" name="txtQuant4"size="7%"/></td>
                                        <td><input type="text" name="txtQuant5"size="7%"/></td>
                                        <td><input type="text" name="txtQuant6"size="7%"/></td>
                                        <td><input type="text" name="txtQuant7"size="7%"/></td>
                                        <td><input type="text" name="txtQuant8"size="7%"/></td>
                                        <td><input type="text" name="txtQuant9"size="7%"/></td>
                                        <td><input type="text" name="txtExamDD"size="7%"/></td>
                                    </tr>
                                    <tr>
                                        <td>OVERALL</td>
                                        <td><input type="text" name="txtQuant1" size="7%"/></td>
                                        <td><input type="text" name="txtQuant2"size="7%"/></td>
                                        <td><input type="text" name="txtQuant3"size="7%"/></td>
                                        <td><input type="text" name="txtQuant4"size="7%"/></td>
                                        <td><input type="text" name="txtQuant5"size="7%"/></td>
                                        <td><input type="text" name="txtQuant6"size="7%"/></td>
                                        <td><input type="text" name="txtQuant7"size="7%"/></td>
                                        <td><input type="text" name="txtQuant8"size="7%"/></td>
                                        <td><input type="text" name="txtQuant9"size="7%"/></td>
                                        <td><input type="text" name="txtOverAllDD"size="7%"/></td>
                                    </tr>
                                </table>
                                <br>
                                <table border="1" style="width: 80%">
                                    <tr>
                                        <td style="background-color: #9acfea;">
                                            <p><h3>General comments</h3></p>
                                            <p>When you complete this section, at a minimum, you should address the following:</p>

                                            <p> 1.	The overview of the Course Leader (to include; comments on available statistics, the range of marks, assessment diet and any issues affecting the delivery of the course this year).</p>
                                            <p> 2.	Student Evaluation and Feedback.</p>
                                            <p>  3.	Comments of the External Examiner.</p>
                                            <p>4.	A review of the previous year’s action plan.</p>

                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="text" name="txtComment" size="100%"/>
                                        </td>
                                    </tr>
                                </table>
                                <br>
                                <table border="1" style="width: 80%">
                                    <tr>
                                        <td style="background-color: #9acfea;">
                                            <p><h3>Action to be taken</h3></p>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td>
                                            <input type="text" name="txtAction" size="100%"/>
                                        </td>
                                    </tr>
                                </table>
                                <table>
                                    <tr>
                                        <td><input type="reset" value="Clear"/></td>
                                        <td>
                                            <input type="submit" value="Addnew"/>
                                        </td>
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

