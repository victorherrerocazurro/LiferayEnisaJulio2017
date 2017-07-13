package com.example.plugins.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Puja}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Puja
 * @generated
 */
public class PujaWrapper implements Puja, ModelWrapper<Puja> {
    private Puja _puja;

    public PujaWrapper(Puja puja) {
        _puja = puja;
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

    /**
    * Returns the primary key of this puja.
    *
    * @return the primary key of this puja
    */
    @Override
    public long getPrimaryKey() {
        return _puja.getPrimaryKey();
    }

    /**
    * Sets the primary key of this puja.
    *
    * @param primaryKey the primary key of this puja
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _puja.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the uuid of this puja.
    *
    * @return the uuid of this puja
    */
    @Override
    public java.lang.String getUuid() {
        return _puja.getUuid();
    }

    /**
    * Sets the uuid of this puja.
    *
    * @param uuid the uuid of this puja
    */
    @Override
    public void setUuid(java.lang.String uuid) {
        _puja.setUuid(uuid);
    }

    /**
    * Returns the puja ID of this puja.
    *
    * @return the puja ID of this puja
    */
    @Override
    public long getPujaId() {
        return _puja.getPujaId();
    }

    /**
    * Sets the puja ID of this puja.
    *
    * @param pujaId the puja ID of this puja
    */
    @Override
    public void setPujaId(long pujaId) {
        _puja.setPujaId(pujaId);
    }

    /**
    * Returns the group ID of this puja.
    *
    * @return the group ID of this puja
    */
    @Override
    public long getGroupId() {
        return _puja.getGroupId();
    }

    /**
    * Sets the group ID of this puja.
    *
    * @param groupId the group ID of this puja
    */
    @Override
    public void setGroupId(long groupId) {
        _puja.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this puja.
    *
    * @return the company ID of this puja
    */
    @Override
    public long getCompanyId() {
        return _puja.getCompanyId();
    }

    /**
    * Sets the company ID of this puja.
    *
    * @param companyId the company ID of this puja
    */
    @Override
    public void setCompanyId(long companyId) {
        _puja.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this puja.
    *
    * @return the user ID of this puja
    */
    @Override
    public long getUserId() {
        return _puja.getUserId();
    }

    /**
    * Sets the user ID of this puja.
    *
    * @param userId the user ID of this puja
    */
    @Override
    public void setUserId(long userId) {
        _puja.setUserId(userId);
    }

    /**
    * Returns the user uuid of this puja.
    *
    * @return the user uuid of this puja
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _puja.getUserUuid();
    }

    /**
    * Sets the user uuid of this puja.
    *
    * @param userUuid the user uuid of this puja
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _puja.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this puja.
    *
    * @return the user name of this puja
    */
    @Override
    public java.lang.String getUserName() {
        return _puja.getUserName();
    }

    /**
    * Sets the user name of this puja.
    *
    * @param userName the user name of this puja
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _puja.setUserName(userName);
    }

    /**
    * Returns the create date of this puja.
    *
    * @return the create date of this puja
    */
    @Override
    public java.util.Date getCreateDate() {
        return _puja.getCreateDate();
    }

    /**
    * Sets the create date of this puja.
    *
    * @param createDate the create date of this puja
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _puja.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this puja.
    *
    * @return the modified date of this puja
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _puja.getModifiedDate();
    }

    /**
    * Sets the modified date of this puja.
    *
    * @param modifiedDate the modified date of this puja
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _puja.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the valor of this puja.
    *
    * @return the valor of this puja
    */
    @Override
    public double getValor() {
        return _puja.getValor();
    }

    /**
    * Sets the valor of this puja.
    *
    * @param valor the valor of this puja
    */
    @Override
    public void setValor(double valor) {
        _puja.setValor(valor);
    }

    /**
    * Returns the subasta ID of this puja.
    *
    * @return the subasta ID of this puja
    */
    @Override
    public long getSubastaId() {
        return _puja.getSubastaId();
    }

    /**
    * Sets the subasta ID of this puja.
    *
    * @param subastaId the subasta ID of this puja
    */
    @Override
    public void setSubastaId(long subastaId) {
        _puja.setSubastaId(subastaId);
    }

    @Override
    public boolean isNew() {
        return _puja.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _puja.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _puja.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _puja.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _puja.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _puja.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _puja.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _puja.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _puja.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _puja.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _puja.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PujaWrapper((Puja) _puja.clone());
    }

    @Override
    public int compareTo(com.example.plugins.model.Puja puja) {
        return _puja.compareTo(puja);
    }

    @Override
    public int hashCode() {
        return _puja.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.example.plugins.model.Puja> toCacheModel() {
        return _puja.toCacheModel();
    }

    @Override
    public com.example.plugins.model.Puja toEscapedModel() {
        return new PujaWrapper(_puja.toEscapedModel());
    }

    @Override
    public com.example.plugins.model.Puja toUnescapedModel() {
        return new PujaWrapper(_puja.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _puja.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _puja.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _puja.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PujaWrapper)) {
            return false;
        }

        PujaWrapper pujaWrapper = (PujaWrapper) obj;

        if (Validator.equals(_puja, pujaWrapper._puja)) {
            return true;
        }

        return false;
    }

    @Override
    public StagedModelType getStagedModelType() {
        return _puja.getStagedModelType();
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Puja getWrappedPuja() {
        return _puja;
    }

    @Override
    public Puja getWrappedModel() {
        return _puja;
    }

    @Override
    public void resetOriginalValues() {
        _puja.resetOriginalValues();
    }
}
