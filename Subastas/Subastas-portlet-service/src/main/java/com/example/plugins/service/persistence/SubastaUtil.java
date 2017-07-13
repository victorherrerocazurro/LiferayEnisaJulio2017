package com.example.plugins.service.persistence;

import com.example.plugins.model.Subasta;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the subasta service. This utility wraps {@link SubastaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubastaPersistence
 * @see SubastaPersistenceImpl
 * @generated
 */
public class SubastaUtil {
    private static SubastaPersistence _persistence;

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
    public static void clearCache(Subasta subasta) {
        getPersistence().clearCache(subasta);
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
    public static List<Subasta> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Subasta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Subasta> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Subasta update(Subasta subasta) throws SystemException {
        return getPersistence().update(subasta);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Subasta update(Subasta subasta, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(subasta, serviceContext);
    }

    /**
    * Returns all the subastas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the subastas where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the subastas where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the subastas before and after the current subasta in the ordered set where uuid = &#63;.
    *
    * @param subastaId the primary key of the current subasta
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta[] findByUuid_PrevAndNext(
        long subastaId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(subastaId, uuid, orderByComparator);
    }

    /**
    * Removes all the subastas where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of subastas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the subasta where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchSubastaException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the subasta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the subasta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the subasta where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the subasta that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of subastas where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the subastas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the subastas where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the subastas where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the subastas before and after the current subasta in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param subastaId the primary key of the current subasta
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta[] findByUuid_C_PrevAndNext(
        long subastaId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(subastaId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the subastas where uuid = &#63; and companyId = &#63; from the database.
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
    * Returns the number of subastas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByFechaInicio_FechaFin(
        java.util.Date fechaInicio, java.util.Date fechaFin)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByFechaInicio_FechaFin(fechaInicio, fechaFin);
    }

    /**
    * Returns a range of all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByFechaInicio_FechaFin(
        java.util.Date fechaInicio, java.util.Date fechaFin, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFechaInicio_FechaFin(fechaInicio, fechaFin, start, end);
    }

    /**
    * Returns an ordered range of all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findByFechaInicio_FechaFin(
        java.util.Date fechaInicio, java.util.Date fechaFin, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFechaInicio_FechaFin(fechaInicio, fechaFin, start,
            end, orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByFechaInicio_FechaFin_First(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFechaInicio_FechaFin_First(fechaInicio, fechaFin,
            orderByComparator);
    }

    /**
    * Returns the first subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByFechaInicio_FechaFin_First(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFechaInicio_FechaFin_First(fechaInicio, fechaFin,
            orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByFechaInicio_FechaFin_Last(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFechaInicio_FechaFin_Last(fechaInicio, fechaFin,
            orderByComparator);
    }

    /**
    * Returns the last subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByFechaInicio_FechaFin_Last(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByFechaInicio_FechaFin_Last(fechaInicio, fechaFin,
            orderByComparator);
    }

    /**
    * Returns the subastas before and after the current subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param subastaId the primary key of the current subasta
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next subasta
    * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta[] findByFechaInicio_FechaFin_PrevAndNext(
        long subastaId, java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByFechaInicio_FechaFin_PrevAndNext(subastaId,
            fechaInicio, fechaFin, orderByComparator);
    }

    /**
    * Removes all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63; from the database.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @throws SystemException if a system exception occurred
    */
    public static void removeByFechaInicio_FechaFin(
        java.util.Date fechaInicio, java.util.Date fechaFin)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByFechaInicio_FechaFin(fechaInicio, fechaFin);
    }

    /**
    * Returns the number of subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countByFechaInicio_FechaFin(java.util.Date fechaInicio,
        java.util.Date fechaFin)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByFechaInicio_FechaFin(fechaInicio, fechaFin);
    }

    /**
    * Caches the subasta in the entity cache if it is enabled.
    *
    * @param subasta the subasta
    */
    public static void cacheResult(com.example.plugins.model.Subasta subasta) {
        getPersistence().cacheResult(subasta);
    }

    /**
    * Caches the subastas in the entity cache if it is enabled.
    *
    * @param subastas the subastas
    */
    public static void cacheResult(
        java.util.List<com.example.plugins.model.Subasta> subastas) {
        getPersistence().cacheResult(subastas);
    }

    /**
    * Creates a new subasta with the primary key. Does not add the subasta to the database.
    *
    * @param subastaId the primary key for the new subasta
    * @return the new subasta
    */
    public static com.example.plugins.model.Subasta create(long subastaId) {
        return getPersistence().create(subastaId);
    }

    /**
    * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta that was removed
    * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta remove(long subastaId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(subastaId);
    }

    public static com.example.plugins.model.Subasta updateImpl(
        com.example.plugins.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(subasta);
    }

    /**
    * Returns the subasta with the primary key or throws a {@link com.example.plugins.NoSuchSubastaException} if it could not be found.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta
    * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta findByPrimaryKey(
        long subastaId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(subastaId);
    }

    /**
    * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchByPrimaryKey(
        long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(subastaId);
    }

    /**
    * Returns all the subastas.
    *
    * @return the subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the subastas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @return the range of subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the subastas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of subastas
    * @param end the upper bound of the range of subastas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of subastas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Subasta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the subastas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of subastas.
    *
    * @return the number of subastas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static SubastaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (SubastaPersistence) PortletBeanLocatorUtil.locate(com.example.plugins.service.ClpSerializer.getServletContextName(),
                    SubastaPersistence.class.getName());

            ReferenceRegistry.registerReference(SubastaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(SubastaPersistence persistence) {
    }
}
