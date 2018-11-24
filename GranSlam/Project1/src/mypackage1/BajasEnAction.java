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
public class BajasEnAction extends Action 
{
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    BajasEnForm bf=(BajasEnForm)form;
      String cod=bf.getCod();

    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    try
       {
         cn = conn.conexion;
         String cadena="delete from t_entrenador where id_entrenador="+cod;
         System.out.println("Eliminando Entrenador     "+cadena);
         int a=conn.InsertaDatos(cadena);
         return (mapping.findForward("exito"));
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
