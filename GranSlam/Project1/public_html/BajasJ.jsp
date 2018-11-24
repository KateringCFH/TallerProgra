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
Eliminar Jugadores
</h2>
<html:form action="/bajas_jugador">
<table border="1" align="center" >
<tr>
    <td align="center"><b>Codigo Jugador</b></td>
    <td align="center"><b>Codigo Equipo</b></td>
    <td align="center"><b>Codigo Entrenador</b></td>
    <td align="center"><b>Nombre Jugador</b></td>
    <td align="center"><b>Apellido Jugador</b></td>
    <td align="center"><b>Genero</b></td>
    <td align="center"><b>Ganacia</b></td>
</tr>
<logic:iterate id="tabla" indexId="index" name="bajas_jugador" property="tabla">
          <tr>
            <td>
                <html:submit property="cod">
                <bean:write name="tabla" property="codigoj" />
                </html:submit>
              </td>
            <td><bean:write name="tabla" property="codigoeq" /></td>
            <td><bean:write name="tabla" property="codigoe" /></td>
            <td><bean:write name="tabla" property="nomj" /></td>
            <td><bean:write name="tabla" property="apj" /></td>
            <td><bean:write name="tabla" property="genj" /></td>
            <td><bean:write name="tabla" property="ganaj" /></td>
          </tr>
</logic:iterate>
</html:form>
</table>
</body>
</html>
