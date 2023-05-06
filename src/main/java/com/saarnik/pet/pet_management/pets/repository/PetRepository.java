package com.saarnik.pet.pet_management.pets.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saarnik.pet.pet_management.pets.model.Pet;
import java.util.List;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {

}
