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

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class EditarEqAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    EditarEqForm mf=(EditarEqForm)form;
    String cod=mf.getCod();
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
       String cadena = "select id_equipo, modalidad  from t_equipo where id_equipo="+cod+"order by 1";
       rsConsulta = conn.getData(cadena);
      
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        ClaseEquipo item = new ClaseEquipo();
        item.setCodigoeq(rsConsulta.getString("id_equipo"));
        item.setModalidad(rsConsulta.getString("modalidad"));
      
        
        items.add(item);
        System.out.println("Paso ..");
      }
      EditarEqForm m=new EditarEqForm();
      m.setTabla(items);
      request.getSession().setAttribute("editar_eq",m);
       
      return (mapping.findForward("vista_mod_eq"));
    }
    catch(Exception e)
       {
          e.printStackTrace();
          return (mapping.findForward("mal"));
       }
       
    finally
    {
      conn.closeConnection();	
    } 
  }
}