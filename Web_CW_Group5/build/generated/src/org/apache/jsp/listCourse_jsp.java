package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"\">\n");
      out.write("        <!--<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">-->\n");
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
      out.write("            <div class=\"top-bar\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <div class=\"pull-left\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"pull-right\">\n");
      out.write("                                <ul class=\"list-unstyled top-links\">\n");
      out.write("\n");
      out.write("                                    <li><h4><a href=\"ListCourse\">List Course</a></h4></li>\n");
      out.write("                                    <li><h4><a href=\"introduction.jsp\">Introduction</a></h4></li>\n");
      out.write("                                    <li><h4><a href=\"login.jsp\">Sign in</a></h4></li>\n");
      out.write("\n");
      out.write("                                </ul>\t\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end .top-bar-->\n");
      out.write("\n");
      out.write("            <div class=\"main-header\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4\"> <a href=\"LoadHome\"><img src=\"./templates/img/logo.jpg\" /></a>  \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 \">\n");
      out.write("                            <div class=\"banner text-center\">\n");
      out.write("                                <a href=\"LoadHome\"><img src=\"./templates/img/PRADOTEC_LOGO-Copy-185x45.jpg\" alt=\"Banner\" /></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-4  search-w\">\n");
      out.write("                            <div class=\"input-group pull-right\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" placeholder=\"Search course here\">\n");
      out.write("                                <span class=\"input-group-btn\">\n");
      out.write("                                    <button class=\"btn btn-default\" type=\"button\"><i class=\"glyphicon glyphicon-search\"></i></button>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>                                                              \t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div><!--end .header-header-->\n");
      out.write("\n");
      out.write("            <div class=\"main-nav\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\" style=\"text-align:center\">\n");
      out.write("                        <ul class=\"nav nav-pills\">\n");
      out.write("                            <li class=\"active\">\n");
      out.write("                                <a href=\"LoadHome\"><i class=\"glyphicon glyphicon-home\"></i> Home</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li><a href=\"ListPrograming\">Programing</a></li>\n");
      out.write("                            <li><a href=\"ListAllAppCMR\">News</a></li>\n");
      out.write("                            <li><a href=\"aboutUs.jsp\">About Us</a></li>\n");
      out.write("                            <li><a href=\"ListReport\">Report</a></li>\n");
      out.write("                            <li><a href=\"feedBack.jsp\">Feed Back</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div><!--end .main-nav-->\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"content\">\n");
      out.write("            <div class=\"container\">                \n");
      out.write("                <div class=\"col-sm-12\">\n");
      out.write("                    <h3 style=\"background-color:red; text-align:center\">List Course</h3>\n");
      out.write("                </div>\n");
      out.write("                .\n");
      out.write("                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <br />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"about\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-3 about-w\">\n");
      out.write("                            <div class=\"form-about\">\n");
      out.write("                                <h3>About Website</h3>\n");
      out.write("                                <a href=\"feedBack.html\" class=\"btn btn-default\">Contact us</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-9 shop-about\">\n");
      out.write("                            <p>\n");
      out.write("                                nonummy laoreet phasellent penatoque in antesque pellus elis eget tincidunt. Nequatdui laorem justo a non tellus laoreet tincidunt ut vel velit. Idenim semper pellente\n");
      out.write("                            </p>\n");
      out.write("                            <p>\n");
      out.write("                                This about text can be edited from theme admin panel! \n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div><!--end .about-->\n");
      out.write("            </div><!--end .container-->\n");
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
      out.write("                                    <a target=\"_blank\" href=\"#\"></a>, personalize your profile w/ accent color: \n");
      out.write("                                    <a target=\"_blank\" href=\"#\"></a> design. \n");
      out.write("                                    <a target=\"_blank\" href=\"#\"></a> \n");
      out.write("                                    <span class=\"time\">\n");
      out.write("                                        <a target=\"_blank\" title=\"\" href=\"#\"> about 2 days ago</a>\n");
      out.write("                                    </span>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listCou}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("cou");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div class=\"new-lists\">\n");
          out.write("                        <div class=\"row\">                     \n");
          out.write("\n");
          out.write("                            <div class=\"list-group\">\n");
          out.write("                                <a href=\"DetailCourse?courseId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cou.courseId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"list-group-item active\">\n");
          out.write("                                    <h4 class=\"list-group-item-heading\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cou.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" - ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cou.courseId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                    <p class=\"list-group-item-text\">Course Leader: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cou.courseLeader}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <p class=\"list-group-item-text\">Course Moderator: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cou.courserModerator}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                    <p class=\"list-group-item-text\"> SEM: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${cou.semester}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                </a>\n");
          out.write("                            </div>\n");
          out.write("\n");
          out.write("\n");
          out.write("                        </div>\n");
          out.write("                    ");
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
