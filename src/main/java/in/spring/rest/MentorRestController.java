package in.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Mentor;
import in.spring.service.MentorService;

@RestController
public class MentorRestController {
	//Inject the MentorService reference
	@Autowired
	private MentorService service;
	
	//Create a POST Mode method to Add a new mentor
	@PostMapping("/addMentor")
	public ResponseEntity<String> addMentor(@RequestBody Mentor m){
		System.out.println(m);
		
		//Call the service add method and hold the inserted object
		Mentor newM = service.addNewMentor(m);
		
		//Validate and return response
		if(newM.get_id()!=null) {
			//return success res
			return new ResponseEntity<String>("Mentor Saved..",HttpStatus.CREATED);
		}else {
			//return err msg
			return new ResponseEntity<String>("Failed!!",HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET mode method to get the mentor from of specific id
	@GetMapping("/getMentor")
	public Mentor getMentor(@RequestParam("id") String id) {
		//call the findbyid method on service and return the object
		return service.getTheMentor(id);
	}
}
