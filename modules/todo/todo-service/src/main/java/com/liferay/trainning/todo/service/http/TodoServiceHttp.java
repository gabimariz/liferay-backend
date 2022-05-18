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

package com.liferay.trainning.todo.service.http;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.trainning.todo.service.TodoServiceUtil;

/**
 * Provides the HTTP utility for the
 * <code>TodoServiceUtil</code> service
 * utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * <code>HttpPrincipal</code> parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TodoServiceHttp {

	public static com.liferay.trainning.todo.model.Todo addTodo(
			HttpPrincipal httpPrincipal, long groupId, String title,
			boolean isComplete,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				TodoServiceUtil.class, "addTodo", _addTodoParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, groupId, title, isComplete, serviceContext);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.trainning.todo.model.Todo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.trainning.todo.model.Todo updateTodo(
			HttpPrincipal httpPrincipal, long todoId, String title,
			boolean isComplete)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				TodoServiceUtil.class, "updateTodo",
				_updateTodoParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, todoId, title, isComplete);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.trainning.todo.model.Todo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.trainning.todo.model.Todo>
		getTodoByGroupId(HttpPrincipal httpPrincipal, long groupId) {

		try {
			MethodKey methodKey = new MethodKey(
				TodoServiceUtil.class, "getTodoByGroupId",
				_getTodoByGroupIdParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, groupId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (java.util.List<com.liferay.trainning.todo.model.Todo>)
				returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.trainning.todo.model.Todo getTodo(
			HttpPrincipal httpPrincipal, long todoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				TodoServiceUtil.class, "getTodo", _getTodoParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, todoId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.trainning.todo.model.Todo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.trainning.todo.model.Todo deleteTodo(
			HttpPrincipal httpPrincipal, long todoId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				TodoServiceUtil.class, "deleteTodo",
				_deleteTodoParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, todoId);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.trainning.todo.model.Todo)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(TodoServiceHttp.class);

	private static final Class<?>[] _addTodoParameterTypes0 = new Class[] {
		long.class, String.class, boolean.class,
		com.liferay.portal.kernel.service.ServiceContext.class
	};
	private static final Class<?>[] _updateTodoParameterTypes1 = new Class[] {
		long.class, String.class, boolean.class
	};
	private static final Class<?>[] _getTodoByGroupIdParameterTypes2 =
		new Class[] {long.class};
	private static final Class<?>[] _getTodoParameterTypes3 = new Class[] {
		long.class
	};
	private static final Class<?>[] _deleteTodoParameterTypes4 = new Class[] {
		long.class
	};

}