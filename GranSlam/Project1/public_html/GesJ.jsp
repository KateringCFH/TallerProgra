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
Gestion de Jugadores
</h2>
<%= session.getAttribute("ini.usu")%>
<br>
<%= session.getAttribute("botm")%>
<html:form action="/gesj">
<table  cellspacing="2" cellpadding="2" border="1" width="80%" align="center">
<tr>
    <td><html:submit property="boton1" value="AltasJ" /></td>
</tr>
<tr>
    <td><html:submit property="boton1" value="ListarJ" /></td>
</tr>
</table>
</html:form>
</body>
</html>
