package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Members;
import in.spring.service.MembersService;

@RestController
public class MembersRestController {
	//Inject the Service interface ref
	@Autowired
	private MembersService service;
	
	//Create a POST mapped method to insert the members obj coming in req-body
	@PostMapping("/addMember")
	public ResponseEntity<String> addMember(@RequestBody Members m){
		System.out.println(m);
		
		//Call the service method to insert and get the inserted obj
		Members newM = service.addNewMember(m);
		
		//validate and return response
		if(newM.get_id()!=null) {
			//give success msg
			return new ResponseEntity<String>("Member saved..",HttpStatus.CREATED);
		}else {
			//give error msg
			return new ResponseEntity<String>("Failed!!",HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET MODE method to get all the member data as List
	@GetMapping("/getMembers")
	public List<Members> getMembers(){
		//call the service class get method
		return service.getAllMembers();
	}
}
