<%@page import="com.example.plugins.model.Foo"%>
<%@page import="java.util.List"%>
<%@page import="com.example.plugins.portlets.FooPortlet"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<portlet:defineObjects />

<portlet:renderURL portletMode="VIEW" var="urlAlta">
	<portlet:param name="mvcPath" value="/html/foo/alta.jsp"/>
</portlet:renderURL>

<aui:button-row>
	<aui:button type="button" value="Nuevo" href="<%=urlAlta %>"/>
</aui:button-row>

<%
	List<Foo> foos = (List<Foo>) request.getAttribute(FooPortlet.ATTRIBUTE_FOOS);
%>
<c:if test="<%=foos != null %>">
	<liferay-ui:search-container>
		<liferay-ui:search-container-results results="<%= foos %>" />
	
		<liferay-ui:search-container-row className="com.example.plugins.model.impl.FooImpl" modelVar="aFooImpl">
		
			<liferay-ui:search-container-column-text property="field1" />
	
			<liferay-ui:search-container-column-text property="field2" />
	
			<liferay-ui:search-container-column-text property="field3" />
	
			<liferay-ui:search-container-column-date property="field4" />
	
			<liferay-ui:search-container-column-text property="field5" />
	
			<liferay-ui:search-container-column-text property="userName" />
			
			<portlet:renderURL portletMode="VIEW" var="urlEdit">
				<portlet:param name="mvcPath" value="/html/foo/alta.jsp"/>
				<portlet:param name="idFoo" value="<%=String.valueOf(aFooImpl.getFooId())%>"/>
			</portlet:renderURL>
			
			<liferay-ui:search-container-column-text>
				<a href="<%=urlEdit %>">Editar</a>
			</liferay-ui:search-container-column-text>
				
		</liferay-ui:search-container-row>
	
		<liferay-ui:search-iterator />
	</liferay-ui:search-container>

</c:if>

