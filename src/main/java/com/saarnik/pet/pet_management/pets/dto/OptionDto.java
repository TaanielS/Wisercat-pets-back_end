package com.saarnik.pet.pet_management.pets.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OptionDto {
    private Integer id;
    private String type;
    private String furColor;
    private String country;
}