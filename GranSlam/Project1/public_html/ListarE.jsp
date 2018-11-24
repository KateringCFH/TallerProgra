<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
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
Los entrenadores registrados se muestran a continuacion
</h2>
USUARIO:<%= session.getAttribute("ini.usu")%>

<html:form action="/listarE">
<table  cellspacing="2" cellpadding="1" border="1" width="50%" align="center">
<tr>
    <td><b>Codigo Entrenador</b></td>
    <td><b>Nombre</b></td>
    <td><b>Apellido</b></td>
</tr>
<logic:iterate id="tabla" indexId="index" name="muestrae" property="tabla">
    <tr>
        <td><bean:write name="tabla" property="cod_e" /></td>
        <td><bean:write name="tabla" property="nombre_e" /></td>
        <td><bean:write name="tabla" property="apellido_e" /></td>
    </tr>
</logic:iterate>
</table>

</html:form>

</body>
</html>
