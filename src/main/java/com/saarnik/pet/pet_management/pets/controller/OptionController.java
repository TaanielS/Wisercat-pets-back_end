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
import com.saarnik.pet.pet_management.pets.service.OptionService;
import com.saarnik.pet.pet_management.pets.service.PetService;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class OptionController {

    @Autowired
    private OptionService optionService;

    @GetMapping("/option/{select}")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getOptions(@PathVariable String select) {
        return optionService.getOptions(select);
    }
}