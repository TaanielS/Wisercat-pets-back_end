package com.saarnik.pet.pet_management.pets.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Pattern.Flag;

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