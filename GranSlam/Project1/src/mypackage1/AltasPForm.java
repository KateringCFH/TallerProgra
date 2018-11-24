package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltasPForm extends ActionForm 
{
  String fecha;
  String modalidad;
  String gen_partido;
  String nom_arbitro;
  String fase_ar;
  String cod_partido;

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

  public String getFecha()
  {
    return fecha;
  }

  public void setFecha(String newFecha)
  {
    fecha = newFecha;
  }

  public String getModalidad()
  {
    return modalidad;
  }

  public void setModalidad(String newModalidad)
  {
    modalidad = newModalidad;
  }

  public String getGen_partido()
  {
    return gen_partido;
  }

  public void setGen_partido(String newGen_partido)
  {
    gen_partido = newGen_partido;
  }

  public String getNom_arbitro()
  {
    return nom_arbitro;
  }

  public void setNom_arbitro(String newNom_arbitro)
  {
    nom_arbitro = newNom_arbitro;
  }

  public String getFase_ar()
  {
    return fase_ar;
  }

  public void setFase_ar(String newFase_ar)
  {
    fase_ar = newFase_ar;
  }

  public String getCod_partido()
  {
    return cod_partido;
  }

  public void setCod_partido(String newCod_partido)
  {
    cod_partido = newCod_partido;
  }
}