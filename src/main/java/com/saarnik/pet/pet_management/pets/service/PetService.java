package com.saarnik.pet.pet_management.pets.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.saarnik.pet.pet_management.pets.dto.PetDto;
import com.saarnik.pet.pet_management.pets.model.Pet;
import com.saarnik.pet.pet_management.pets.repository.PetRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PetService {
    @Autowired
    private PetRepository petRepository;

    public List<Pet> getAllPets() {
        try {
            List<Pet> pets = new ArrayList<>();
            petRepository.findAll().forEach(pets::add);
            return pets;
        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<>(null);
        }
    }

    public boolean addPet(PetDto petDto) {
        // Check if we got no code for a pet or the code is already in use.
        if (petDto.getCode() == null || petRepository.findById(petDto.getCode()).isPresent()) {
            System.out.println("pet exists");
            return false;
        }
        Pet newPet = Pet.builder()
                .code(petDto.getCode())
                .name(petDto.getName())
                .type(petDto.getType())
                .furColor(petDto.getFurColor())
                .country(petDto.getCountry())
                .build();
        try {
            petRepository.save(newPet);
            log.info("Pet {} is added to the database", newPet.getCode());
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}
