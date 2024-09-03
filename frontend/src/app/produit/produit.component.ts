import { Component } from '@angular/core';


@Component({
  selector: 'app-produit',
  templateUrl: './produit.component.html',
  styleUrl: './produit.component.css'
})
export class ProduitComponent {
  produit = {
    name: '',
    category: ''
  };
  produits: any[] = [];

  addProduit() {
    this.produits.push({ ...this.produit });
    this.produit = {
      name: '',
      category: ''
    };
  }
}
