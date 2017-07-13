package com.liferay.portal.service.impl.custom;

import java.util.List;
import java.util.Locale;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.EmailAddress;
import com.liferay.portal.model.Phone;
import com.liferay.portal.model.User;
import com.liferay.portal.model.Website;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.UserServiceWrapper;
import com.liferay.portlet.announcements.model.AnnouncementsDelivery;

public class MiCustomUserServiceWrapperImpl extends UserServiceWrapper {

	public MiCustomUserServiceWrapperImpl(UserService userService) {
		super(userService);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public User addUser(long companyId, boolean autoPassword, String password1, String password2,
			boolean autoScreenName, String screenName, String emailAddress, long facebookId, String openId,
			Locale locale, String firstName, String middleName, String lastName, int prefixId, int suffixId,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle, long[] groupIds,
			long[] organizationIds, long[] roleIds, long[] userGroupIds, boolean sendEmail,
			ServiceContext serviceContext) throws PortalException, SystemException {
		System.out.println("añadiendo un nuevo usuario");
		return super.addUser(companyId, autoPassword, password1, password2, autoScreenName, screenName, emailAddress,
				facebookId, openId, locale, firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, sendEmail,
				serviceContext);
	}
	
	@Override
	public User addUser(long companyId, boolean autoPassword, String password1, String password2,
			boolean autoScreenName, String screenName, String emailAddress, long facebookId, String openId,
			Locale locale, String firstName, String middleName, String lastName, int prefixId, int suffixId,
			boolean male, int birthdayMonth, int birthdayDay, int birthdayYear, String jobTitle, long[] groupIds,
			long[] organizationIds, long[] roleIds, long[] userGroupIds, List<Address> addresses,
			List<EmailAddress> emailAddresses, List<Phone> phones, List<Website> websites,
			List<AnnouncementsDelivery> announcementsDelivers, boolean sendEmail, ServiceContext serviceContext)
			throws PortalException, SystemException {
		System.out.println("añadiendo un nuevo usuario");
		return super.addUser(companyId, autoPassword, password1, password2, autoScreenName, screenName, emailAddress,
				facebookId, openId, locale, firstName, middleName, lastName, prefixId, suffixId, male, birthdayMonth,
				birthdayDay, birthdayYear, jobTitle, groupIds, organizationIds, roleIds, userGroupIds, addresses,
				emailAddresses, phones, websites, announcementsDelivers, sendEmail, serviceContext);
	}
}
