/*
 * Copyright 2002-2015 the original author or authors.
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

import org.junit.Test;

import org.springframework.web.client.RestTemplate;

public class HomePageTests {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		String response = restTemplate.getForObject("http://localhost:8080", String.class);

		System.out.println(response);

	}

}
