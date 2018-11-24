package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;

public class ListarTForm extends ActionForm 
{
  ArrayList tabla;
  String id_torneo;
  String nombre;
  String pais;
  String gestion;

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

  public ArrayList getTabla()
  {
    return tabla;
  }

  public void setTabla(ArrayList newTabla)
  {
    tabla = newTabla;
  }

  public String getId_torneo()
  {
    return id_torneo;
  }

  public void setId_torneo(String newId_torneo)
  {
    id_torneo = newId_torneo;
  }

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }

  public String getPais()
  {
    return pais;
  }

  public void setPais(String newPais)
  {
    pais = newPais;
  }

  public String getGestion()
  {
    return gestion;
  }

  public void setGestion(String newGestion)
  {
    gestion = newGestion;
  }
}