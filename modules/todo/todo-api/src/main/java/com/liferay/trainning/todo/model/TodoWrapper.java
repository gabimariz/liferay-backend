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

package com.liferay.trainning.todo.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Todo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Todo
 * @generated
 */
public class TodoWrapper
	extends BaseModelWrapper<Todo> implements ModelWrapper<Todo>, Todo {

	public TodoWrapper(Todo todo) {
		super(todo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("todoId", getTodoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("title", getTitle());
		attributes.put("isComplete", isIsComplete());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long todoId = (Long)attributes.get("todoId");

		if (todoId != null) {
			setTodoId(todoId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		Boolean isComplete = (Boolean)attributes.get("isComplete");

		if (isComplete != null) {
			setIsComplete(isComplete);
		}
	}

	@Override
	public Todo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this todo.
	 *
	 * @return the company ID of this todo
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this todo.
	 *
	 * @return the create date of this todo
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this todo.
	 *
	 * @return the group ID of this todo
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is complete of this todo.
	 *
	 * @return the is complete of this todo
	 */
	@Override
	public boolean getIsComplete() {
		return model.getIsComplete();
	}

	/**
	 * Returns the modified date of this todo.
	 *
	 * @return the modified date of this todo
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this todo.
	 *
	 * @return the primary key of this todo
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the title of this todo.
	 *
	 * @return the title of this todo
	 */
	@Override
	public String getTitle() {
		return model.getTitle();
	}

	/**
	 * Returns the todo ID of this todo.
	 *
	 * @return the todo ID of this todo
	 */
	@Override
	public long getTodoId() {
		return model.getTodoId();
	}

	/**
	 * Returns the user ID of this todo.
	 *
	 * @return the user ID of this todo
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this todo.
	 *
	 * @return the user name of this todo
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this todo.
	 *
	 * @return the user uuid of this todo
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this todo.
	 *
	 * @return the uuid of this todo
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this todo is is complete.
	 *
	 * @return <code>true</code> if this todo is is complete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIsComplete() {
		return model.isIsComplete();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this todo.
	 *
	 * @param companyId the company ID of this todo
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this todo.
	 *
	 * @param createDate the create date of this todo
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this todo.
	 *
	 * @param groupId the group ID of this todo
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets whether this todo is is complete.
	 *
	 * @param isComplete the is complete of this todo
	 */
	@Override
	public void setIsComplete(boolean isComplete) {
		model.setIsComplete(isComplete);
	}

	/**
	 * Sets the modified date of this todo.
	 *
	 * @param modifiedDate the modified date of this todo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this todo.
	 *
	 * @param primaryKey the primary key of this todo
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the title of this todo.
	 *
	 * @param title the title of this todo
	 */
	@Override
	public void setTitle(String title) {
		model.setTitle(title);
	}

	/**
	 * Sets the todo ID of this todo.
	 *
	 * @param todoId the todo ID of this todo
	 */
	@Override
	public void setTodoId(long todoId) {
		model.setTodoId(todoId);
	}

	/**
	 * Sets the user ID of this todo.
	 *
	 * @param userId the user ID of this todo
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this todo.
	 *
	 * @param userName the user name of this todo
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this todo.
	 *
	 * @param userUuid the user uuid of this todo
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this todo.
	 *
	 * @param uuid the uuid of this todo
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected TodoWrapper wrap(Todo todo) {
		return new TodoWrapper(todo);
	}

}