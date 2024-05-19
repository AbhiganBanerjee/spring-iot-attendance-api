package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Softwares;

public interface SoftwareRepository extends MongoRepository<Softwares,String>{
	
}
