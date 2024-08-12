package com.example.Quality_control_system.Quality_control_system.Controller;

import com.example.Quality_control_system.Quality_control_system.Service.LigneService;
import com.example.Quality_control_system.Quality_control_system.model.LigneDeControle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(path = "ligne_de_controle")
public class LigneController {
    private final LigneService ligneService;

    @Autowired
    public LigneController(LigneService ligneService) {
        this.ligneService = ligneService;
    }

    @GetMapping
    public List<LigneDeControle> getAllLignes() {
        return ligneService.getAllLignesDeControle();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LigneDeControle> getLigneById(@PathVariable Long id) {
        LigneDeControle ligneDeControle = ligneService.getLigneDeControleById(id);
        return ResponseEntity.ok(ligneDeControle);
    }

    @PostMapping
    public ResponseEntity<LigneDeControle> createLigne(@RequestBody LigneDeControle ligneDeControle) {
        ligneService.saveLigneDeControle(ligneDeControle);
        return ResponseEntity.ok(ligneDeControle);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LigneDeControle> updateLigne(@PathVariable Long id, @RequestBody LigneDeControle ligneDeControle) {
        ligneService.updateLigneDeControle(id, ligneDeControle);
        return ResponseEntity.ok(ligneDeControle);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLigne(@PathVariable Long id) {
        ligneService.deleteLigneDeControle(id);
        return ResponseEntity.noContent().build();
    }
}