package com.example.plugins.service.persistence;

import com.example.plugins.model.Producto;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the producto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductoPersistenceImpl
 * @see ProductoUtil
 * @generated
 */
public interface ProductoPersistence extends BasePersistence<Producto> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ProductoUtil} to access the producto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the productos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Producto> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto[] findByUuid_PrevAndNext(
        long productoId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the productos where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the producto where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchProductoException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the producto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the producto where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the producto where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the producto that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the productos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Producto> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto[] findByUuid_C_PrevAndNext(
        long productoId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the productos where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Producto> findByNombre(
        java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombre(
        java.lang.String nombre, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombre(
        java.lang.String nombre, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByNombre_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByNombre_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByNombre_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByNombre_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto[] findByNombre_PrevAndNext(
        long productoId, java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the productos where nombre = &#63; from the database.
    *
    * @param nombre the nombre
    * @throws SystemException if a system exception occurred
    */
    public void removeByNombre(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByNombre(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the productos where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Producto> findByNombre_Precio(
        java.lang.String nombre, double precio)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombre_Precio(
        java.lang.String nombre, double precio, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombre_Precio(
        java.lang.String nombre, double precio, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto findByNombre_Precio_First(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByNombre_Precio_First(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto findByNombre_Precio_Last(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByNombre_Precio_Last(
        java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto[] findByNombre_Precio_PrevAndNext(
        long productoId, java.lang.String nombre, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the productos where nombre = &#63; and precio = &#63; from the database.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @throws SystemException if a system exception occurred
    */
    public void removeByNombre_Precio(java.lang.String nombre, double precio)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where nombre = &#63; and precio = &#63;.
    *
    * @param nombre the nombre
    * @param precio the precio
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByNombre_Precio(java.lang.String nombre, double precio)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String nombre, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String nombre, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByNombres_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByNombres_First(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByNombres_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where nombre = &#63;.
    *
    * @param nombre the nombre
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByNombres_Last(
        java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto[] findByNombres_PrevAndNext(
        long productoId, java.lang.String nombre,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String[] nombres)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String[] nombres, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByNombres(
        java.lang.String[] nombres, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the productos where nombre = &#63; from the database.
    *
    * @param nombre the nombre
    * @throws SystemException if a system exception occurred
    */
    public void removeByNombres(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where nombre = &#63;.
    *
    * @param nombre the nombre
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByNombres(java.lang.String nombre)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where nombre = any &#63;.
    *
    * @param nombres the nombres
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByNombres(java.lang.String[] nombres)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the productos where precio &le; &#63;.
    *
    * @param precio the precio
    * @return the matching productos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Producto> findByPrecio(
        double precio)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByPrecio(
        double precio, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findByPrecio(
        double precio, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByPrecio_First(
        double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByPrecio_First(
        double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto
    * @throws com.example.plugins.NoSuchProductoException if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByPrecio_Last(double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last producto in the ordered set where precio &le; &#63;.
    *
    * @param precio the precio
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching producto, or <code>null</code> if a matching producto could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByPrecio_Last(
        double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Producto[] findByPrecio_PrevAndNext(
        long productoId, double precio,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the productos where precio &le; &#63; from the database.
    *
    * @param precio the precio
    * @throws SystemException if a system exception occurred
    */
    public void removeByPrecio(double precio)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos where precio &le; &#63;.
    *
    * @param precio the precio
    * @return the number of matching productos
    * @throws SystemException if a system exception occurred
    */
    public int countByPrecio(double precio)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the producto in the entity cache if it is enabled.
    *
    * @param producto the producto
    */
    public void cacheResult(com.example.plugins.model.Producto producto);

    /**
    * Caches the productos in the entity cache if it is enabled.
    *
    * @param productos the productos
    */
    public void cacheResult(
        java.util.List<com.example.plugins.model.Producto> productos);

    /**
    * Creates a new producto with the primary key. Does not add the producto to the database.
    *
    * @param productoId the primary key for the new producto
    * @return the new producto
    */
    public com.example.plugins.model.Producto create(long productoId);

    /**
    * Removes the producto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param productoId the primary key of the producto
    * @return the producto that was removed
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto remove(long productoId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.example.plugins.model.Producto updateImpl(
        com.example.plugins.model.Producto producto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the producto with the primary key or throws a {@link com.example.plugins.NoSuchProductoException} if it could not be found.
    *
    * @param productoId the primary key of the producto
    * @return the producto
    * @throws com.example.plugins.NoSuchProductoException if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto findByPrimaryKey(long productoId)
        throws com.example.plugins.NoSuchProductoException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the producto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param productoId the primary key of the producto
    * @return the producto, or <code>null</code> if a producto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Producto fetchByPrimaryKey(long productoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the productos.
    *
    * @return the productos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Producto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Producto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the productos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of productos.
    *
    * @return the number of productos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
