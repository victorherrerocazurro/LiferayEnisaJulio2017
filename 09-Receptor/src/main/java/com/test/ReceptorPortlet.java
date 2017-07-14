package com.test;

import java.io.IOException;
import java.io.Serializable;

import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSession;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class ReceptorPortlet
 */
public class ReceptorPortlet extends GenericPortlet {

    public void init() {
        viewTemplate = getInitParameter("view-template");
    }

    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

    	//1-Porlet Session con ambito de Application
    	String parametro = (String) renderRequest.getPortletSession().getAttribute("parametro", PortletSession.APPLICATION_SCOPE);
    	
    	_log.info("El parametro recibido de otro Portlet es: " + parametro);
    	
    	//2-Public Render Parameter
    	String parametroRender = renderRequest.getParameter("parametro");
    	
    	_log.info("El parametro recibido de otro Portlet es: " + parametroRender);
    	
    	//3-Eventos
    	String parametroEvent = (String) renderRequest.getAttribute("parametro");
    	
    	_log.info("El parametro recibido de otro Portlet es: " + parametroEvent);
    	
        include(viewTemplate, renderRequest, renderResponse);
    }
    
    @ProcessEvent(qname="{http://liferay.com}miEvento")
    public void procesarEvent(EventRequest eventRequest, EventResponse eventResponse)
    		throws PortletException, IOException {

    	String value = (String) eventRequest.getEvent().getValue();
    	
    	_log.info("El parametro enviado con eventos: " + value);
    	
    	eventRequest.setAttribute("parametro", value);
    	
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

    private static Log _log = LogFactoryUtil.getLog(ReceptorPortlet.class);

}
