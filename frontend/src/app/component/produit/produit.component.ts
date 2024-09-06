import { Component } from '@angular/core';
import { Produit } from '../../model/produit.model';
import { ProduitService } from '../../service/produit.service';

@Component({
  selector: 'app-produit',
  templateUrl: './produit.component.html',
  styleUrl: './produit.component.css'
})
export class ProduitComponent {
  produit = {
    name: '',
    categorie: ''
  };
  produits: any[] = [];

  constructor(private produitService: ProduitService) {}

  addProduit() {
    this.produits.push({ ...this.produit });
    this.produit = {
      name: '',
      categorie: ''
    };

    this.produitService.addProduit(this.produit).subscribe(response => {
      console.log('Produit added to backend successfully:', response);
      // Optionally, update the frontend with the response data if necessary
      this.produit = { name: '', categorie: '' }; // Clear the form
    }, error => {
      console.error('Error adding produit to backend:', error);
    });
  }
}
