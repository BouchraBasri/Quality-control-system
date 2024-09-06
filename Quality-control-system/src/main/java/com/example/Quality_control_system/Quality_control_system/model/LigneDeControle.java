package com.example.Quality_control_system.Quality_control_system.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Data
@Table(name = "ligne_de_controle")
public class LigneDeControle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String checkName;

    @ManyToOne
    @JoinColumn(name = "plan_de_controle_id", nullable = false)
    @JsonBackReference
    private PlanDeControle planDeControle;

    @OneToMany(mappedBy = "ligneDeControle")
    private List<AnalyseDeLigne> analyses;

    @OneToOne(mappedBy = "ligneDeControle")
    private ExecutionLignePC executionlignePCs;



}

