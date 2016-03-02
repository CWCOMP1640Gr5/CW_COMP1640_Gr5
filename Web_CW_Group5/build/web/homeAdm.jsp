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

          </ul>
  
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">Dashboard</h1>

          <div class="row placeholders">
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
            <div class="col-xs-6 col-sm-3 placeholder">
              <img src="data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==" width="200" height="200" class="img-responsive" alt="Generic placeholder thumbnail">
              <h4>Label</h4>
              <span class="text-muted">Something else</span>
            </div>
          </div>

          <h2 class="sub-header">List Account</h2>
          <h1 style="color: red">${requestScope.deleteStatus}</h1>
          <div class="table-responsive">
            <table  class="table table-striped" border="1">
              <thead>
                <tr>
                  <th>ID</th>
                  <th>FirstName</th>
                  <th>LastName</th>
                  <th>Address</th>
                  <th>Phone</th>
                  <th>UserName</th>
                  <th>Permission</th>
                  <th colspan="2">Action</th>
                </tr>
              </thead>
              
                  <c:forEach items="${requestScope.listAccount}" var="ac">
                <tr>
                  <td>${ac.accountId}</td>
                  <td>${ac.firtsName}</td>
                  <td>${ac.lastName}</td>
                  <td>${ac.address}</td>
                  <td>${ac.phone}</td>
                  <td>${ac.userName}</td>
                  <td>${ac.permission}</td>
                  <td colspan="2"><a href="DetailAccount?accountId=${ac.accountId}">View</a>  |  <a href="PreUpdateAccount?accountId=${ac.accountId}">Update</a>| <a onclick="return confirm('Are you sure want to delete Account :')" href="DeleteAccount?accountId=${ac.accountId}">Delete</a></td>
                </tr>
                </c:forEach>
              
            </table>
          </div>
        </div>
      </div>
    </div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
   
  </body>
</html>
