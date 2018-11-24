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
public class AltasJAction extends Action 
{

  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    AltasJForm ajf=(AltasJForm) form;
    String codigo=ajf.getCod_j();
    String codeq=ajf.getCod_eq_j();
    String nombre=ajf.getNombre_j();
    String apellido=ajf.getApellido_j();
    String genero=ajf.getGenero_j();
    String nacionalidad=ajf.getNacionalidad_j();
    String gana=ajf.getGanancia_j();
    String coden=ajf.getCod_ent_j();

    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

     try
       {
         cn = conn.conexion;
         String cadena = "insert into t_jugador values ("+codigo+","+codeq+","+coden+",'"+nombre+"','"+apellido+"','"+genero+"',"+gana+")";
         System.out.println(cadena);
         int a = conn.InsertaDatos(cadena);
        
         return mapping.findForward("exito");
                         System.out.println("Paso..............");
	      }
      catch(Exception e)
       {
          e.printStackTrace();
          return (mapping.findForward("malo"));
       }
        finally
        {
          conn.closeConnection();	
        }

  }
}