package com.example.plugins.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.example.plugins.service.http.SubastaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.http.SubastaServiceSoap
 * @generated
 */
public class SubastaSoap implements Serializable {
    private String _uuid;
    private long _subastaId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private double _precioMinimo;
    private Date _fechaInicio;
    private Date _fechaFin;
    private long _productoId;

    public SubastaSoap() {
    }

    public static SubastaSoap toSoapModel(Subasta model) {
        SubastaSoap soapModel = new SubastaSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setSubastaId(model.getSubastaId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setPrecioMinimo(model.getPrecioMinimo());
        soapModel.setFechaInicio(model.getFechaInicio());
        soapModel.setFechaFin(model.getFechaFin());
        soapModel.setProductoId(model.getProductoId());

        return soapModel;
    }

    public static SubastaSoap[] toSoapModels(Subasta[] models) {
        SubastaSoap[] soapModels = new SubastaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static SubastaSoap[][] toSoapModels(Subasta[][] models) {
        SubastaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new SubastaSoap[models.length][models[0].length];
        } else {
            soapModels = new SubastaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static SubastaSoap[] toSoapModels(List<Subasta> models) {
        List<SubastaSoap> soapModels = new ArrayList<SubastaSoap>(models.size());

        for (Subasta model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new SubastaSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _subastaId;
    }

    public void setPrimaryKey(long pk) {
        setSubastaId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getSubastaId() {
        return _subastaId;
    }

    public void setSubastaId(long subastaId) {
        _subastaId = subastaId;
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

    public double getPrecioMinimo() {
        return _precioMinimo;
    }

    public void setPrecioMinimo(double precioMinimo) {
        _precioMinimo = precioMinimo;
    }

    public Date getFechaInicio() {
        return _fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        _fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return _fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        _fechaFin = fechaFin;
    }

    public long getProductoId() {
        return _productoId;
    }

    public void setProductoId(long productoId) {
        _productoId = productoId;
    }
}
