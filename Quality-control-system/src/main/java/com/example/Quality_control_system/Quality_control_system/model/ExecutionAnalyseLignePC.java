package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "execution_analyse_ligne_pc")
public class ExecutionAnalyseLignePC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String result;
    private float value;

    @ManyToOne
    @JoinColumn(name = "execution_ligne_pc_id", referencedColumnName = "id")
    private ExecutionLignePC executionLignePC;

    @OneToOne
    @JoinColumn(name = "analyse_de_ligne_id", referencedColumnName = "id")
    private AnalyseDeLigne analyseDeLigne;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public ExecutionLignePC getExecutionLignePC() {
        return executionLignePC;
    }

    public void setExecutionLignePC(ExecutionLignePC executionLignePC) {
        this.executionLignePC = executionLignePC;
    }

    public AnalyseDeLigne getAnalyseDeLigne() {
        return analyseDeLigne;
    }

    public void setAnalyseDeLigne(AnalyseDeLigne analyseDeLigne) {
        this.analyseDeLigne = analyseDeLigne;
    }
}

