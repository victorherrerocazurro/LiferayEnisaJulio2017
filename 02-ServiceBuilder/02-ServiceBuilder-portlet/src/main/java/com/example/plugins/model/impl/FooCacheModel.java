package com.example.plugins.model.impl;

import com.example.plugins.model.Foo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Foo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Foo
 * @generated
 */
public class FooCacheModel implements CacheModel<Foo>, Externalizable {
    public String uuid;
    public long fooId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public String field1;
    public boolean field2;
    public int field3;
    public long field4;
    public String field5;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{uuid=");
        sb.append(uuid);
        sb.append(", fooId=");
        sb.append(fooId);
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
        sb.append(", field1=");
        sb.append(field1);
        sb.append(", field2=");
        sb.append(field2);
        sb.append(", field3=");
        sb.append(field3);
        sb.append(", field4=");
        sb.append(field4);
        sb.append(", field5=");
        sb.append(field5);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Foo toEntityModel() {
        FooImpl fooImpl = new FooImpl();

        if (uuid == null) {
            fooImpl.setUuid(StringPool.BLANK);
        } else {
            fooImpl.setUuid(uuid);
        }

        fooImpl.setFooId(fooId);
        fooImpl.setGroupId(groupId);
        fooImpl.setCompanyId(companyId);
        fooImpl.setUserId(userId);

        if (userName == null) {
            fooImpl.setUserName(StringPool.BLANK);
        } else {
            fooImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            fooImpl.setCreateDate(null);
        } else {
            fooImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            fooImpl.setModifiedDate(null);
        } else {
            fooImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (field1 == null) {
            fooImpl.setField1(StringPool.BLANK);
        } else {
            fooImpl.setField1(field1);
        }

        fooImpl.setField2(field2);
        fooImpl.setField3(field3);

        if (field4 == Long.MIN_VALUE) {
            fooImpl.setField4(null);
        } else {
            fooImpl.setField4(new Date(field4));
        }

        if (field5 == null) {
            fooImpl.setField5(StringPool.BLANK);
        } else {
            fooImpl.setField5(field5);
        }

        fooImpl.resetOriginalValues();

        return fooImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        uuid = objectInput.readUTF();
        fooId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        field1 = objectInput.readUTF();
        field2 = objectInput.readBoolean();
        field3 = objectInput.readInt();
        field4 = objectInput.readLong();
        field5 = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (uuid == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(uuid);
        }

        objectOutput.writeLong(fooId);
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

        if (field1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(field1);
        }

        objectOutput.writeBoolean(field2);
        objectOutput.writeInt(field3);
        objectOutput.writeLong(field4);

        if (field5 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(field5);
        }
    }
}
