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

public class ModEnAction extends Action 
{

  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    ModEnForm mf=(ModEnForm)form;
    String cod=mf.getCod();
    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
       String cadena = " select ID_ENTRENADOR, NOM_ENTRENADOR, AP_ENTRENADOR  from t_entrenador where id_entrenador="+cod+"order by 1";
       rsConsulta = conn.getData(cadena);
      
      ArrayList items = new ArrayList();
      while (rsConsulta.next())
      {
        ClaseEntrenador item = new ClaseEntrenador();
        item.setCod_e(rsConsulta.getString("ID_ENTRENADOR"));
        item.setNombre_e(rsConsulta.getString("NOM_ENTRENADOR"));
        item.setApellido_e(rsConsulta.getString("AP_ENTRENADOR"));
        
        items.add(item);
        System.out.println("Paso ..");
      }
      ModEnForm m=new ModEnForm();
      m.setTabla(items);
      request.getSession().setAttribute("actualizar_en",m);
       
      return (mapping.findForward("vista_modEn"));
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
