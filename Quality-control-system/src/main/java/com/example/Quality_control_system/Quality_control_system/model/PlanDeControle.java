package com.example.Quality_control_system.Quality_control_system.model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

import java.time.LocalDate;
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
@Table(name = "plan_de_controle")
public class PlanDeControle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String PCname;
    private LocalDate startDate;
    private LocalDate endDate;
    @ManyToOne
    @JoinColumn(name = "produit_id", nullable = false)
    @JsonBackReference
    private Produit produit;

    @OneToMany(mappedBy = "planDeControle")
    private List<LigneDeControle> ligneDeControles;

    @OneToOne(mappedBy = "planDeControle")
    private ExecutionPC executionsPC;

}

