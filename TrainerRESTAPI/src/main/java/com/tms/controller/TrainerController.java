package com.tms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tms.entities.Trainer;
import com.tms.service.Trainerservice;

@RestController
@RequestMapping("/api")

public class TrainerController {
	
	
	@Autowired
	Trainerservice trainerService;
	
	@PostMapping("/createTrainer")	
	 ResponseEntity<Trainer> createTrainer(@RequestBody Trainer trainer)	
	 {
		return new ResponseEntity<Trainer>(trainerService.createTrainer(trainer),HttpStatus.CREATED); 
	 }
	
	@GetMapping("/getAllTrainers")
	List<Trainer> getAllTrainers()
	{
		return trainerService.getAllTrainers();
	}
	
	@GetMapping("/getTrainersById/{tid}")
  Trainer getTrainerById(@PathVariable("tid") int id)
   {
	   return trainerService.getTrainerById(id);
   }
	
	@PutMapping("/updateTrainer/{id}")
	Trainer	updateTrainer(@PathVariable int id,@RequestBody Trainer trainer)
	{
		return trainerService.updateTrainer(id, trainer);
	}
	
	@DeleteMapping("/deleteTrainer/{id}")
	String deleteStudent(@PathVariable int id)
	{
		return trainerService.deleteTrainer(id);
	}
	
	
}
