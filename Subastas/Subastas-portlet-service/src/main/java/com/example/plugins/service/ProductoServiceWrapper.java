package com.example.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ProductoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ProductoService
 * @generated
 */
public class ProductoServiceWrapper implements ProductoService,
    ServiceWrapper<ProductoService> {
    private ProductoService _productoService;

    public ProductoServiceWrapper(ProductoService productoService) {
        _productoService = productoService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _productoService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _productoService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _productoService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ProductoService getWrappedProductoService() {
        return _productoService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedProductoService(ProductoService productoService) {
        _productoService = productoService;
    }

    @Override
    public ProductoService getWrappedService() {
        return _productoService;
    }

    @Override
    public void setWrappedService(ProductoService productoService) {
        _productoService = productoService;
    }
}
