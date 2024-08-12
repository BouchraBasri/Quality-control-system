package com.example.Quality_control_system.Quality_control_system.Controller;

import com.example.Quality_control_system.Quality_control_system.Service.UniteService;
import com.example.Quality_control_system.Quality_control_system.model.UniteDeMesure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(path = "unite_de_mesure")
public class UniteController {
    private final UniteService uniteService;

    @Autowired
    public UniteController(UniteService uniteService) {
        this.uniteService = uniteService;
    }

    @GetMapping
    public List<UniteDeMesure> getAllUnite() {
        return uniteService.getAllUnites();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UniteDeMesure> getuniteById(@PathVariable Long id) {
        UniteDeMesure uniteDeMesure = uniteService.getUnitesById(id);
        return ResponseEntity.ok(uniteDeMesure);
    }

    @PostMapping
    public ResponseEntity<UniteDeMesure> createUnite(@RequestBody UniteDeMesure uniteDeMesure) {
        uniteService.saveUnites(uniteDeMesure);
        return ResponseEntity.ok(uniteDeMesure);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UniteDeMesure> updateunite(@PathVariable Long id, @RequestBody UniteDeMesure uniteDeMesure) {
        uniteService.updateUnites(id, uniteDeMesure);
        return ResponseEntity.ok(uniteDeMesure);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteunite(@PathVariable Long id) {
        uniteService.deleteUnites(id);
        return ResponseEntity.noContent().build();
    }
}
