package com.example.Quality_control_system.Quality_control_system.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Data
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
}

