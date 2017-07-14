<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

This is the <b>Consulta</b> portlet in View mode.

<portlet:resourceURL var="urlRecursoJson"></portlet:resourceURL>

<script>

function peticionAjaxAlPortlet(){
	YUI().use(
			  'aui-io-request',
			  function (Y) {
					Y.io.request(
						'<%= urlRecursoJson%>',
			      		{
							dataType: "json",
			        		on: {
			          			success: function() {
			            			var data = this.get('responseData').resultado;
			            			
			            			document.getElementById("resultado").innerHTML = data[0].nombre;
			            			
			          			}
			        		}
			      		}
			    	);
			  }
	);
}

</script>

<div onclick="peticionAjaxAlPortlet()">Pulsando aqui debe salir un alert</div>

<div id="resultado"></div>

