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

package com.liferay.trainning.todo.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.trainning.todo.model.Todo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Todo in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TodoCacheModel implements CacheModel<Todo>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TodoCacheModel)) {
			return false;
		}

		TodoCacheModel todoCacheModel = (TodoCacheModel)object;

		if (todoId == todoCacheModel.todoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, todoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", todoId=");
		sb.append(todoId);
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
		sb.append(", title=");
		sb.append(title);
		sb.append(", isComplete=");
		sb.append(isComplete);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Todo toEntityModel() {
		TodoImpl todoImpl = new TodoImpl();

		if (uuid == null) {
			todoImpl.setUuid("");
		}
		else {
			todoImpl.setUuid(uuid);
		}

		todoImpl.setTodoId(todoId);
		todoImpl.setGroupId(groupId);
		todoImpl.setCompanyId(companyId);
		todoImpl.setUserId(userId);

		if (userName == null) {
			todoImpl.setUserName("");
		}
		else {
			todoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			todoImpl.setCreateDate(null);
		}
		else {
			todoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			todoImpl.setModifiedDate(null);
		}
		else {
			todoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (title == null) {
			todoImpl.setTitle("");
		}
		else {
			todoImpl.setTitle(title);
		}

		todoImpl.setIsComplete(isComplete);

		todoImpl.resetOriginalValues();

		return todoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		todoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		title = objectInput.readUTF();

		isComplete = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(todoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		objectOutput.writeBoolean(isComplete);
	}

	public String uuid;
	public long todoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String title;
	public boolean isComplete;

}