package com.saarnik.pet.pet_management.pets.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "pet")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Pet {
    @Id
    private Long code;
    private String name;
    private String type;
    @Column(name = "fur_color")
    private String furColor;
    private String country;

    public Pet(Long code) {
        this.code = code;
    }
}
