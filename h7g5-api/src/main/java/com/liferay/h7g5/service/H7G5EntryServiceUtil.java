/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service;

import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.module.service.Snapshot;

import java.util.List;

/**
 * Provides the remote service utility for H7G5Entry. This utility wraps
 * <code>com.liferay.h7g5.service.impl.H7G5EntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see H7G5EntryService
 * @generated
 */
public class H7G5EntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.h7g5.service.impl.H7G5EntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId)
		throws PortalException {

		return getService().findByH7G5FolderId(h7g5FolderId);
	}

	public static H7G5Entry findByH_D_N(
			long h7g5FolderId, String description, String name)
		throws com.liferay.h7g5.exception.NoSuchH7G5EntryException,
			   PortalException {

		return getService().findByH_D_N(h7g5FolderId, description, name);
	}

	public static H7G5Entry findByKey(String key)
		throws com.liferay.h7g5.exception.NoSuchH7G5EntryException,
			   PortalException {

		return getService().findByKey(key);
	}

	public static List<H7G5Entry> findByName(String name)
		throws PortalException {

		return getService().findByName(name);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static H7G5EntryService getService() {
		return _serviceSnapshot.get();
	}

	private static final Snapshot<H7G5EntryService> _serviceSnapshot =
		new Snapshot<>(H7G5EntryServiceUtil.class, H7G5EntryService.class);

}