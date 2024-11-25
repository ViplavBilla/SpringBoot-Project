package com.example.DMS.repository;


/**
 * 
 * @author Viplav Billa
 * 
 */

import org.springframework.data.repository.CrudRepository;
import com.example.DMS.Models.Trainer;
public interface TrainerRepository extends CrudRepository<Trainer, Integer> {
}
