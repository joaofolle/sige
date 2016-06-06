package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class localizacaoMapa_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_h_inputText_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_f_view;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_h_inputText_value_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_h_inputText_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_f_view = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_h_inputText_value_id_nobody.release();
    _jspx_tagPool_h_inputText_value_nobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      if (_jspx_meth_f_view_0(_jspx_page_context))
        return;
      out.write("\n");
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
        out.write("\n");
        out.write("    <html>\n");
        out.write("        <head>\n");
        out.write("            <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
        out.write("            <title>Local do Evento</title>\n");
        out.write("            <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\">    \n");
        out.write("            <style type=\"text/css\">\n");
        out.write("                html, body {\n");
        out.write("                    height: 100%;\n");
        out.write("                    margin: 0;\n");
        out.write("                    padding: 0;\n");
        out.write("                }\n");
        out.write("                #map {\n");
        out.write("                    height: 100%;\n");
        out.write("                }\n");
        out.write("                #floating-panel {\n");
        out.write("                    position: fixed;\n");
        out.write("                    top: 50px;\n");
        out.write("                    left: 25%;\n");
        out.write("                    z-index: 5;                   \n");
        out.write("                }\n");
        out.write("                .btn-voltar{\n");
        out.write("                    font-family: 'Roboto','sans-serif';\n");
        out.write("                    position: absolute;\n");
        out.write("                    width: 60px;\n");
        out.write("                    left: calc(50% - 30px);\n");
        out.write("                    top: 10px;\n");
        out.write("                    z-index: 9999;                    \n");
        out.write("                    text-align:center;\n");
        out.write("                    color: gray;\n");
        out.write("                    text-decoration: none;\n");
        out.write("                    border: 2px solid gray;\n");
        out.write("                    border-radius: 10px;\n");
        out.write("                    padding: 10px\n");
        out.write("                }\n");
        out.write("                .btn-voltar:hover{\n");
        out.write("                    background: #ffffff;\n");
        out.write("                }\n");
        out.write("            </style>\n");
        out.write("        </head>\n");
        out.write("        <body >\n");
        out.write("            <div id=\"floating-panel\">\n");
        out.write("                \n");
        out.write("                ");
        if (_jspx_meth_h_inputText_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write(" \n");
        out.write("                ");
        if (_jspx_meth_h_inputText_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_f_view_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            </div>\n");
        out.write("            <a class=\"btn-voltar\" href=\"javascript:window.history.go(-1)\">VOLTAR</a>\n");
        out.write("            <div id=\"map\"></div>\n");
        out.write("            <script type=\"text/javascript\">\n");
        out.write("                function initMap() {\n");
        out.write("                    var map = new google.maps.Map(document.getElementById('map'), {\n");
        out.write("                        zoom: 16,\n");
        out.write("                        center: {lat: -30.093703, lng: -51.141438}//-30.093703,-51.141438,porto alegre\n");
        out.write("                    });\n");
        out.write("                    var geocoder = new google.maps.Geocoder();\n");
        out.write("\n");
        out.write("\n");
        out.write("                    geocodeAddress(geocoder, map);//executa a função\n");
        out.write("\n");
        out.write("                }\n");
        out.write("\n");
        out.write("                function geocodeAddress(geocoder, resultsMap) {\n");
        out.write("                    var address = document.getElementById('address').value;\n");
        out.write("                    geocoder.geocode({'address': address}, function (results, status) {\n");
        out.write("                        if (status === google.maps.GeocoderStatus.OK) {\n");
        out.write("                            resultsMap.setCenter(results[0].geometry.location);\n");
        out.write("                            var marker = new google.maps.Marker({\n");
        out.write("                                map: resultsMap,\n");
        out.write("                                position: results[0].geometry.location\n");
        out.write("                            });\n");
        out.write("                        } else {\n");
        out.write("                            alert('Endereço não informado ' + status);\n");
        out.write("                        }\n");
        out.write("                    });\n");
        out.write("                }\n");
        out.write("\n");
        out.write("            </script>\n");
        out.write("            <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAWMM38dR6Rg50ts6aDNXUaDFZpEI1G1As&signed_in=true&callback=initMap\"\n");
        out.write("            async=\"true\" defer=\"true\"></script>\n");
        out.write("        </body>\n");
        out.write("          \n");
        out.write("    </html>\n");
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
    _jspx_th_h_inputText_0.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("otto niemeyer, porto alegre", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_inputText_0 = _jspx_th_h_inputText_0.doStartTag();
    if (_jspx_th_h_inputText_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_id_nobody.reuse(_jspx_th_h_inputText_0);
      return true;
    }
    _jspx_tagPool_h_inputText_value_id_nobody.reuse(_jspx_th_h_inputText_0);
    return false;
  }

  private boolean _jspx_meth_h_inputText_1(javax.servlet.jsp.tagext.JspTag _jspx_th_f_view_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  h:inputText
    com.sun.faces.taglib.html_basic.InputTextTag _jspx_th_h_inputText_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.sun.faces.taglib.html_basic.InputTextTag.class) : new com.sun.faces.taglib.html_basic.InputTextTag();
    _jspx_th_h_inputText_1.setPageContext(_jspx_page_context);
    _jspx_th_h_inputText_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_f_view_0);
    _jspx_th_h_inputText_1.setJspId("id22");
    _jspx_th_h_inputText_1.setValue(org.apache.jasper.runtime.PageContextImpl.getValueExpression("#{EventoBean.evento.lugar}", (PageContext)_jspx_page_context, java.lang.Object.class, null));
    int _jspx_eval_h_inputText_1 = _jspx_th_h_inputText_1.doStartTag();
    if (_jspx_th_h_inputText_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_h_inputText_value_nobody.reuse(_jspx_th_h_inputText_1);
      return true;
    }
    _jspx_tagPool_h_inputText_value_nobody.reuse(_jspx_th_h_inputText_1);
    return false;
  }
}
