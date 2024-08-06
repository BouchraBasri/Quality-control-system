package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "ligne_de_controle")
public class LigneDeControle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String checkName;

    @ManyToOne
    @JoinColumn(name = "plan_de_controle_id", nullable = false)
    private PlanDeControle planDeControle;

    @OneToMany(mappedBy = "ligneDeControle", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnalyseDeLigne> analyses;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    public PlanDeControle getPlanDeControle() {
        return planDeControle;
    }

    public void setPlanDeControle(PlanDeControle planDeControle) {
        this.planDeControle = planDeControle;
    }

    public List<AnalyseDeLigne> getAnalyses() {
        return analyses;
    }

    public void setAnalyses(List<AnalyseDeLigne> analyses) {
        this.analyses = analyses;
    }
}

