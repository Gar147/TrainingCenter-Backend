package com.traini8.training_center1.service;

import com.traini8.training_center1.model.TrainingCenter;
import com.traini8.training_center1.repository.TrainingCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;
import java.util.List;

@Service
public class TrainingCenterService {

	@Autowired
	private TrainingCenterRepository repository;

	public TrainingCenter createTrainingCenter(TrainingCenter trainingCenter) {
		trainingCenter.setCreatedOn(Instant.now());  // Automatically set createdOn
		return repository.save(trainingCenter);
	}

	public List<TrainingCenter> getAllTrainingCenters() {
		return repository.findAll();
	}
}

