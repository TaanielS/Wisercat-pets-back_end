package com.saarnik.pet.pet_management.pets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.saarnik.pet.pet_management.pets.dto.PetDto;
import com.saarnik.pet.pet_management.pets.model.Pet;
import com.saarnik.pet.pet_management.pets.repository.PetRepository;
import com.saarnik.pet.pet_management.pets.service.PetService;

import org.springframework.http.HttpStatus;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
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
    @ResponseStatus(HttpStatus.CREATED)
    public void addPet(@RequestBody PetDto pedDto) {
        System.out.println(pedDto);
        petService.addPet(pedDto);
    }

}