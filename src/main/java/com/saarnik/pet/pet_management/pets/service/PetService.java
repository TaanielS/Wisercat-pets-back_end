package com.saarnik.pet.pet_management.pets.service;

import java.util.ArrayList;
import java.util.List;

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

    public void addPet(PetDto petDto) {
        Pet pet = Pet.builder()
                .code(petDto.getCode())
                .name(petDto.getName())
                .type(petDto.getType())
                .furColor(petDto.getFurColor())
                .country(petDto.getCountry())
                .build();
        petRepository.save(pet);
        log.info("Pet {} is added to the database", pet.getCode());
    }
}
