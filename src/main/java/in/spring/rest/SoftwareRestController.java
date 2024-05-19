package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Softwares;
import in.spring.service.SoftwareService;

@RestController
public class SoftwareRestController {
	//Inject the SftwareService interface ref
	@Autowired
	private SoftwareService service;
	
	//Create a POST Mapped method to insert software obj
	@PostMapping("/addSoftware")
	public ResponseEntity<String> addNewSoftware(@RequestBody Softwares sft){
		System.out.println(sft);
		
		//Call the serviceimpl class add method and store it in new obj
		Softwares s = service.addSoftware(sft);
		
		//Validate the s obj and based on that return response
		if(s.get_id()!=null) {
			//give success msg
			return new ResponseEntity<String>("Software Saved..",HttpStatus.CREATED);
		}else {
			//give failed msg
			return new ResponseEntity<String>("Failed!!",HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET mapped method to get all Softwares Array of JSON
	@GetMapping("/getSoftwares")
	public List<Softwares> getSoftwares(){
		//Call the service class get method
		return service.getAllSoftwares();
	}
}

/*
 {
        "name": "Eclipse IDE",
        "type": "IDE",
        "role": "Used to build a Servlet & JDBC Integrated Web-App to fetch ID from Local Database",
        "image": "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjSYaE9DSkKqvoYSz00u1NLwG5Yttc_YJp0jz3khZsag&s",
        "icon" : "Code"
 } 
 */
