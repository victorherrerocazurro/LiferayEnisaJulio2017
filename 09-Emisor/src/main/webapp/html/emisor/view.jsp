<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Emisor</b> portlet in View mode.

<portlet:actionURL name="EnviarDato" var="urlEnviarDato"></portlet:actionURL>

<a href="<%= urlEnviarDato%>"> Enviar Dato</a>