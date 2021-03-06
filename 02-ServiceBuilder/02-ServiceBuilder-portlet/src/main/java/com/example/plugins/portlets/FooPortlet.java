package com.example.plugins.portlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.example.plugins.model.Foo;
import com.example.plugins.service.FooLocalServiceUtil;
import com.example.plugins.service.dto.FooDto;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class FooPortlet
 */
public class FooPortlet extends MVCPortlet {
	
	public static final String ATTRIBUTE_FOOS = "foos";
	public static final String ATTRIBUTE_FOO = "foo";

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
		// Precargar informacion
		
		try {
			if(renderRequest.getPortletMode() == PortletMode.VIEW){
				switch (ParamUtil.get(renderRequest, "mvcPath", "")) {
				case "/html/foo/alta.jsp":
					long fooId = ParamUtil.get(renderRequest, "idFoo", -1L);
					if(fooId != -1){
						Foo foo = FooLocalServiceUtil.getFoo(fooId);
						renderRequest.setAttribute(ATTRIBUTE_FOO, foo);
					}
					break;
				default:
					List<Foo> foos = FooLocalServiceUtil.getFoos(QueryUtil.ALL_POS ,QueryUtil.ALL_POS);
					renderRequest.setAttribute(ATTRIBUTE_FOOS, foos);
					break;
				}
			}
		} catch (Exception e) {
			//Feedback de error
			SessionErrors.add(renderRequest, e.getClass());
			e.printStackTrace();
		}
		
		//Esta sentencia se tiene que mantener porque queremos seguir teniendo la funcionalidad
		//que renderiza los modos empleando los init param definidos en el portlet.xml
		super.render(renderRequest, renderResponse);
	}
	
	public void altaFoo(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		try {
			
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			
			//ParamUtil, ya contempla el namespace del portlet y ademas, 
			//Spermite transformaciones a otros tipos distintos de String
			String field1 = ParamUtil.get(actionRequest, "field1", "");
			boolean field2 = ParamUtil.get(actionRequest, "field2", false);
			int field3 = ParamUtil.get(actionRequest, "field3", 0);
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			
			Date field4 = ParamUtil.get(actionRequest, "field4", dateFormat, null);
			String field5 = ParamUtil.get(actionRequest, "field5", "");
			
			System.out.println(field4);
			
			FooDto fooDto = new FooDto(field1, field2, field3, field4, field5);
			
			long idFoo = FooLocalServiceUtil.addFoo(fooDto, serviceContext);
		
			//Feedback de exito
			SessionMessages.add(actionRequest, "Foo.mensaje.alta.correcta");
			
			//Para quedarnos en la propia pagina de formulario de alta
			actionResponse.setRenderParameter("mvcPath","/html/foo/alta.jsp");
			actionResponse.setRenderParameter("idFoo", String.valueOf(idFoo));
		
		} catch (Exception e) {
			//Feedback de error
			SessionErrors.add(actionRequest, e.getClass());
			e.printStackTrace();
		}
		
		
	}
	

}
