package com.tms.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tms.entities.Trainer;
import com.tms.repository.TrainerRepo;
import com.tms.service.Trainerservice;

@Service
public class TrainerServiceimpl implements Trainerservice{

	@Autowired
	TrainerRepo trainerRepository;
	
	@Override
	public Trainer createTrainer(Trainer trainer) {
		
		return trainerRepository.save(trainer);
	}

	@Override
	public List<Trainer> getAllTrainers() {
		
		return trainerRepository.findAll();
	}

	@Override
	public Trainer getTrainerById(int id) {
	
		Trainer t=trainerRepository.findById(id).get();
		return t;
	}

	@Override
	public Trainer updateTrainer(int id,Trainer trainer) {
		
		Trainer t=trainerRepository.findById(id).get();
		t.setName(trainer.getName());
		t.setAddress(trainer.getAddress());
		t.setPhNo(trainer.getPhNo());
		
		Trainer trainer1=trainerRepository.save(t);
		return trainer1;
	}

	@Override
	public String deleteTrainer(int id) {
		trainerRepository.deleteById(id);
		return "Trainers record deleted successfully!!";
	}

}
