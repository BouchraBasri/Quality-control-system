package com.example.Quality_control_system.Quality_control_system.model;

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
@Table(name = "unite_de_mesure")
public class UniteDeMesure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String unitName;

    @OneToMany(mappedBy = "uniteDeMesure", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<AnalyseDeLigne> analyses;

}
