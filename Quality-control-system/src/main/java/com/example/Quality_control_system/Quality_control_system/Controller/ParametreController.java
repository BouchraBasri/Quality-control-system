package com.example.Quality_control_system.Quality_control_system.Controller;

import com.example.Quality_control_system.Quality_control_system.Service.ParametreService;
import com.example.Quality_control_system.Quality_control_system.model.ParametreAnalyse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(path = "parametre_analyse")
public class ParametreController {
    private final ParametreService parametreService;

    @Autowired
    public ParametreController(ParametreService parametreService) {
        this.parametreService = parametreService;
    }

    @GetMapping
    public List<ParametreAnalyse> getAllparametre() {
        return parametreService.getAllParametre();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ParametreAnalyse> getparametreById(@PathVariable Long id) {
        ParametreAnalyse parametreAnalyse = parametreService.getParametreById(id);
        return ResponseEntity.ok(parametreAnalyse);
    }

    @PostMapping
    public ResponseEntity<ParametreAnalyse> createparametre(@RequestBody ParametreAnalyse parametreAnalyse) {
        parametreService.saveParametre(parametreAnalyse);
        return ResponseEntity.ok(parametreAnalyse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ParametreAnalyse> updateparametre(@PathVariable Long id, @RequestBody ParametreAnalyse parametreAnalyse) {
        parametreService.updateParametre(id, parametreAnalyse);
        return ResponseEntity.ok(parametreAnalyse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteparametre(@PathVariable Long id) {
        parametreService.deleteParametre(id);
        return ResponseEntity.noContent().build();
    }
}