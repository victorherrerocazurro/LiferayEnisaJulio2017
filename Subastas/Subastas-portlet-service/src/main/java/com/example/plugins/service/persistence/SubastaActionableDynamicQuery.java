package com.example.plugins.service.persistence;

import com.example.plugins.model.Subasta;
import com.example.plugins.service.SubastaLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class SubastaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public SubastaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(SubastaLocalServiceUtil.getService());
        setClass(Subasta.class);

        setClassLoader(com.example.plugins.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("subastaId");
    }
}
