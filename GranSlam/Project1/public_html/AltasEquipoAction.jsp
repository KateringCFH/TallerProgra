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
The current time is: 
</h2>
Registrar nuevo Equipo
</h2>
<%= session.getAttribute("ini.usu")%>
<html:form action="/altaeq">
<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td><bean:message key="alteq.cod" />:</td>
    <td><html:text property="cod_eq" /></td>
</tr>
<tr>
    <td><bean:message key="alteq.nombreq" /></td>
    <td><html:text property="nombreq" /></td>
</tr>
<tr>
    <td><html:submit value="Registrar"/></td>
</tr>
</table>
</html:form>
</body>
</html>
