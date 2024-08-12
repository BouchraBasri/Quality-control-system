package com.example.Quality_control_system.Quality_control_system.Controller;

import com.example.Quality_control_system.Quality_control_system.Service.AnalyseService;
import com.example.Quality_control_system.Quality_control_system.model.AnalyseDeLigne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(path = "analyse_de_ligne")
public class AnalyseController {
    private final AnalyseService analyseService;

    @Autowired
    public AnalyseController(AnalyseService analyseService) {
        this.analyseService = analyseService;
    }

    @GetMapping
    public List<AnalyseDeLigne> getAllanalyse() {
        return analyseService.getAllAnalyses();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnalyseDeLigne> getanalyseById(@PathVariable Long id) {
        AnalyseDeLigne analyseDeLigne = analyseService.getAnalyseById(id);
        return ResponseEntity.ok(analyseDeLigne);
    }

    @PostMapping
    public ResponseEntity<AnalyseDeLigne> createAnalyse(@RequestBody AnalyseDeLigne analyseDeLigne) {
        analyseService.saveAnalyses(analyseDeLigne);
        return ResponseEntity.ok(analyseDeLigne);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnalyseDeLigne> updateAnalyse(@PathVariable Long id, @RequestBody AnalyseDeLigne analyseDeLigne) {
        analyseService.updateAnalyse(id, analyseDeLigne);
        return ResponseEntity.ok(analyseDeLigne);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteanalyse(@PathVariable Long id) {
        analyseService.deleteAnalyse(id);
        return ResponseEntity.noContent().build();
    }
}

