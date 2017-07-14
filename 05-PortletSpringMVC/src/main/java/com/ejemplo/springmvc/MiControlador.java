package com.ejemplo.springmvc;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller
@RequestMapping("VIEW")
public class MiControlador {

	@RenderMapping
	public String doView(RenderRequest renderRequest,
			RenderResponse renderResponse) {
		System.out.println("En el render mode view");
		
		return "view";
	}
	
	@ActionMapping(params="javax.portlet.action=Saludar")
	public void processActionEnviarDato(ActionRequest request, ActionResponse response){
		System.out.println("En el Acction de View");
	}

}
