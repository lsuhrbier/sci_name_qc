/** 
 * BatchRunner.java
 * 
 * Copyright 2022 President and Fellows of Harvard College
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
package org.filteredpush.qc.sciname;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.Iterator;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.QuoteMode;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.filteredpush.qc.sciname.services.Validator;

import edu.harvard.mcz.nametools.NameUsage;

/**
 * @author mole
 *
 */
public class BatchRunner {

	private static final Log logger = LogFactory.getLog(BatchRunner.class);

	private File inputFile;
	private File outputFile;
	private Validator validator;
	
	/**
	 * @throws FileException 
	 * 
	 */
	public BatchRunner(String inputFileName, String outputFileName, Validator validator) throws FileException {
	   File targetInputFile = new File(inputFileName);
	   if (targetInputFile.exists() && targetInputFile.canRead()) { 
		   this.inputFile = targetInputFile;
	   } else { 
		   throw new FileException("Unable to read input file [" + inputFileName + "].");
	   }
	   if (outputFileName==null || outputFileName.trim().length()==0) { 
		   outputFileName = inputFile.getName().substring(0, inputFile.getName().indexOf(".")).concat("_out_").concat(LocalDate.now().toString().replace("-","_")).concat(".csv");
	   }
	   File targetOutputFile = new File(outputFileName);
	   if (targetOutputFile.exists()) { 
		   throw new FileException("Output file [" + outputFileName + "] exists, won't overwrite.");
	   }
	   this.outputFile = targetOutputFile;
	   this.validator = validator;
	}

	public boolean runBatch() { 
		boolean result = false;
		
		logger.debug("Reading from " + inputFile.getName());
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(inputFile));
			CSVParser records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader);
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
			CSVPrinter printer = new CSVPrinter(writer, 
					CSVFormat.DEFAULT.withQuoteMode(QuoteMode.ALL).withHeader("dbpk","scientificName","authorship","guid","match","sciNameWas","authorWas","authorSimilarity"));
			
			Iterator<CSVRecord> recordIterator = records.iterator();
			while (recordIterator.hasNext()) {
				CSVRecord line = recordIterator.next();
				logger.debug(line.get("dbpk"));
				NameUsage usage = new NameUsage();
				usage.setInputDbPK(Integer.parseInt(line.get("dbpk")));
				usage.setScientificName(line.get("scientificName"));
				usage.setAuthorship(line.get("authorship"));
				if (line.toMap().containsKey("kingdom")) { 
					usage.setKingdom(line.get("kingdom"));
				} 
				if (line.toMap().containsKey("family")) { 
					usage.setFamily(line.get("family"));
				} 
				
				NameUsage vUsage = validator.validate(usage);
				if (vUsage!=null) {
					logger.debug(vUsage.getGuid());
					printer.printRecord(Integer.valueOf(vUsage.getInputDbPK()).toString(),vUsage.getScientificName(),vUsage.getAuthorship(),vUsage.getGuid(),vUsage.getMatchDescription(),vUsage.getOriginalScientificName(), vUsage.getOriginalAuthorship(), Double.valueOf(vUsage.getAuthorshipStringEditDistance()).toString());
				} else { 
					usage.setMatchDescription("Not Found");
					logger.debug("Not found");
					printer.printRecord(Integer.valueOf(usage.getInputDbPK()).toString(),usage.getScientificName(),usage.getAuthorship(),usage.getGuid(),usage.getMatchDescription(),usage.getOriginalScientificName(), usage.getOriginalAuthorship(), Double.valueOf(usage.getAuthorshipStringEditDistance()).toString());
				}	
				
				printer.flush();
			}
			records.close();
			reader.close();
			printer.close();
			writer.close();
		} catch (Exception e) { 
			logger.error(e.getMessage(), e);
		}
		return result;
	}
	
}
