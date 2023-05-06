package com.saarnik.pet.pet_management.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saarnik.pet.pet_management.pets.model.Pet;

public interface PetRepository extends JpaRepository<Pet, Long> {

}
