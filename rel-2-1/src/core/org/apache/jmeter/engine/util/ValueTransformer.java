// $Header$
/*
 * Copyright 2003-2004 The Apache Software Foundation.
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
 * 
 */

/*
 * Created on May 4, 2003
 */
package org.apache.jmeter.engine.util;

import java.util.Map;

import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.testelement.property.JMeterProperty;

/**
 * @author ano ano
 * 
 * @version $Revision$
 */
interface ValueTransformer {
	/**
	 * Transform the given property and return the new version.
	 * 
	 * @param property
	 * @return the transformed property
	 */
	public JMeterProperty transformValue(JMeterProperty property) throws InvalidVariableException;

	/**
	 * Set the master function for the value transformer. This handles
	 * converting strings to functions.
	 * 
	 * @param masterFunction
	 */
	public void setMasterFunction(CompoundVariable masterFunction);

	/**
	 * Set the variable names and values used to reverse replace functions with
	 * strings, and undo functions to raw values.
	 * 
	 * @param vars
	 */
	public void setVariables(Map vars);
}
