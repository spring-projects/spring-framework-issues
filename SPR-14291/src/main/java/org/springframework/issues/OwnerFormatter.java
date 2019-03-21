/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.issues;

import java.util.Locale;

import org.springframework.expression.ParseException;
import org.springframework.format.Formatter;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

public class OwnerFormatter implements Formatter<Owner> {

	@Override
	public Owner parse(String text, Locale locale) throws ParseException {
		if (text == null || !StringUtils.hasText(text)) {
			return null;
		}
		Long id = Long.parseLong(text);
		if (id == 1) {
			throw new EntityResultNotFoundException();
		}
		return new Owner();
	}

	@Override
	public String print(Owner owner, Locale locale) {
		return owner == null ? null : ObjectUtils.getIdentityHexString(owner);
	}
}