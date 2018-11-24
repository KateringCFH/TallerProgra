package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InicialAction extends Action 
{
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    System.out.println("Verificando usuario");
    /**Casteo**/
    InicialForm in=(InicialForm)form ;
    String usu=in.getUsuario();
    String cla=in.getClave();
    request.getSession().setAttribute("ini.usu",usu);
    if(usu.equals("admin") && cla.equals("admin"))
    {
      return mapping.findForward("exito");
    }
    else  return mapping.findForward("fallo");
  }
}