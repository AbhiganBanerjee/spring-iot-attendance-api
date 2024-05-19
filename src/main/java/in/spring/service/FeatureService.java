package in.spring.service;

import java.util.List;

import in.spring.document.Features;

public interface FeatureService {
	//method to Add new Feature in the MongoDB
	Features addNewFeature(Features f);
	
	//Method to retrieve all the features
	List<Features> getAllFeatures();	
}
