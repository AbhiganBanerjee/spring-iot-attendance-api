package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Prototype;
import in.spring.repo.PrototypeRepository;

@Service
public class PrototypeServiceImpl implements PrototypeService {

	//Inject the PrototypeRepo interface ref
	@Autowired
	private PrototypeRepository repo;
	
	@Override
	public Prototype addNewPrototype(Prototype p) {
		//Call the repo save method and return the inserted obj
		return repo.save(p);
	}

	@Override
	public List<Prototype> getAllThePrototypes() {
		//Call the repo findAll method and return the List<Prototype>
		return repo.findAll();
	}

}
