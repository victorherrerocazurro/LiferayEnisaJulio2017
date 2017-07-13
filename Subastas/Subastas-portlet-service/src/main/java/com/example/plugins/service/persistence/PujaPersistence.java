package com.example.plugins.service.persistence;

import com.example.plugins.model.Puja;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the puja service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PujaPersistenceImpl
 * @see PujaUtil
 * @generated
 */
public interface PujaPersistence extends BasePersistence<Puja> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PujaUtil} to access the puja persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the pujas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching pujas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Puja> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last puja in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Puja[] findByUuid_PrevAndNext(
        long pujaId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the pujas where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of pujas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the puja where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchPujaException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja findByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the puja where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchByUUID_G(java.lang.String uuid,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the puja where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchByUUID_G(java.lang.String uuid,
        long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the puja where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the puja that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of pujas where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the pujas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching pujas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Puja> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Puja findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first puja in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Puja findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last puja in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Puja[] findByUuid_C_PrevAndNext(
        long pujaId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the pujas where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of pujas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the pujas where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @return the matching pujas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Puja> findBySubasta(
        long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findBySubasta(
        long subastaId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findBySubasta(
        long subastaId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja findBySubasta_First(long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchBySubasta_First(long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja
    * @throws com.example.plugins.NoSuchPujaException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja findBySubasta_Last(long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last puja in the ordered set where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchBySubasta_Last(long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Puja[] findBySubasta_PrevAndNext(
        long pujaId, long subastaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the pujas where subastaId = &#63; from the database.
    *
    * @param subastaId the subasta ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBySubasta(long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of pujas where subastaId = &#63;.
    *
    * @param subastaId the subasta ID
    * @return the number of matching pujas
    * @throws SystemException if a system exception occurred
    */
    public int countBySubasta(long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the puja in the entity cache if it is enabled.
    *
    * @param puja the puja
    */
    public void cacheResult(com.example.plugins.model.Puja puja);

    /**
    * Caches the pujas in the entity cache if it is enabled.
    *
    * @param pujas the pujas
    */
    public void cacheResult(
        java.util.List<com.example.plugins.model.Puja> pujas);

    /**
    * Creates a new puja with the primary key. Does not add the puja to the database.
    *
    * @param pujaId the primary key for the new puja
    * @return the new puja
    */
    public com.example.plugins.model.Puja create(long pujaId);

    /**
    * Removes the puja with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pujaId the primary key of the puja
    * @return the puja that was removed
    * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja remove(long pujaId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.example.plugins.model.Puja updateImpl(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the puja with the primary key or throws a {@link com.example.plugins.NoSuchPujaException} if it could not be found.
    *
    * @param pujaId the primary key of the puja
    * @return the puja
    * @throws com.example.plugins.NoSuchPujaException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja findByPrimaryKey(long pujaId)
        throws com.example.plugins.NoSuchPujaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the puja with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pujaId the primary key of the puja
    * @return the puja, or <code>null</code> if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Puja fetchByPrimaryKey(long pujaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the pujas.
    *
    * @return the pujas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Puja> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Puja> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the pujas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of pujas.
    *
    * @return the number of pujas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
