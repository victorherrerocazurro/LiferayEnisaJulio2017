package com.example.plugins.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.example.plugins.service.http.ProductoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.example.plugins.service.http.ProductoServiceSoap
 * @generated
 */
public class ProductoSoap implements Serializable {
    private String _uuid;
    private long _productoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private String _nombre;
    private String _descripcion;
    private double _precio;

    public ProductoSoap() {
    }

    public static ProductoSoap toSoapModel(Producto model) {
        ProductoSoap soapModel = new ProductoSoap();

        soapModel.setUuid(model.getUuid());
        soapModel.setProductoId(model.getProductoId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setNombre(model.getNombre());
        soapModel.setDescripcion(model.getDescripcion());
        soapModel.setPrecio(model.getPrecio());

        return soapModel;
    }

    public static ProductoSoap[] toSoapModels(Producto[] models) {
        ProductoSoap[] soapModels = new ProductoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ProductoSoap[][] toSoapModels(Producto[][] models) {
        ProductoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ProductoSoap[models.length][models[0].length];
        } else {
            soapModels = new ProductoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ProductoSoap[] toSoapModels(List<Producto> models) {
        List<ProductoSoap> soapModels = new ArrayList<ProductoSoap>(models.size());

        for (Producto model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ProductoSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _productoId;
    }

    public void setPrimaryKey(long pk) {
        setProductoId(pk);
    }

    public String getUuid() {
        return _uuid;
    }

    public void setUuid(String uuid) {
        _uuid = uuid;
    }

    public long getProductoId() {
        return _productoId;
    }

    public void setProductoId(long productoId) {
        _productoId = productoId;
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

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        _nombre = nombre;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;
    }

    public double getPrecio() {
        return _precio;
    }

    public void setPrecio(double precio) {
        _precio = precio;
    }
}
