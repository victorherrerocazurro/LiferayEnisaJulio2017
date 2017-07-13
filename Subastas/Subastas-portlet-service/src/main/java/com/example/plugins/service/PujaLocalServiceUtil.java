package com.example.plugins.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Puja. This utility wraps
 * {@link com.example.plugins.service.impl.PujaLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see PujaLocalService
 * @see com.example.plugins.service.base.PujaLocalServiceBaseImpl
 * @see com.example.plugins.service.impl.PujaLocalServiceImpl
 * @generated
 */
public class PujaLocalServiceUtil {
    private static PujaLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.example.plugins.service.impl.PujaLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the puja to the database. Also notifies the appropriate model listeners.
    *
    * @param puja the puja
    * @return the puja that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja addPuja(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPuja(puja);
    }

    /**
    * Creates a new puja with the primary key. Does not add the puja to the database.
    *
    * @param pujaId the primary key for the new puja
    * @return the new puja
    */
    public static com.example.plugins.model.Puja createPuja(long pujaId) {
        return getService().createPuja(pujaId);
    }

    /**
    * Deletes the puja with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pujaId the primary key of the puja
    * @return the puja that was removed
    * @throws PortalException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja deletePuja(long pujaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePuja(pujaId);
    }

    /**
    * Deletes the puja from the database. Also notifies the appropriate model listeners.
    *
    * @param puja the puja
    * @return the puja that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja deletePuja(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deletePuja(puja);
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.example.plugins.model.impl.PujaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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

    public static com.example.plugins.model.Puja fetchPuja(long pujaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPuja(pujaId);
    }

    /**
    * Returns the puja with the matching UUID and company.
    *
    * @param uuid the puja's UUID
    * @param companyId the primary key of the company
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchPujaByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPujaByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the puja matching the UUID and group.
    *
    * @param uuid the puja's UUID
    * @param groupId the primary key of the group
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja fetchPujaByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPujaByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the puja with the primary key.
    *
    * @param pujaId the primary key of the puja
    * @return the puja
    * @throws PortalException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja getPuja(long pujaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPuja(pujaId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns the puja with the matching UUID and company.
    *
    * @param uuid the puja's UUID
    * @param companyId the primary key of the company
    * @return the matching puja
    * @throws PortalException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja getPujaByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPujaByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the puja matching the UUID and group.
    *
    * @param uuid the puja's UUID
    * @param groupId the primary key of the group
    * @return the matching puja
    * @throws PortalException if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja getPujaByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPujaByUuidAndGroupId(uuid, groupId);
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
    public static java.util.List<com.example.plugins.model.Puja> getPujas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPujas(start, end);
    }

    /**
    * Returns the number of pujas.
    *
    * @return the number of pujas
    * @throws SystemException if a system exception occurred
    */
    public static int getPujasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPujasCount();
    }

    /**
    * Updates the puja in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param puja the puja
    * @return the puja that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.example.plugins.model.Puja updatePuja(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePuja(puja);
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

    public static java.util.List<com.example.plugins.model.Puja> consultarPujasDeUnaSubasta(
        long idSubasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().consultarPujasDeUnaSubasta(idSubasta);
    }

    public static void clearService() {
        _service = null;
    }

    public static PujaLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PujaLocalService.class.getName());

            if (invokableLocalService instanceof PujaLocalService) {
                _service = (PujaLocalService) invokableLocalService;
            } else {
                _service = new PujaLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(PujaLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(PujaLocalService service) {
    }
}
