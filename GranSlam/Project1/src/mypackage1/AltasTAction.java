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

public class AltasTAction extends Action 
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
      AltasTForm aaa= (AltasTForm)form;
      String codigo = aaa.getCodigo_t();
      String nombre = aaa.getNombre_t();
      String pais = aaa.getNom_pais();
      String gestion = aaa.getGestion();

      Connection cn = null;
      ConnectDB conn =new ConnectDB();
    /*ResultSet rsConsulta = null; Es solo cuando se hace consultas y en este caso es ingresar un registro */

       try
       {
         cn = conn.conexion;
         String cadena = "insert into t_torneo values ("+codigo+",'"+nombre+"','"+pais+"',"+gestion+")";
         System.out.println(cadena);
         int a = conn.InsertaDatos(cadena); //Este metodo se utiliza para crear la cadena
          
         return mapping.findForward("exito");
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