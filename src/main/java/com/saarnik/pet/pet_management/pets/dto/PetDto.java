package com.saarnik.pet.pet_management.pets.dto;

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
    @NotNull
    @NotBlank
    private Long code;
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String type;
    @NotNull
    @NotBlank
    private String furColor;
    @NotNull
    @NotBlank
    private String country;

    public PetDto(long code) {
        this.code = code;
    }
}