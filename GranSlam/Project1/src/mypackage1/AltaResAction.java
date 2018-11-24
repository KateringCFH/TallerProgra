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
public class AltaResAction extends Action 
{

  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    AltaResForm ar=(AltaResForm)form;
    String cod_set=ar.getCod_res();
    String cod_part=ar.getCod_part();
    String eq1=ar.getCod_eq1();
    String eq2=ar.getCod_eq2();
    String set=ar.getCod_res();
    

    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;

     try
     {
        cn = conn.conexion;
         String cadena = "insert into t_jugador_partido values ("+cod_set+","+cod_part+",1,2,"+eq1+","+eq2+","+set+")";
         System.out.println(cadena);
         int a = conn.InsertaDatos(cadena);

        return mapping.findForward("exito");
     }
     catch(Exception e)
       {
          e.printStackTrace();
          return (mapping.findForward("fallo"));
       }
        finally
        {
          conn.closeConnection();	
        }
   
  }
}