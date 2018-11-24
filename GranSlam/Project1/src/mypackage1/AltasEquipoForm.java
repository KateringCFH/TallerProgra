package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltasEquipoForm extends ActionForm 
{
  String cod_eq;
  String nombreq;

  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public String getCod_eq()
  {
    return cod_eq;
  }

  public void setCod_eq(String newCod_eq)
  {
    cod_eq = newCod_eq;
  }

  public String getNombreq()
  {
    return nombreq;
  }

  public void setNombreq(String newNombreq)
  {
    nombreq = newNombreq;
  }
}
