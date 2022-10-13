package com.tufer.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
@Entity
@Table(name = "vehicule")
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "vehicule")
    private Collection<Servic> service;

    @Column(name = "numeroImm")
    private String numeroImm;

    private String type;

    private String marque;

}
