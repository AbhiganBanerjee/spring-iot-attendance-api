package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Members;
import in.spring.repo.MembersRepository;

@Service
public class MembersServiceImpl implements MembersService {
	//Inject the repo interface reference
	@Autowired
	private MembersRepository repo;
	
	@Override
	public Members addNewMember(Members m) {
		//Call the repo.save to insert and get the inserted obj
		return repo.save(m);
	}

	@Override
	public List<Members> getAllMembers() {
		//Call the repo.findAll method to get all the members
		return repo.findAll();
	}
}
