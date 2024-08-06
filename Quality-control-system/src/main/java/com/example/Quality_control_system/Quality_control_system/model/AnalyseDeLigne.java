package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "analyse_de_ligne")
public class AnalyseDeLigne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String result;

    @ManyToOne
    @JoinColumn(name = "ligne_de_controle_id", nullable = false)
    private LigneDeControle ligneDeControle;

    @ManyToOne
    @JoinColumn(name = "unite_de_mesure_id", nullable = false)
    private UniteDeMesure uniteDeMesure;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public LigneDeControle getLigneDeControle() {
        return ligneDeControle;
    }

    public void setLigneDeControle(LigneDeControle ligneDeControle) {
        this.ligneDeControle = ligneDeControle;
    }

    public UniteDeMesure getUniteDeMesure() {
        return uniteDeMesure;
    }

    public void setUniteDeMesure(UniteDeMesure uniteDeMesure) {
        this.uniteDeMesure = uniteDeMesure;
    }
}

