package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Results;

public interface ResultsRepository extends MongoRepository<Results,String>{
	
}
