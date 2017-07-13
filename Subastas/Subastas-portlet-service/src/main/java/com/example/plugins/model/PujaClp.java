package com.example.plugins.model;

import com.example.plugins.service.ClpSerializer;
import com.example.plugins.service.PujaLocalServiceUtil;

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


public class PujaClp extends BaseModelImpl<Puja> implements Puja {
    private String _uuid;
    private long _pujaId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private double _valor;
    private long _subastaId;
    private BaseModel<?> _pujaRemoteModel;
    private Class<?> _clpSerializerClass = com.example.plugins.service.ClpSerializer.class;

    public PujaClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Puja.class;
    }

    @Override
    public String getModelClassName() {
        return Puja.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _pujaId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPujaId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _pujaId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("uuid", getUuid());
        attributes.put("pujaId", getPujaId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("valor", getValor());
        attributes.put("subastaId", getSubastaId());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String uuid = (String) attributes.get("uuid");

        if (uuid != null) {
            setUuid(uuid);
        }

        Long pujaId = (Long) attributes.get("pujaId");

        if (pujaId != null) {
            setPujaId(pujaId);
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

        Double valor = (Double) attributes.get("valor");

        if (valor != null) {
            setValor(valor);
        }

        Long subastaId = (Long) attributes.get("subastaId");

        if (subastaId != null) {
            setSubastaId(subastaId);
        }
    }

    @Override
    public String getUuid() {
        return _uuid;
    }

    @Override
    public void setUuid(String uuid) {
        _uuid = uuid;

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setUuid", String.class);

                method.invoke(_pujaRemoteModel, uuid);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPujaId() {
        return _pujaId;
    }

    @Override
    public void setPujaId(long pujaId) {
        _pujaId = pujaId;

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setPujaId", long.class);

                method.invoke(_pujaRemoteModel, pujaId);
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

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_pujaRemoteModel, groupId);
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

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_pujaRemoteModel, companyId);
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

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_pujaRemoteModel, userId);
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

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_pujaRemoteModel, userName);
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

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_pujaRemoteModel, createDate);
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

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_pujaRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getValor() {
        return _valor;
    }

    @Override
    public void setValor(double valor) {
        _valor = valor;

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setValor", double.class);

                method.invoke(_pujaRemoteModel, valor);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getSubastaId() {
        return _subastaId;
    }

    @Override
    public void setSubastaId(long subastaId) {
        _subastaId = subastaId;

        if (_pujaRemoteModel != null) {
            try {
                Class<?> clazz = _pujaRemoteModel.getClass();

                Method method = clazz.getMethod("setSubastaId", long.class);

                method.invoke(_pujaRemoteModel, subastaId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public StagedModelType getStagedModelType() {
        return new StagedModelType(PortalUtil.getClassNameId(
                Puja.class.getName()));
    }

    public BaseModel<?> getPujaRemoteModel() {
        return _pujaRemoteModel;
    }

    public void setPujaRemoteModel(BaseModel<?> pujaRemoteModel) {
        _pujaRemoteModel = pujaRemoteModel;
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

        Class<?> remoteModelClass = _pujaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_pujaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PujaLocalServiceUtil.addPuja(this);
        } else {
            PujaLocalServiceUtil.updatePuja(this);
        }
    }

    @Override
    public Puja toEscapedModel() {
        return (Puja) ProxyUtil.newProxyInstance(Puja.class.getClassLoader(),
            new Class[] { Puja.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PujaClp clone = new PujaClp();

        clone.setUuid(getUuid());
        clone.setPujaId(getPujaId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setValor(getValor());
        clone.setSubastaId(getSubastaId());

        return clone;
    }

    @Override
    public int compareTo(Puja puja) {
        int value = 0;

        if (getValor() < puja.getValor()) {
            value = -1;
        } else if (getValor() > puja.getValor()) {
            value = 1;
        } else {
            value = 0;
        }

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

        if (!(obj instanceof PujaClp)) {
            return false;
        }

        PujaClp puja = (PujaClp) obj;

        long primaryKey = puja.getPrimaryKey();

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
        StringBundler sb = new StringBundler(21);

        sb.append("{uuid=");
        sb.append(getUuid());
        sb.append(", pujaId=");
        sb.append(getPujaId());
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
        sb.append(", valor=");
        sb.append(getValor());
        sb.append(", subastaId=");
        sb.append(getSubastaId());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(34);

        sb.append("<model><model-name>");
        sb.append("com.example.plugins.model.Puja");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>uuid</column-name><column-value><![CDATA[");
        sb.append(getUuid());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pujaId</column-name><column-value><![CDATA[");
        sb.append(getPujaId());
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
            "<column><column-name>valor</column-name><column-value><![CDATA[");
        sb.append(getValor());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>subastaId</column-name><column-value><![CDATA[");
        sb.append(getSubastaId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
