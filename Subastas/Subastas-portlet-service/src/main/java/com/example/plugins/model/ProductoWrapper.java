package com.example.plugins.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Producto}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Producto
 * @generated
 */
public class ProductoWrapper implements Producto, ModelWrapper<Producto> {
    private Producto _producto;

    public ProductoWrapper(Producto producto) {
        _producto = producto;
    }

    @Override
    public Class<?> getModelClass() {
        return Producto.class;
    }

    @Override
    public String getModelClassName() {
        return Producto.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("productoId", getProductoId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("nombre", getNombre());
        attributes.put("descripcion", getDescripcion());
        attributes.put("precio", getPrecio());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long productoId = (Long) attributes.get("productoId");

        if (productoId != null) {
            setProductoId(productoId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String nombre = (String) attributes.get("nombre");

        if (nombre != null) {
            setNombre(nombre);
        }

        String descripcion = (String) attributes.get("descripcion");

        if (descripcion != null) {
            setDescripcion(descripcion);
        }

        Double precio = (Double) attributes.get("precio");

        if (precio != null) {
            setPrecio(precio);
        }
    }

    /**
    * Returns the primary key of this producto.
    *
    * @return the primary key of this producto
    */
    @Override
    public long getPrimaryKey() {
        return _producto.getPrimaryKey();
    }

    /**
    * Sets the primary key of this producto.
    *
    * @param primaryKey the primary key of this producto
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _producto.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this producto.
    *
    * @return the uuid of this producto
    */
    @Override
    public java.lang.String getUuid() {
        return _producto.getUuid();
    }

    /**
    * Sets the uuid of this producto.
    *
    * @param uuid the uuid of this producto
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _producto.setUuid(uuid);
    }

    /**
    * Returns the producto ID of this producto.
    *
    * @return the producto ID of this producto
    */
    @Override
    public long getProductoId() {
        return _producto.getProductoId();
    }

    /**
    * Sets the producto ID of this producto.
    *
    * @param productoId the producto ID of this producto
    */
    @Override
    public void setProductoId(long productoId) {
        _producto.setProductoId(productoId);
    }

    /**
    * Returns the group ID of this producto.
    *
    * @return the group ID of this producto
    */
    @Override
    public long getGroupId() {
        return _producto.getGroupId();
    }

    /**
    * Sets the group ID of this producto.
    *
    * @param groupId the group ID of this producto
    */
    @Override
    public void setGroupId(long groupId) {
        _producto.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this producto.
    *
    * @return the company ID of this producto
    */
    @Override
    public long getCompanyId() {
        return _producto.getCompanyId();
    }

    /**
    * Sets the company ID of this producto.
    *
    * @param companyId the company ID of this producto
    */
    @Override
    public void setCompanyId(long companyId) {
        _producto.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this producto.
    *
    * @return the user ID of this producto
    */
    @Override
    public long getUserId() {
        return _producto.getUserId();
    }

    /**
    * Sets the user ID of this producto.
    *
    * @param userId the user ID of this producto
    */
    @Override
    public void setUserId(long userId) {
        _producto.setUserId(userId);
    }

    /**
    * Returns the user uuid of this producto.
    *
    * @return the user uuid of this producto
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _producto.getUserUuid();
    }

    /**
    * Sets the user uuid of this producto.
    *
    * @param userUuid the user uuid of this producto
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _producto.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this producto.
    *
    * @return the user name of this producto
    */
    @Override
    public java.lang.String getUserName() {
        return _producto.getUserName();
    }

    /**
    * Sets the user name of this producto.
    *
    * @param userName the user name of this producto
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _producto.setUserName(userName);
    }

    /**
    * Returns the create date of this producto.
    *
    * @return the create date of this producto
    */
    @Override
    public java.util.Date getCreateDate() {
        return _producto.getCreateDate();
    }

    /**
    * Sets the create date of this producto.
    *
    * @param createDate the create date of this producto
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _producto.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this producto.
    *
    * @return the modified date of this producto
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _producto.getModifiedDate();
    }

    /**
    * Sets the modified date of this producto.
    *
    * @param modifiedDate the modified date of this producto
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _producto.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the nombre of this producto.
    *
    * @return the nombre of this producto
    */
    @Override
    public java.lang.String getNombre() {
        return _producto.getNombre();
    }

    /**
    * Sets the nombre of this producto.
    *
    * @param nombre the nombre of this producto
    */
    @Override
    public void setNombre(java.lang.String nombre) {
        _producto.setNombre(nombre);
    }

    /**
    * Returns the descripcion of this producto.
    *
    * @return the descripcion of this producto
    */
    @Override
    public java.lang.String getDescripcion() {
        return _producto.getDescripcion();
    }

    /**
    * Sets the descripcion of this producto.
    *
    * @param descripcion the descripcion of this producto
    */
    @Override
    public void setDescripcion(java.lang.String descripcion) {
        _producto.setDescripcion(descripcion);
    }

    /**
    * Returns the precio of this producto.
    *
    * @return the precio of this producto
    */
    @Override
    public double getPrecio() {
        return _producto.getPrecio();
    }

    /**
    * Sets the precio of this producto.
    *
    * @param precio the precio of this producto
    */
    @Override
    public void setPrecio(double precio) {
        _producto.setPrecio(precio);
    }

    @Override
    public boolean isNew() {
        return _producto.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _producto.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _producto.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _producto.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _producto.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _producto.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _producto.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _producto.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _producto.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _producto.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _producto.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ProductoWrapper((Producto) _producto.clone());
    }

    @Override
    public int compareTo(com.example.plugins.model.Producto producto) {
        return _producto.compareTo(producto);
    }

    @Override
    public int hashCode() {
        return _producto.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.plugins.model.Producto> toCacheModel() {
        return _producto.toCacheModel();
    }

    @Override
    public com.example.plugins.model.Producto toEscapedModel() {
        return new ProductoWrapper(_producto.toEscapedModel());
    }

    @Override
    public com.example.plugins.model.Producto toUnescapedModel() {
        return new ProductoWrapper(_producto.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _producto.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _producto.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _producto.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ProductoWrapper)) {
            return false;
        }

        ProductoWrapper productoWrapper = (ProductoWrapper) obj;

        if (Validator.equals(_producto, productoWrapper._producto)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _producto.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Producto getWrappedProducto() {
        return _producto;
    }

    @Override
    public Producto getWrappedModel() {
        return _producto;
    }

    @Override
    public void resetOriginalValues() {
        _producto.resetOriginalValues();
    }
}
