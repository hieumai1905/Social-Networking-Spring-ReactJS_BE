package com.codegym.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "type_images")
@NoArgsConstructor
@AllArgsConstructor
public class TypeImages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type_image_name", nullable = false)
    private String typeImageName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeImageName() {
        return typeImageName;
    }

    public void setTypeImageName(String typeImageName) {
        this.typeImageName = typeImageName;
    }
}
