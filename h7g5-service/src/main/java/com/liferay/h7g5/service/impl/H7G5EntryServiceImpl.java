/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.exception.NoSuchH7G5EntryException;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.PrincipalException;

import java.util.List;
import java.util.Objects;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=ohqiwtsfhl",
		"json.web.service.context.path=H7G5Entry"
	},
	service = AopService.class
)
public class H7G5EntryServiceImpl extends H7G5EntryServiceBaseImpl {
	public H7G5Entry findByH_D_N(
			long h7g5FolderId, String description, String name)
		throws NoSuchH7G5EntryException, PortalException {

		_checkEmailAddress();

		return h7g5EntryLocalService.findByH_D_N(
			h7g5FolderId, description, name);
	}

	public List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId)
		throws PortalException {

		_checkEmailAddress();

		return h7g5EntryLocalService.findByH7G5FolderId(h7g5FolderId);
	}

	public H7G5Entry findByKey(String key)
		throws NoSuchH7G5EntryException, PortalException {

		_checkEmailAddress();

		return h7g5EntryLocalService.findByKey(key);
	}

	public List<H7G5Entry> findByName(String name) throws PortalException {
		_checkEmailAddress();

		return h7g5EntryLocalService.findByName(name);
	}

	private void _checkEmailAddress() throws PortalException {
		User user = getUser();

		if (!Objects.equals(user.getEmailAddress(), "test@liferay.com")) {
			throw new PrincipalException("You are not test@liferay.com");
		}
	}
}