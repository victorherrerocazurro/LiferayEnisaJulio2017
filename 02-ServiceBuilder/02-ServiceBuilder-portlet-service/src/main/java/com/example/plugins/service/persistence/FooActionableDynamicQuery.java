package com.example.plugins.service.persistence;

import com.example.plugins.model.Foo;
import com.example.plugins.service.FooLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class FooActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FooActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FooLocalServiceUtil.getService());
        setClass(Foo.class);

        setClassLoader(com.example.plugins.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("fooId");
    }
}
