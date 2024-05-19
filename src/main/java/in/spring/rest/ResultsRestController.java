package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Results;
import in.spring.repo.ResultsRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ResultsRestController {
	//Inject the Repo interface ref directly we dont have service here
	@Autowired
	private ResultsRepository repo;
	
	//Create a POST mode method to add the result objects in mongoDB
	@PostMapping("/addResult")
	public ResponseEntity<String> addResult(@RequestBody Results res) {
		System.out.println(res);
		
		//Call the repo.save to add the request body result obj in db
		Results newRes = repo.save(res);
		
		//Validate and give response
		if(newRes.get_id()!=null) {
			//give success msg
			return new ResponseEntity<String>("Result Saved...",HttpStatus.CREATED);
		}else {
			//give err msg
			return new ResponseEntity<String>("Failed!!",HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET Mode request to get all the results as a List
	@GetMapping("/getResults")
	public List<Results> getResults(){
		//call the repo.findAll to get all the results obj
		return repo.findAll();
	}
}
