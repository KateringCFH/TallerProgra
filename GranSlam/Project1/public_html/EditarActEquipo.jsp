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
<html:form action="/edit_equipo">
<table  cellspacing="2" cellpadding="2" border="1" width="100%" align="center">
<logic:iterate id="tabla" indexId="index" name="editar_eq" property="tabla">
<tr>
  <td><bean:message key="alteq.cod" /></td>
   <td><html:hidden property="codigoeq" name="tabla" /></td>
</tr>
<tr>
    <td><bean:message key="alteq.nombreq"/>:</td>
    <td><html:text property="modalidad" name="tabla"/></td>
</tr>


</logic:iterate>

<tr>
    <td><html:submit value="Guardar" /></td>
</tr>

</table>
</html:form>
</body>
</html>

