/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.liferay.h7g5.service.impl;

import com.liferay.h7g5.exception.NoSuchH7G5EntryException;
import com.liferay.h7g5.model.H7G5Entry;
import com.liferay.h7g5.service.base.H7G5EntryLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;


import java.util.Collections;
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
			System.out.println("Invoking findByH_D_N: " + h7g5FolderId + ", " + description + ", "+  name + ".");
			DynamicQuery dynamicQuery = dynamicQuery();
			if (h7g5FolderId > 0) {
				dynamicQuery.add(RestrictionsFactoryUtil.eq("h7g5FolderId", h7g5FolderId));
			}
			if (Validator.isNotNull(description)) {
				dynamicQuery.add(RestrictionsFactoryUtil.eq("description", description));
			}
			if (Validator.isNotNull(name)) {
				dynamicQuery.add(RestrictionsFactoryUtil.eq("name", name));
			}
 try {
            List<H7G5Entry> entries = h7g5EntryPersistence.findWithDynamicQuery(dynamicQuery);
            if (entries.isEmpty()) {
                throw new NoSuchH7G5EntryException("No H7G5Entry found with the given criteria");
            }
            return entries.get(0);
        } catch (SystemException e) {
            throw new NoSuchH7G5EntryException("Error finding entry by HDN", e);
        }
	}

	public List<H7G5Entry> findByH7G5FolderId(long h7g5FolderId) {
		System.out.println("Invoking findByH7G5FolderId: " + h7g5FolderId + ".");
		DynamicQuery dynamicQuery = dynamicQuery().add(RestrictionsFactoryUtil.eq("h7g5FolderId", h7g5FolderId));

		try{
			return h7g5EntryPersistence.findWithDynamicQuery(dynamicQuery);
		}catch (SystemException e) {
            return Collections.emptyList();
        }
	}

	public H7G5Entry findByKey(String key) throws NoSuchH7G5EntryException {
		System.out.println("Invoking Key: " + key + ".");
		DynamicQuery dynamicQuery = dynamicQuery()
            .add(RestrictionsFactoryUtil.eq("key", key));
        try {
            List<H7G5Entry> entries = h7g5EntryPersistence.findWithDynamicQuery(dynamicQuery);
            if (entries.isEmpty()) {
                throw new NoSuchH7G5EntryException("No H7G5Entry found with key: " + key);
            }
            return entries.get(0);
        } catch (SystemException e) {
            throw new NoSuchH7G5EntryException("Error finding entry by key: " + key, e);
        }
	}

	public List<H7G5Entry> findByName(String name) {
		System.out.println("Invoking Name: " + name + ".");
		DynamicQuery dynamicQuery = dynamicQuery()
		.add(RestrictionsFactoryUtil.eq("name", name));
		try{

			return h7g5EntryPersistence.findWithDynamicQuery(dynamicQuery);

		}catch (SystemException e) {
            return Collections.emptyList();
        }
	}
}