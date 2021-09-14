/** 
 * LookupResult.java
 * 
 * Copyright 2021 President and Fellows of Harvard College
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.harvard.mcz.nametools;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Structure to hold the result of a lookup of a name
 * 
 * @author mole
 *
 */
public class LookupResult {
	
	private static final Log log = LogFactory.getLog(LookupResult.class);
	
	private NameComparison nameComparison;
	private String matchedName;
	private String matchedAuthorship;
	private String guid;
	private Class<?> service;
	
	public LookupResult() { 
		nameComparison = null;
		matchedName = null;
		matchedAuthorship = null;
		guid = null;
		service = null;
	}

	/**
	 * Create an instance of a LookupResult carrying metadata about a lookup of 
	 * a name on a service.
	 * 
	 * @param nameComparison a structured comparison of the authorship of the name presented (as name one)
	 *  and the authorship of the name returned by the service (as name two)
	 * @param matchedName the scientific name string for the match as returned by the service
	 * @param matchedAuthorship the authorship string for the match as returned by the service
	 * @param guid a guid for the match as returned by the service.
	 * @param service the service on which the lookup was performed.
	 * @throws ExpectationsNotMetException when the matchedAuthorship doesn't match nameTwo in the nameComparison
	 */
	public LookupResult(NameComparison nameComparison, String matchedName, String matchedAuthorship, String guid, Class<?> service) throws ExpectationsNotMetException {
		if (nameComparison!=null) { 
			if (!matchedName.equals(nameComparison.getNameTwo())) { 
				throw new ExpectationsNotMetException("matchedName and nameComparison.nameTwo are not the same");
			}
		}
		this.nameComparison = nameComparison;
		this.matchedName = matchedName;
		this.guid = guid;
		this.matchedAuthorship = matchedAuthorship;
		this.service = service;
	}

	/**
	 * @return the nameComparison
	 */
	public NameComparison getNameComparison() {
		return nameComparison;
	}

	/**
	 * @param nameComparison the nameComparison to set
	 */
	public void setNameComparison(NameComparison nameComparison) {
		this.nameComparison = nameComparison;
	}

	/**
	 * @return the matchedName
	 */
	public String getMatchedName() {
		return matchedName;
	}

	/**
	 * @param matchedName the matchedName to set
	 */
	public void setMatchedName(String matchedName) {
		this.matchedName = matchedName;
	}

	/**
	 * @return the guid
	 */
	public String getGuid() {
		return guid;
	}

	/**
	 * @param guid the guid to set
	 */
	public void setGuid(String guid) {
		this.guid = guid;
	}

	/**
	 * @return the matchedAuthorship
	 */
	public String getMatchedAuthorship() {
		return matchedAuthorship;
	}

	/**
	 * @param matchedAuthorship the matchedAuthorship to set
	 */
	public void setMatchedAuthorship(String matchedAuthorship) {
		this.matchedAuthorship = matchedAuthorship;
	}

	/**
	 * @return the service
	 */
	public Class<?> getService() {
		return service;
	}

	/**
	 * @param service the service to set
	 */
	public void setService(Class<?> service) {
		this.service = service;
	}

}
