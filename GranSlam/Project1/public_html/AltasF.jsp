<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
AltasF
</title>
</head>
<body>
<h2>
Registra Fase
</h2>
USUARIO:<%= session.getAttribute("ini.usu")%>

<html:form action="/altaf">

  <table  cellspacing="2" cellpadding="1" border="1" width="100%">
  <tr>
      <td><bean:message key="altaf.codigo" /></td>
      <td><html:text property="codigo" /></td>
  </tr>
  <tr>
      <td><bean:message key="altaf.nombre" /></td>
      <td><html:text property="nombre" /></td>
  </tr>
  <tr>
      <td><bean:message key="altaf.ganador" /></td>
      <td><html:text property="ganador" /></td>
  </tr>
  <tr>
      <td><bean:message key="altaf.consuelo" /></td>
      <td><html:text property="consuelo" /></td>
  </tr>
  <tr>
      <td colspan="2" align="center"><html:submit value="Registrar" /></td>
  </tr>
  </table>

</html:form>

</body>
</html>
