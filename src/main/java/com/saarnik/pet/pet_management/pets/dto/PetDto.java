package com.saarnik.pet.pet_management.pets.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDto {
    @Id
    private Long code;
    private String name;
    private String type;
    private String furColor;
    private String country;

    public PetDto(long code) {
        this.code = code;
    }
}