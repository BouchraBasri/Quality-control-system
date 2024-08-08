package com.example.Quality_control_system.Quality_control_system.Controller;

import com.example.Quality_control_system.Quality_control_system.Service.ProduitService;
import com.example.Quality_control_system.Quality_control_system.model.Produit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "")
public class ProduitController {
    private final ProduitService produitService;
    @Autowired
    public ProduitController(ProduitService produitService) {this.produitService = produitService;}

    @GetMapping
    public List<Produit> getAllProduits() {return produitService.getAllProduits();}

    @PostMapping
    public void addProduit(@RequestBody Produit produit) {produitService.saveProduit(produit);}

    @DeleteMapping(path = "{produitId}")
    public void deleteProduit(
            @PathVariable("studentId") Long produitId){
        produitService.deleteProduit(produitId);
    }

    @PutMapping(path = "{produitId}")
    public void updateProduit(
            @PathVariable("produitId") long produitId
    ){}
}
