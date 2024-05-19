package in.spring.service;

import java.util.List;

import in.spring.document.Hardwares;

public interface HardwareService {
	//Method to Insert Hardwares document object in MongoDB
	Hardwares insertHardware(Hardwares hw);
	
	//Method to Get all the Hardwares from the MongoDB
	List<Hardwares> getAllHardwares();
}
