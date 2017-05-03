package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Button_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <center>\n");
      out.write("<style>\n");
      out.write("#a1{\n");
      out.write("background-color:\n");
      out.write("#FF99CC;\n");
      out.write("color:\n");
      out.write("#3333CC;\n");
      out.write("border:medium thick #FF3399;\n");
      out.write("font-family:Georgia, \"Times New Roman\", Times, serif bold;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("h1 {background-color:#CCCCCC;}\n");
      out.write("li {background-color:#CCCCCC; \n");
      out.write("font-size:18px;\n");
      out.write("border-width:medium;\n");
      out.write("font-family:Georgia, \"Times New Roman\", Times, serif;\n");
      out.write("text-shadow:inherit;color:#3333CC;}\n");
      out.write("br {background-color:#CC6699;}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<h1><ul>Login</ul></h1>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body>\n");
      out.write("\t<form name=\"\" onsubmit=\"f()\">\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("\t<li><b>Name<font color=\"red\">* </font></b>&nbsp;&nbsp;\n");
      out.write("\t  <input type=\"text\" id=\"nam\" ></input><br>\n");
      out.write("\n");
      out.write("\t\t<script>\n");
      out.write("\t\tfunction f(){\n");
      out.write("\n");
      out.write("//VARIABLE DELCARE\n");
      out.write("\n");
      out.write("\t\t\tvar v=document.getElementById(\"nam\").value;\n");
      out.write("\t\t\tvar pat5=/^[a-zA-Z]/;\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("//passwrd var\n");
      out.write("\t\t\tvar v1=document.getElementById(\"pw\").value;\n");
      out.write("\t\t\tvar v2=document.getElementById(\"pw1\").value;\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tvar pat2=/^[0-9a-zA-Z]/;\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("//VALIDATION\n");
      out.write("\t\t\tif(v==\"\") {\n");
      out.write("\t\t\t\talert(\"Please Enter Your Name\");\n");
      out.write("\t\t\t\tdocument.getElementById(\"nam\").focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\telse if(pat5.test(v)==false){\n");
      out.write("\t\t\t\talert(\"Name should be text\");\n");
      out.write("\t\t\t\tdocument.getElementById(\"nam\").focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("//pw validation\n");
      out.write("\t\t\telse if(v1==\"\"){\n");
      out.write("\t\t\t\talert(\"please enter strong password\");\n");
      out.write("\t\t\t\tdocument.getElementById(\"pw\").focus();\n");
      out.write("\t\t\t\treturn false;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\telse if(v2==\"\" || v2!=v1){\n");
      out.write("\t\t\t\talert(\"Incorrect password\");\n");
      out.write("\t\t\t\tdocument.getElementById(\"pw1\").focus();\n");
      out.write("\t\t\t\treturn false;\t\t\t\t\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("\t<b>Password</b>&nbsp; &nbsp;\n");
      out.write("\t<input type=\"password\" id=\"pw\"></input><br>\n");
      out.write("\t<b>Re-enter Password</b>&nbsp;&nbsp;<input type=\"password\" id=\"pw1\"></input><br>\n");
      out.write("<input type=\"submit\"></input>\n");
      out.write("<br>\n");
      out.write("<button><a href=\"Registration.html\">Registration</a></button>\n");
      out.write("<br><br><br></li>\n");
      out.write("<b>Note:</b>* means must required\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("</body>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
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
