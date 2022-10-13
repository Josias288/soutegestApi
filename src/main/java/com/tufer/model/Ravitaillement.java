package com.tufer.model;

import javax.persistence.*;

import lombok.Data;

import java.util.Collection;
import java.util.Objects;

@Data
@Entity
@Table(name = "ravitaillement")
public class Ravitaillement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Soute soute;
    private String nomFournisseur;
    private String adressFournisseur;
    private int numFournisseur;
    private int quantiteFournie;
    private String typeFournie;

    public Ravitaillement(Long id, Soute soute, String nomFournisseur, String adressFournisseur, int numFournisseur,
            int quantiteFournie, String typeFournie) {
        this.id = id;
        this.soute = soute;
        this.nomFournisseur = nomFournisseur;
        this.adressFournisseur = adressFournisseur;
        this.numFournisseur = numFournisseur;
        this.quantiteFournie = quantiteFournie;
        this.typeFournie = typeFournie;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Soute getSoute() {
        return soute;
    }

    public void setSoute(Soute soute) {
        this.soute = soute;
    }

    public String getNomFournisseur() {
        return nomFournisseur;
    }

    public void setNomFournisseur(String nomFournisseur) {
        this.nomFournisseur = nomFournisseur;
    }

    public String getAdressFournisseur() {
        return adressFournisseur;
    }

    public void setAdressFournisseur(String adressFournisseur) {
        this.adressFournisseur = adressFournisseur;
    }

    public int getNumFournisseur() {
        return numFournisseur;
    }

    public void setNumFournisseur(int numFournisseur) {
        this.numFournisseur = numFournisseur;
    }

    public int getQuantiteFournie() {
        return quantiteFournie;
    }

    public void setQuantiteFournie(int quantiteFournie) {
        this.quantiteFournie = quantiteFournie;
    }

    public String getTypeFournie() {
        return typeFournie;
    }

    public void setTypeFournie(String typeFournie) {
        this.typeFournie = typeFournie;
    }
}
