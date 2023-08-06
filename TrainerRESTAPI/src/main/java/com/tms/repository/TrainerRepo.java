package com.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.entities.Trainer;

public interface TrainerRepo extends JpaRepository<Trainer, Integer>
{

}
