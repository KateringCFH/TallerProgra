package mypackage1;

public class ClasePartido 
{
  String fecha;
  String id_fase;
  String id_modalidad;
  String id_genero;
  String id_arbitro;
  String cod_partido;

  public ClasePartido()
  {
  }

  public String getFecha()
  {
    return fecha;
  }

  public void setFecha(String newFecha)
  {
    fecha = newFecha;
  }

  public String getId_fase()
  {
    return id_fase;
  }

  public void setId_fase(String newId_fase)
  {
    id_fase = newId_fase;
  }

  public String getId_modalidad()
  {
    return id_modalidad;
  }

  public void setId_modalidad(String newId_modalidad)
  {
    id_modalidad = newId_modalidad;
  }

  public String getId_genero()
  {
    return id_genero;
  }

  public void setId_genero(String newId_genero)
  {
    id_genero = newId_genero;
  }

  public String getId_arbitro()
  {
    return id_arbitro;
  }

  public void setId_arbitro(String newId_arbitro)
  {
    id_arbitro = newId_arbitro;
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