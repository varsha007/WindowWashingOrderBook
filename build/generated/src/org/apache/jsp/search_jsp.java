package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/bootstrap-responsive.css\" rel=\"stylesheet\"> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("        <script src=\"js/jquery-1.10.0.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script rel=\"text/javascript\">\n");
      out.write("           \n");
      out.write("            $(function(){\n");
      out.write("       \n");
      out.write("                $(' #Add_new_contact').click(function(e){  \n");
      out.write("                    e.preventDefault();\n");
      out.write("                    $('#form2').hide();\n");
      out.write("                    $('#form3').show(); \n");
      out.write("                });\n");
      out.write("                 \n");
      out.write("            });\n");
      out.write("          \n");
      out.write("        </script>\n");
      out.write("        <title>Search Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image:none;\">\n");
      out.write("        <div class=\"navbar navbar-fixed-top\">  \n");
      out.write("            <div class=\"navbar-inner\">  \n");
      out.write("                <div class=\"container\">  \n");
      out.write("                    <ul class=\"nav\">  \n");
      out.write("                        <li class=\"active\">  \n");
      out.write("                            <a class=\"brand\" href=\"#\">Washing Windows</a>  \n");
      out.write("                        </li>  \n");
      out.write("                        <li><a href=\"index.jsp\"><i class=\"icon-home\"></i>Home</a></li>  \n");
      out.write("                        <li><a href=\"#\"></a></li>  \n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-user\"></i>Contact</a></li>  \n");
      out.write("                    </ul>  \n");
      out.write("                    <form class=\"navbar-search pull-right\">  \n");
      out.write("                        <div class=\"input-prepend\">\n");
      out.write("                            <span class=\"add-on\"><i class=\"icon-plus\"></i></span><button type=\"submit\" class=\"btn\" id=\"Add_new_contact\">Add New Contact</button>\n");
      out.write("                            <span class=\"add-on\"><i class=\"icon-search\"></i></span><input name=\"url\" type=\"text\" class=\"span3\" placeholder=\"Search\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container-fluid\"style=\"background-color: white; \">\n");
      out.write("\n");
      out.write("            <div class=\"form-horizontal\" id=\"form2\">  \n");
      out.write("                <fieldset>  \n");
      out.write("                    <legend>Client Form</legend>  \n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"input01\">Name</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <input type=\"text\" class=\"input-large\" id=\"input01\">  \n");
      out.write("                        </div>  \n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"input01\">Email</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <input type=\"text\" class=\"input-large\" id=\"input01\">  \n");
      out.write("                        </div>  \n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"input01\">Phone</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <input type=\"text\" class=\"input-large\" id=\"input01\">  \n");
      out.write("                        </div>  \n");
      out.write("                    </div> \n");
      out.write("                    <h2>Address</h2>\n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"multiSelect\">Home Descripition</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <select multiple=\"multiple\" id=\"multiSelect\">  \n");
      out.write("                                <option>Front</option>  \n");
      out.write("                                <option>Back</option>  \n");
      out.write("                                <option>Side</option>  \n");
      out.write("                                <option>Side</option>  \n");
      out.write("\n");
      out.write("                            </select>  \n");
      out.write("                        </div>  \n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"input01\">Quantity</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <input type=\"text\" class=\"input-large\" id=\"input01\">  \n");
      out.write("                        </div>  \n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"input01\">Price</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <input type=\"text\" class=\"input-large\" id=\"input01\">  \n");
      out.write("                        </div>  \n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"textarea\">Equiptment Notes</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <textarea class=\"input-large\" id=\"textarea\" rows=\"3\"></textarea>  \n");
      out.write("                        </div>  \n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"control-group\">  \n");
      out.write("                        <label class=\"control-label\" for=\"textarea\">Special Notes</label>  \n");
      out.write("                        <div class=\"controls\">  \n");
      out.write("                            <textarea class=\"input-large\" id=\"textarea\" rows=\"3\"></textarea>  \n");
      out.write("                        </div>  \n");
      out.write("                    </div>  \n");
      out.write("                    <div class=\"form-actions\">  \n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary\">Save changes</button>  \n");
      out.write("                        <button class=\"btn\">Cancel</button>  \n");
      out.write("                    </div>  \n");
      out.write("                </fieldset>  \n");
      out.write("            </div>  \n");
      out.write("\n");
      out.write("            <div class=\"form-horizontal\"id=\"form3\">\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\" for=\"inputEmail\">First Name</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" id=\"inputEmail\" placeholder=\"Client First Name\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\" for=\"inputEmail\">Last Name</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" id=\"inputEmail\" placeholder=\"Client Last Name\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\" for=\"inputEmail\">Email</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" id=\"inputEmail\" placeholder=\"Email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\" for=\"inputEmail\">Phone No.</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" id=\"inputEmail\" placeholder=\"Client phone Number\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\" for=\"inputEmail\">Address1</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" id=\"streetname\" class=\"input-large\" placeholder=\"Street No./Street Name\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                  <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\" for=\"inputEmail\">Address2</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" id=\"streetname\" class=\"input-Large\" placeholder=\"Postal Code/State/City\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                  <div class=\"control-group\">\n");
      out.write("                    <label class=\"control-label\" for=\"inputEmail\">Country</label>\n");
      out.write("                    <div class=\"controls\">\n");
      out.write("                        <input type=\"text\" id=\"streetname\" class=\"input-small\" placeholder=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"form-actions\">  \n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Add</button>  \n");
      out.write("                    <button class=\"btn\">Cancel</button>  \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
}
