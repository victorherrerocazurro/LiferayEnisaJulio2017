<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Saludador</b> portlet in Edit mode.

<portlet:actionURL name="guardarPreferencias" var="urlGuardarPreferencias"></portlet:actionURL>

<form action="<%=urlGuardarPreferencias%>" method="post">
	Prefijo: <input type="text" name="prefijo" value="<%=renderRequest.getPreferences().getValue("prefijo", "")%>"/>
	Sufijo: <input type="text" name="sufijo" value="<%=renderRequest.getPreferences().getValue("sufijo", "")%>"/>
	<input type="submit" value="Enviar">
</form>