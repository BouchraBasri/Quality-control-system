import { Component } from '@angular/core';

@Component({
  selector: 'app-analyse-de-ligne',
  templateUrl: './analyse-de-ligne.component.html',
  styleUrl: './analyse-de-ligne.component.css'
})
export class AnalyseDeLigneComponent {
  selectedProduit: string = '';
  selectedPlanDeControle: string = '';
  selectedLigneDeControle: string = '';
  List: { produit: string, planDeControle: string, ligneDeControle: string, }[] = [];

  add() {
    if (this.selectedLigneDeControle.trim() && this.selectedProduit.trim() && this.selectedPlanDeControle.trim()) {
      this.List.push({
        produit: this.selectedProduit,
        planDeControle: this.selectedPlanDeControle,
        ligneDeControle: this.selectedLigneDeControle
      });
      this.selectedProduit = '';
      this.selectedPlanDeControle = '';
      this.selectedLigneDeControle = '';
    } else {
      alert('Please fill in both fields.');
    }
  }
}
