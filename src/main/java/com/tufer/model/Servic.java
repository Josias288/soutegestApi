package com.tufer.model;

import javax.persistence.*;

import org.springframework.format.datetime.standard.DateTimeContext;

import lombok.Data;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Data
@Entity
@Table(name = "service")
public class Servic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Vehicule vehicule;
    @ManyToOne
    private Soute soute;

    private String kilometrageVehicule;

    private String typeContenue;

    private DateTimeContext dateService;
    private String nomChauffeur;
    private String prenomChauffeur;
    private int numeroChauffeur;
    private String adresseChauffeur;
}
