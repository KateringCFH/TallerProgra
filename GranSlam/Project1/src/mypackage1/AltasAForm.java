package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltasAForm extends ActionForm 
{
  String nombre_a;
  String apellido_a;
  String codigo_a;

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

  public String getNombre_a()
  {
    return nombre_a;
  }

  public void setNombre_a(String newNombre_a)
  {
    nombre_a = newNombre_a;
  }

  public String getApellido_a()
  {
    return apellido_a;
  }

  public void setApellido_a(String newApellido_a)
  {
    apellido_a = newApellido_a;
  }

  public String getCodigo_a()
  {
    return codigo_a;
  }

  public void setCodigo_a(String newCodigo_a)
  {
    codigo_a = newCodigo_a;
  }
}