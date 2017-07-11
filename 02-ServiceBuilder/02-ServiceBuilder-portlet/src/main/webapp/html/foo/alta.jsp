<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<portlet:defineObjects />

<portlet:actionURL name="altaFoo" var="urlActionAltaFoo" />

<portlet:renderURL portletMode="VIEW" var="urlInicio">
	<portlet:param name="mvcPath" value="/html/foo/view.jsp"/>
</portlet:renderURL>

<aui:form action="<%=urlActionAltaFoo%>">
	<aui:fieldset>
		<aui:input name="field1" type="text"></aui:input>
		<aui:input name="field2" type="checkbox"></aui:input>
		<aui:input name="field3" type="number"></aui:input>
		<aui:input name="field4" type="date"></aui:input>
		<aui:input name="field5" type="textarea"></aui:input>
	</aui:fieldset>
	<aui:button-row>
		<aui:button value="Enviar" type="submit" />
		<aui:button value="Vaciar" type="reset" />
		<aui:button type="button" value="Volver" href="<%=urlInicio %>"/>
	</aui:button-row>
</aui:form>