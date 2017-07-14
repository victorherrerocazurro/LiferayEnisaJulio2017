package com.test;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class EmisorPortlet
 */
public class EmisorPortlet extends GenericPortlet {

    public void init() {
        viewTemplate = getInitParameter("view-template");
    }

    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

        include(viewTemplate, renderRequest, renderResponse);
    }
    
    @ProcessAction(name="EnviarDato")
    public void processActionEnviarDato(ActionRequest request, ActionResponse response)
    		throws PortletException, IOException {
    	
    	//1-Porlet Session con ambito de Application
    	request.getPortletSession().setAttribute("parametro", "El dato que envia el emisor", PortletSession.APPLICATION_SCOPE);
    	
    	//2-Public Render Parameter
    	response.setRenderParameter("parametro", "El dato enviado desde el emisor como Render");
    	
    	
		//3-Event
    	QName namespace = new QName("http://liferay.com", "miEvento", "x");
    	response.setEvent(namespace, "Este dato es el que enviamos al emisor con Eventos");
    	
    }

    protected void include(
            String path, RenderRequest renderRequest,
            RenderResponse renderResponse)
        throws IOException, PortletException {

        PortletRequestDispatcher portletRequestDispatcher =
            getPortletContext().getRequestDispatcher(path);

        if (portletRequestDispatcher == null) {
            _log.error(path + " is not a valid include");
        }
        else {
            portletRequestDispatcher.include(renderRequest, renderResponse);
        }
    }
 
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(EmisorPortlet.class);

}
