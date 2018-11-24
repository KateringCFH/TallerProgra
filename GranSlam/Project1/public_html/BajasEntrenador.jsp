<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>
Eliminar Entrenador
</h2>
<html:form action="/bajas_entrenador">
<table border="1" align="center" >
<tr>
    <td align="center"><b>Codigo Entrenador</b></td>
    <td align="center"><b>Nombre Entrenador</b></td>
    <td align="center"><b>Apellido Entrenador</b></td>
</tr>
<logic:iterate id="tabla" indexId="index" name="bajas_entrenador" property="tabla">
          <tr>
            <td>
                <html:submit property="cod">
                <bean:write name="tabla" property="cod_e" />
                </html:submit>
              </td>
            <td><bean:write name="tabla" property="nombre_e" /></td>
            <td><bean:write name="tabla" property="apellido_e" /></td>
         
          </tr>
</logic:iterate>
</html:form>
</table>
</body>
</html>
