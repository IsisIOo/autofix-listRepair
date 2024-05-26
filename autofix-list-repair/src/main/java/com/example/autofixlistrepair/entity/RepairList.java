package com.example.autofixlistrepair.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//ESTE ES EL MICROSERVICIO 2

@Entity
@Table(name = "repairList")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class RepairList {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(unique = true, nullable = false)

    private Long id;

    private String repairType;
    private double gasolina;
    private double diesel;
    private double hibrido;
    private double electrico;

}
