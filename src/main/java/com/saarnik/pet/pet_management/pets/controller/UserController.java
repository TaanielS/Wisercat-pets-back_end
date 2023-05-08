package com.saarnik.pet.pet_management.pets.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import com.saarnik.pet.pet_management.jwt.JwtService;
import com.saarnik.pet.pet_management.pets.dto.UserLoginDto;
import com.saarnik.pet.pet_management.pets.service.PetService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class UserController {

    @Autowired
    private PetService petService;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping("/login")
    public String logInAndGetToken(@RequestBody UserLoginDto userLoginDto) {

        if (userLoginDto.getUsername() == null || userLoginDto.getPassword() == null) {
            throw new UsernameNotFoundException("UserName or Password is Empty");
        }
        log.info(userLoginDto.toString());
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(userLoginDto.getUsername(),
                        userLoginDto.getPassword()));
        // If the user is authenticated we generate the token, otherwise, we throw an
        // exception
        // log.info("authentication.isAuthenticated() {} ", authentication);
        log.info(userLoginDto.toString());
        if (authentication.isAuthenticated()) {
            log.info("jwtService.generateToken(authRequest.getName())  {} ",
                    jwtService.generateToken(userLoginDto.getUsername()).toString());
            return jwtService.generateToken(userLoginDto.getUsername());
        } else {
            throw new UsernameNotFoundException("The user cannot be authinticated!");
        }
    }

    @GetMapping("/authenticate")
    public Boolean authenticate(@RequestHeader("Authorization") String header) {
        String token = header.replace("Bearer ", "");
        log.info(" authenticate - token {} ", token);
        return jwtService.validateToken(token);
    }
}