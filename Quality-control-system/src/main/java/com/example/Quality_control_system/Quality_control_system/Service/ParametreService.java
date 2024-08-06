package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.ParametreRepository;
import com.example.Quality_control_system.Quality_control_system.model.ParametreAnalyse;
import org.springframework.stereotype.Service;

@Service
public class ParametreService {
    private final ParametreRepository parametreRepository;
    public ParametreService(ParametreRepository parametreRepository) {
        this.parametreRepository = parametreRepository;
    }

    public void saveParametreAnalyse(ParametreAnalyse parametreAnalyse) {
        parametreRepository.save(parametreAnalyse);
    }

    public void deleteParametreAnalyse(Long id) {
        parametreRepository.deleteById(id);
    }
}
