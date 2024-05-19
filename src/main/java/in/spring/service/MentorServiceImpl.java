package in.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Mentor;
import in.spring.repo.MentorRepository;

@Service
public class MentorServiceImpl implements MentorService {
	
	//Inject the repo interface ref
	@Autowired
	private MentorRepository repo;
	
	@Override
	public Mentor addNewMentor(Mentor m) {
		//Call the repo.save method and return the inserted object
		return repo.save(m);
	}

	@Override
	public Mentor getTheMentor(String id) {
		//Call the repo.findById method to get that particular object
		Optional<Mentor> optional= repo.findById(id);
		
		//return the mentor obj
		return optional.get();
	}

}
