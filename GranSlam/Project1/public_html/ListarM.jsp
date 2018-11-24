<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
ListarM
</title>
</head>
<body>
<h2>
Listado de Modalidades
</h2>
USUARIO:<%= session.getAttribute("ini.usu")%>

<table  cellspacing="2" cellpadding="1" border="1" width="100%" align="center">
  <tr>
      <td><b>CODIGO</b></td>
      <td><b>MODALIDAD</b></td>
  </tr>
  <logic:iterate id="tabla" indexId="index" name="listado_modalidad" property="tabla">
    <tr>
        <td><bean:write name="tabla" property="codigo" /></td>
        <td><bean:write name="tabla" property="nombre" /></td>
    </tr>
  </logic:iterate>
</table>

</body>
</html>
