  /*@lineinfo:filename=/ListarJ.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _ListarJ extends com.orionserver.http.OrionHttpJspPage {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _ListarJ page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      __ojsp_s_out.write(__jsp_StaticText.text[2]);
      __ojsp_s_out.write(__jsp_StaticText.text[3]);
      /*@lineinfo:user-code*//*@lineinfo:16^9*/      out.print( session.getAttribute("ini.usu"));
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[4]);
      /*@lineinfo:translated-code*//*@lineinfo:17^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/listaj");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:28^1*/            {
              org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_2=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setId("tabla");
              __jsp_taghandler_2.setIndexId("index");
              __jsp_taghandler_2.setName("muestraj");
              __jsp_taghandler_2.setProperty("tabla");
              java.lang.Object tabla = null;
              java.lang.Integer index = null;
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                  tabla = (java.lang.Object) pageContext.findAttribute("tabla");
                  index = (java.lang.Integer) pageContext.findAttribute("index");
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[6]);
                  /*@lineinfo:translated-code*//*@lineinfo:30^9*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_3=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_3.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_3.setName("tabla");
                    __jsp_taghandler_3.setProperty("codigoj");
                    __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[7]);
                  /*@lineinfo:translated-code*//*@lineinfo:31^9*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_4=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_4.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_4.setName("tabla");
                    __jsp_taghandler_4.setProperty("codigoeq");
                    __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[8]);
                  /*@lineinfo:translated-code*//*@lineinfo:32^9*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_5=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_5.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_5.setName("tabla");
                    __jsp_taghandler_5.setProperty("codigoe");
                    __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[9]);
                  /*@lineinfo:translated-code*//*@lineinfo:33^9*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_6.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_6.setName("tabla");
                    __jsp_taghandler_6.setProperty("nomj");
                    __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[10]);
                  /*@lineinfo:translated-code*//*@lineinfo:34^9*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_7=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_7.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_7.setName("tabla");
                    __jsp_taghandler_7.setProperty("apj");
                    __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[11]);
                  /*@lineinfo:translated-code*//*@lineinfo:35^9*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_8.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_8.setName("tabla");
                    __jsp_taghandler_8.setProperty("genj");
                    __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[12]);
                  /*@lineinfo:translated-code*//*@lineinfo:36^9*/                  {
                    org.apache.struts.taglib.bean.WriteTag __jsp_taghandler_9=(org.apache.struts.taglib.bean.WriteTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.WriteTag.class,"org.apache.struts.taglib.bean.WriteTag name property");
                    __jsp_taghandler_9.setParent(__jsp_taghandler_2);
                    __jsp_taghandler_9.setName("tabla");
                    __jsp_taghandler_9.setProperty("ganaj");
                    __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
                  }
                  /*@lineinfo:generated-code*/
                  __ojsp_s_out.write(__jsp_StaticText.text[13]);
                /*@lineinfo:translated-code*//*@lineinfo:36^53*/                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[14]);
          /*@lineinfo:translated-code*//*@lineinfo:38^17*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[15]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final byte text[][]=new byte[16][];
    static {
      try {
      text[0] = 
      "\n".getBytes("Cp1252");
      text[1] = 
      "\n".getBytes("Cp1252");
      text[2] = 
      "\n".getBytes("Cp1252");
      text[3] = 
      "\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n<title>\nHello World\n</title>\n</head>\n<body>\n<h2>\nLos jugadores registrados se muestran a continuacion\n</h2>\nUSUARIO:".getBytes("Cp1252");
      text[4] = 
      "\n".getBytes("Cp1252");
      text[5] = 
      "\n<table  cellspacing=\"2\" cellpadding=\"1\" border=\"1\" width=\"60%\" align=\"center\">\n<tr>\n    <td align=\"center\"><b>Codigo Jugador</b></td>\n    <td align=\"center\"><b>Codigo Equipo</b></td>\n    <td align=\"center\"><b>Codigo Entrenador</b></td>\n    <td align=\"center\"><b>Nombre Jugador</b></td>\n    <td align=\"center\"><b>Apellido Jugador</b></td>\n    <td align=\"center\"><b>Genero</b></td>\n    <td align=\"center\"><b>Ganacia</b></td>\n</tr>\n".getBytes("Cp1252");
      text[6] = 
      "\n<tr>\n    <td>".getBytes("Cp1252");
      text[7] = 
      "</td>\n    <td>".getBytes("Cp1252");
      text[8] = 
      "</td>\n    <td>".getBytes("Cp1252");
      text[9] = 
      "</td>\n    <td>".getBytes("Cp1252");
      text[10] = 
      "</td>\n    <td>".getBytes("Cp1252");
      text[11] = 
      "</td>\n    <td>".getBytes("Cp1252");
      text[12] = 
      "</td>\n    <td>".getBytes("Cp1252");
      text[13] = 
      "</td>\n</tr>\n".getBytes("Cp1252");
      text[14] = 
      "\n</table>\n".getBytes("Cp1252");
      text[15] = 
      "\n</body>\n</html>\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
