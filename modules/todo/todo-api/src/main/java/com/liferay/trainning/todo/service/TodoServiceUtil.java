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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.trainning.todo.model.Todo;

import java.util.List;

/**
 * Provides the remote service utility for Todo. This utility wraps
 * <code>com.liferay.trainning.todo.service.impl.TodoServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see TodoService
 * @generated
 */
public class TodoServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.trainning.todo.service.impl.TodoServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Todo addTodo(
			long groupId, String title, boolean isComplete,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws PortalException {

		return getService().addTodo(groupId, title, isComplete, serviceContext);
	}

	public static Todo deleteTodo(long todoId) throws PortalException {
		return getService().deleteTodo(todoId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static Todo getTodo(long todoId) throws PortalException {
		return getService().getTodo(todoId);
	}

	public static List<Todo> getTodoByGroupId(long groupId) {
		return getService().getTodoByGroupId(groupId);
	}

	public static Todo updateTodo(long todoId, String title, boolean isComplete)
		throws PortalException {

		return getService().updateTodo(todoId, title, isComplete);
	}

	public static TodoService getService() {
		return _service;
	}

	private static volatile TodoService _service;

}