package com.example.plugins.model;

import com.example.plugins.service.ClpSerializer;
import com.example.plugins.service.ProductoLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ProductoClp extends BaseModelImpl<Producto> implements Producto {
    private String _uuid;
    private long _productoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _nombre;
    private String _descripcion;
    private double _precio;
    private BaseModel<?> _productoRemoteModel;
    private Class<?> _clpSerializerClass = com.example.plugins.service.ClpSerializer.class;

    public ProductoClp() {
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
    public long getPrimaryKey() {
        return _productoId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setProductoId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _productoId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_productoRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getProductoId() {
        return _productoId;
    }

    @Override
    public void setProductoId(long productoId) {
        _productoId = productoId;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setProductoId", long.class);

                method.invoke(_productoRemoteModel, productoId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_productoRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_productoRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_productoRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_productoRemoteModel, userName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_productoRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_productoRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNombre() {
        return _nombre;
    }

    @Override
    public void setNombre(String nombre) {
        _nombre = nombre;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_productoRemoteModel, nombre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescripcion() {
        return _descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setDescripcion", String.class);

                method.invoke(_productoRemoteModel, descripcion);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getPrecio() {
        return _precio;
    }

    @Override
    public void setPrecio(double precio) {
        _precio = precio;

        if (_productoRemoteModel != null) {
            try {
                Class<?> clazz = _productoRemoteModel.getClass();

                Method method = clazz.getMethod("setPrecio", double.class);

                method.invoke(_productoRemoteModel, precio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Producto.class.getName()));
    }

    public BaseModel<?> getProductoRemoteModel() {
        return _productoRemoteModel;
    }

    public void setProductoRemoteModel(BaseModel<?> productoRemoteModel) {
        _productoRemoteModel = productoRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _productoRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_productoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ProductoLocalServiceUtil.addProducto(this);
        } else {
            ProductoLocalServiceUtil.updateProducto(this);
        }
    }

    @Override
    public Producto toEscapedModel() {
        return (Producto) ProxyUtil.newProxyInstance(Producto.class.getClassLoader(),
            new Class[] { Producto.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ProductoClp clone = new ProductoClp();

        clone.setUuid(getUuid());
        clone.setProductoId(getProductoId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setNombre(getNombre());
        clone.setDescripcion(getDescripcion());
        clone.setPrecio(getPrecio());

        return clone;
    }

    @Override
    public int compareTo(Producto producto) {
        int value = 0;

        value = getNombre().compareTo(producto.getNombre());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ProductoClp)) {
            return false;
        }

        ProductoClp producto = (ProductoClp) obj;

        long primaryKey = producto.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", productoId=");
        sb.append(getProductoId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", nombre=");
        sb.append(getNombre());
        sb.append(", descripcion=");
        sb.append(getDescripcion());
        sb.append(", precio=");
        sb.append(getPrecio());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("com.example.plugins.model.Producto");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>productoId</column-name><column-value><![CDATA[");
        sb.append(getProductoId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombre</column-name><column-value><![CDATA[");
        sb.append(getNombre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descripcion</column-name><column-value><![CDATA[");
        sb.append(getDescripcion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>precio</column-name><column-value><![CDATA[");
        sb.append(getPrecio());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
