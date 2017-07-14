package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.json.JSONArray;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class ConsultaPortlet
 */
public class ConsultaPortlet extends GenericPortlet {

    public void init() {
        viewTemplate = getInitParameter("view-template");
    }
    
    @Override
    public void serveResource(ResourceRequest request, ResourceResponse response)
    		throws PortletException, IOException {

    	//No delegamos a un JSP la generacion de la vista, porque en realidad no generamos
    	//una vista al uso, lo que se genera e realidad es un dato formateado, normalmente
    	//en JSON
    	
    	//Es la logica para invocar el servicio
    	
    	JSONObject resultado = JSONFactoryUtil.createJSONObject();
    	
    	JSONArray array = JSONFactoryUtil.createJSONArray();
    	
    	for (int i = 0; i < 3; i++) {
			
    		JSONObject tmp = JSONFactoryUtil.createJSONObject();
    		
    		tmp.put("nombre", "Victor" + i);
    		tmp.put("apellido", "Herrero" + i);
    		
    		array.put(tmp);
    		
		}
    	
    	resultado.put("resultado", array);
    	
    	//Logica para retornar el resultado del servicio a el cliente
    	
    	PrintWriter out = response.getWriter();
    	
    	out.print(resultado);
    	
    	out.flush();
    	
    	out.close();
    }

    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

        include(viewTemplate, renderRequest, renderResponse);
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

    private static Log _log = LogFactoryUtil.getLog(ConsultaPortlet.class);

}
