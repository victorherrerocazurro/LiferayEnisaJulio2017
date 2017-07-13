package com.example.plugins.model.impl;

import com.example.plugins.model.Producto;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Producto in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Producto
 * @generated
 */
public class ProductoCacheModel implements CacheModel<Producto>, Externalizable {
    public String uuid;
    public long productoId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String nombre;
    public String descripcion;
    public double precio;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", productoId=");
        sb.append(productoId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", descripcion=");
        sb.append(descripcion);
        sb.append(", precio=");
        sb.append(precio);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Producto toEntityModel() {
        ProductoImpl productoImpl = new ProductoImpl();

        if (uuid == null) {
            productoImpl.setUuid(StringPool.BLANK);
        } else {
            productoImpl.setUuid(uuid);
        }

        productoImpl.setProductoId(productoId);
        productoImpl.setGroupId(groupId);
        productoImpl.setCompanyId(companyId);
        productoImpl.setUserId(userId);

        if (userName == null) {
            productoImpl.setUserName(StringPool.BLANK);
        } else {
            productoImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            productoImpl.setCreateDate(null);
        } else {
            productoImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            productoImpl.setModifiedDate(null);
        } else {
            productoImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (nombre == null) {
            productoImpl.setNombre(StringPool.BLANK);
        } else {
            productoImpl.setNombre(nombre);
        }

        if (descripcion == null) {
            productoImpl.setDescripcion(StringPool.BLANK);
        } else {
            productoImpl.setDescripcion(descripcion);
        }

        productoImpl.setPrecio(precio);

        productoImpl.resetOriginalValues();

        return productoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        productoId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        nombre = objectInput.readUTF();
        descripcion = objectInput.readUTF();
        precio = objectInput.readDouble();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(productoId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (nombre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombre);
        }

        if (descripcion == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descripcion);
        }

        objectOutput.writeDouble(precio);
    }
}
