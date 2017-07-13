package com.example.plugins.service.persistence;

import com.example.plugins.model.Producto;
import com.example.plugins.service.ProductoLocalServiceUtil;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ProductoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ProductoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ProductoLocalServiceUtil.getService());
        setClass(Producto.class);

        setClassLoader(com.example.plugins.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("productoId");
    }
}
