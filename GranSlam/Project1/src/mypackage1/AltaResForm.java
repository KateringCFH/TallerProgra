package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class AltaResForm extends ActionForm 
{

  String cod_res;
  String cod_part;
  String cod_eq1;
  String cod_eq2;
  String res_tot;

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

  public String getCod_res()
  {
    return cod_res;
  }

  public void setCod_res(String newCod_res)
  {
    cod_res = newCod_res;
  }

  public String getCod_part()
  {
    return cod_part;
  }

  public void setCod_part(String newCod_part)
  {
    cod_part = newCod_part;
  }

  public String getCod_eq1()
  {
    return cod_eq1;
  }

  public void setCod_eq1(String newCod_eq1)
  {
    cod_eq1 = newCod_eq1;
  }

  public String getCod_eq2()
  {
    return cod_eq2;
  }

  public void setCod_eq2(String newCod_eq2)
  {
    cod_eq2 = newCod_eq2;
  }

  public String getRes_tot()
  {
    return res_tot;
  }

  public void setRes_tot(String newRes_tot)
  {
    res_tot = newRes_tot;
  }











}