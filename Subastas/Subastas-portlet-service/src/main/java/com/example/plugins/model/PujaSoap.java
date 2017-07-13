package com.example.plugins.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.example.plugins.service.http.PujaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.http.PujaServiceSoap
 * @generated
 */
public class PujaSoap implements Serializable {
    private String _uuid;
    private long _pujaId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private double _valor;
    private long _subastaId;

    public PujaSoap() {
    }

    public static PujaSoap toSoapModel(Puja model) {
        PujaSoap soapModel = new PujaSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setPujaId(model.getPujaId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setValor(model.getValor());
        soapModel.setSubastaId(model.getSubastaId());

        return soapModel;
    }

    public static PujaSoap[] toSoapModels(Puja[] models) {
        PujaSoap[] soapModels = new PujaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PujaSoap[][] toSoapModels(Puja[][] models) {
        PujaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PujaSoap[models.length][models[0].length];
        } else {
            soapModels = new PujaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PujaSoap[] toSoapModels(List<Puja> models) {
        List<PujaSoap> soapModels = new ArrayList<PujaSoap>(models.size());

        for (Puja model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PujaSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _pujaId;
    }

    public void setPrimaryKey(long pk) {
        setPujaId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getPujaId() {
        return _pujaId;
    }

    public void setPujaId(long pujaId) {
        _pujaId = pujaId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public double getValor() {
        return _valor;
    }

    public void setValor(double valor) {
        _valor = valor;
    }

    public long getSubastaId() {
        return _subastaId;
    }

    public void setSubastaId(long subastaId) {
        _subastaId = subastaId;
    }
}
