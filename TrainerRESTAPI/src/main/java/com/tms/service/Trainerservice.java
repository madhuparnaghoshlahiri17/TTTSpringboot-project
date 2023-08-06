package com.tms.service;

import java.util.List;

import com.tms.entities.Trainer;


public interface Trainerservice {
	Trainer createTrainer(Trainer trainer);
	
	List<Trainer> getAllTrainers();
	Trainer getTrainerById(int id);
	Trainer updateTrainer(int id,Trainer trainer);
	String deleteTrainer(int id);
}
