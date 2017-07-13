package com.example.plugins.service.persistence;

import com.example.plugins.model.Subasta;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the subasta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SubastaPersistenceImpl
 * @see SubastaUtil
 * @generated
 */
public interface SubastaPersistence extends BasePersistence<Subasta> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link SubastaUtil} to access the subasta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the subastas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Subasta> findByUuid(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findByUuid(
        java.lang.String uuid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findByUuid(
        java.lang.String uuid, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta findByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByUuid_First(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta findByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where uuid = &#63;.
    *
    * @param uuid the uuid
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByUuid_Last(
        java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Subasta[] findByUuid_PrevAndNext(
        long subastaId, java.lang.String uuid,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the subastas where uuid = &#63; from the database.
    *
    * @param uuid the uuid
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where uuid = &#63;.
    *
    * @param uuid the uuid
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid(java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subasta where uuid = &#63; and groupId = &#63; or throws a {@link com.example.plugins.NoSuchSubastaException} if it could not be found.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching subasta
    * @throws com.example.plugins.NoSuchSubastaException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta findByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subasta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subasta where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByUUID_G(
        java.lang.String uuid, long groupId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the subasta where uuid = &#63; and groupId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the subasta that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta removeByUUID_G(
        java.lang.String uuid, long groupId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where uuid = &#63; and groupId = &#63;.
    *
    * @param uuid the uuid
    * @param groupId the group ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countByUUID_G(java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Subasta> findByUuid_C(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findByUuid_C(
        java.lang.String uuid, long companyId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Subasta findByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByUuid_C_First(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Subasta findByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByUuid_C_Last(
        java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Subasta[] findByUuid_C_PrevAndNext(
        long subastaId, java.lang.String uuid, long companyId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the subastas where uuid = &#63; and companyId = &#63; from the database.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where uuid = &#63; and companyId = &#63;.
    *
    * @param uuid the uuid
    * @param companyId the company ID
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countByUuid_C(java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @return the matching subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Subasta> findByFechaInicio_FechaFin(
        java.util.Date fechaInicio, java.util.Date fechaFin)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findByFechaInicio_FechaFin(
        java.util.Date fechaInicio, java.util.Date fechaFin, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findByFechaInicio_FechaFin(
        java.util.Date fechaInicio, java.util.Date fechaFin, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Subasta findByFechaInicio_FechaFin_First(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByFechaInicio_FechaFin_First(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Subasta findByFechaInicio_FechaFin_Last(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last subasta in the ordered set where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByFechaInicio_FechaFin_Last(
        java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.example.plugins.model.Subasta[] findByFechaInicio_FechaFin_PrevAndNext(
        long subastaId, java.util.Date fechaInicio, java.util.Date fechaFin,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63; from the database.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @throws SystemException if a system exception occurred
    */
    public void removeByFechaInicio_FechaFin(java.util.Date fechaInicio,
        java.util.Date fechaFin)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas where fechaInicio &ge; &#63; and fechaFin &le; &#63;.
    *
    * @param fechaInicio the fecha inicio
    * @param fechaFin the fecha fin
    * @return the number of matching subastas
    * @throws SystemException if a system exception occurred
    */
    public int countByFechaInicio_FechaFin(java.util.Date fechaInicio,
        java.util.Date fechaFin)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the subasta in the entity cache if it is enabled.
    *
    * @param subasta the subasta
    */
    public void cacheResult(com.example.plugins.model.Subasta subasta);

    /**
    * Caches the subastas in the entity cache if it is enabled.
    *
    * @param subastas the subastas
    */
    public void cacheResult(
        java.util.List<com.example.plugins.model.Subasta> subastas);

    /**
    * Creates a new subasta with the primary key. Does not add the subasta to the database.
    *
    * @param subastaId the primary key for the new subasta
    * @return the new subasta
    */
    public com.example.plugins.model.Subasta create(long subastaId);

    /**
    * Removes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta that was removed
    * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta remove(long subastaId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.example.plugins.model.Subasta updateImpl(
        com.example.plugins.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subasta with the primary key or throws a {@link com.example.plugins.NoSuchSubastaException} if it could not be found.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta
    * @throws com.example.plugins.NoSuchSubastaException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta findByPrimaryKey(long subastaId)
        throws com.example.plugins.NoSuchSubastaException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the subasta with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta, or <code>null</code> if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.example.plugins.model.Subasta fetchByPrimaryKey(long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the subastas.
    *
    * @return the subastas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.example.plugins.model.Subasta> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.example.plugins.model.Subasta> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the subastas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of subastas.
    *
    * @return the number of subastas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
