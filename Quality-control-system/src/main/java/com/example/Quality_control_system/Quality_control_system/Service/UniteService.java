package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.UniteRepository;
import com.example.Quality_control_system.Quality_control_system.model.UniteDeMesure;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniteService {
    private final UniteRepository uniteRepository;

    public UniteService(UniteRepository uniteRepository) {

        this.uniteRepository = uniteRepository;
    }

    public List<UniteDeMesure> getAllUnites() {
        return uniteRepository.findAll();
    }

    public void saveUnites(UniteDeMesure uniteDeMesure) {
        uniteRepository.save(uniteDeMesure);
    }

    public void deleteUnites(Long id) {
        uniteRepository.deleteById(id);
    }

    public void updateUnites(Long id, UniteDeMesure uniteDeMesure) {
        UniteDeMesure existinguniteDeMesure = uniteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("unite De Mesure not found with id: " + id));
        //existinguniteDeMesure.setName(uniteDeMesure.getUnitName());
        uniteRepository.save(existinguniteDeMesure);
    }

    public UniteDeMesure getUnitesById(Long id) {
        return uniteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("unite De Mesure not found with id: " + id));
    }
}

