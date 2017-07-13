package com.example.plugins.hook;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.struts.BaseStrutsAction;

public class MiNuevoStrutsAction extends BaseStrutsAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("En Struts nuevo");
		
		
		//La ubicacion del recurso al que se deriva, es la carpeta "src/main/webapp/META-INF/html"
		return "/MiFuncionalidad/view.jsp";
	}
}
