package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltasTForm extends ActionForm 
{
  String nombre_t;
  String nom_pais;
  String gestion;
  String codigo_t;

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

  public String getNombre_t()
  {
    return nombre_t;
  }

  public void setNombre_t(String newNombre_t)
  {
    nombre_t = newNombre_t;
  }

  public String getNom_pais()
  {
    return nom_pais;
  }

  public void setNom_pais(String newNom_pais)
  {
    nom_pais = newNom_pais;
  }

  public String getGestion()
  {
    return gestion;
  }

  public void setGestion(String newGestion)
  {
    gestion = newGestion;
  }

  public String getCodigo_t()
  {
    return codigo_t;
  }

  public void setCodigo_t(String newCodigo_t)
  {
    codigo_t = newCodigo_t;
  }
}