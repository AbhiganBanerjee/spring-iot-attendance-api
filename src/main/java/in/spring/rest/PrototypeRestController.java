package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Prototype;
import in.spring.service.PrototypeService;

@RestController
public class PrototypeRestController {
	//Inject the prototype_service interface ref
	@Autowired
	private PrototypeService service;
	
	//Create a POST mode method to insert the Prototype object in Mongo
	@PostMapping("/addPrototype")
	public ResponseEntity<String> addPrototype(@RequestBody Prototype p){
		System.out.println(p);
		
		//Call the service class add method
		Prototype newP = service.addNewPrototype(p);
		
		//Validate and give msg
		if(newP.get_id()!=null) {
			//give success message
			return new ResponseEntity<String>("Model Saved..",HttpStatus.CREATED);
			
		}else {
			//give error message
			return new ResponseEntity<String>("Failed!!",HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET mapped request to get the List<Prototype>
	@GetMapping("/getPrototypes")
	public List<Prototype> getPrototypes(){
		//call the service class get method
		return service.getAllThePrototypes();
	}
	
}
