package com.saarnik.pet.pet_management.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saarnik.pet.pet_management.pets.model.Option;

public interface OptionRepository extends JpaRepository<Option, Integer> {

}
