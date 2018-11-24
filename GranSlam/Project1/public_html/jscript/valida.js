function finmes()
{
	this[1]=31;this[2]=29;this[3]=31;this[4]=30;this[5]=31;this[6]=30;
	this[7]=31;this[8]=31;this[9]=30;this[10]=31;this[11]=30;this[12]=31;
};
function EsFecha(fecha)
{
var a,d,m;
var mes = new finmes;
var er = new RegExp("^[0-3]{1}[0-9]{1}/(01|02|03|04|05|06|07|08|09|10|11|12)/[1-2]{1}[0-9]{3}$","g");
a = er.test(fecha);
if (a) {
		d = parseInt(fecha.substring(0,2),10);
		m = parseInt(fecha.substring(3,5),10);
		if (d > 0 && d <= mes[m]) { return true; };
};
return false;
};

function EsTelefono(valor)
{
var fono = new RegExp("^[0-9]{7,15}$","g");
return fono.test(valor)
};

function EsNro(valor)
{
var nro = new RegExp("^[0-9.]{1,12}$","g");
return nro.test(valor)
};

function EsCadena(valor)
{
var tipo = new RegExp("^[a-zA-Z0-9_. ]+$","g");
return tipo.test(valor)
};

function EsEmail(valor)
{
var email = new RegExp("^[a-z0-9.]+@[a-z.]+$","g");
return email.test(valor)
};

function EsVacio(valor)
{
if (valor == "") return true
else return false;
};


function Redondea(num, numDec, decSep, thousandSep)
{
    // rounds number to X decimal places, defaults to 2
    numDec = (!numDec ? 2 : numDec);
    return Math.round(num*Math.pow(10,numDec))/Math.pow(10,numDec);
} 

function EvaluateText(cadena, obj)
{
    opc = false; 
    if (cadena == "%d")
     if (event.keyCode > 47 && event.keyCode < 58)
      opc = true;
    if (cadena == "%f"){ 
     if (event.keyCode > 47 && event.keyCode < 58)
      opc = true;
     if (obj.value.search("[.*]") == -1 && obj.value.length != 0)
      if (event.keyCode == 46)
       opc = true;
    }
    if(opc == false)
     event.returnValue = false; 
}

// Scripts de validacion de fechas

function esDigito(sChr){
    var sCod = sChr.charCodeAt(0);
    return ((sCod > 47) && (sCod < 58));
   }

   function valSep(oTxt){
    var bOk = false;
    bOk = bOk || ((oTxt.value.charAt(2) == "-") && (oTxt.value.charAt(5) == "-"));
    bOk = bOk || ((oTxt.value.charAt(2) == "/") && (oTxt.value.charAt(5) == "/"));
    return bOk;
   }

   function finMes(oTxt){
    var nMes = parseInt(oTxt.value.substr(3, 2), 10);
    var nAno = parseInt(oTxt.value.substr(6), 10);
    var nRes = 0;
    switch (nMes){
     case 1: nRes = 31; break;
     case 2: nRes = 28; break;
     case 3: nRes = 31; break;
     case 4: nRes = 30; break;
     case 5: nRes = 31; break;
     case 6: nRes = 30; break;
     case 7: nRes = 31; break;
     case 8: nRes = 31; break;
     case 9: nRes = 30; break;
     case 10: nRes = 31; break;
     case 11: nRes = 30; break;
     case 12: nRes = 31; break;
    }
    return nRes + (((nMes == 2) && (nAno % 4) == 0)? 1: 0);
   }

   function valDia(oTxt){
    var bOk = false;
    var nDia = parseInt(oTxt.value.substr(0, 2), 10);
    bOk = bOk || ((nDia >= 1) && (nDia <= finMes(oTxt)));
    return bOk;
   }

   function valMes(oTxt){
    var bOk = false;
    var nMes = parseInt(oTxt.value.substr(3, 2), 10);
    bOk = bOk || ((nMes >= 1) && (nMes <= 12));
    return bOk;
   }

   function valAno(oTxt){
    var bOk = true;
    var nAno = oTxt.value.substr(6);
    bOk = bOk && ((nAno.length == 2) || (nAno.length == 4));
    if (bOk){
     for (var i = 0; i < nAno.length; i++){
      bOk = bOk && esDigito(nAno.charAt(i));
     }
    }
    return bOk;
   }

   function valFecha(oTxt){
    var bOk = true;
    if (oTxt.value != ""){
     bOk = bOk && (valAno(oTxt));
     bOk = bOk && (valMes(oTxt));
     bOk = bOk && (valDia(oTxt));
     bOk = bOk && (valSep(oTxt));
     return bOk;
    }
   }

   function fechaMayorOIgualQue(fec0, fec1){
    var bRes = false;
    var sDia0 = fec0.value.substr(0, 2);
    var sMes0 = fec0.value.substr(3, 2);
    var sAno0 = fec0.value.substr(6, 4);
    var sDia1 = fec1.value.substr(0, 2);
    var sMes1 = fec1.value.substr(3, 2);
    var sAno1 = fec1.value.substr(6, 4);
    if (sAno0 > sAno1) bRes = true;
    else {
     if (sAno0 == sAno1){
      if (sMes0 > sMes1) bRes = true;
      else {
       if (sMes0 == sMes1)
        if (sDia0 >= sDia1) bRes = true;
      }
     }
    }
    return bRes;
   }


   function fMayorOIgualQue(fec0, fec1){
    var bRes = false;
    if(EsVacio(fec1))
      fec1 = '31/12/2010';
    var sDia0 = fec0.substr(0, 2);
    var sMes0 = fec0.substr(3, 2);
    var sAno0 = fec0.substr(6, 4);
    var sDia1 = fec1.substr(0, 2);
    var sMes1 = fec1.substr(3, 2);
    var sAno1 = fec1.substr(6, 4);
    if (sAno0 > sAno1) bRes = true;
    else {
     if (sAno0 == sAno1){
      if (sMes0 > sMes1) bRes = true;
      else {
       if (sMes0 == sMes1)
        if (sDia0 >= sDia1) bRes = true;
      }
     }
    }
    return bRes;
   }
  