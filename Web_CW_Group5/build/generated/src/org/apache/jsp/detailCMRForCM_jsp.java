package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detailCMRForCM_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"ico/favicon.png\">\n");
      out.write("        <title>COURSE MONITOR GROUP 5</title>\n");
      out.write("        <!-- Bootstrap core CSS -->\n");
      out.write("        <link href=\"./templates/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Custom styles for this template -->\n");
      out.write("        <link href=\"./templates/css/StyleSheet.css\" rel=\"stylesheet\" />\n");
      out.write("        <!-- Just for debugging purposes. Don't actually copy this line! -->\n");
      out.write("        <!--[if lt IE 9]><script src=\"js/ie8-responsive-file-warning.js\"></script><![endif]-->\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"top-bar\" style=\"background-color: #5bc0de   \">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <div class=\"pull-left\">\n");
      out.write("                                <div class=\"input-group pull-right\">              \n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search course here\">\n");
      out.write("                                    <span class=\"input-group-btn\">\n");
      out.write("                                        <button class=\"btn btn-default\" type=\"button\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("                                    </span>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"input-group pull-left\">                                    \n");
      out.write("                                <img style=\"height:38%;width: 38% \" src=\"templates/img/logo.jpg\" alt=\"\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"pull-right\">\n");
      out.write("\n");
      out.write("                                <ul class=\"list-unstyled top-links\">\n");
      out.write("\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </ul>\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end .top-bar-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"main-nav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\" style=\"text-align:center\">\n");
      out.write("                        <ul class=\"nav nav-pills\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"homePageForCM.jsp\"><i class=\"glyphicon glyphicon-home\"></i> Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"listCMRForCM\">View Course Monitoring Reports</a></li>\n");
      out.write("                            <li><a href=\"profileForCM.html\">Profile</a></li>\n");
      out.write("                            <li><a href=\"approveCMR.html\">Approve Course Monitoring Reports</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end .main-nav-->\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"content\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"new-lists\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <h3 class=\"box-title\" style=\"background-color:#2aabd2; text-align:center\">Welcome to Course Monitor</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <br>\n");
      out.write("                        \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div><!--end .container-->\n");
      out.write("                </div>\n");
      out.write("            <center>\n");
      out.write("                <table border=\"1\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"2\" style=\"text-align: center\"><h1>COURSE MONITORING REPORT</h1></td>\n");
      out.write("                                        <td></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Academic Session</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"number\" name=\"academicsession\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.createCMR.courseWorkId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Course Code</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"text\" name=\"coursecode\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.createCMR.courseId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Title</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.createCMR.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"title\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Year</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.createCMR.yearMaking}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"yearmarking\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Semester</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.createCMR.semester}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"semester\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Date Create</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.createCMR.createDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"createdate\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    ");

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
                                    
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Course Leader:</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"courseleader\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Student count</td>\n");
      out.write("                                        <td>\n");
      out.write("                                            <input readonly=\"true\" type=\"number\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.createCMR.studentCount}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" name=\"studentcounnt\" />\n");
      out.write("                                        </td>\n");
      out.write("                                    </tr>                                   \n");
      out.write("                                </table>\n");
      out.write("                                <br/>\n");
      out.write("                                <table class=\"table\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"7\" style=\"text-align: center\"><h1>Statistical Data</h1></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td>CW1</td>\n");
      out.write("                                        <td>CW2</td>\n");
      out.write("                                        <td>CW3</td>\n");
      out.write("                                        <td>CW4</td>\n");
      out.write("                                        <td>EXAM</td>\n");
      out.write("                                        <td>OVERALL</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Mean</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw1r1\" id=\"r1\" class=\"r1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw2r1\" id=\"r1\" class=\"r1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw3r1\" id=\"r1\" class=\"r1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw4r1\" id=\"r1\" class=\"r1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"examr1\" id=\"r1\" class=\"r1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"overr1\" id=\"over1\" readonly class=\"over1\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Median</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw1r2\" class=\"r2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw2r2\" class=\"r2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw3r2\" class=\"r2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw4r2\" class=\"r2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"examr2\" class=\"r2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"overr2\" readonly class=\"over2\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>Standard Deviation</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw1r3\" class=\"r3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw2r3\" class=\"r3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw3r3\" class=\"r3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"cw4r3\" class=\"r3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"examr3\" class=\"r3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"overr3\" readonly class=\"over3\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                                <br/>\n");
      out.write("\n");
      out.write("                                <table class=\"table\" style=\"width: 50%\">\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td colspan=\"11\" style=\"text-align: center\"><h1>Grade Distribution Data</h1></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td></td>\n");
      out.write("                                        <td>0–9</td>\n");
      out.write("                                        <td>10-19</td>\n");
      out.write("                                        <td>20-29</td>\n");
      out.write("                                        <td>30-39</td>\n");
      out.write("                                        <td>40-49</td>\n");
      out.write("                                        <td>50-59</td>\n");
      out.write("                                        <td>60-69</td>\n");
      out.write("                                        <td>70-79</td>\n");
      out.write("                                        <td>80-89</td>\n");
      out.write("                                        <td>90+</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>CW1</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c1\" class=\"c1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c2\" class=\"c2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c3\" class=\"c3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c4\" class=\"c4\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c5\" class=\"c5\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c6\" class=\"c6\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c7\" class=\"c7\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c8\" class=\"c8\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c9\" class=\"c9\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r1c10\" class=\"c10\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>CW2</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c1\" class=\"c1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c2\" class=\"c2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c3\" class=\"c3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c4\" class=\"c4\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c5\" class=\"c5\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c6\" class=\"c6\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c7\" class=\"c7\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c8\" class=\"c8\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c9\" class=\"c9\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r2c10\" class=\"c10\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>CW3</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c1\" class=\"c1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c2\" class=\"c2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c3\" class=\"c3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c4\" class=\"c4\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c5\" class=\"c5\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c6\" class=\"c6\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c7\" class=\"c7\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c8\" class=\"c8\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c9\" class=\"c9\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r3c10\" class=\"c10\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>CW4</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c1\" class=\"c1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c2\" class=\"c2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c3\" class=\"c3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c4\" class=\"c4\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c5\" class=\"c5\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c6\" class=\"c6\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c7\" class=\"c7\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c8\" class=\"c8\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c9\" class=\"c9\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r4c10\" class=\"c10\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>EX</td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c1\" class=\"c1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c2\" class=\"c2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c3\" class=\"c3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c4\" class=\"c4\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c5\" class=\"c5\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c6\" class=\"c6\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c7\" class=\"c7\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c8\" class=\"c8\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c9\" class=\"c9\" /></td>\n");
      out.write("                                        <td><input type=\"number\" name=\"r5c10\" class=\"c10\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td>OVERALL</td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c1\" class=\"gddov1\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c2\" class=\"gddov2\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c3\" class=\"gddov3\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c4\" class=\"gddov4\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c5\" class=\"gddov5\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly  name=\"r6c6\" class=\"gddov6\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c7\" class=\"gddov7\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c8\" class=\"gddov8\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c9\" class=\"gddov9\" /></td>\n");
      out.write("                                        <td><input type=\"number\" readonly name=\"r6c10\" class=\"gddov10\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("                                <br/>\n");
      out.write("                                <br/>\n");
      out.write("                                <table>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <td><input value=\"CREATE\" type=\"submit\" /></td>\n");
      out.write("                                        <td><input value=\"RESET\" type=\"reset\" /> </td>\n");
      out.write("                                        <td><input value=\"CANCEL\" onclick=\"window.location = 'viewCMR.jsp';\" type=\"button\" /></td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </table>\n");
      out.write("            </center>\n");
      out.write("            \n");
      out.write("        </section><!--end .content-->\n");
      out.write("\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <div class=\"footer-custom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"title\">\n");
      out.write("                                <h3>About us</h3>\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <p>\n");
      out.write("                                    This is a CMS block edited from admin panel. You can insert any content here. \n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente\n");
      out.write("                                </p>\n");
      out.write("                                <p>\n");
      out.write("                                    nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-3 contact-us\">\n");
      out.write("                            <div class=\"title\">\n");
      out.write("                                <h3>Contact Us</h3>\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"glyphicon glyphicon-map-marker\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"info\">\n");
      out.write("                                        So 8, Ton That Thuyet,My Dinh,Ha Noi\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"glyphicon glyphicon-phone-alt\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"info\">\n");
      out.write("                                        +84 1425 4587\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"glyphicon glyphicon-envelope\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"info\">\n");
      out.write("                                        <a href=\"#\"> fpteducation@fpt.edu.vn </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <div class=\"icon\">\n");
      out.write("                                        <i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"info\">\n");
      out.write("                                        <a href=\"#\">Admin</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"title\">\n");
      out.write("                                <h3>Twitter</h3>\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("                                <div class=\"tweet-content\">\n");
      out.write("                                    At refreshed \n");
      out.write("                                    <a target=\"_blank\" href=\"#</a>, personalize your profile w/ accent color: \n");
      out.write("                                       <a target=\"_blank\" href=\"#</a> design. \n");
      out.write("                                    <a target=\"_blank\" href=\"#</a> \n");
      out.write("                                       <span class=\"time\">\n");
      out.write("                                       <a target=\"_blank\" title=\"\" href=\"#\"> about 2 days ago</a>\n");
      out.write("                                        </span>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-3\">\n");
      out.write("                            <div class=\"title\">\n");
      out.write("                                <h3>AnyThing</h3>\n");
      out.write("                                <div class=\"line\"></div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"content\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <p>&copy; 2016 | Design by Group 5</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer><!--end .footer-->\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty sessionScope.user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li><h4 style=\"color: red\"> Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4></li>\n");
        out.write("                                        <li><h4><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.linkpages}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Control Pages</a></h4></li>\n");
        out.write("                                        <li><h4><a href=\"introduction.jsp\">Introduction</a></h4></li>\n");
        out.write("                                        <li><h4><a href=\"LogoutProcess\">Sign out</a></h4></li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionScope.user}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <li><h4><a href=\"ListCourse\">List Course</a></h4></li>\n");
        out.write("                                        <li><h4><a href=\"introduction.jsp\">Introduction</a></h4></li>\n");
        out.write("                                        <li><h4><a href=\"login.jsp\">Sign in</a></h4></li>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
