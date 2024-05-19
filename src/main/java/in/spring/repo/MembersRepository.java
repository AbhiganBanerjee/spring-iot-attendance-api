package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Members;

public interface MembersRepository extends MongoRepository<Members, String> {
	
}
