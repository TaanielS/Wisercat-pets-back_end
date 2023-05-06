package com.saarnik.pet.pet_management.pets.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PetDto {
    @Id
    @NotNull(message = "The code is required.")
    private Long code;
    @NotBlank(message = "The name is required.")
    private String name;
    @NotBlank(message = "The type is required.")
    private String type;
    @NotBlank(message = "The fur color is required.")
    private String furColor;
    @NotBlank(message = "The country is required.")
    private String country;

    public PetDto(long code) {
        this.code = code;
    }
}