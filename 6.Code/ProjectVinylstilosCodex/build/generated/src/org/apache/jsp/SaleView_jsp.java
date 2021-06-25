package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ec.edu.espe.vinylstilos.model.Sale;
import ec.edu.espe.vinylstilos.client.SaleClient;

public final class SaleView_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Sale View</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>Search a Sale</h1>\r\n");
      out.write("       <form action=\"ConsumeGetSale.jsp\" method=\"POST\">\r\n");
      out.write("            <div class=\"form-row align-items-center\">\r\n");
      out.write("              <div class=\"col-sm-3 my-1\">\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"idSale\" id=\"idSale\" placeholder=\"Example: 027S\">\r\n");
      out.write("              </div>\r\n");
      out.write("              \r\n");
      out.write("              <div class=\"col-auto my-1\">\r\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("              </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
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
