/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.lock.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.MVCCModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Lock service. Represents a row in the &quot;Lock_&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.portal.lock.model.impl.LockModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.portal.lock.model.impl.LockImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Lock
 * @see com.liferay.portal.lock.model.impl.LockImpl
 * @see com.liferay.portal.lock.model.impl.LockModelImpl
 * @generated
 */
@ProviderType
public interface LockModel extends BaseModel<Lock>, MVCCModel, ShardedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lock model instance should use the {@link Lock} interface instead.
	 */

	/**
	 * Returns the primary key of this lock.
	 *
	 * @return the primary key of this lock
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lock.
	 *
	 * @param primaryKey the primary key of this lock
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this lock.
	 *
	 * @return the mvcc version of this lock
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this lock.
	 *
	 * @param mvccVersion the mvcc version of this lock
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the uuid of this lock.
	 *
	 * @return the uuid of this lock
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this lock.
	 *
	 * @param uuid the uuid of this lock
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the lock ID of this lock.
	 *
	 * @return the lock ID of this lock
	 */
	public long getLockId();

	/**
	 * Sets the lock ID of this lock.
	 *
	 * @param lockId the lock ID of this lock
	 */
	public void setLockId(long lockId);

	/**
	 * Returns the company ID of this lock.
	 *
	 * @return the company ID of this lock
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this lock.
	 *
	 * @param companyId the company ID of this lock
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this lock.
	 *
	 * @return the user ID of this lock
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this lock.
	 *
	 * @param userId the user ID of this lock
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this lock.
	 *
	 * @return the user uuid of this lock
	 */
	public String getUserUuid();

	/**
	 * Sets the user uuid of this lock.
	 *
	 * @param userUuid the user uuid of this lock
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this lock.
	 *
	 * @return the user name of this lock
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this lock.
	 *
	 * @param userName the user name of this lock
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this lock.
	 *
	 * @return the create date of this lock
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this lock.
	 *
	 * @param createDate the create date of this lock
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the class name of this lock.
	 *
	 * @return the class name of this lock
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this lock.
	 *
	 * @param className the class name of this lock
	 */
	public void setClassName(String className);

	/**
	 * Returns the key of this lock.
	 *
	 * @return the key of this lock
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this lock.
	 *
	 * @param key the key of this lock
	 */
	public void setKey(String key);

	/**
	 * Returns the owner of this lock.
	 *
	 * @return the owner of this lock
	 */
	@AutoEscape
	public String getOwner();

	/**
	 * Sets the owner of this lock.
	 *
	 * @param owner the owner of this lock
	 */
	public void setOwner(String owner);

	/**
	 * Returns the inheritable of this lock.
	 *
	 * @return the inheritable of this lock
	 */
	public boolean getInheritable();

	/**
	 * Returns <code>true</code> if this lock is inheritable.
	 *
	 * @return <code>true</code> if this lock is inheritable; <code>false</code> otherwise
	 */
	public boolean isInheritable();

	/**
	 * Sets whether this lock is inheritable.
	 *
	 * @param inheritable the inheritable of this lock
	 */
	public void setInheritable(boolean inheritable);

	/**
	 * Returns the expiration date of this lock.
	 *
	 * @return the expiration date of this lock
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this lock.
	 *
	 * @param expirationDate the expiration date of this lock
	 */
	public void setExpirationDate(Date expirationDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(com.liferay.portal.lock.model.Lock lock);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.liferay.portal.lock.model.Lock> toCacheModel();

	@Override
	public com.liferay.portal.lock.model.Lock toEscapedModel();

	@Override
	public com.liferay.portal.lock.model.Lock toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}