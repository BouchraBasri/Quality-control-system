import { Component } from '@angular/core';

@Component({
  selector: 'app-ligne-de-controle',
  templateUrl: './ligne-de-controle.component.html',
  styleUrl: './ligne-de-controle.component.css'
})
export class LigneDeControleComponent {
  newLigneDeControle: string = '';
  selectedProduit: string = '';
  selectedPlanDeControle: string = '';
  ligneDeControleList: { ligneDeControle: string, produit: string, planDeControle: string }[] = [];

  addLigneDeControle() {
    if (this.newLigneDeControle.trim() && this.selectedProduit.trim() && this.selectedPlanDeControle.trim()) {
      this.ligneDeControleList.push({
        ligneDeControle: this.newLigneDeControle,
        produit: this.selectedProduit,
        planDeControle: this.selectedPlanDeControle
      });
      this.newLigneDeControle = '';
      this.selectedProduit = '';
      this.selectedPlanDeControle = ''
    } else {
      alert('Please fill in both fields.');
    }
  }
}
