package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.AnalyseRepository;
import com.example.Quality_control_system.Quality_control_system.model.AnalyseDeLigne;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyseService {
    private final AnalyseRepository analyseRepository;

    public AnalyseService(AnalyseRepository analyseRepository) {

        this.analyseRepository = analyseRepository;
    }

    public List<AnalyseDeLigne> getAllAnalyses() {
        return analyseRepository.findAll();
    }

    public void saveAnalyses(AnalyseDeLigne analysedeligne) {
        analyseRepository.save(analysedeligne);
    }

    public void deleteAnalyse(Long id) {
        analyseRepository.deleteById(id);
    }

    public void updateAnalyse(Long id, AnalyseDeLigne analysedeligne) {
        AnalyseDeLigne existingAnalyse = analyseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Analyse De Ligne not found with id: " + id));
        //existingAnalyse.setName(analysedeligne.getName());
        analyseRepository.save(existingAnalyse);
    }

    public AnalyseDeLigne getAnalyseById(Long id) {
        return analyseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Analyse De Ligne not found with id: " + id));
    }
}
