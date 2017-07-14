<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>New</b> portlet in View mode.

<portlet:actionURL name="Saludar" var="urlAccion"></portlet:actionURL>

<a href="<%=urlAccion %>">a la accion</a>
