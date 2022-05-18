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

package com.liferay.trainning.todo.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.trainning.todo.model.Todo;
import com.liferay.trainning.todo.service.base.TodoServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=todo",
		"json.web.service.context.path=Todo"
	},
	service = AopService.class
)
public class TodoServiceImpl extends TodoServiceBaseImpl {

	public Todo addTodo(long groupId, String title, boolean isComplete,
						ServiceContext serviceContext) throws PortalException {
		return todoLocalService.addTodo(groupId, title, isComplete, serviceContext);
	}

	public Todo updateTodo(long todoId, String title, boolean isComplete) throws PortalException {
		return todoLocalService.updateTodo(todoId, title, isComplete);
	}

	public List<Todo> getTodoByGroupId(long groupId) {
		return todoPersistence.findBygroupId(groupId);
	}

	public Todo getTodo(long todoId) throws PortalException {
		return todoLocalService.getTodo(todoId);
	}


	public Todo deleteTodo(long todoId) throws PortalException {
		return todoLocalService.deleteTodo(todoId);
	}
}