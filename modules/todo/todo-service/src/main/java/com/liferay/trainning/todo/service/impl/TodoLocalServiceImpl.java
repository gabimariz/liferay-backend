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
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.GroupLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.trainning.todo.model.Todo;
import com.liferay.trainning.todo.service.base.TodoLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.trainning.todo.model.Todo",
	service = AopService.class
)
public class TodoLocalServiceImpl extends TodoLocalServiceBaseImpl {

	public Todo addTodo(long groupId, String title, boolean isComplete,
						ServiceContext serviceContext) throws PortalException {

		Group group = GroupLocalServiceUtil.getGroup(groupId);
		long userId = serviceContext.getUserId();
		User user = userLocalService.getUser(userId);

		long todoId = counterLocalService.increment(Todo.class.getName());

		Todo todo = createTodo(todoId);

		todo.setGroupId(groupId);
		todo.setCompanyId(group.getCompanyId());
		todo.setUserId(userId);
		todo.setUserName(user.getScreenName());
		todo.setCreateDate(new Date());
		todo.setModifiedDate(new Date());

		todo.setTitle(title);
		todo.setIsComplete(isComplete);

		return super.addTodo(todo);
	}

	public Todo updateTodo(long todoId, String title, boolean isComplete) throws PortalException {

		Todo todo = getTodo(todoId);

		todo.setModifiedDate(new Date());

		todo.setTitle(title);
		todo.setIsComplete(isComplete);

		return super.updateTodo(todo);

	}
}