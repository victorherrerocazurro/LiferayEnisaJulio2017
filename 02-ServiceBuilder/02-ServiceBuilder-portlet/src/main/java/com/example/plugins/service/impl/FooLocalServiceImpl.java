package com.example.plugins.service.impl;

import java.util.Date;

import com.example.plugins.model.Foo;
import com.example.plugins.service.base.FooLocalServiceBaseImpl;
import com.example.plugins.service.dto.FooDto;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the foo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.example.plugins.service.FooLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.base.FooLocalServiceBaseImpl
 * @see com.example.plugins.service.FooLocalServiceUtil
 */
public class FooLocalServiceImpl extends FooLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.example.plugins.service.FooLocalServiceUtil} to access the foo local service.
     */
	
	
	//Necesitamos obtener los datos del Foo
	public void addFoo(FooDto fooDto, ServiceContext serviceContext) throws SystemException, PortalException{
		
		long fooId = counterLocalService.increment();
		
		Foo newFoo = createFoo(fooId);
		
		newFoo.setField1(fooDto.getField1());
		newFoo.setField2(fooDto.isField2());
		newFoo.setField3(fooDto.getField3());
		newFoo.setField4(fooDto.getField4());
		newFoo.setField5(fooDto.getField5());
		
		newFoo.setCreateDate(new Date());
		newFoo.setModifiedDate(new Date());
		newFoo.setCompanyId(serviceContext.getCompanyId());
		newFoo.setUserId(serviceContext.getUserId());
		newFoo.setUserName(userLocalService.getUser(serviceContext.getUserId()).getFullName());
		newFoo.setGroupId(serviceContext.getScopeGroupId());
		
		addFoo(newFoo);
		
	}
	
}
