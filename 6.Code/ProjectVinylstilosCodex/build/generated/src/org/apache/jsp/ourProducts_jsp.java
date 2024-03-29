package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import ec.edu.espe.vinylstilos.webservices.ProductRest;
import java.util.ArrayList;
import ec.edu.espe.vinylstilos.client.ProductNameClient;
import com.google.gson.JsonElement;
import com.google.gson.Gson;
import ec.edu.espe.vinylstilos.model.Product;

public final class ourProducts_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>List Products</title>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <h1>These are our products</h1>\r\n");
      out.write("        \r\n");
      out.write("        ");

           ProductRest productRest = new ProductRest();
           List<Product> products = productRest.getJson();
           Product product = new Product();
           
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <table width=\"600\" borde=\"1\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <th width=\"91\"> <div align=\"center\"> ID </div> </th>\r\n");
      out.write("                    <th width=\"98\"> <div align=\"center\">Name </div> </th>\r\n");
      out.write("                    <th width=\"91\"> <div align=\"center\">Description </div> </th>\r\n");
      out.write("                    <th width=\"91\"> <div align=\"center\">Image </div> </th>\r\n");
      out.write("                    <th width=\"100\"> <div align=\"center\">Price </div> </th>\r\n");
      out.write("                    <th width=\"91\"> <div align=\"center\">Amount </div> </th>\r\n");
      out.write("                    <th width=\"91\"> <div align=\"center\">Category</div> </th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 for (int i=0; i<products.size(); i++){ 
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    ");
 
                        product = products.get(i); 
                    
      out.write("\r\n");
      out.write("                    <td><div align=\"center\">");
      out.print(product.getIdProduct());
      out.write("</div></td>\r\n");
      out.write("                    <td><div align=\"center\">");
      out.print(product.getNameProduct());
      out.write("</div></td>\r\n");
      out.write("                    <td><div align=\"center\">");
      out.print(product.getDescriptionProduct());
      out.write("</div></td>\r\n");
      out.write("                    <td><div align=\"center\">");
      out.print(product.getImageProduct());
      out.write("</div></td>\r\n");
      out.write("                    <td><div align=\"center\">");
      out.print(product.getPriceProduct());
      out.write("</div></td>\r\n");
      out.write("                    <td><div align=\"center\">");
      out.print(product.getAmountProduct());
      out.write("</div></td>\r\n");
      out.write("                    <td><div align=\"center\">");
      out.print(product.getCategoryProduct());
      out.write("</div></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                ");
 } 
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        \r\n");
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
