package com.example.Quality_control_system.Quality_control_system.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDateTime;
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
@Table(name = "execution_ligne_pc")
public class ExecutionLignePC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "execution_pc_id", referencedColumnName = "id")
    @JsonBackReference
    private ExecutionPC executionPC;

    @OneToOne
    @JoinColumn(name = "ligne_de_controle_id", referencedColumnName = "id")
    @JsonBackReference
    private LigneDeControle ligneDeControle;

    @OneToMany(mappedBy = "executionLignePC")
    private List<ExecutionAnalyseLignePC> executionanalyselignePCs;



}

