<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Saludador</b> portlet in View mode.


<%=renderRequest.getParameter("parametro")%>

<%=renderRequest.getPortletSession().getAttribute("parametroSession")%>

<%=renderRequest.getAttribute("parametroRequest")%>

<portlet:namespace/>

<portlet:actionURL name="saludar" var="urlSaludar"></portlet:actionURL>
<portlet:renderURL portletMode="edit" var="urlEditMode"></portlet:renderURL>

<a href="<%=urlEditMode %>">Modo de Preferencias</a>

<form action="<%=urlSaludar%>" method="post">
	Nombre: <input type="text" name="nombre"/>
	<input type="submit" value="Enviar">
</form>

