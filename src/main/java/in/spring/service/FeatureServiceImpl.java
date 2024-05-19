package in.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spring.document.Features;
import in.spring.repo.FeatureRepository;

@Service
public class FeatureServiceImpl implements FeatureService {
	//Inject the repo reference variable
	@Autowired
	private FeatureRepository repo;
	
	@Override
	public Features addNewFeature(Features f) {
		//Call the repo interf save method and return that saved obj
		return repo.save(f);
	}

	@Override
	public List<Features> getAllFeatures() {
		//Call the findAll method of repo
		return repo.findAll();
	}
}
