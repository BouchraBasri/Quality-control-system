package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "produit")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "produit", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PlanDeControle> planDeControles;

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

    public List<PlanDeControle> getPlanDeControles() {
        return planDeControles;
    }

    public void setPlanDeControles(List<PlanDeControle> planDeControles) {
        this.planDeControles = planDeControles;
    }
}

