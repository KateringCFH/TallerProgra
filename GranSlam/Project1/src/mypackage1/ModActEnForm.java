package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class ModActEnForm extends ActionForm 
{
  String nombre_e;
  String apellido_e;
  String cod_e;
  ArrayList tabla;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public String getNombre_e()
  {
    return nombre_e;
  }

  public void setNombre_e(String newNombre_e)
  {
    nombre_e = newNombre_e;
  }

  public String getApellido_e()
  {
    return apellido_e;
  }

  public void setApellido_e(String newApellido_e)
  {
    apellido_e = newApellido_e;
  }

  public String getCod_e()
  {
    return cod_e;
  }

  public void setCod_e(String newCod_e)
  {
    cod_e = newCod_e;
  }

  public ArrayList getTabla()
  {
    return tabla;
  }

  public void setTabla(ArrayList newTabla)
  {
    tabla = newTabla;
  }
}
