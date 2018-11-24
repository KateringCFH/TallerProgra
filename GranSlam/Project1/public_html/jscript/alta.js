function fParams( )
{
  var Mensaje = "";
  f = document.forms[0];

  if(EsVacio( f.codigo.value ))
    Mensaje = Mensaje + 'Verifique el codigo \n';
  if(EsVacio( f.nombre_e.value ))
    Mensaje = Mensaje + 'Verifique el nombre \n';
  if(EsVacio( f.apellido_e.value ))
    Mensaje = Mensaje + 'Verifique el apellido \n';



  if( Mensaje == "" )
    return true;
  else
  {
    alert( Mensaje );
    return false;
  }
}
