/*
 * Copyright 2002-2010 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.flex.roo.addon.entity;

import org.springframework.flex.roo.addon.as.model.ActionScriptType;
import org.springframework.roo.model.JavaType;

public class TypeMapping {

	private String metadataId;
	private ActionScriptType asType;
	private JavaType javaType;
	
	public TypeMapping(String metadataId, ActionScriptType asType,
			JavaType javaType) {
		super();
		this.metadataId = metadataId;
		this.asType = asType;
		this.javaType = javaType;
	}
	
	public String getMetadataId() {
		return metadataId;
	}
	
	public ActionScriptType getAsType() {
		return asType;
	}
	
	public JavaType getJavaType() {
		return javaType;
	}
}
