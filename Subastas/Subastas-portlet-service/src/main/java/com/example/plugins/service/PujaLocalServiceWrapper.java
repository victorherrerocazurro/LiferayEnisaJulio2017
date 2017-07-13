package com.example.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PujaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PujaLocalService
 * @generated
 */
public class PujaLocalServiceWrapper implements PujaLocalService,
    ServiceWrapper<PujaLocalService> {
    private PujaLocalService _pujaLocalService;

    public PujaLocalServiceWrapper(PujaLocalService pujaLocalService) {
        _pujaLocalService = pujaLocalService;
    }

    /**
    * Adds the puja to the database. Also notifies the appropriate model listeners.
    *
    * @param puja the puja
    * @return the puja that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.plugins.model.Puja addPuja(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.addPuja(puja);
    }

    /**
    * Creates a new puja with the primary key. Does not add the puja to the database.
    *
    * @param pujaId the primary key for the new puja
    * @return the new puja
    */
    @Override
    public com.example.plugins.model.Puja createPuja(long pujaId) {
        return _pujaLocalService.createPuja(pujaId);
    }

    /**
    * Deletes the puja with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pujaId the primary key of the puja
    * @return the puja that was removed
    * @throws PortalException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.plugins.model.Puja deletePuja(long pujaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.deletePuja(pujaId);
    }

    /**
    * Deletes the puja from the database. Also notifies the appropriate model listeners.
    *
    * @param puja the puja
    * @return the puja that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.plugins.model.Puja deletePuja(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.deletePuja(puja);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _pujaLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.example.plugins.model.Puja fetchPuja(long pujaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.fetchPuja(pujaId);
    }

    /**
    * Returns the puja with the matching UUID and company.
    *
    * @param uuid the puja's UUID
    * @param companyId the primary key of the company
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.plugins.model.Puja fetchPujaByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.fetchPujaByUuidAndCompanyId(uuid, companyId);
    }

    /**
    * Returns the puja matching the UUID and group.
    *
    * @param uuid the puja's UUID
    * @param groupId the primary key of the group
    * @return the matching puja, or <code>null</code> if a matching puja could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.plugins.model.Puja fetchPujaByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.fetchPujaByUuidAndGroupId(uuid, groupId);
    }

    /**
    * Returns the puja with the primary key.
    *
    * @param pujaId the primary key of the puja
    * @return the puja
    * @throws PortalException if a puja with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.plugins.model.Puja getPuja(long pujaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.getPuja(pujaId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public com.example.plugins.model.Puja getPujaByUuidAndCompanyId(
        java.lang.String uuid, long companyId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.getPujaByUuidAndCompanyId(uuid, companyId);
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
    @Override
    public com.example.plugins.model.Puja getPujaByUuidAndGroupId(
        java.lang.String uuid, long groupId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.getPujaByUuidAndGroupId(uuid, groupId);
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
    @Override
    public java.util.List<com.example.plugins.model.Puja> getPujas(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.getPujas(start, end);
    }

    /**
    * Returns the number of pujas.
    *
    * @return the number of pujas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPujasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.getPujasCount();
    }

    /**
    * Updates the puja in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param puja the puja
    * @return the puja that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.example.plugins.model.Puja updatePuja(
        com.example.plugins.model.Puja puja)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.updatePuja(puja);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _pujaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _pujaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _pujaLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.example.plugins.model.Puja> consultarPujasDeUnaSubasta(
        long idSubasta)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _pujaLocalService.consultarPujasDeUnaSubasta(idSubasta);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PujaLocalService getWrappedPujaLocalService() {
        return _pujaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPujaLocalService(PujaLocalService pujaLocalService) {
        _pujaLocalService = pujaLocalService;
    }

    @Override
    public PujaLocalService getWrappedService() {
        return _pujaLocalService;
    }

    @Override
    public void setWrappedService(PujaLocalService pujaLocalService) {
        _pujaLocalService = pujaLocalService;
    }
}
