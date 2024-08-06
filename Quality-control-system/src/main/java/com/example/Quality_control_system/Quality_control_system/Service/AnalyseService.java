package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.AnalyseRepository;
import com.example.Quality_control_system.Quality_control_system.model.AnalyseDeLigne;
import org.springframework.stereotype.Service;

@Service
public class AnalyseService {
    private final AnalyseRepository analyseRepository;
    public AnalyseService(AnalyseRepository analyseRepository) {

        this.analyseRepository = analyseRepository;
    }

    public void insertAnalyseDeLigne(AnalyseDeLigne analyseDeLigne) {
        analyseRepository.save(analyseDeLigne);
    }

    public void deleteAnalyseDeLigne(Long id) {
        analyseRepository.deleteById(id);
    }
}
