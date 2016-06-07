package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class localizacaoMapa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_inputText_value_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_inputText_value_id_nobody.release();
    _jspx_tagPool_f_view.release();
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\r\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
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

  private boolean _jspx_meth_f_view_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  f:view
    com.sun.faces.taglib.jsf_core.ViewTag _jspx_th_f_view_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.jsf_core.ViewTag.class) : new com.sun.faces.taglib.jsf_core.ViewTag();
    _jspx_th_f_view_0.setPageContext(_jspx_page_context);
    _jspx_th_f_view_0.setParent(null);
    _jspx_th_f_view_0.setJspId("id7");
    int _jspx_eval_f_view_0 = _jspx_th_f_view_0.doStartTag();
    if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_f_view_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_f_view_0.doInitBody();
      }
      do {
        out.write("\r\n");
        out.write("    <html>\r\n");
        out.write("        <head>\r\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\r\n");
        out.write("            <title>Local do Evento</title>\r\n");
        out.write("            <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">    \r\n");
        out.write("            <style type=\"text/css\">\r\n");
        out.write("                html, body {\r\n");
        out.write("                    height: 100%;\r\n");
        out.write("                    margin: 0;\r\n");
        out.write("                    padding: 0;\r\n");
        out.write("                }\r\n");
        out.write("                #map {\r\n");
        out.write("                    height: 100%;\r\n");
        out.write("                }\r\n");
        out.write("                #floating-panel {\r\n");
        out.write("                    position: fixed;\r\n");
        out.write("                    top: -150px;\r\n");
        out.write("                    left: 25%;\r\n");
        out.write("                    z-index: 5;                   \r\n");
        out.write("                }\r\n");
        out.write("                .btn-voltar{\r\n");
        out.write("                    font-family: 'Roboto','sans-serif';\r\n");
        out.write("                    position: absolute;\r\n");
        out.write("                    width: 60px;\r\n");
        out.write("                    left: calc(50% - 30px);\r\n");
        out.write("                    top: 10px;\r\n");
        out.write("                    z-index: 9999;                    \r\n");
        out.write("                    text-align:center;\r\n");
        out.write("                    color: gray;\r\n");
        out.write("                    text-decoration: none;\r\n");
        out.write("                    border: 2px solid gray;\r\n");
        out.write("                    border-radius: 10px;\r\n");
        out.write("                    padding: 10px\r\n");
        out.write("                }\r\n");
        out.write("                .btn-voltar:hover{\r\n");
        out.write("                    background: #ffffff;\r\n");
        out.write("                }\r\n");
        out.write("            </style>\r\n");
        out.write("        </head>\r\n");
        out.write("        <body >\r\n");
        out.write("            <div id=\"floating-panel\">\r\n");
        out.write("                \r\n");
        out.write("                ");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write(" \r\n");
        out.write("                \r\n");
        out.write("            </div>\r\n");
        out.write("            <a class=\"btn-voltar\" href=\"javascript:window.history.go(-1)\">VOLTAR</a>\r\n");
        out.write("            <div id=\"map\"></div>\r\n");
        out.write("            <script type=\"text/javascript\">\r\n");
        out.write("                function initMap() {\r\n");
        out.write("                    var map = new google.maps.Map(document.getElementById('map'), {\r\n");
        out.write("                        zoom: 16,\r\n");
        out.write("                        center: {lat: -30.093703, lng: -51.141438}//-30.093703,-51.141438,porto alegre\r\n");
        out.write("                    });\r\n");
        out.write("                    var geocoder = new google.maps.Geocoder();\r\n");
        out.write("\r\n");
        out.write("\r\n");
        out.write("                    geocodeAddress(geocoder, map);//executa a função\r\n");
        out.write("\r\n");
        out.write("                }\r\n");
        out.write("\r\n");
        out.write("                function geocodeAddress(geocoder, resultsMap) {\r\n");
        out.write("                    var address = document.getElementById('address').value;\r\n");
        out.write("                    geocoder.geocode({'address': address}, function (results, status) {\r\n");
        out.write("                        if (status === google.maps.GeocoderStatus.OK) {\r\n");
        out.write("                            resultsMap.setCenter(results[0].geometry.location);\r\n");
        out.write("                            var marker = new google.maps.Marker({\r\n");
        out.write("                                map: resultsMap,\r\n");
        out.write("                                position: results[0].geometry.location\r\n");
        out.write("                            });\r\n");
        out.write("                        } else {\r\n");
        out.write("                            alert('Endereço não informado ' + status);\r\n");
        out.write("                        }\r\n");
        out.write("                    });\r\n");
        out.write("                }\r\n");
        out.write("\r\n");
        out.write("            </script>\r\n");
        out.write("            <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAWMM38dR6Rg50ts6aDNXUaDFZpEI1G1As&signed_in=true&callback=initMap\"\r\n");
        out.write("            async=\"true\" defer=\"true\"></script>\r\n");
        out.write("        </body>\r\n");
        out.write("          \r\n");
        out.write("    </html>\r\n");
        int evalDoAfterBody = _jspx_th_f_view_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_f_view_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_f_view_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
      return true;
    }
    _jspx_tagPool_f_view.reuse(_jspx_th_f_view_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_0(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_0.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_inputText_0.setJspId("id20");
    _jspx_th_h_inputText_0.setId("address");
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{EventoBean.evento.lugar}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_id_nobody.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_id_nobody.reuse(_jspx_th_h_inputText_0);
    return false;
  }
}
