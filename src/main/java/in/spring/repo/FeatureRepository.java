package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.Features;

public interface FeatureRepository extends MongoRepository<Features, String> {
	
}
