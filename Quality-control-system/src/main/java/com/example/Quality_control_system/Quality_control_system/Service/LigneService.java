package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.LigneRepository;
import com.example.Quality_control_system.Quality_control_system.model.LigneDeControle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LigneService {
    private final LigneRepository ligneRepository;

    public LigneService(LigneRepository ligneRepository) {

        this.ligneRepository = ligneRepository;
    }

    public List<LigneDeControle> getAllLignesDeControle() {
        return ligneRepository.findAll();
    }

    public void saveLigneDeControle(LigneDeControle ligneDeControle) {
        ligneRepository.save(ligneDeControle);
    }

    public void deleteLigneDeControle(Long id) {
        ligneRepository.deleteById(id);
    }

    public void updateLigneDeControle(Long id, LigneDeControle ligneDeControle) {
        LigneDeControle existingLigneDeControle = ligneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ligne De Controle not found with id: " + id));
        existingLigneDeControle.setName(ligneDeControle.getName());
        ligneRepository.save(existingLigneDeControle);
    }

    public LigneDeControle getLigneDeControleById(Long id) {
        return ligneRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Ligne De Controle not found with id: " + id));
    }
}
