package com.example.plugins.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Producto. This utility wraps
 * {@link com.example.plugins.service.impl.ProductoLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProductoLocalService
 * @see com.example.plugins.service.base.ProductoLocalServiceBaseImpl
 * @see com.example.plugins.service.impl.ProductoLocalServiceImpl
 * @generated
 */
public class ProductoLocalServiceUtil {
    private static ProductoLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.example.plugins.service.impl.ProductoLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the producto to the database. Also notifies the appropriate model listeners.
    *
    * @param producto the producto
    * @return the producto that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto addProducto(
        com.example.plugins.model.Producto producto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addProducto(producto);
    }

    /**
    * Creates a new producto with the primary key. Does not add the producto to the database.
    *
    * @param productoId the primary key for the new producto
    * @return the new producto
    */
    public static com.example.plugins.model.Producto createProducto(
        long productoId) {
        return getService().createProducto(productoId);
    }

    /**
    * Deletes the producto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param productoId the primary key of the producto
    * @return the producto that was removed
    * @throws PortalException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto deleteProducto(
        long productoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteProducto(productoId);
    }

    /**
    * Deletes the producto from the database. Also notifies the appropriate model listeners.
    *
    * @param producto the producto
    * @return the producto that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto deleteProducto(
        com.example.plugins.model.Producto producto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteProducto(producto);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.example.plugins.model.Producto fetchProducto(
        long productoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchProducto(productoId);
    }

    /**
    * Returns the producto with the matching UUID and company.
    *
    * @param uuid the producto's UUID
    * @param companyId the primary key of the company
    * @return the matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchProductoByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchProductoByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the producto matching the UUID and group.
    *
    * @param uuid the producto's UUID
    * @param groupId the primary key of the group
    * @return the matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchProductoByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchProductoByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the producto with the primary key.
    *
    * @param productoId the primary key of the producto
    * @return the producto
    * @throws PortalException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto getProducto(
        long productoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getProducto(productoId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the producto with the matching UUID and company.
    *
    * @param uuid the producto's UUID
    * @param companyId the primary key of the company
    * @return the matching producto
    * @throws PortalException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto getProductoByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getProductoByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the producto matching the UUID and group.
    *
    * @param uuid the producto's UUID
    * @param groupId the primary key of the group
    * @return the matching producto
    * @throws PortalException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto getProductoByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getProductoByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns a range of all the productos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> getProductos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getProductos(start, end);
    }

    /**
    * Returns the number of productos.
    *
    * @return the number of productos
    * @throws SystemException if a system exception occurred
    */
    public static int getProductosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getProductosCount();
    }

    /**
    * Updates the producto in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param producto the producto
    * @return the producto that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto updateProducto(
        com.example.plugins.model.Producto producto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateProducto(producto);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static long altaProducto(
        com.example.plugins.service.dto.ProductoDto productoDto,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().altaProducto(productoDto, serviceContext);
    }

    public static java.util.List<com.example.plugins.model.Producto> buscarProductosPorNombre(
        java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().buscarProductosPorNombre(nombre);
    }

    public static java.util.List<com.example.plugins.model.Producto> buscarProductosPorNombreAndPrecio(
        java.lang.String nombre, double precio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().buscarProductosPorNombreAndPrecio(nombre, precio);
    }

    public static void clearService() {
        _service = null;
    }

    public static ProductoLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ProductoLocalService.class.getName());

            if (invokableLocalService instanceof ProductoLocalService) {
                _service = (ProductoLocalService) invokableLocalService;
            } else {
                _service = new ProductoLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ProductoLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ProductoLocalService service) {
    }
}
