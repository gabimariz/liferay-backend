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

package com.liferay.trainning.todo.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TodoService}.
 *
 * @author Brian Wing Shun Chan
 * @see TodoService
 * @generated
 */
public class TodoServiceWrapper
	implements ServiceWrapper<TodoService>, TodoService {

	public TodoServiceWrapper() {
		this(null);
	}

	public TodoServiceWrapper(TodoService todoService) {
		_todoService = todoService;
	}

	@Override
	public com.liferay.trainning.todo.model.Todo addTodo(
			long groupId, String title, boolean isComplete,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _todoService.addTodo(groupId, title, isComplete, serviceContext);
	}

	@Override
	public com.liferay.trainning.todo.model.Todo deleteTodo(long todoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _todoService.deleteTodo(todoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _todoService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.trainning.todo.model.Todo getTodo(long todoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _todoService.getTodo(todoId);
	}

	@Override
	public java.util.List<com.liferay.trainning.todo.model.Todo>
		getTodoByGroupId(long groupId) {

		return _todoService.getTodoByGroupId(groupId);
	}

	@Override
	public com.liferay.trainning.todo.model.Todo updateTodo(
			long todoId, String title, boolean isComplete)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _todoService.updateTodo(todoId, title, isComplete);
	}

	@Override
	public TodoService getWrappedService() {
		return _todoService;
	}

	@Override
	public void setWrappedService(TodoService todoService) {
		_todoService = todoService;
	}

	private TodoService _todoService;

}