package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Softwares;
import in.spring.repo.SoftwareRepository;

@Service
public class SoftwareServiceImpl implements SoftwareService {
	//Inject the Repository Reference ref
	@Autowired
	private SoftwareRepository repo;
	
	@Override
	public Softwares addSoftware(Softwares sft) {
		//Call the repo save method to insert sft in MongoDB and return inserted obj
		return repo.save(sft);
	}

	@Override
	public List<Softwares> getAllSoftwares() {
		//Call the findAll method on repo reference
		return repo.findAll();
	}
}
