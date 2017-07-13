package com.example.plugins.hook;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.struts.BaseStrutsPortletAction;
import com.liferay.portal.kernel.struts.StrutsPortletAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;

public class MiBolgAdminView extends BaseStrutsPortletAction {

	@Override
	public String render(StrutsPortletAction originalStrutsPortletAction, PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse) throws Exception {
		
		System.out.println("En Struts");
		
		long userId = ParamUtil.get(renderRequest, "userId", -1);
		if(userId != -1){
			User user = UserLocalServiceUtil.getUser(userId);
		}
		
		return originalStrutsPortletAction.render(originalStrutsPortletAction, portletConfig, renderRequest, renderResponse);
	}
	
	public MiBolgAdminView() {
		super();
		// TODO Auto-generated constructor stub
	}
}
