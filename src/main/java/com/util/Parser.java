package com.util;
import com.opencsv.CSVParser;
import java.io.IOException;
import com.rest.entity.*;
public class Parser {
	private CSVParser csvParser;
	public Parser() {
		// TODO Auto-generated constructor stub
		csvParser = new CSVParser();
	}
	public PatientEntity getPatinetData(String csvData) throws IOException{
		String[] data = csvParser.parseLine(csvData);
		PatientEntity patientEntity = new PatientEntity();
		patientEntity.setPatient_id(data[0].trim());
		patientEntity.setName(data[1].trim());
		patientEntity.setAddress(data[2].trim());
		patientEntity.setCity(data[3].trim());
		patientEntity.setState(data[4].trim());
		patientEntity.setMaritialStatus(data[5].trim());
		patientEntity.setTelecom(data[6].trim());
		patientEntity.setGender(data[7].trim());
		patientEntity.setBirthDate(data[8].trim());

		patientEntity.setMultipleBirthInteger(Integer.parseInt(data[9].trim()));
	if (data[9].equalsIgnoreCase("null")) {
			patientEntity.setMultipleBirthInteger(0);

		}
		else
			patientEntity.setMultipleBirthInteger(Integer.parseInt(data[9].trim()));
		patientEntity.setDeceasedDateTime(data[10].trim());
		return patientEntity;
	}

	
}
