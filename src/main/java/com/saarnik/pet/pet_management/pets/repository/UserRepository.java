package com.saarnik.pet.pet_management.pets.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saarnik.pet.pet_management.pets.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
