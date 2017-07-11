package com.example.plugins.liferaymvc.portlets;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class HolaMundoPortlet
 */
public class HolaMundoPortlet extends MVCPortlet {

	@Override
	public void render(RenderRequest arg0, RenderResponse arg1) throws PortletException, IOException {

		// Codigo que permita la inicializacion del portlet, es decir que
		// permita al RenderMode View pintarse

		super.render(arg0, arg1);
	}

	public void saludar(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		//Codigo que permite procesar una tarea que se le pide al Portlet

	}
	
	public void despedir(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {
		
		//Codigo que permite procesar una tarea que se le pide al Portlet
		
	}

}
