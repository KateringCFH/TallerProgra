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
<h1>
<center>MENU GRANDSLAM</center>
</h1>
<%= session.getAttribute("ini.usu")%>
<html:form action="/menu">
<div class="col-md-8 mr-auto ml-auto">
<table class="table table-hover" cellspacing="2" cellpadding="2" border="1" width="60%" align="center">
<tr align="center">
<td colspan=4>Gestion de Jugadores</td>
    <td><html:submit property="boton" value="Registrar Jugador"/></td>
    <td><html:submit property="boton" value="Listar Jugador" /></td>
    <td><html:submit property="boton" value="Editar Jugador" /></td>
    <td><html:submit property="boton" value="Eliminar Jugador" /></td>
</tr>
<tr align="center"><td colspan=4>Gestion de Equipos</td>
    <td><html:submit property="boton" value="Registrar Equipo"/></td>
    <td><html:submit property="boton" value="Listar Equipo" /></td>
    <td><html:submit property="boton" value="Editar Equipo" /></td>
    <td><html:submit property="boton" value="Eliminar Equipo" /></td>
</tr>

<tr align="center"><td colspan=4>Gestion de Entrenadores</td>
    <td><html:submit property="boton" value="Registrar Entrenador"/></td>
    <td><html:submit property="boton" value="Listar Entrenador" /></td>
    <td><html:submit property="boton" value="Editar Entrenador" /></td>
    <td><html:submit property="boton" value="Eliminar Entrenador" /></td>
</tr>
<tr align="center"><td colspan=4>Gestion de Arbitros</td>
    <td><html:submit property="boton" value="Registrar Arbitro" /></td>
    <td><html:submit property="boton" value="Listar Arbitro" /></td>
    <td><html:submit property="boton" value="Editar Arbitro" /></td>
    <td><html:submit property="boton" value="Eliminar Arbitro" /></td>
</tr>
<tr align="center"><td colspan=4>Gestion de Partidos</td>
    <td colspan="2"><html:submit property="boton" value="Regsitrar Partido" /></td>
    <td colspan="2"><html:submit property="boton" value="Listar Partido" /></td>
    
</tr>
<tr align="center"><td colspan=4>Gestion de Resultados</td>
    <td colspan="2"><html:submit property="boton" value="Registrar Resultados" /></td>
    <td colspan="2"><html:submit property="boton" value="Listar Resultados" /></td>    
    
</tr>
<tr align="center"><td colspan=4>Gestion de Torneos</td>
    <td colspan="2"><html:submit property="boton" value="Regsitrar Torneo" /></td>
    <td colspan="2"><html:submit property="boton" value="Listar Torneo" /></td>
    
</tr>
<tr align="center"><td colspan=4>Gestion de Fases</td>
    <td colspan="2"><html:submit property="boton" value="Registrar Fase" /></td>
    <td colspan="2"><html:submit property="boton" value="Listar Fase" /></td>
    
</tr>
<tr align="center"><td colspan=4>Gestion de Modalidades</td>
    <td colspan="2"><html:submit property="boton" value="Registrar Modalidad" /></td>
    <td colspan="2"><html:submit property="boton" value="Listar Modalidad" /></td>
    
</tr>
</table>
</div>
</html:form>
</body>
</html>
