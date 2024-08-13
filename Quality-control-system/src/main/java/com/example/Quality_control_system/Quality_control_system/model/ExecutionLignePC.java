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


}

