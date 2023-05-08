package com.saarnik.pet.pet_management.pets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.saarnik.pet.pet_management.pets.dto.PetDto;
import com.saarnik.pet.pet_management.pets.model.Pet;
import com.saarnik.pet.pet_management.pets.service.PetService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping("/pets")
    @ResponseStatus(HttpStatus.OK)
    public List<Pet> getAllPets() {
        return petService.getAllPets();
    }

    @PostMapping("/pets")
    // @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> addPet(@RequestBody PetDto pedDto) {
        boolean result = petService.addPet(pedDto);
        if (result) {
            return ResponseEntity.status(HttpStatus.CREATED).body("Pet is added.");
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Constraint conflict.");
        }
    }

    @PutMapping("/pets")
    public ResponseEntity<Pet> editPet(@RequestBody PetDto petDto) {
        boolean result = petService.editPet(petDto);
        if (result) {
            return ResponseEntity.status(HttpStatus.OK).build();
        } else {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
    }

}