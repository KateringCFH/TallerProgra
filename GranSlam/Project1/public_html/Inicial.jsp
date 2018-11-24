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
Gran Salm
</h2>
<html:form action="/inicial">
<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
<td colspan=2>Ingreso de usuario </td>
</tr>
<tr>
    <td><bean:message key="ini.usu" /></td>
    <td><html:text property="usuario" /></td>
</tr>
<tr>
    <td><bean:message key="ini.cla" /></td>
    <td><html:text property="clave" /></td>
</tr>
<tr>
    <td colspan=2><html:submit value="Ingresar" /></td>
</tr>
</table>
</html:form>
</body>
</html>
