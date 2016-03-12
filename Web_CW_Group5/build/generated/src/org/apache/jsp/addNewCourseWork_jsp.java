package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addNewCourseWork_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("                     <ul class=\"nav nav-sidebar\">\n");
      out.write("                        <li class=\"active\"><a href=\"#\">Courser Work <span class=\"sr-only\">(current)</span></a></li>\n");
      out.write("                        <li><a href=\"ListCourseWorkAdmin\">List Course Work</a></li>\n");
      out.write("                        <li><a href=\"PreAddCourseWork\">Add New Course Work</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                     <ul class=\"nav nav-sidebar\">\n");
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
      out.write("                        <div class=\"col-xs-6 col-sm-3 placeholder\">\n");
      out.write("                            <img src=\"data:image/gif;base64,R0lGODlhAQABAIAAAHd3dwAAACH5BAAAAAAALAAAAAABAAEAAAICRAEAOw==\" width=\"200\" height=\"200\" class=\"img-responsive\" alt=\"Generic placeholder thumbnail\">\n");
      out.write("                            <h4>Label</h4>\n");
      out.write("                            <span class=\"text-muted\">Something else</span>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <h2 class=\"sub-header\">Add Course Work</h2>\n");
      out.write("                    <h1 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.deleteStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                    <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.updateStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                    <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.insertStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("                    <div class=\"table-responsive\">\n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <h1>INSERT NEW COURSE</h1>\n");
      out.write("                            <h3 style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.insertStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\n");
      out.write("\n");
      out.write("                            <form action=\"AddCourseWork\">\n");
      out.write("                                <table border=\"1\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Course:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            \n");
      out.write("                                            <select name=\"courseId\">\n");
      out.write("                                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Department:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"department\">                                                   \n");
      out.write("                                                <option value=\"1\" selected=\"selected\">Software Engineering</option>\n");
      out.write("                                                <option value=\"2\">Communications And Computer Networks</option>\n");
      out.write("                                                <option value=\"3\">Computer Science</option>\n");
      out.write("                                                <option value=\"4\">Computer Engineering</option>\n");
      out.write("                                                <option value=\"5\">Information Systems</option>\n");
      out.write("                                                <option value=\"6\">Graphics</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Course Leader:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input required=\"required\" type=\"text\" name=\"courseLeader\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.courseLeader}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Courser Moderator:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input required=\"required\" type=\"text\" name=\"courserModerator\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.courserModerator}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Start Date:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"text\" name=\"createDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.createDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            <span style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.dateErr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Year Making:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"number\" name=\"yearmaking\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.yearmaking}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            <span style=\"color: red\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.yearErr}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Semeter:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input required=\"required\" type=\"number\" name=\"semester\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.semester}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Student Count:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input required=\"required\" type=\"number\" name=\"studentCount\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.studentCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Courser Unit:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input required=\"required\" type=\"number\" name=\"courserUnits\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.courserUnits}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                                            \n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><b>Courser Duration:</b></td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <select name=\"costUnit\">                                                   \n");
      out.write("                                                <option value=\"hours\" selected=\"selected\">Hours</option>\n");
      out.write("                                                <option value=\"months\">Months</option>\n");
      out.write("                                                <option value=\"years\">Years</option>\n");
      out.write("                                                <option value=\"weeks\">Weeks</option>\n");
      out.write("                                            </select>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>\n");
      out.write("                                            <a href=\"LoadHomeAdmin\">Home</a>\n");
      out.write("                                        </td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input type=\"submit\" value=\"Insert\"/>\n");
      out.write("                                            <input type=\"reset\" value=\"Reset\"/>\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                            </form>                     \n");
      out.write("                        </center>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.Course}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("co");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${co.courseId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${co.courseId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${co.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
