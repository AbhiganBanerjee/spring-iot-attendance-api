package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Prototype;

public interface PrototypeRepository extends MongoRepository<Prototype,String>{
	
}
