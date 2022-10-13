package com.tufer.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
@Entity
@Table(name = "soute")
public class Soute {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "soute")
    private Collection<Servic> service;
    @OneToMany(mappedBy = "soute")
    private Collection<Ravitaillement> ravitaillement;

    private String codeS;
    private int niveauContenu;
}
