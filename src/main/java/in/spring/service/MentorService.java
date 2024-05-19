package in.spring.service;

import in.spring.document.Mentor;

public interface MentorService {
	//Create a method to add mentor in MongoDb
	Mentor addNewMentor(Mentor m);
	
	//create a method to get the mentor by id
	Mentor getTheMentor(String id);
}
