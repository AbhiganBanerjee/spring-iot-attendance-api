package in.spring.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import in.spring.document.BlockDiagram;

public interface BlockDiagramRepository extends MongoRepository<BlockDiagram, String> {

}
