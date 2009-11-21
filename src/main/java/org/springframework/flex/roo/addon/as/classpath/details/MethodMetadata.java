package org.springframework.flex.roo.addon.as.classpath.details;

import org.springframework.flex.roo.addon.as.model.ActionScriptSymbolName;
import org.springframework.flex.roo.addon.as.model.ActionScriptType;

public interface MethodMetadata {

	ActionScriptType getReturnType();
	
	ActionScriptSymbolName getMethodName();
}