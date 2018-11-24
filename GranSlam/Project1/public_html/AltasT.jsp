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
Registrar torneos
</h2>
<%= session.getAttribute("ini.usu")%>
<html:form action="/altt">
<table  cellspacing="2" cellpadding="2" border="1" width="100%" align="center">
<!--En el archivo AplicationResources.properties se definen las etiquetetas textuales que se mostrara en el formulario para cada caja. 
se utiliza el key para identificar el campo que se etiquetara: ej
altas_j.nom=Nombre Jugador-->
<tr>
    <td><bean:message key="altt.cod" />:</td>
    <td><html:text property="codigo_t" /></td>
</tr>
<tr>
    <td><bean:message key="altt.nom" />:</td>
    <td><html:text property="nombre_t" /></td>
</tr>
<tr>
    <td><bean:message key="altt.pais" />:</td>
    <td><html:text property="nom_pais" /></td>
</tr>
<tr>
    <td><bean:message key="altt.ges" />:</td>
    <td><html:text property="gestion" /></td>
</tr>
<tr>
    <td colspan="2" align="center"><html:submit value="Registrar" />
</td>
</tr>
</table>
</html:form>
</body>
</html>
