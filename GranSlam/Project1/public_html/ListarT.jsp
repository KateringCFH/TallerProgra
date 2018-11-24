<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
ListarT
</title>
</head>
<body>
<h2>
Listado de Torneos
</h2>
USUARIO:<%= session.getAttribute("ini.usu")%>

  <table  cellspacing="2" cellpadding="1" border="1" width="100%" align="center">
    <tr>
        <td><b>ID</b></td>
        <td><b>NOMBRE</b></td>
        <td><b>PAIS</b></td>
        <td><b>GESTION</b></td>
    </tr>
    <logic:iterate id="tabla" indexId="index" name="muestrat" property="tabla">
      <tr>
          <td><bean:write name="tabla" property="id_torneo" /></td>
          <td><bean:write name="tabla" property="nombre" /></td>
          <td><bean:write name="tabla" property="pais" /></td>
          <td><bean:write name="tabla" property="gestion" /></td>
      </tr>
    </logic:iterate>
  </table>


</body>
</html>
