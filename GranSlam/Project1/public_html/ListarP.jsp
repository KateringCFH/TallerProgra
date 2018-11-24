<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
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
Lista de Partidos- PRTIDOS Y JUGADORES
</h2>
<html:form action="/listarP">
<table  cellspacing="2" cellpadding="1" border="1" width="60%" align="center">
<tr>
    <td><b>Fecha</b></td>
    <td><b>Fase</b></td>
    <td><b>Modalidad</b></td>
    <td><b>Genero</b></td>
    <td><b>Arbitro</b></td>
</tr>
<logic:iterate id="tabla" indexId="index" name="muestrap" property="tabla">
<tr>
    <td><bean:write name="tabla" property="fecha" /></td>
    <td><bean:write name="tabla" property="id_fase" /></td>
    <td><bean:write name="tabla" property="id_modalidad" /></td>
    <td><bean:write name="tabla" property="id_genero" /></td>
    <td><bean:write name="tabla" property="id_arbitro" /></td>
</tr>
</logic:iterate>
</table>
</html:form>
</body>
</html>
