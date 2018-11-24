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
public class BuenoAction extends Action 
{

  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    BuenoForm m=(BuenoForm) form;
    String bot=m.getBoton();
    String to="";
    request.getSession().setAttribute("botm",bot);
     if(bot.equals("Registrar Jugador") )
     {
            Connection cn = null;
            ConnectDB conn =new ConnectDB();
            ResultSet rsConsulta = null;
            try
            {
              cn = conn.conexion;
              /**PARA SELECCIONAR UNA NACIONALIDAD***/
              String cadena = "select * from tipo_nacionalidad order by 1";
              rsConsulta = conn.getData(cadena);
              ArrayList items = new ArrayList();
      
              while (rsConsulta.next())
              {
                ClaseJugador item = new ClaseJugador();
                item.setCod_nacionalidad(rsConsulta.getString("id_tipo_nacionalidad"));
                item.setNacionalidad(rsConsulta.getString("tipo_nacionalidad"));
                items.add(item);
              }  
                request.getSession().setAttribute("naci",items);
                /**PARA SELECCIONAR UNA EQUIPO***/
                String eq="select distinct * from t_equipo";
                rsConsulta=conn.getData(eq);
                ArrayList itemseq = new ArrayList();
            while(rsConsulta.next())
            {
                ClaseJugador itemq = new ClaseJugador();
                itemq.setCodigoeq(rsConsulta.getString("id_equipo"));
                itemq.setModalidad(rsConsulta.getString("modalidad"));
                itemseq.add(itemq);
                System.out.println("Paso equipo..");
            }
                request.getSession().setAttribute("eq",itemseq);
                /**PARA SELECCIONAR UN ENTRENADOR***/
                 String en="select * from t_entrenador order by 1";
                rsConsulta=conn.getData(en);
                ArrayList itemsen = new ArrayList();
            while(rsConsulta.next())
            {
               ClaseJugador iteme = new ClaseJugador();
                iteme.setCodigoen(rsConsulta.getString("id_entrenador"));
                iteme.setNomen(rsConsulta.getString("nom_entrenador"));
                itemsen.add(iteme);
                System.out.println("Paso equipo..");
            }
            request.getSession().setAttribute("en",itemsen);
           to="altaj";
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

    
    if(bot.equals("Listar Jugador"))
    {
            Connection cn = null;
            ConnectDB conn =new ConnectDB();
            ResultSet rsConsulta = null;
            System.out.println("CONEXION ..");
            try
            {
              cn = conn.conexion;
              System.out.println("qUERY ..");
              String cadena = " select id_jugador,id_equipo,id_entrenador,nom_j,ap_j,genero,ganancia from t_jugador order by 1";
              rsConsulta = conn.getData(cadena);
              ArrayList items = new ArrayList();
              while (rsConsulta.next())
              {
                ClaseJugador item = new ClaseJugador();
                item.setCodigoj(rsConsulta.getString("id_jugador"));
                item.setCodigoeq(rsConsulta.getString("id_equipo"));
                item.setCodigoe(rsConsulta.getString("id_entrenador"));
                item.setNomj(rsConsulta.getString("nom_j"));
                item.setApj(rsConsulta.getString("ap_j"));
                item.setGenj(rsConsulta.getString("genero"));
                item.setGanaj(rsConsulta.getString("ganancia"));
                items.add(item);
                System.out.println("Paso ..");
            }
                ListarJForm f = new ListarJForm ();	   
                f.setTabla(items);
                request.getSession().setAttribute("muestraj",f);  //llamar al listado
                to="listaj";
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

    if(bot.equals("Registrar Entrenador") )
      to="altae";
if(bot.equals("Registrar Equipo") )
      to="altaeq";
      
   if(bot.equals("Listar Entrenador")){
          Connection cn = null;
          ConnectDB conn =new ConnectDB();
          ResultSet rsConsulta = null;
          System.out.println("CONEXION ..");
          try
          {
                cn = conn.conexion;
                System.out.println("qUERY ..");
                String cadena = " select id_entrenador,nom_entrenador,ap_entrenador from t_entrenador order by 1";
                rsConsulta = conn.getData(cadena);
                ArrayList items = new ArrayList();
                while (rsConsulta.next())
                {
                  ClaseEntrenador item = new ClaseEntrenador();
                  item.setCod_e(rsConsulta.getString("id_entrenador"));
                  item.setNombre_e(rsConsulta.getString("nom_entrenador"));
                  item.setApellido_e(rsConsulta.getString("ap_entrenador"));
                  items.add(item);
                  System.out.println("Paso ..");
                }
                ListarEForm f = new ListarEForm ();	   
                f.setTabla(items);
                request.getSession().setAttribute("muestrae",f);  //llamar al listado
                to="listae";
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
      
    if(bot.equals("Registrar Arbitro"))
    to="altaa";

    
     if(bot.equals("Listar Arbitro")){   
            Connection cn = null;
            ConnectDB conn =new ConnectDB();
            ResultSet rsConsulta = null;
            try
            {
                cn = conn.conexion;
                System.out.println("QUERY ..");
                String cadena = " select id_arbitro,nom_arbitro,ap_arbitro from t_arbitro order by 1";
                rsConsulta = conn.getData(cadena);
                ArrayList items = new ArrayList();
                while (rsConsulta.next())
                {
                  ClassArbitro item = new ClassArbitro();
                  item.setCod_a(rsConsulta.getString("id_arbitro"));
                  item.setNombre_a(rsConsulta.getString("nom_arbitro"));
                  item.setApellido_a(rsConsulta.getString("ap_arbitro"));
                  items.add(item);
                  System.out.println("Paso ..");
              }
              ListarEForm f = new ListarEForm ();	   
              f.setTabla(items);
              request.getSession().setAttribute("muestraA",f);  //llamar al listado
              to="listaa";
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
     
    if(bot.equals("Regsitrar Partido"))
    to="altap";

    if(bot.equals("Registrar Resultados"))
    {
          Connection cn = null;
          ConnectDB conn =new ConnectDB();
          ResultSet rsConsulta = null;
          try
          {
              cn = conn.conexion;
              /**PARA SELECCIONAR PArtido**/
              String cadena = "select * from t_partido order by 1";
              rsConsulta = conn.getData(cadena);
              ArrayList items = new ArrayList();
              while (rsConsulta.next())
              {
                ClaseRes item = new ClaseRes();
                item.setCodpart(rsConsulta.getString("id_partido"));
                item.setCod_part(rsConsulta.getString("id_partido"));
                items.add(item);
              }  
                request.getSession().setAttribute("part",items);

                /**PARA SELECCIONAR Equipo 1**/
              String cadenaeq1 = "select * from t_equipo order by 1";
              rsConsulta = conn.getData(cadenaeq1);
              ArrayList itemseq1 = new ArrayList();
              while (rsConsulta.next())
              {
                ClaseRes eq1 = new ClaseRes();
                eq1.setCodeq1(rsConsulta.getString("id_equipo"));
                eq1.setCodigoeq1(rsConsulta.getString("id_equipo"));
                itemseq1.add(eq1);
              }  
                request.getSession().setAttribute("eq1",itemseq1);
              /**PARA SELECCIONAR Equipo 2**/
              String cadenaeq2 = "select * from t_equipo order by 1";
              rsConsulta = conn.getData(cadenaeq2);
              ArrayList itemseq2 = new ArrayList();
              while (rsConsulta.next())
              {
                ClaseRes eq2 = new ClaseRes();
                eq2.setCodeq2(rsConsulta.getString("id_equipo"));
                eq2.setCodigoeq2(rsConsulta.getString("id_equipo"));
                itemseq2.add(eq2);
              }  
                request.getSession().setAttribute("eq2",itemseq2);


              to="altares";
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
   

    if(bot.equals("Listar Resultados"))
    {
        Connection cn = null;
          ConnectDB conn =new ConnectDB();
          ResultSet rsConsulta = null;
          try
          {
              cn = conn.conexion;
            System.out.println("QUERY ..");
            String cadena = "select id_jp, id_partido, t_equipo_id_equipo, t_equipo_2_id_equipo, sets from t_jugador_partido";
            rsConsulta = conn.getData(cadena);
            ArrayList items = new ArrayList();
            System.out.println("inicio while ..");
            while (rsConsulta.next())
            {

              ClaseRes cr=new ClaseRes();
              cr.setCod_set(rsConsulta.getString("id_jp"));
              cr.setCodpart(rsConsulta.getString("id_partido"));
              cr.setCodeq1(rsConsulta.getString("t_equipo_id_equipo"));
              cr.setCodeq2(rsConsulta.getString("t_equipo_2_id_equipo"));
              cr.setRes_total(rsConsulta.getString("sets"));
              items.add(cr);
            }
            ListarResForm f = new ListarResForm ();	   
            f.setTabla(items);
            request.getSession().setAttribute("lista_res",f);  //llamar al listado
            to="listares";
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
   

    
    if(bot.equals("Listar Partido")){
          Connection cn = null;
          ConnectDB conn =new ConnectDB();
          ResultSet rsConsulta = null;
          try
          {
            cn = conn.conexion;
            System.out.println("QUERY ..");
            String cadena = "select TO_CHAR(p.fecha,'DD/MM/YYYY') ,f.nom_fase ,m.nom_modalidad ,g.nom_genero ,a.nom_arbitro from t_partido p, t_fase f,t_modalidad m,t_genero g,t_arbitro a where p.id_fase=f.id_fase and p.id_modalidad=m.id_modalidad and p.id_arbitro=a.id_arbitro and p.id_genero=g.id_genero order by p.fecha desc";
            rsConsulta = conn.getData(cadena);
            ArrayList items = new ArrayList();
            System.out.println("inicio while ..");
            while (rsConsulta.next())
            {
              ClasePartido lp=new ClasePartido();
              lp.setFecha(rsConsulta.getString("fecha"));
              lp.setId_fase(rsConsulta.getString("nom_fase"));
              lp.setId_modalidad(rsConsulta.getString("nom_modalidad"));
              lp.setId_genero(rsConsulta.getString("nom_genero"));
              lp.setId_arbitro(rsConsulta.getString("nom_arbitro"));
              items.add(lp);
        System.out.println("Paso ..final");
            }
            ListarPForm f = new ListarPForm ();	   
            f.setTabla(items);
            request.getSession().setAttribute("muestrap",f);  //llamar al listado
            to="listap";
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
    
    if(bot.equals("Regsitrar Torneo"))
    to="altat"; 

    
    if(bot.equals("Registrar Fase") )
      to="altaf";
      
    if(bot.equals("Listar Fase") )
    {
          Connection cn = null;
          ConnectDB conn =new ConnectDB();
          ResultSet rsConsulta = null;
          try
          {
            cn = conn.conexion;
            System.out.println("QUERY ..");
            String cadena = " select * from t_fase order by 1";
            rsConsulta = conn.getData(cadena);
            ArrayList items = new ArrayList();
            while (rsConsulta.next())
            {
              ListarFForm item = new ListarFForm();
              item.setCodigo(rsConsulta.getString("id_fase"));
              item.setNombre(rsConsulta.getString("nom_fase"));
              item.setGanador(rsConsulta.getString("premio_ganador"));
              item.setConsuelo(rsConsulta.getString("premio_consuelo"));     
              items.add(item);
          }
          ListarFForm f = new ListarFForm ();	   
          f.setTabla(items);
          request.getSession().setAttribute("listado_fase",f);  //llamar al listado
          to="listaf";
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

    
    if(bot.equals("Registrar Modalidad") )
      to="altam";

      
    if(bot.equals("Listar Modalidad") )
    {
      Connection cn = null;
      ConnectDB conn =new ConnectDB();
      ResultSet rsConsulta = null;
      try
      {
        cn = conn.conexion;
        System.out.println("QUERY ..");
        String cadena = " select * from t_modalidad order by 1";
        rsConsulta = conn.getData(cadena);
        ArrayList items = new ArrayList();
        while (rsConsulta.next())
        {
          ListarMForm item = new ListarMForm();
       
          item.setCodigo(rsConsulta.getString("id_modalidad"));
          item.setNombre(rsConsulta.getString("nom_modalidad"));
        
          items.add(item);
          System.out.println("Paso ..");
      }
      ListarFForm f = new ListarFForm ();	   
      f.setTabla(items);
      request.getSession().setAttribute("listado_modalidad",f);  //llamar al listado
   
      to="listam";
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

    if(bot.equals("Listar Torneo"))
    {
          Connection cn = null;
          ConnectDB conn =new ConnectDB();
          ResultSet rsConsulta = null;
          try
          {
            cn = conn.conexion;
            System.out.println("QUERY ..");
            String cadena = " select * from t_torneo order where ";
            rsConsulta = conn.getData(cadena);
            ArrayList items = new ArrayList();
            while (rsConsulta.next())
            {
              ListarTForm item = new ListarTForm();
              item.setId_torneo(rsConsulta.getString("id_torneo"));
              item.setNombre(rsConsulta.getString("nombre"));
              item.setPais(rsConsulta.getString("pais"));
              item.setGestion(rsConsulta.getString("gestion"));
              items.add(item);
              System.out.println("Paso ..");
          }
          ListarTForm f = new ListarTForm ();	   
          f.setTabla(items);
          request.getSession().setAttribute("muestrat",f);  //llamar al listado
          to="listat";
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
if(bot.equals("Eliminar Equipo"))
   {
     Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = " select id_equipo,modalidad from t_equipo order by 1";
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
                BajasEForm f = new BajasEForm ();	   
                f.setTabla(items);
                request.getSession().setAttribute("bajas_equipo",f); 
        to="bajas_e";
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

     if(bot.equals("Editar Entrenador")){
          Connection cn = null;
          ConnectDB conn =new ConnectDB();
          ResultSet rsConsulta = null;
          System.out.println("CONEXION ..");
          try
          {
                cn = conn.conexion;
                System.out.println("qUERY ..");
                String cadena = " select id_entrenador,nom_entrenador,ap_entrenador from t_entrenador order by 1";
                rsConsulta = conn.getData(cadena);
                ArrayList items = new ArrayList();
                while (rsConsulta.next())
                {
                  ClaseEntrenador item = new ClaseEntrenador();
                  item.setCod_e(rsConsulta.getString("id_entrenador"));
                  item.setNombre_e(rsConsulta.getString("nom_entrenador"));
                  item.setApellido_e(rsConsulta.getString("ap_entrenador"));
                  items.add(item);
                  System.out.println("Paso ..");
                }
                ListarEForm f = new ListarEForm ();	   
                f.setTabla(items);
                request.getSession().setAttribute("muestrae",f);  //llamar al listado
                to="listae";
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


    if(bot.equals("Eliminar Jugador"))
   {
     Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = " select id_jugador,id_equipo,id_entrenador,nom_j,ap_j,genero,ganancia from t_jugador order by 1";
      rsConsulta = conn.getData(cadena);
      ArrayList items = new ArrayList();
     while (rsConsulta.next())
              {
                ClaseJugador item = new ClaseJugador();
                item.setCodigoj(rsConsulta.getString("id_jugador"));
                item.setCodigoeq(rsConsulta.getString("id_equipo"));
                item.setCodigoe(rsConsulta.getString("id_entrenador"));
                item.setNomj(rsConsulta.getString("nom_j"));
                item.setApj(rsConsulta.getString("ap_j"));
                item.setGenj(rsConsulta.getString("genero"));
                item.setGanaj(rsConsulta.getString("ganancia"));
                items.add(item);
                System.out.println("Paso ..");
            }
                BajasJForm f = new BajasJForm ();	   
                f.setTabla(items);
                request.getSession().setAttribute("bajas_jugador",f); 
                to="bajas_j";
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


    return mapping.findForward(to);
  }
}