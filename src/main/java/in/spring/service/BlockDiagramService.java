package in.spring.service;

import java.util.List;

import in.spring.document.BlockDiagram;

public interface BlockDiagramService {
	//Insert BlockDiagram object into MongoDB
	BlockDiagram insertDiagram(BlockDiagram bd);
	
	//To get the BlockDiagram from mongoDB
	List<BlockDiagram> getBlockDiagram();
}
