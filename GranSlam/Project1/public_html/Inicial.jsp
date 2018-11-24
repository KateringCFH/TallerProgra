<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<style type="text/css">
    <%@include file="Bootstrap/css/bootstrap.css" %>
    
</style>
<title>
Hello World
</title>
</head>
<body>
<br>
<h1 class="text-center">
GRANDSLAM
</h1>
<html:form action="/inicial">
<div class="col-lg-5 ml-auto mr-auto">
<table  class="table">
<thead class="thead-dark">
  <tr>
    <th scope="col" colspan=2 class="text-center">INGRESO DE USUARIOS </th>
  </tr>
</thead>
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
</div>
</html:form>
</body>
</html>
