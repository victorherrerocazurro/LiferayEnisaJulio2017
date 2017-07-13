package com.example.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PujaService}.
 *
 * @author Brian Wing Shun Chan
 * @see PujaService
 * @generated
 */
public class PujaServiceWrapper implements PujaService,
    ServiceWrapper<PujaService> {
    private PujaService _pujaService;

    public PujaServiceWrapper(PujaService pujaService) {
        _pujaService = pujaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _pujaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _pujaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _pujaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PujaService getWrappedPujaService() {
        return _pujaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPujaService(PujaService pujaService) {
        _pujaService = pujaService;
    }

    @Override
    public PujaService getWrappedService() {
        return _pujaService;
    }

    @Override
    public void setWrappedService(PujaService pujaService) {
        _pujaService = pujaService;
    }
}
