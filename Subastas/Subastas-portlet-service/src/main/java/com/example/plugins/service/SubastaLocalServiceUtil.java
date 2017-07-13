package com.example.plugins.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Subasta. This utility wraps
 * {@link com.example.plugins.service.impl.SubastaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SubastaLocalService
 * @see com.example.plugins.service.base.SubastaLocalServiceBaseImpl
 * @see com.example.plugins.service.impl.SubastaLocalServiceImpl
 * @generated
 */
public class SubastaLocalServiceUtil {
    private static SubastaLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.example.plugins.service.impl.SubastaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the subasta to the database. Also notifies the appropriate model listeners.
    *
    * @param subasta the subasta
    * @return the subasta that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta addSubasta(
        com.example.plugins.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addSubasta(subasta);
    }

    /**
    * Creates a new subasta with the primary key. Does not add the subasta to the database.
    *
    * @param subastaId the primary key for the new subasta
    * @return the new subasta
    */
    public static com.example.plugins.model.Subasta createSubasta(
        long subastaId) {
        return getService().createSubasta(subastaId);
    }

    /**
    * Deletes the subasta with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta that was removed
    * @throws PortalException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta deleteSubasta(
        long subastaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSubasta(subastaId);
    }

    /**
    * Deletes the subasta from the database. Also notifies the appropriate model listeners.
    *
    * @param subasta the subasta
    * @return the subasta that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta deleteSubasta(
        com.example.plugins.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteSubasta(subasta);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.SubastaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.example.plugins.model.Subasta fetchSubasta(long subastaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSubasta(subastaId);
    }

    /**
    * Returns the subasta with the matching UUID and company.
    *
    * @param uuid the subasta's UUID
    * @param companyId the primary key of the company
    * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchSubastaByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSubastaByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the subasta matching the UUID and group.
    *
    * @param uuid the subasta's UUID
    * @param groupId the primary key of the group
    * @return the matching subasta, or <code>null</code> if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta fetchSubastaByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchSubastaByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the subasta with the primary key.
    *
    * @param subastaId the primary key of the subasta
    * @return the subasta
    * @throws PortalException if a subasta with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta getSubasta(long subastaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSubasta(subastaId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the subasta with the matching UUID and company.
    *
    * @param uuid the subasta's UUID
    * @param companyId the primary key of the company
    * @return the matching subasta
    * @throws PortalException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta getSubastaByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSubastaByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the subasta matching the UUID and group.
    *
    * @param uuid the subasta's UUID
    * @param groupId the primary key of the group
    * @return the matching subasta
    * @throws PortalException if a matching subasta could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta getSubastaByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getSubastaByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<com.example.plugins.model.Subasta> getSubastas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSubastas(start, end);
    }

    /**
    * Returns the number of subastas.
    *
    * @return the number of subastas
    * @throws SystemException if a system exception occurred
    */
    public static int getSubastasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getSubastasCount();
    }

    /**
    * Updates the subasta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param subasta the subasta
    * @return the subasta that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Subasta updateSubasta(
        com.example.plugins.model.Subasta subasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateSubasta(subasta);
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

    public static long altaSubasta(
        com.example.plugins.service.dto.SubastaDto ubastaDto,
        com.liferay.portal.service.ServiceContext serviceContext)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().altaSubasta(ubastaDto, serviceContext);
    }

    public static java.util.List<com.example.plugins.model.Subasta> consultarSubastasActivas()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().consultarSubastasActivas();
    }

    public static void clearService() {
        _service = null;
    }

    public static SubastaLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    SubastaLocalService.class.getName());

            if (invokableLocalService instanceof SubastaLocalService) {
                _service = (SubastaLocalService) invokableLocalService;
            } else {
                _service = new SubastaLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(SubastaLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(SubastaLocalService service) {
    }
}
