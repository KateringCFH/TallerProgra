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
Registro de Resultados
</h2>
<html:form action="/altares">
<table  cellspacing="2" cellpadding="1" border="1" width="100%">
<tr>
    <td><bean:message key="altres.cod" /></td>
    <td><html:text property="cod_res" /></td>
</tr>
<tr>
    <td><bean:message key="altres.part" /></td>
    <td><html:select property="cod_part">
        <html:options collection="part" labelProperty="cod_part" property="codpart"/>
    </html:select></td>
</tr>
<tr>
    <td><bean:message key="altres.eq1" /></td>
    <td><html:select property="cod_eq1">
        <html:options collection="eq1" labelProperty="codeq1" property="codigoeq1" />
        </html:select>
    </td>
</tr>
<tr>
    <td><bean:message key="altres.eq2" /></td>
    <td><html:select property="cod_eq2">
        <html:options collection="eq2" labelProperty="codeq2" property="codigoeq2" />
        </html:select>
    </td>
</tr>
<tr>
    <td><bean:message key="altres.set" /></td>
    <td><html:text property="res_tot" /></td>
</tr>
<tr>
    <td colspan="2" align="center"><html:submit value="Registrar" /></td>
</tr>
</table>

</html:form>
</body>
</html>
