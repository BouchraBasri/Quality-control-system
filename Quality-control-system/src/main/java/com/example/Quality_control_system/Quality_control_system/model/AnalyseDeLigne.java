package com.example.Quality_control_system.Quality_control_system.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Data
@Table(name = "analyse_de_ligne")
public class AnalyseDeLigne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "ligne_de_controle_id", nullable = false)
    @JsonBackReference
    private LigneDeControle ligneDeControle;

    @ManyToOne
    @JoinColumn(name = "unite_de_mesure_id", nullable = false)
    @JsonBackReference
    private UniteDeMesure uniteDeMesure;

    @OneToOne
    @JoinColumn(name = "parametre_analyse_id", referencedColumnName = "id")
    @JsonBackReference
    private ParametreAnalyse parametreAnalyse;

    @OneToOne(mappedBy = "analyseDeLigne")
    private ExecutionAnalyseLignePC executionanalyselignePC;

}

