package com.example.plugins.service.persistence;

import com.example.plugins.model.Puja;
import com.example.plugins.service.PujaLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PujaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PujaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PujaLocalServiceUtil.getService());
        setClass(Puja.class);

        setClassLoader(com.example.plugins.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("pujaId");
    }
}
