package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Hardwares;
import in.spring.repo.HardwaresRepository;

@Service
public class HardwareServiceImpl implements HardwareService {

	//Inject the Repository Interface Reference
	@Autowired
	private HardwaresRepository repo;
	
	@Override
	public Hardwares insertHardware(Hardwares hw) {
		//Call the save method on repository ref and return the inserted doc
		return repo.save(hw);
	}

	@Override
	public List<Hardwares> getAllHardwares() {
		//Call the findAll method to get all the List of Hardwars
		return repo.findAll();
	}

}
