package in.spring.service;

import java.util.List;

import in.spring.document.Softwares;

public interface SoftwareService {
	//Add a method to insert Software entity in MongoDB
	Softwares addSoftware(Softwares sft);
	
	//Add a method to get all Softwares as List of softwares
	List<Softwares> getAllSoftwares();
}
