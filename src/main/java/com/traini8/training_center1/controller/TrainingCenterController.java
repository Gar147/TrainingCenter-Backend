package com.traini8.training_center1.controller;

import com.traini8.training_center1.model.TrainingCenter;
import com.traini8.training_center1.service.TrainingCenterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("/api/training-centers")
public class TrainingCenterController {

	@Autowired
	private TrainingCenterService service;

	// POST API to create a new training center
	@PostMapping
	public ResponseEntity<String> createTrainingCenter(@Valid @RequestBody TrainingCenter trainingCenter) {
		// Process the training center data
		return ResponseEntity.ok("Training Center created successfully!");
	}

	// GET API to get all training centers
	@GetMapping
	public ResponseEntity<List<TrainingCenter>> getAllTrainingCenters() {
		List<TrainingCenter> centers = service.getAllTrainingCenters();
		return ResponseEntity.ok(centers);
	}



}

