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
Editar Equipos 
</h2>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Hello World
</title>
</head>
<body>
<h2>

</h2>
<html:form action="/editareq">
<table  cellspacing="2" cellpadding="1" border="1" width="50%" align="center">
<tr>
    <td><b>Codigo Equipo</b></td>
    <td><b>Nombre</b></td>
    
</tr>
<logic:iterate id="tabla" indexId="index" name="muestraeq" property="tabla">
    <tr>
        <td>
          <html:submit property="cod">
            <bean:write name="tabla" property="codigoeq" />
          </html:submit>
        <td><bean:write name="tabla" property="modalidad" /></td>
        
        
    </tr>
</logic:iterate>
</table>

</html:form>

</body>
</html>

</body>
</html>
