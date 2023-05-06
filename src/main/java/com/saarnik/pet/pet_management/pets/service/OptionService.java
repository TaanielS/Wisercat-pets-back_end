package com.saarnik.pet.pet_management.pets.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.saarnik.pet.pet_management.pets.dto.PetDto;
import com.saarnik.pet.pet_management.pets.model.Option;
import com.saarnik.pet.pet_management.pets.repository.OptionRepository;
import com.saarnik.pet.pet_management.pets.repository.PetRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OptionService {
    @Autowired
    private OptionRepository optionRepository;

    public List<String> getOptions(String select) {
        System.out.println(select);
        try {
            Option option = optionRepository.findById(1).get();
            System.out.println(option.toString());
            if (select.equals("type")) {
                String text = option.getType();
                String[] options = text.split(";");
                return Arrays.asList(options);
            } else if (select.equals("fur_color")) {
                String text = option.getFurColor();
                String[] options = text.split(";");
                return Arrays.asList(options);
            } else if (select.equals("country")) {
                String text = option.getCountry();
                String[] options = text.split(";");
                return Arrays.asList(options);
            } else {
                return new ArrayList<>();
            }
        } catch (Exception e) {
            System.out.println(e);
            return new ArrayList<>(null);
        }
    }

}
