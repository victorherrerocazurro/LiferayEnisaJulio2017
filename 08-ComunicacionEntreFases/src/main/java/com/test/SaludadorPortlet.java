package com.test;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * Portlet implementation class SaludadorPortlet
 */
public class SaludadorPortlet extends GenericPortlet {

    private static Log _log = LogFactoryUtil.getLog(SaludadorPortlet.class);
	
	protected String viewTemplate;
	protected String editTemplate;
	
	//No emplear nunca los constructores de los Bean Manejados para inicializar
	/*public SaludadorPortlet() {
		viewTemplate = getInitParameter("view-template");
        editTemplate = getInitParameter("edit-template");
	}*/
	
    public void init() {
        viewTemplate = getInitParameter("view-template");
        editTemplate = getInitParameter("edit-template");
    }
    
    //Metodos de la fase de Render
    @Override
    public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

    	String parametetroRender = renderRequest.getParameter("parametro");
    	
    	_log.info("Parametro enviado desde el Accion en un RenderParameter: " + parametetroRender);
    	
    	String parametroSession = (String) renderRequest.getPortletSession().getAttribute("parametroSession");
    	
    	_log.info("Parametro enviado desde el Accion en un SessionAtribute: " + parametroSession);
    	
    	String parametroRequest = (String) renderRequest.getAttribute("parametroRequest");
    	
    	_log.info("Parametro enviado desde el Accion en un RequestAtribute: " + parametroRequest);
    	
        include(viewTemplate, renderRequest, renderResponse);
    }
    
    @Override
    protected void doEdit(RenderRequest renderRequest, RenderResponse renderResponse)
    		throws PortletException, IOException {
    	 include(editTemplate, renderRequest, renderResponse);
    }
    
    //Metodos de la fase de Accion
    
    @ProcessAction(name="saludar")
    public void procesarActionSaludar(ActionRequest actionRequest, ActionResponse actionResponse)
    		throws PortletException, IOException {
    	
    	try {
			List<User> users = UserLocalServiceUtil.getUsers(0, 101);

			System.out.println("Se ha nconseguido los usurios");
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	//Recoger los parametro que nos envia el cliente
    	String nombre = actionRequest.getParameter("nombre");
    	
    	//Invocar la logica de negocio
    	PortletPreferences preferences = actionRequest.getPreferences();
    	
    	String prefijo = preferences.getValue("prefijo", "");
    	String sufijo = preferences.getValue("sufijo", "");
    	
    	String saludo = prefijo + nombre + sufijo;
    	
    	//Hacer llegar el resultado de la logica de negocio a la fase de Render para que pinte la Vista
    	
    	//1-RenderParam (Portlet v1)
		actionResponse.setRenderParameter("parametro", saludo);
    	
    	//2-SessionAttribute (Portlet v1)
    	actionRequest.getPortletSession().setAttribute("parametroSession", saludo);
    	
    	//3-RequestAttribute (Portlet v2)
    	actionRequest.setAttribute("parametroRequest", saludo);
    	
    }
    
    @ProcessAction(name="guardarPreferencias")
    public void procesarActionGuardarPreferencias(ActionRequest actionRequest, ActionResponse actionResponse)
    		throws PortletException, IOException {
    	
    	//Recuperamos la informacion que nos envia el cliente
    	String prefijo = actionRequest.getParameter("prefijo");
    	String sufijo = actionRequest.getParameter("sufijo");
    	
    	//Persistencia en las preferencias
    	PortletPreferences preferences = actionRequest.getPreferences();
    	
    	preferences.setValue("prefijo", prefijo);
    	preferences.setValue("sufijo", sufijo);
    	
    	preferences.store();
    	
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


}
