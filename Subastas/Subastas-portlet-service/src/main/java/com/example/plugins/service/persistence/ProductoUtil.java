package com.example.plugins.service.persistence;

import com.example.plugins.model.Producto;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the producto service. This utility wraps {@link ProductoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductoPersistence
 * @see ProductoPersistenceImpl
 * @generated
 */
public class ProductoUtil {
    private static ProductoPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Producto producto) {
        getPersistence().clearCache(producto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Producto> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Producto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Producto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Producto update(Producto producto) throws SystemException {
        return getPersistence().update(producto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Producto update(Producto producto,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(producto, serviceContext);
    }

    /**
    * Returns all the productos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the productos where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the productos where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the productos before and after the current producto in the ordered set where uuid = &#63;.
    *
    * @param productoId the primary key of the current producto
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto[] findByUuid_PrevAndNext(
        long productoId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(productoId, uuid, orderByComparator);
    }

    /**
    * Removes all the productos where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of productos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the producto where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchProductoException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the producto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the producto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the producto where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the producto that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of productos where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the productos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the productos where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the productos where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the productos before and after the current producto in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param productoId the primary key of the current producto
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto[] findByUuid_C_PrevAndNext(
        long productoId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(productoId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the productos where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid_C(uuid, companyId);
    }

    /**
    * Returns the number of productos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombre(
        java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombre(nombre);
    }

    /**
    * Returns a range of all the productos where nombre = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombre(
        java.lang.String nombre, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombre(nombre, start, end);
    }

    /**
    * Returns an ordered range of all the productos where nombre = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombre(
        java.lang.String nombre, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombre(nombre, start, end, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByNombre_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombre_First(nombre, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByNombre_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNombre_First(nombre, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByNombre_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombre_Last(nombre, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByNombre_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNombre_Last(nombre, orderByComparator);
    }

    /**
    * Returns the productos before and after the current producto in the ordered set where nombre = &#63;.
    *
    * @param productoId the primary key of the current producto
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto[] findByNombre_PrevAndNext(
        long productoId, java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombre_PrevAndNext(productoId, nombre,
            orderByComparator);
    }

    /**
    * Removes all the productos where nombre = &#63; from the database.
    *
    * @param nombre the nombre
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNombre(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNombre(nombre);
    }

    /**
    * Returns the number of productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByNombre(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNombre(nombre);
    }

    /**
    * Returns all the productos where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombre_Precio(
        java.lang.String nombre, double precio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombre_Precio(nombre, precio);
    }

    /**
    * Returns a range of all the productos where nombre = &#63; and precio = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombre_Precio(
        java.lang.String nombre, double precio, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombre_Precio(nombre, precio, start, end);
    }

    /**
    * Returns an ordered range of all the productos where nombre = &#63; and precio = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombre_Precio(
        java.lang.String nombre, double precio, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombre_Precio(nombre, precio, start, end,
            orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByNombre_Precio_First(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombre_Precio_First(nombre, precio, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByNombre_Precio_First(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNombre_Precio_First(nombre, precio, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByNombre_Precio_Last(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombre_Precio_Last(nombre, precio, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByNombre_Precio_Last(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByNombre_Precio_Last(nombre, precio, orderByComparator);
    }

    /**
    * Returns the productos before and after the current producto in the ordered set where nombre = &#63; and precio = &#63;.
    *
    * @param productoId the primary key of the current producto
    * @param nombre the nombre
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto[] findByNombre_Precio_PrevAndNext(
        long productoId, java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombre_Precio_PrevAndNext(productoId, nombre, precio,
            orderByComparator);
    }

    /**
    * Removes all the productos where nombre = &#63; and precio = &#63; from the database.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNombre_Precio(java.lang.String nombre,
        double precio)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNombre_Precio(nombre, precio);
    }

    /**
    * Returns the number of productos where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByNombre_Precio(java.lang.String nombre,
        double precio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNombre_Precio(nombre, precio);
    }

    /**
    * Returns all the productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombres(nombre);
    }

    /**
    * Returns a range of all the productos where nombre = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String nombre, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombres(nombre, start, end);
    }

    /**
    * Returns an ordered range of all the productos where nombre = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombre the nombre
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String nombre, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombres(nombre, start, end, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByNombres_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombres_First(nombre, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByNombres_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNombres_First(nombre, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByNombres_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombres_Last(nombre, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByNombres_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByNombres_Last(nombre, orderByComparator);
    }

    /**
    * Returns the productos before and after the current producto in the ordered set where nombre = &#63;.
    *
    * @param productoId the primary key of the current producto
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto[] findByNombres_PrevAndNext(
        long productoId, java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombres_PrevAndNext(productoId, nombre,
            orderByComparator);
    }

    /**
    * Returns all the productos where nombre = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombres the nombres
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String[] nombres)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombres(nombres);
    }

    /**
    * Returns a range of all the productos where nombre = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombres the nombres
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String[] nombres, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByNombres(nombres, start, end);
    }

    /**
    * Returns an ordered range of all the productos where nombre = any &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param nombres the nombres
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String[] nombres, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByNombres(nombres, start, end, orderByComparator);
    }

    /**
    * Removes all the productos where nombre = &#63; from the database.
    *
    * @param nombre the nombre
    * @throws SystemException if a system exception occurred
    */
    public static void removeByNombres(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByNombres(nombre);
    }

    /**
    * Returns the number of productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByNombres(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNombres(nombre);
    }

    /**
    * Returns the number of productos where nombre = any &#63;.
    *
    * @param nombres the nombres
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByNombres(java.lang.String[] nombres)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByNombres(nombres);
    }

    /**
    * Returns all the productos where precio &le; &#63;.
    *
    * @param precio the precio
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByPrecio(
        double precio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrecio(precio);
    }

    /**
    * Returns a range of all the productos where precio &le; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param precio the precio
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @return the range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByPrecio(
        double precio, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrecio(precio, start, end);
    }

    /**
    * Returns an ordered range of all the productos where precio &le; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param precio the precio
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findByPrecio(
        double precio, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPrecio(precio, start, end, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByPrecio_First(
        double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrecio_First(precio, orderByComparator);
    }

    /**
    * Returns the first producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByPrecio_First(
        double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrecio_First(precio, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByPrecio_Last(
        double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrecio_Last(precio, orderByComparator);
    }

    /**
    * Returns the last producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByPrecio_Last(
        double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrecio_Last(precio, orderByComparator);
    }

    /**
    * Returns the productos before and after the current producto in the ordered set where precio &le; &#63;.
    *
    * @param productoId the primary key of the current producto
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto[] findByPrecio_PrevAndNext(
        long productoId, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPrecio_PrevAndNext(productoId, precio,
            orderByComparator);
    }

    /**
    * Removes all the productos where precio &le; &#63; from the database.
    *
    * @param precio the precio
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPrecio(double precio)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPrecio(precio);
    }

    /**
    * Returns the number of productos where precio &le; &#63;.
    *
    * @param precio the precio
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public static int countByPrecio(double precio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPrecio(precio);
    }

    /**
    * Caches the producto in the entity cache if it is enabled.
    *
    * @param producto the producto
    */
    public static void cacheResult(com.example.plugins.model.Producto producto) {
        getPersistence().cacheResult(producto);
    }

    /**
    * Caches the productos in the entity cache if it is enabled.
    *
    * @param productos the productos
    */
    public static void cacheResult(
        java.util.List<com.example.plugins.model.Producto> productos) {
        getPersistence().cacheResult(productos);
    }

    /**
    * Creates a new producto with the primary key. Does not add the producto to the database.
    *
    * @param productoId the primary key for the new producto
    * @return the new producto
    */
    public static com.example.plugins.model.Producto create(long productoId) {
        return getPersistence().create(productoId);
    }

    /**
    * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param productoId the primary key of the producto
    * @return the producto that was removed
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto remove(long productoId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(productoId);
    }

    public static com.example.plugins.model.Producto updateImpl(
        com.example.plugins.model.Producto producto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(producto);
    }

    /**
    * Returns the producto with the primary key or throws a {@link com.example.plugins.NoSuchProductoException} if it could not be found.
    *
    * @param productoId the primary key of the producto
    * @return the producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto findByPrimaryKey(
        long productoId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(productoId);
    }

    /**
    * Returns the producto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param productoId the primary key of the producto
    * @return the producto, or <code>null</code> if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Producto fetchByPrimaryKey(
        long productoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(productoId);
    }

    /**
    * Returns all the productos.
    *
    * @return the productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.example.plugins.model.Producto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the productos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.ProductoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of productos
    * @param end the upper bound of the range of productos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of productos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Producto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the productos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of productos.
    *
    * @return the number of productos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ProductoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ProductoPersistence) PortletBeanLocatorUtil.locate(com.example.plugins.service.ClpSerializer.getServletContextName(),
                    ProductoPersistence.class.getName());

            ReferenceRegistry.registerReference(ProductoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ProductoPersistence persistence) {
    }
}
