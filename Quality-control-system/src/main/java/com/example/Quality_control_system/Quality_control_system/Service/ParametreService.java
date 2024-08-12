package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.ParametreRepository;
import com.example.Quality_control_system.Quality_control_system.model.ParametreAnalyse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParametreService {
    private final ParametreRepository parametreRepository;

    public ParametreService(ParametreRepository parametreRepository) {

        this.parametreRepository = parametreRepository;
    }

    public List<ParametreAnalyse> getAllParametre() {
        return parametreRepository.findAll();
    }

    public void saveParametre(ParametreAnalyse parametreAnalyse) {
        parametreRepository.save(parametreAnalyse);
    }

    public void deleteParametre(Long id) {
        parametreRepository.deleteById(id);
    }

    public void updateParametre(Long id, ParametreAnalyse parametreAnalyse) {
        ParametreAnalyse existingParametre = parametreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parametre Analyse not found with id: " + id));
        existingParametre.setName(parametreAnalyse.getName());
        parametreRepository.save(existingParametre);
    }

    public ParametreAnalyse getParametreById(Long id) {
        return parametreRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Parametre Analyse not found with id: " + id));
    }
}

