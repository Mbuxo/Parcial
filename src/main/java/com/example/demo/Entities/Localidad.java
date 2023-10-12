package com.example.demo.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "localidad")@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Localidad extends BaseEntidad {

    @Column(name = "denominacion")
    private String denominacion;
}


