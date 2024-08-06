package com.example.Quality_control_system.Quality_control_system.Service;

import com.example.Quality_control_system.Quality_control_system.Repository.ProduitRepository;
import com.example.Quality_control_system.Quality_control_system.model.Produit;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;
    public ProduitService(ProduitRepository produitRepository) {

        this.produitRepository = produitRepository;
    }

    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    public void saveProduit(Produit produit) {
        produitRepository.save(produit);
    }

    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
}
