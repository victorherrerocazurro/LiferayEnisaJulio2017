package com.example.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link SubastaService}.
 *
 * @author Brian Wing Shun Chan
 * @see SubastaService
 * @generated
 */
public class SubastaServiceWrapper implements SubastaService,
    ServiceWrapper<SubastaService> {
    private SubastaService _subastaService;

    public SubastaServiceWrapper(SubastaService subastaService) {
        _subastaService = subastaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _subastaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _subastaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _subastaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public SubastaService getWrappedSubastaService() {
        return _subastaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedSubastaService(SubastaService subastaService) {
        _subastaService = subastaService;
    }

    @Override
    public SubastaService getWrappedService() {
        return _subastaService;
    }

    @Override
    public void setWrappedService(SubastaService subastaService) {
        _subastaService = subastaService;
    }
}
