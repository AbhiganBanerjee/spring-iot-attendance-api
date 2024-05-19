package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Hardwares;

public interface HardwaresRepository extends MongoRepository<Hardwares,String> {
	
}
