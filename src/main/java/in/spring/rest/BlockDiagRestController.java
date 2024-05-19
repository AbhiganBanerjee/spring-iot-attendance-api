package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.BlockDiagram;
import in.spring.service.BlockDiagramService;

@RestController
public class BlockDiagRestController {
	//Inject the Service ref
	@Autowired
	private BlockDiagramService service;
	
	//Create a POST Mapped method to insert BlockDiagram 
	@PostMapping("/addDiag")
	public ResponseEntity<String> addDiag(@RequestBody BlockDiagram bd){
		System.out.println(bd);
		
		//Call the service add method
		BlockDiagram newBd = service.insertDiagram(bd);
		
		//Validate and return msg
		if(newBd.get_id()!=null) {
			return new ResponseEntity<String>("BlockDiag Saved..",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Failed!!", HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET Mapped method to return BlockDiagram
	@GetMapping("/getDiag")
	public List<BlockDiagram> getDiag(){
		//call findAll from service
		return service.getBlockDiagram();
	}
}
