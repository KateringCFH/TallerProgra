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
Lista de Resultados
</h2>
<html:form action="/listares">
<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td>Codigo Set</td>
    <td>Codigo del Partido</td>
    <td>Jugador 1</td>
    <td>Jugador 2</td>
    <td>Resultado Partido</td>
</tr>
<logic:iterate id="tabla" indexId="index" name="lista_res" property="tabla">

<tr>
    <td><bean:write name="tabla" property="cod_set" /></td>
    <td><bean:write name="tabla" property="cod_part" /></td>
    <td><bean:write name="tabla" property="codeq1" /></td>
    <td><bean:write name="tabla" property="codeq2" /></td>
    <td><bean:write name="tabla" property="res_total" /></td>
</tr>
</logic:iterate>
</table>
</html:form>
</body>
</html>
