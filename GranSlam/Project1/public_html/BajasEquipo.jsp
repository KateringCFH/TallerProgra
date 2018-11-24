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
Eliminar Equipo
</h2>
<html:form action="/bajas_equipo">
<table border="1" align="center" >
<tr>
    <td align="center"><b>Codigo Equipo</b></td>
    <td align="center"><b>Modalidad</b></td>
</tr>
<logic:iterate id="tabla" indexId="index" name="bajas_equipo" property="tabla">
          <tr>
            <td>
                <html:submit property="cod">
                <bean:write name="tabla" property="codigoeq" />
                </html:submit>
              </td>
            <td><bean:write name="tabla" property="modalidad" /></td>
         
          </tr>
</logic:iterate>
</html:form>
</table>
</body>
</html>
