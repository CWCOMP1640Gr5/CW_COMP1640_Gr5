package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class introduction_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("        <!--<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">-->\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"ico/favicon.png\">\r\n");
      out.write("        <title>COURSE MONITOR GROUP 5</title>\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"./templates/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Custom styles for this template -->\r\n");
      out.write("        <link href=\"./templates/css/StyleSheet.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <!-- Just for debugging purposes. Don't actually copy this line! -->\r\n");
      out.write("        <!--[if lt IE 9]><script src=\"js/ie8-responsive-file-warning.js\"></script><![endif]-->\r\n");
      out.write("        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\r\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <div class=\"top-bar\" style=\"background-color: #5bc0de   \">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <div class=\"pull-left\">\r\n");
      out.write("                                <div class=\"input-group pull-right\">              \r\n");
      out.write("                                    <input type=\"text\" class=\"form-control\" placeholder=\"Search course here\">\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\"><i class=\"glyphicon glyphicon-search\"></i></button>\r\n");
      out.write("                                </span>\r\n");
      out.write("                                </div>\r\n");
      out.write("                               \r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"input-group pull-left\">                                    \r\n");
      out.write("                                    <img style=\"height:38%;width: 38% \" src=\"templates/img/logo.jpg\" alt=\"\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            <div class=\"pull-right\">\r\n");
      out.write("                                \r\n");
      out.write("                                <ul class=\"list-unstyled top-links\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </ul>\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--end .top-bar-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"main-header\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-md-4\"> <a href=\"LoadHome\"><img src=\"./templates/img/logo.jpg\" /></a>  \r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-md-4 \">\r\n");
      out.write("                            <div class=\"banner text-center\">\r\n");
      out.write("                                <a href=\"LoadHome\"><img src=\"./templates/img/PRADOTEC_LOGO-Copy-185x45.jpg\" alt=\"Banner\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-lg-4  search-w\">\r\n");
      out.write("                            <div class=\"input-group pull-right\">\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search course here\">\r\n");
      out.write("                                <span class=\"input-group-btn\">\r\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\"><i class=\"glyphicon glyphicon-search\"></i></button>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>                                                              \t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--end .header-header-->\r\n");
      out.write("\r\n");
      out.write("            <div class=\"main-nav\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\" style=\"text-align:center\">\r\n");
      out.write("                        <ul class=\"nav nav-pills\">\r\n");
      out.write("                            <li class=\"active\">\r\n");
      out.write("                                <a href=\"LoadHome\"><i class=\"glyphicon glyphicon-home\"></i> Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li><a href=\"ListPrograming\">Programing</a></li>\r\n");
      out.write("                            <li><a href=\"ListAllAppCMR\">News</a></li>\r\n");
      out.write("                            <li><a href=\"aboutUs.jsp\">About Us</a></li>\r\n");
      out.write("                            <li><a href=\"ListReport\">Report</a></li>\r\n");
      out.write("                            <li><a href=\"feedBack.jsp\">Feed Back</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--end .main-nav-->\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <section class=\"content\">\r\n");
      out.write("            <div class=\"container\">                \r\n");
      out.write("                <div class=\"col-sm-12\">\r\n");
      out.write("                    \r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("                <div class=\"panel panel-default\">\r\n");
      out.write("                    <div class=\"panel-heading\">\r\n");
      out.write("                        <h3 class=\"panel-title\">Introduction</h3>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"panel-body\">\r\n");
      out.write("                        FPT University is the leading university in Information and Communication Technology training in Vietnam. As a member of FPT Corporation, the largest ICT Corporation in Vietnam (http://www.fpt.com.vn/en/) with global branches in many countries, FPT University has maintained the outstanding curriculum with high practicality including on-the-job training component and state-of-the-art facilities. The employment rate is 96 - 98% within 3 months after graduation.\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"about\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3 about-w\">\r\n");
      out.write("                        <div class=\"form-about\">\r\n");
      out.write("                            <h3>About Website</h3>\r\n");
      out.write("                            <a href=\"feedBack.html\" class=\"btn btn-default\">Contact us</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-9 shop-about\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p>\r\n");
      out.write("                            This about text can be edited from theme admin panel! \r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div><!--end .about-->\r\n");
      out.write("        </div><!--end .container-->\r\n");
      out.write("    </section><!--end .content-->\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"footer-custom\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            <h3>About us</h3>\r\n");
      out.write("                            <div class=\"line\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <p>\r\n");
      out.write("                                This is a CMS block edited from admin panel. You can insert any content here. \r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente\r\n");
      out.write("                            </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-3 contact-us\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            <h3>Contact Us</h3>\r\n");
      out.write("                            <div class=\"line\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"glyphicon glyphicon-map-marker\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"info\">\r\n");
      out.write("                                    So 8, Ton That Thuyet,My Dinh,Ha Noi\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"glyphicon glyphicon-phone-alt\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"info\">\r\n");
      out.write("                                    +84 1425 4587\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"glyphicon glyphicon-envelope\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"info\">\r\n");
      out.write("                                    <a href=\"#\"> fpteducation@fpt.edu.vn </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"item\">\r\n");
      out.write("                                <div class=\"icon\">\r\n");
      out.write("                                    <i class=\"glyphicon glyphicon-user\"></i>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"info\">\r\n");
      out.write("                                    <a href=\"#\">Admin</a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            <h3>Twitter</h3>\r\n");
      out.write("                            <div class=\"line\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("                            <div class=\"tweet-content\">\r\n");
      out.write("                                At refreshed \r\n");
      out.write("                                <a target=\"_blank\" href=\"#\"></a>, personalize your profile w/ accent color: \r\n");
      out.write("                                <a target=\"_blank\" href=\"#\"></a> design. \r\n");
      out.write("                                <a target=\"_blank\" href=\"#\"></a> \r\n");
      out.write("                                <span class=\"time\">\r\n");
      out.write("                                    <a target=\"_blank\" title=\"\" href=\"#\"> about 2 days ago</a>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <div class=\"title\">\r\n");
      out.write("                            <h3>AnyThing</h3>\r\n");
      out.write("                            <div class=\"line\"></div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"footer-copyright\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <p>&copy; 2016 | Design by Group 5</p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer><!--end .footer-->\r\n");
      out.write("    <script src=\"http://code.jquery.com/jquery-2.0.3.min.js\"></script>\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"js/main.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
        out.write("\r\n");
        out.write("                                        <li><h4 style=\"color: red\"> Hello, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.user}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4></li>\r\n");
        out.write("                                        <li><h4><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.linkpages}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Control Pages</a></h4></li>\r\n");
        out.write("                                        <li><h4><a href=\"introduction.jsp\">Introduction</a></h4></li>\r\n");
        out.write("                                        <li><h4><a href=\"LogoutProcess\">Sign out</a></h4></li>\r\n");
        out.write("                                    ");
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
        out.write("\r\n");
        out.write("                                        <li><h4><a href=\"ListCourse\">List Course</a></h4></li>\r\n");
        out.write("                                        <li><h4><a href=\"introduction.jsp\">Introduction</a></h4></li>\r\n");
        out.write("                                        <li><h4><a href=\"login.jsp\">Sign in</a></h4></li>\r\n");
        out.write("                                    ");
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
