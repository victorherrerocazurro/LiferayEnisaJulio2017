<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Receptor</b> portlet in View mode.

<div id="<portlet:namespace/>_resultado"></div>

<script>

function <portlet:namespace/>_saludar(){
	
	//peticion ajax
	
	var div = document.getElementById("<portlet:namespace/>_resultado");
	
	div.innerHTML = "";
	
}

</script>