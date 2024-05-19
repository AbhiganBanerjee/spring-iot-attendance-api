package in.spring.service;

import java.util.List;

import in.spring.document.Prototype;

public interface PrototypeService {
	//Create methods for adding new prototype
	Prototype addNewPrototype(Prototype p);
	
	//Create a method to retrieve all the prototypes List
	List<Prototype> getAllThePrototypes();
}
