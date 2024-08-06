package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "plan_de_controle")
public class PlanDeControle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "produit_id", nullable = false)
    private Produit produit;

    @OneToMany(mappedBy = "planDeControle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LigneDeControle> ligneDeControles;

    // Getters and setters...

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

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public List<LigneDeControle> getLigneDeControles() {
        return ligneDeControles;
    }

    public void setLigneDeControles(List<LigneDeControle> ligneDeControles) {
        this.ligneDeControles = ligneDeControles;
    }
}

