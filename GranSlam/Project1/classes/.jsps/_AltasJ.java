  /*@lineinfo:filename=/AltasJ.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _AltasJ extends oracle.jsp.runtime.HttpJsp {

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
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _AltasJ page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:user-code*//*@lineinfo:15^1*/      out.print( session.getAttribute("ini.usu"));
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[3]);
      /*@lineinfo:translated-code*//*@lineinfo:17^1*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/altj");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:23^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_2=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setKey("altj.cod");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:24^9*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_3=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("cod_j");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:27^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_4=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setKey("altj.nom");
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
            out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:28^9*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_5=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("nombre_j");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:31^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_6=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setKey("altj.ap");
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
            out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:32^9*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_7=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setProperty("apellido_j");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:35^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_8=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setKey("altj.gen");
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
            out.write(__jsp_StaticText.text[11]);
            /*@lineinfo:translated-code*//*@lineinfo:36^9*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_9=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setProperty("genero_j");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[12]);
                  /*@lineinfo:translated-code*//*@lineinfo:37^9*/                  {
                    org.apache.struts.taglib.html.OptionTag __jsp_taghandler_10=(org.apache.struts.taglib.html.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionTag.class,"org.apache.struts.taglib.html.OptionTag key value");
                    __jsp_taghandler_10.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_10.setKey("Femenino");
                    __jsp_taghandler_10.setValue("Femenino");
                    __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[13]);
                  /*@lineinfo:translated-code*//*@lineinfo:38^9*/                  {
                    org.apache.struts.taglib.html.OptionTag __jsp_taghandler_11=(org.apache.struts.taglib.html.OptionTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionTag.class,"org.apache.struts.taglib.html.OptionTag key value");
                    __jsp_taghandler_11.setParent(__jsp_taghandler_9);
                    __jsp_taghandler_11.setKey("Masculino");
                    __jsp_taghandler_11.setValue("Masculino");
                    __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
                    if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
                    {
                      out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                      do {
                      } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                      out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                    }
                    if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[14]);
                /*@lineinfo:translated-code*//*@lineinfo:38^57*/                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[15]);
            /*@lineinfo:translated-code*//*@lineinfo:43^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_12=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_12.setParent(__jsp_taghandler_1);
              __jsp_taghandler_12.setKey("altj.nac");
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[16]);
            /*@lineinfo:translated-code*//*@lineinfo:44^9*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_13=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_13.setParent(__jsp_taghandler_1);
              __jsp_taghandler_13.setProperty("nacionalidad_j");
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[17]);
                  /*@lineinfo:translated-code*//*@lineinfo:45^9*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_14=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_14.setParent(__jsp_taghandler_13);
                    __jsp_taghandler_14.setCollection("naci");
                    __jsp_taghandler_14.setLabelProperty("nacionalidad");
                    __jsp_taghandler_14.setProperty("cod_nacionalidad");
                    __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[18]);
                /*@lineinfo:translated-code*//*@lineinfo:45^100*/                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[19]);
            /*@lineinfo:translated-code*//*@lineinfo:49^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_15=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_15.setParent(__jsp_taghandler_1);
              __jsp_taghandler_15.setKey("altj.ent");
              __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[20]);
            /*@lineinfo:translated-code*//*@lineinfo:50^9*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_16=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_16.setParent(__jsp_taghandler_1);
              __jsp_taghandler_16.setProperty("cod_ent_j");
              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[21]);
                  /*@lineinfo:translated-code*//*@lineinfo:51^9*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_17=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_17.setParent(__jsp_taghandler_16);
                    __jsp_taghandler_17.setCollection("en");
                    __jsp_taghandler_17.setLabelProperty("nomen");
                    __jsp_taghandler_17.setProperty("codigoen");
                    __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[22]);
                /*@lineinfo:translated-code*//*@lineinfo:51^83*/                } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[23]);
            /*@lineinfo:translated-code*//*@lineinfo:55^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_18=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_18.setParent(__jsp_taghandler_1);
              __jsp_taghandler_18.setKey("altj.eq");
              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[24]);
            /*@lineinfo:translated-code*//*@lineinfo:56^9*/            {
              org.apache.struts.taglib.html.SelectTag __jsp_taghandler_19=(org.apache.struts.taglib.html.SelectTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SelectTag.class,"org.apache.struts.taglib.html.SelectTag property");
              __jsp_taghandler_19.setParent(__jsp_taghandler_1);
              __jsp_taghandler_19.setProperty("cod_eq_j");
              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                do {
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[25]);
                  /*@lineinfo:translated-code*//*@lineinfo:57^9*/                  {
                    org.apache.struts.taglib.html.OptionsTag __jsp_taghandler_20=(org.apache.struts.taglib.html.OptionsTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.OptionsTag.class,"org.apache.struts.taglib.html.OptionsTag collection labelProperty property");
                    __jsp_taghandler_20.setParent(__jsp_taghandler_19);
                    __jsp_taghandler_20.setCollection("eq");
                    __jsp_taghandler_20.setLabelProperty("modalidad");
                    __jsp_taghandler_20.setProperty("codigoeq");
                    __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
                    if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
                    {
                      do {
                      } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                    }
                    if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                      return;
                    OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
                  }
                  /*@lineinfo:generated-code*/
                  out.write(__jsp_StaticText.text[26]);
                /*@lineinfo:translated-code*//*@lineinfo:57^87*/                } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[27]);
            /*@lineinfo:translated-code*//*@lineinfo:61^9*/            {
              org.apache.struts.taglib.bean.MessageTag __jsp_taghandler_21=(org.apache.struts.taglib.bean.MessageTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.bean.MessageTag.class,"org.apache.struts.taglib.bean.MessageTag key");
              __jsp_taghandler_21.setParent(__jsp_taghandler_1);
              __jsp_taghandler_21.setKey("altj.gana");
              __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
              if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
              {
                do {
                } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
              }
              if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[28]);
            /*@lineinfo:translated-code*//*@lineinfo:62^9*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_22=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property");
              __jsp_taghandler_22.setParent(__jsp_taghandler_1);
              __jsp_taghandler_22.setProperty("ganancia_j");
              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_22,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[29]);
            /*@lineinfo:translated-code*//*@lineinfo:65^36*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_23=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag value");
              __jsp_taghandler_23.setParent(__jsp_taghandler_1);
              __jsp_taghandler_23.setValue("Registrar");
              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[30]);
          /*@lineinfo:translated-code*//*@lineinfo:65^69*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[31]);


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
    private static final char text[][]=new char[32][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n<title>\nHello World\n</title>\n</head>\n<body>\n<h2>\nRegistrar nuevo jugador\n</h2>\n".toCharArray();
      text[3] = 
      "\n\n".toCharArray();
      text[4] = 
      "\n<table  cellspacing=\"2\" cellpadding=\"2\" border=\"1\" width=\"100%\" align=\"center\">\n<!--En el archivo AplicationResources.properties se definen las etiquetetas textuales que se mostrara en el formulario para cada caja. \nse utiliza el key para identificar el campo que se etiquetara: ej\naltas_j.nom=Nombre Jugador-->\n<tr>\n    <td>".toCharArray();
      text[5] = 
      ":</td>\n    <td>".toCharArray();
      text[6] = 
      "</td>\n</tr>\n<tr>\n    <td>".toCharArray();
      text[7] = 
      ":</td>\n    <td>".toCharArray();
      text[8] = 
      "</td>\n</tr>\n<tr>\n    <td>".toCharArray();
      text[9] = 
      ":</td>\n    <td>".toCharArray();
      text[10] = 
      "</td>\n</tr>\n<tr>\n    <td>".toCharArray();
      text[11] = 
      ":</td>\n    <td>".toCharArray();
      text[12] = 
      "\n        ".toCharArray();
      text[13] = 
      "\n        ".toCharArray();
      text[14] = 
      "\n    ".toCharArray();
      text[15] = 
      "</td>\n</tr>\n\n<tr>\n    <td>".toCharArray();
      text[16] = 
      ":</td>\n    <td>".toCharArray();
      text[17] = 
      "\n        ".toCharArray();
      text[18] = 
      "\n    ".toCharArray();
      text[19] = 
      "</td>\n</tr>\n<tr>\n    <td>".toCharArray();
      text[20] = 
      ":</td>\n    <td>".toCharArray();
      text[21] = 
      "\n        ".toCharArray();
      text[22] = 
      "\n    ".toCharArray();
      text[23] = 
      "</td>\n</tr>\n<tr>\n    <td>".toCharArray();
      text[24] = 
      ":</td>\n    <td>".toCharArray();
      text[25] = 
      "\n        ".toCharArray();
      text[26] = 
      "\n    ".toCharArray();
      text[27] = 
      "</td>\n</tr>\n<tr>\n    <td>".toCharArray();
      text[28] = 
      ":</td>\n    <td>".toCharArray();
      text[29] = 
      "</td>\n</tr>\n<tr>\n    <td colspan=\"2\" align=\"center\">".toCharArray();
      text[30] = 
      "\n</td>\n</tr>\n</table>\n".toCharArray();
      text[31] = 
      "\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
