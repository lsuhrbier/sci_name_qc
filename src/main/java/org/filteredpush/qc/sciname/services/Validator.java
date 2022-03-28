/**
 * 
 */
package org.filteredpush.qc.sciname.services;

import edu.harvard.mcz.nametools.NameUsage;

/**
 * Interface for data sources that are capable of validating scientific 
 * name usages.  A consumer of NameUsages returned by validate() is responsible
 * for serialization of those objects to output.
 * 
 * @author mole
 *
 */
public interface Validator {

	public NameUsage validate(NameUsage taxonToValidate);
	
}
