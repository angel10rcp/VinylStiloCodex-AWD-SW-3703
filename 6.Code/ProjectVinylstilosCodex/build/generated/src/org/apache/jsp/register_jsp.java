package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ec.edu.espe.vinylstilos.webservices.UserRest;
import ec.edu.espe.vinylstilos.model.User;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\t\t\n");
      out.write("        <h1>Usuarios del sistema</h1><a href=\"index.jsp\">Return</a>\n");
      out.write("        ");

            if((String)request.getParameter("email")!=null){
            User userReq = new User();
            userReq.setEmail((String) request.getParameter("email"));
            userReq.setIdUser((String) request.getParameter("iduser"));
            userReq.setLastName((String) request.getParameter("lastname"));
            userReq.setPassword((String) request.getParameter("password"));
            userReq.setFirstName((String) request.getParameter("firstname"));

            UserRest userR = new UserRest();
            userR.create(userReq);}
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <table class=\"table\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>IDUSER</th>\n");
      out.write("                                <th>FIRSTNAME</th>\n");
      out.write("                                <th>LASTNAME</th>\n");
      out.write("                                <th>EMAIL</th>\n");
      out.write("                                <th>PASSWORD</th>                                  \n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                UserRest userRes = new UserRest();

                                for (User user : userRes.getJson()) {
                            
      out.write("                               \n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(user.getIdUser());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getFirstName());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getLastName());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getEmail());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(user.getPassword());
      out.write("</td>                                    \n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>      \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
