package in.spring.service;

import java.util.List;

import in.spring.document.Members;

public interface MembersService {
	//Define method to add members into the MongoDB
	Members addNewMember(Members m);
	
	//Define method to get all the List of the Members
	List<Members> getAllMembers();
}
