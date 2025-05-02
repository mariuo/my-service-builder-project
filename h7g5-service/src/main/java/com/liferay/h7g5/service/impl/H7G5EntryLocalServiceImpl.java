/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.exception.NoSuchH7G5EntryException;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.liferay.h7g5.model.H7G5Entry",
	service = AopService.class
)
public class H7G5EntryLocalServiceImpl extends H7G5EntryLocalServiceBaseImpl {
	public H7G5Entry findByH_D_N(
			long h7g5FolderId, String description, String name)
		throws NoSuchH7G5EntryException {

		return h7g5EntryPersistence.findByH_D_N(
			h7g5FolderId, description, name);
	}

	public List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId) {
		return h7g5EntryPersistence.findByH7G5FolderId(h7g5FolderId);
	}

	public H7G5Entry findByKey(String key) throws NoSuchH7G5EntryException {
		return h7g5EntryPersistence.findByKey(key);
	}

	public List<H7G5Entry> findByName(String name) {
		return h7g5EntryPersistence.findByName(name);
	}
}