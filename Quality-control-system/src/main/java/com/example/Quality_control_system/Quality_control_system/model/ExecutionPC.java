package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "execution_pc")
public class ExecutionPC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @OneToOne
    @JoinColumn(name = "plan_de_controle_id", referencedColumnName = "id")
    private PlanDeControle planDeControle;

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

    public PlanDeControle getPlanDeControle() {
        return planDeControle;
    }

    public void setPlanDeControle(PlanDeControle planDeControle) {
        this.planDeControle = planDeControle;
    }
}
