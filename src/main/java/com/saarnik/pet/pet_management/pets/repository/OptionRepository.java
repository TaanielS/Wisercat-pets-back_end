package com.saarnik.pet.pet_management.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saarnik.pet.pet_management.pets.model.Option;

@Repository
public interface OptionRepository extends JpaRepository<Option, Integer> {

}
