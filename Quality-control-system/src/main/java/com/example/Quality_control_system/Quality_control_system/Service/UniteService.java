package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.UniteRepository;
import com.example.Quality_control_system.Quality_control_system.model.UniteDeMesure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniteService {
    private final UniteRepository uniteRepository;
    public UniteService(UniteRepository uniteRepository) {
        this.uniteRepository = uniteRepository;
    }

    public void saveUniteDeMesure(UniteDeMesure uniteDeMesure){
        uniteRepository.save(uniteDeMesure);
    }

}
