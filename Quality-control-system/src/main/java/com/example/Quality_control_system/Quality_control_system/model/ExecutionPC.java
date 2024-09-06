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
@Table(name = "execution_pc")
public class ExecutionPC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    @OneToOne
    @JoinColumn(name = "plan_de_controle_id", referencedColumnName = "id")
    @JsonBackReference
    private PlanDeControle planDeControle;

    @OneToMany(mappedBy = "executionPC")
    private List<ExecutionLignePC> executionlignePCs;


}
