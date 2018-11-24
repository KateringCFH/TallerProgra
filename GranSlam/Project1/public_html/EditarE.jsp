<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Editar Entrenador by Fabrii
</h2>
<html:form action="/editarE">
<table  cellspacing="2" cellpadding="1" border="1" width="50%" align="center">
<tr>
    <td><b>Codigo Entrenador</b></td>
    <td><b>Nombre</b></td>
    <td><b>Apellido</b></td>
</tr>
<logic:iterate id="tabla" indexId="index" name="muestra_e" property="tabla">
    <tr>
      <td>
        <html:submit property="cod_e" >
          
            <bean:write name="tabla" property="cod_e" />
        </html:submit>
       </td>  
        <td><bean:write name="tabla" property="nombre_e" /></td>
        <td><bean:write name="tabla" property="apellido_e" /></td>
        
    </tr>
</logic:iterate>
</table>

</html:form>
</body>
</html>

