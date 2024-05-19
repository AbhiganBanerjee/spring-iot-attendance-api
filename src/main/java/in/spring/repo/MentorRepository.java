package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Mentor;

public interface MentorRepository extends MongoRepository<Mentor, String> {
	
}
