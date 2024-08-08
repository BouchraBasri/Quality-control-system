package com.example.Quality_control_system.Quality_control_system.Controller;

import com.example.Quality_control_system.Quality_control_system.Service.ProduitService;
import com.example.Quality_control_system.Quality_control_system.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping(path = "produit")
public class ProduitController {
    private final ProduitService produitService;

    @Autowired
    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @GetMapping
    public List<Produit> getAllProduits() {
        return produitService.getAllProduits();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produit> getProduitById(@PathVariable Long id) {
        Produit produit = produitService.getProduitById(id);
        return ResponseEntity.ok(produit);
    }

    @PostMapping
    public ResponseEntity<Produit> createProduit(@RequestBody Produit produit) {
        produitService.saveProduit(produit);
        return ResponseEntity.ok(produit);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Produit> updateProduit(@PathVariable Long id, @RequestBody Produit produit) {
        produitService.updateProduit(id, produit);
        return ResponseEntity.ok(produit);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduit(@PathVariable Long id) {
        produitService.deleteProduit(id);
        return ResponseEntity.noContent().build();
    }
}
