package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "execution_ligne_pc")
public class ExecutionLignePC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "execution_pc_id", referencedColumnName = "id")
    private ExecutionPC executionPC;

    @OneToOne
    @JoinColumn(name = "ligne_de_controle_id", referencedColumnName = "id")
    private LigneDeControle ligneDeControle;

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

    public ExecutionPC getExecutionPC() {
        return executionPC;
    }

    public void setExecutionPC(ExecutionPC executionPC) {
        this.executionPC = executionPC;
    }

    public LigneDeControle getLigneDeControle() {
        return ligneDeControle;
    }

    public void setLigneDeControle(LigneDeControle ligneDeControle) {
        this.ligneDeControle = ligneDeControle;
    }
}

