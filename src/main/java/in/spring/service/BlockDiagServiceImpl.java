package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.BlockDiagram;
import in.spring.repo.BlockDiagramRepository;

@Service
public class BlockDiagServiceImpl implements BlockDiagramService {

	//Inject the BlockDiagRepo ref
	@Autowired
	private BlockDiagramRepository repo;
	
	@Override
	public BlockDiagram insertDiagram(BlockDiagram bd) {
		//Call repo interface save method and return the inserted bd obj
		return repo.save(bd);
	}

	@Override
	public List<BlockDiagram> getBlockDiagram() {
		//Call the repo interface findAll method
		return repo.findAll();
	}

}
