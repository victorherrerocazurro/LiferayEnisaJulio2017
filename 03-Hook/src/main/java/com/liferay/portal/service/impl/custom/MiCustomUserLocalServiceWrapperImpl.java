package com.liferay.portal.service.impl.custom;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserLocalServiceWrapper;

public class MiCustomUserLocalServiceWrapperImpl extends UserLocalServiceWrapper {

	public MiCustomUserLocalServiceWrapperImpl(UserLocalService userLocalService) {
		super(userLocalService);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public User addUser(User user) throws SystemException {
		System.out.println("añadiendo un nuevo usuario");
		
		return super.addUser(user);
	}
	
	@Override
	public User createUser(long userId) {
		System.out.println("creando un nuevo usuario");
		// TODO Auto-generated method stub
		return super.createUser(userId);
	}
}
