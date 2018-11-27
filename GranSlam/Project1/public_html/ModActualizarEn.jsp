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
Registrar nuevo entrenador
</h2>
<%= session.getAttribute("ini.usu")%>
<html:form action="/mod_actualizarEn">
<table  cellspacing="2" cellpadding="2" border="1" width="100%" align="center">
<logic:iterate id="tabla" indexId="index" name="actualizar_en" property="tabla">
<tr>
  <td><bean:message key="alte.cod" /></td>
   <td><html:text property="cod_e" name="tabla" /></td>
</tr>
<tr>
    <td><bean:message key="alte.nom"/>:</td>
    <td><html:text property="nombre_e" name="tabla"/></td>
</tr>
<tr>
    <td><bean:message key="alte.ap"/>:</td>
    <td><html:text property="apellido_e" name="tabla"/></td>
</tr>

</logic:iterate>

<tr>
    <td><html:submit value="Guardar" /></td>
</tr>

</table>
</html:form>
</body>
</html>
