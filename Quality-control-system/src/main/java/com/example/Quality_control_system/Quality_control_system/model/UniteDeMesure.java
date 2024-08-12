package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "unite_de_mesure")
public class UniteDeMesure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String unitName;

    @OneToMany(mappedBy = "uniteDeMesure", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnalyseDeLigne> analyses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return unitName;
    }

    public void setName(String unitName) {
        this.unitName = unitName;
    }

    public List<AnalyseDeLigne> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<AnalyseDeLigne> analyses) {
        this.analyses = analyses;
    }
}
