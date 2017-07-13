package com.example.plugins.model.impl;

import com.example.plugins.model.Subasta;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Subasta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Subasta
 * @generated
 */
public class SubastaCacheModel implements CacheModel<Subasta>, Externalizable {
    public String uuid;
    public long subastaId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public double precioMinimo;
    public long fechaInicio;
    public long fechaFin;
    public long productoId;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(25);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", subastaId=");
        sb.append(subastaId);
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
        sb.append(", precioMinimo=");
        sb.append(precioMinimo);
        sb.append(", fechaInicio=");
        sb.append(fechaInicio);
        sb.append(", fechaFin=");
        sb.append(fechaFin);
        sb.append(", productoId=");
        sb.append(productoId);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Subasta toEntityModel() {
        SubastaImpl subastaImpl = new SubastaImpl();

        if (uuid == null) {
            subastaImpl.setUuid(StringPool.BLANK);
        } else {
            subastaImpl.setUuid(uuid);
        }

        subastaImpl.setSubastaId(subastaId);
        subastaImpl.setGroupId(groupId);
        subastaImpl.setCompanyId(companyId);
        subastaImpl.setUserId(userId);

        if (userName == null) {
            subastaImpl.setUserName(StringPool.BLANK);
        } else {
            subastaImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            subastaImpl.setCreateDate(null);
        } else {
            subastaImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            subastaImpl.setModifiedDate(null);
        } else {
            subastaImpl.setModifiedDate(new Date(modifiedDate));
        }

        subastaImpl.setPrecioMinimo(precioMinimo);

        if (fechaInicio == Long.MIN_VALUE) {
            subastaImpl.setFechaInicio(null);
        } else {
            subastaImpl.setFechaInicio(new Date(fechaInicio));
        }

        if (fechaFin == Long.MIN_VALUE) {
            subastaImpl.setFechaFin(null);
        } else {
            subastaImpl.setFechaFin(new Date(fechaFin));
        }

        subastaImpl.setProductoId(productoId);

        subastaImpl.resetOriginalValues();

        return subastaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        subastaId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        precioMinimo = objectInput.readDouble();
        fechaInicio = objectInput.readLong();
        fechaFin = objectInput.readLong();
        productoId = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(subastaId);
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
        objectOutput.writeDouble(precioMinimo);
        objectOutput.writeLong(fechaInicio);
        objectOutput.writeLong(fechaFin);
        objectOutput.writeLong(productoId);
    }
}
