package in.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.spring.document.Hardwares;
import in.spring.service.HardwareService;

@RestController
public class HardwareRestController {
	//Inject the Service interface ref
	@Autowired
	private HardwareService service;
	
	//Create a POST mapped method to insert Hw data from ReqBody
	@PostMapping("/addHardware")
	public ResponseEntity<String> addHardware(@RequestBody Hardwares hw){
		System.out.println(hw);
		
		//Call the service insert method and store the new hardware obj
		Hardwares newHw = service.insertHardware(hw);
		
		//validate and give msg
		if(newHw.get_id()!=null) {
			return new ResponseEntity<String>("Hardware Saved..",HttpStatus.CREATED);
		}else {
			return new ResponseEntity<String>("Failed..",HttpStatus.UNAUTHORIZED);
		}
	}
	
	//Create a GET Mapped method to get all the hardwares as List
	@GetMapping("/getHardwares")
	public List<Hardwares> getHardwares() {
		//Call the service class get method
		return service.getAllHardwares();
	}
}	

/*{
    "name" : "Generic Esp8266 NodeMCU Lua Amica-Development Board",
    "price" : 254.00,
    "pins" : ["Power(3.3V,Vin,GND)", "Control(EN,RST)", "Digital(D0-D8)"],
    "image" : "https://5.imimg.com/data5/SELLER/Default/2023/6/313627150/KN/KD/NH/66278010/nodemcu-esp8266-wifi-development-board-lolin-.jpg"
}*/
