package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Features;
import in.spring.service.FeatureService;

@RestController
public class FeatureRestController {
	
	//Inject the FeatureService interface reference
	@Autowired
	private FeatureService service;
	
	//POST Mapped Method to POST feature into Mongo from request Body
	@PostMapping("/addFeature")
	public ResponseEntity<String> addFeature(@RequestBody Features f){
		System.out.println(f);
		
		//Call the service class add method, and store it in new obj
		Features newF = service.addNewFeature(f);
		
		//Validate and send response
		if(newF.get_id()!=null) {
			//send success msg
			return new ResponseEntity<String>("Feature Saved..",HttpStatus.CREATED);
		}else {
			//send err msg
			return new ResponseEntity<String>("Failed..",HttpStatus.UNAUTHORIZED);
		}
	}
	
	//GET Mapped method to get all the features from MongoDB
	@GetMapping("/getFeatures")
	public List<Features> getFeatures(){
		//call service get method and return all features
		return service.getAllFeatures();
	}
}	
