package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"icon\" href=\"../../favicon.ico\">\n");
      out.write("\n");
      out.write("        <title>Dashboard Template for Bootstrap</title>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"templates/css/StyleSheet.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"templates/css/bootstrap-theme.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"templates/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"templates/css/dashboard.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                        <span class=\"icon-bar\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Admin Manager</a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("\n");
      out.write("                    <form class=\"navbar-form navbar-right\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3 col-md-2 sidebar\">\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Account <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"addAccount.jsp\">Add Account</a></li>\n");
      out.write("                        <li><a href=\"LoadHomeAdmin\">List Account</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Courser Work <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"ListCourseWorkAdmin\">List Course Work</a></li>\n");
      out.write("                        <li><a href=\"PreAddCourseWork\">Add New Course Work</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Courser <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"ListCourseAdmin\">List Course</a></li>\n");
      out.write("                        <li><a href=\"addNewCourse.jsp\">Add New Course</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Department <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"ListDepartmentAdmin\">List Department</a></li>\n");
      out.write("                        <li><a href=\"addNewDepartment\">Add New Department</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"#\">FeedBack <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"ListFeedBack\">List Account</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                    <ul class=\"nav nav-sidebar\">\n");
      out.write("\n");
      out.write("                        <li class=\"active\"><a href=\"#\">News <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"addNews.jsp\">Add News</a></li>\n");
      out.write("                        <li><a href=\"ListNews\">List News</a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main\">\n");
      out.write("                    <h1 class=\"page-header\">Dashboard</h1>\n");
      out.write("\n");
      out.write("                    <div class=\"row placeholders\">\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                            <img style=\"background-color: red\" src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                            <h4>Label</h4>\n");
      out.write("                            <span class=\"text-muted\">Something else</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                            <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                            <h4>Label</h4>\n");
      out.write("                            <span class=\"text-muted\">Something else</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                            <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                            <h4>Label</h4>\n");
      out.write("                            <span class=\"text-muted\">Something else</span>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                            <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                            <h4>Label</h4>\n");
      out.write("                            <span class=\"text-muted\">Something else</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <h2 class=\"sub-header\">Add New Account</h2>\n");
      out.write("                    <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.insertStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("\n");
      out.write("                        <form action=\"AddNewAccount\">\n");
      out.write("                            <table border=\"1\">                            \n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b><span class=\"input-group-addon\" id=\"basic-addon1\">First Name</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input required=\"required\" type=\"text\" name=\"txtFirstName\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b><span class=\"input-group-addon\" id=\"basic-addon1\">Last Name</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input required=\"required\" type=\"text\" name=\"txtLastName\"class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b><span class=\"input-group-addon\" id=\"basic-addon1\">Address</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input required=\"required\" type=\"text\" name=\"txtAddress\"  class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b> <span class=\"input-group-addon\" id=\"basic-addon1\">Department</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select name=\"sldepartment\">                                           \n");
      out.write("                                            <option value=\"1\" selected=\"selected\">Software Engineering</option>\n");
      out.write("                                            <option value=\"2\">Communications And Computer Networks</option>\n");
      out.write("                                            <option value=\"3\">Computer Science</option>\n");
      out.write("                                            <option value=\"4\">Computer Engineering</option>\n");
      out.write("                                            <option value=\"5\">Information Systems</option>\n");
      out.write("                                            <option value=\"6\">Graphics</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b> <span class=\"input-group-addon\" id=\"basic-addon1\">StaffPossition</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <select name=\"slstaff\">                                            \n");
      out.write("                                            <option value=\"1\" selected=\"selected\">Course Leader</option>\n");
      out.write("                                            <option value=\"2\">Course Moderator</option>\n");
      out.write("                                            <option value=\"3\">Pro-Vice Chancellor</option>\n");
      out.write("                                            <option value=\"4\">Director of Learning and Quality</option>\n");
      out.write("                                            <option value=\"5\">Admin</option>\n");
      out.write("                                            <option value=\"6\">Teacher</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b><span class=\"input-group-addon\" id=\"basic-addon1\">Phone</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input required=\"required\" type=\"number\" name=\"txtPhone\" maxlength=\"11\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b><span class=\"input-group-addon\" id=\"basic-addon1\">UserName</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input required=\"required\" type=\"text\" name=\"txtuserName\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("                                        <span style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.userNameErr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b><span class=\"input-group-addon\" id=\"basic-addon1\">Password</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("                                        <input required=\"required\" type=\"password\" name=\"txtPass\" class=\"form-control\" aria-describedby=\"basic-addon1\">\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td><b><span class=\"input-group-addon\" id=\"basic-addon1\">Permission</span></b></td>\n");
      out.write("                                    <td>\n");
      out.write("\n");
      out.write("                                        <select name=\"permission\">                                           \n");
      out.write("                                            <option value=\"CL\" selected=\"selected\">Course Leader</option>\n");
      out.write("                                            <option value=\"CM\">Course Moderator</option>\n");
      out.write("                                            <option value=\"PVC\">Pro-Vice Chancellor</option>\n");
      out.write("                                            <option value=\"DTL\">Director of Learning and Quality</option>\n");
      out.write("                                            <option value=\"ADM\">Admin</option>\n");
      out.write("                                            <option value=\"GU\">Teacher</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td></td>\n");
      out.write("                                    <td >\n");
      out.write("                                        <input type=\"submit\" value=\"Add New\"/>\n");
      out.write("                                        <input type=\"reset\" value=\"Reset\"/>\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                            </table>\n");
      out.write("                        </form>\n");
      out.write("                        <a href=\"LoadHomeAdmin\">BACK</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core JavaScript\n");
      out.write("        ================================================== -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}