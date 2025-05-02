/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.http;

import com.liferay.h7g5.service.H7G5EntryServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

/**
 * Provides the HTTP utility for the
 * <code>H7G5EntryServiceUtil</code> service
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
public class H7G5EntryServiceHttp {

	public static com.liferay.h7g5.model.H7G5Entry findByH_D_N(
			HttpPrincipal httpPrincipal, long h7g5FolderId, String description,
			String name)
		throws com.liferay.h7g5.exception.NoSuchH7G5EntryException,
			   com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "findByH_D_N",
				_findByH_D_NParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, h7g5FolderId, description, name);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.h7g5.exception.NoSuchH7G5EntryException) {

					throw (com.liferay.h7g5.exception.NoSuchH7G5EntryException)
						exception;
				}

				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.h7g5.model.H7G5Entry>
			findByH7G5FolderId(HttpPrincipal httpPrincipal, long h7g5FolderId)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "findByH7G5FolderId",
				_findByH7G5FolderIdParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(
				methodKey, h7g5FolderId);

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

			return (java.util.List<com.liferay.h7g5.model.H7G5Entry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static com.liferay.h7g5.model.H7G5Entry findByKey(
			HttpPrincipal httpPrincipal, String key)
		throws com.liferay.h7g5.exception.NoSuchH7G5EntryException,
			   com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "findByKey",
				_findByKeyParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey, key);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception exception) {
				if (exception instanceof
						com.liferay.h7g5.exception.NoSuchH7G5EntryException) {

					throw (com.liferay.h7g5.exception.NoSuchH7G5EntryException)
						exception;
				}

				if (exception instanceof
						com.liferay.portal.kernel.exception.PortalException) {

					throw (com.liferay.portal.kernel.exception.PortalException)
						exception;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(
					exception);
			}

			return (com.liferay.h7g5.model.H7G5Entry)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	public static java.util.List<com.liferay.h7g5.model.H7G5Entry> findByName(
			HttpPrincipal httpPrincipal, String name)
		throws com.liferay.portal.kernel.exception.PortalException {

		try {
			MethodKey methodKey = new MethodKey(
				H7G5EntryServiceUtil.class, "findByName",
				_findByNameParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey, name);

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

			return (java.util.List<com.liferay.h7g5.model.H7G5Entry>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException
					systemException) {

			_log.error(systemException, systemException);

			throw systemException;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(H7G5EntryServiceHttp.class);

	private static final Class<?>[] _findByH_D_NParameterTypes0 = new Class[] {
		long.class, String.class, String.class
	};
	private static final Class<?>[] _findByH7G5FolderIdParameterTypes1 =
		new Class[] {long.class};
	private static final Class<?>[] _findByKeyParameterTypes2 = new Class[] {
		String.class
	};
	private static final Class<?>[] _findByNameParameterTypes3 = new Class[] {
		String.class
	};

}