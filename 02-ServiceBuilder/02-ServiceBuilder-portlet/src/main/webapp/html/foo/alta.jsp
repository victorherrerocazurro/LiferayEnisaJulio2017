

<%
	FooImpl foo = (FooImpl) request.getAttribute(FooPortlet.ATTRIBUTE_FOO);
	
Calendar date = CalendarFactoryUtil.getCalendar();
	if(foo != null && foo.getField4() != null){date.setTime(foo.getField4());}
%>

<portlet:actionURL name="altaFoo" var="urlActionAltaFoo" />

<portlet:renderURL portletMode="VIEW" var="urlInicio">
	<portlet:param name="mvcPath" value="/html/foo/view.jsp" />
</portlet:renderURL>

<liferay-ui:panel title="Formulario" state="close" persistState="<%=true %>">

	<aui:form action="<%=urlActionAltaFoo%>">
		<aui:model-context bean="<%=foo%>" model="<%=FooImpl.class%>" />

		<aui:fieldset>
			<aui:input name="field1" type="text"></aui:input>
			<aui:input name="field2" type="checkbox"
				value="<%=(foo != null)?foo.getField2():false%>"></aui:input>
			<aui:input name="field3" type="number" value="<%=(foo != null)?foo.getField3():0%>"></aui:input>
			<aui:input name="field4" type="date" value="<%=date%>"></aui:input>
			<aui:input name="field5" type="textarea"></aui:input>
		</aui:fieldset>
		<aui:button-row>
			<aui:button value="Enviar" type="submit" />
			<aui:button value="Vaciar" type="reset" />
			<aui:button type="button" value="Volver" href="<%=urlInicio%>" />
		</aui:button-row>
	</aui:form>

</liferay-ui:panel>