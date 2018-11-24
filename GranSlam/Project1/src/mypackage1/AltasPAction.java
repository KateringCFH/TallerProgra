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

public class AltasPAction extends Action 
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
      AltasPForm a = (AltasPForm)form;
    int lugar=1;
   // int codigo=62;
    String fecha = a.getFecha();
    String modalidad = a.getModalidad();
    String gen = a.getGen_partido();
    String nom = a.getNom_arbitro();
    String fase = a.getFase_ar();
    String cod=a.getCod_partido();

    //fechita = ParseFecha(fecha);

     Connection cn = null;
      ConnectDB conn =new ConnectDB();
    /*ResultSet rsConsulta = null; Es solo cuando se hace consultas y en este caso es ingresar un registro */

       try
       {
         cn = conn.conexion;
         String cadena = "insert into t_partido values ("+cod+","+fase+","+modalidad+","+nom+","+gen+","+lugar+",to_date('"+fecha+"','YYYY/MM/DD'))";

         
         System.out.println(cadena);
         int b = conn.InsertaDatos(cadena); //Este metodo se utiliza para crear la cadena
          
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