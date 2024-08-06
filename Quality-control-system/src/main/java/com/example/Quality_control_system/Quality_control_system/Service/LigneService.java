package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.LigneRepository;
import com.example.Quality_control_system.Quality_control_system.model.LigneDeControle;
import org.springframework.stereotype.Service;

@Service
public class LigneService {
    private final LigneRepository ligneRepository;
    public LigneService(LigneRepository ligneRepository) {
        this.ligneRepository = ligneRepository;
    }

    public void insertLigneDeControle(LigneDeControle ligneDeControle) {
        ligneRepository.save(ligneDeControle);
    }

    public void deleteLigneDeControle(Long id) {
        ligneRepository.deleteById(id);
    }
}
