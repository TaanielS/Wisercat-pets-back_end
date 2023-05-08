package com.saarnik.pet.pet_management.pets.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
            log.info("Queried all pets.");
            return pets;
        } catch (Exception e) {
            log.error("Error: {}.", e.getMessage());
            return new ArrayList<>();
        }
    }

    public boolean addPet(PetDto petDto) {
        // Check if we got no code for a pet or the code is already in use.
        if (petDto.getCode() == null || petRepository.findById(petDto.getCode()).isPresent()) {
            log.info("No code for a pet or the code {} is already in use.", petDto.getCode());
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
            log.info("Pet {} is added to the database.", newPet.getCode());
            return true;
        } catch (Exception e) {
            log.error("Error: {}.", e.getMessage());
            return false;
        }
    }

    public boolean editPet(PetDto petDto) {
        if (petDto.getCode() != null && petRepository.findById(petDto.getCode()).isPresent()) {
            Pet pet = Pet.builder()
                    .code(petDto.getCode())
                    .name(petDto.getName())
                    .type(petDto.getType())
                    .furColor(petDto.getFurColor())
                    .country(petDto.getCountry())
                    .build();
            try {
                petRepository.save(pet);
                log.info("Modified pet {}.", pet.getCode());
                return true;
            } catch (Exception e) {
                log.error("Error: {}.", e.getMessage());
                return false;
            }
        } else {
            log.info("Bad pet code {}.", petDto.getCode());
            return false;
        }
    }
}
