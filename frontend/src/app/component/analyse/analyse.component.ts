import { Component } from '@angular/core';

@Component({
  selector: 'app-analyse',
  templateUrl: './analyse.component.html',
  styleUrl: './analyse.component.css'
})
export class AnalyseComponent {
  produit = {
    name: '',
    max: '',
    min: ''
  };
  produits: any[] = [];

  addProduit() {
    this.produits.push({ ...this.produit });
    this.produit = {
      name: '',
      max: '',
      min: ''
    };
  }
}
