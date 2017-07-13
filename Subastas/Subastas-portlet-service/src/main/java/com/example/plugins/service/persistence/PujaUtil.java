package com.example.plugins.service.persistence;

import com.example.plugins.model.Puja;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the puja service. This utility wraps {@link PujaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PujaPersistence
 * @see PujaPersistenceImpl
 * @generated
 */
public class PujaUtil {
    private static PujaPersistence _persistence;

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
    public static void clearCache(Puja puja) {
        getPersistence().clearCache(puja);
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
    public static List<Puja> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Puja> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Puja> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Puja update(Puja puja) throws SystemException {
        return getPersistence().update(puja);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Puja update(Puja puja, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(puja, serviceContext);
    }

    /**
    * Returns all the pujas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid);
    }

    /**
    * Returns a range of all the pujas where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @return the range of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end);
    }

    /**
    * Returns an ordered range of all the pujas where uuid = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid(uuid, start, end, orderByComparator);
    }

    /**
    * Returns the first puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the first puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_First(uuid, orderByComparator);
    }

    /**
    * Returns the last puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the last puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
    }

    /**
    * Returns the pujas before and after the current puja in the ordered set where uuid = &#63;.
    *
    * @param pujaId the primary key of the current puja
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next puja
    * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja[] findByUuid_PrevAndNext(
        long pujaId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_PrevAndNext(pujaId, uuid, orderByComparator);
    }

    /**
    * Removes all the pujas where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUuid(uuid);
    }

    /**
    * Returns the number of pujas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid(uuid);
    }

    /**
    * Returns the puja where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchPujaException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUUID_G(uuid, groupId);
    }

    /**
    * Returns the puja where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId);
    }

    /**
    * Returns the puja where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
    }

    /**
    * Removes the puja where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the puja that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().removeByUUID_G(uuid, groupId);
    }

    /**
    * Returns the number of pujas where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUUID_G(uuid, groupId);
    }

    /**
    * Returns all the pujas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId);
    }

    /**
    * Returns a range of all the pujas where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @return the range of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUuid_C(uuid, companyId, start, end);
    }

    /**
    * Returns an ordered range of all the pujas where uuid = &#63; and companyId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
    }

    /**
    * Returns the first puja in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the first puja in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last puja in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the last puja in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
    }

    /**
    * Returns the pujas before and after the current puja in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param pujaId the primary key of the current puja
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next puja
    * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja[] findByUuid_C_PrevAndNext(
        long pujaId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUuid_C_PrevAndNext(pujaId, uuid, companyId,
            orderByComparator);
    }

    /**
    * Removes all the pujas where uuid = &#63; and companyId = &#63; from the database.
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
    * Returns the number of pujas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUuid_C(uuid, companyId);
    }

    /**
    * Returns all the pujas where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @return the matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findBySubasta(
        long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySubasta(subastaId);
    }

    /**
    * Returns a range of all the pujas where subastaId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param subastaId the subasta ID
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @return the range of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findBySubasta(
        long subastaId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySubasta(subastaId, start, end);
    }

    /**
    * Returns an ordered range of all the pujas where subastaId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param subastaId the subasta ID
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findBySubasta(
        long subastaId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySubasta(subastaId, start, end, orderByComparator);
    }

    /**
    * Returns the first puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findBySubasta_First(
        long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySubasta_First(subastaId, orderByComparator);
    }

    /**
    * Returns the first puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchBySubasta_First(
        long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchBySubasta_First(subastaId, orderByComparator);
    }

    /**
    * Returns the last puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findBySubasta_Last(
        long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySubasta_Last(subastaId, orderByComparator);
    }

    /**
    * Returns the last puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchBySubasta_Last(
        long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchBySubasta_Last(subastaId, orderByComparator);
    }

    /**
    * Returns the pujas before and after the current puja in the ordered set where subastaId = &#63;.
    *
    * @param pujaId the primary key of the current puja
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next puja
    * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja[] findBySubasta_PrevAndNext(
        long pujaId, long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySubasta_PrevAndNext(pujaId, subastaId,
            orderByComparator);
    }

    /**
    * Removes all the pujas where subastaId = &#63; from the database.
    *
    * @param subastaId the subasta ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBySubasta(long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBySubasta(subastaId);
    }

    /**
    * Returns the number of pujas where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public static int countBySubasta(long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBySubasta(subastaId);
    }

    /**
    * Caches the puja in the entity cache if it is enabled.
    *
    * @param puja the puja
    */
    public static void cacheResult(com.example.plugins.model.Puja puja) {
        getPersistence().cacheResult(puja);
    }

    /**
    * Caches the pujas in the entity cache if it is enabled.
    *
    * @param pujas the pujas
    */
    public static void cacheResult(
        java.util.List<com.example.plugins.model.Puja> pujas) {
        getPersistence().cacheResult(pujas);
    }

    /**
    * Creates a new puja with the primary key. Does not add the puja to the database.
    *
    * @param pujaId the primary key for the new puja
    * @return the new puja
    */
    public static com.example.plugins.model.Puja create(long pujaId) {
        return getPersistence().create(pujaId);
    }

    /**
    * Removes the puja with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pujaId the primary key of the puja
    * @return the puja that was removed
    * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja remove(long pujaId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(pujaId);
    }

    public static com.example.plugins.model.Puja updateImpl(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(puja);
    }

    /**
    * Returns the puja with the primary key or throws a {@link com.example.plugins.NoSuchPujaException} if it could not be found.
    *
    * @param pujaId the primary key of the puja
    * @return the puja
    * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja findByPrimaryKey(long pujaId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(pujaId);
    }

    /**
    * Returns the puja with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pujaId the primary key of the puja
    * @return the puja, or <code>null</code> if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchByPrimaryKey(long pujaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(pujaId);
    }

    /**
    * Returns all the pujas.
    *
    * @return the pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the pujas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @return the range of pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the pujas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of pujas
    * @param end the upper bound of the range of pujas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of pujas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.example.plugins.model.Puja> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the pujas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of pujas.
    *
    * @return the number of pujas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PujaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PujaPersistence) PortletBeanLocatorUtil.locate(com.example.plugins.service.ClpSerializer.getServletContextName(),
                    PujaPersistence.class.getName());

            ReferenceRegistry.registerReference(PujaUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PujaPersistence persistence) {
    }
}
