import { Component } from '@angular/core';

@Component({
  selector: 'app-plan-de-controle',
  templateUrl: './plan-de-controle.component.html',
  styleUrl: './plan-de-controle.component.css'
})
export class PlanDeControleComponent {
  newPlanDeControle: string = '';
  selectedProduit: string = '';
  planDeControleList: { planDeControle: string, produit: string }[] = [];

  addPlanDeControle() {
    if (this.newPlanDeControle.trim() && this.selectedProduit.trim()) {
      this.planDeControleList.push({
        planDeControle: this.newPlanDeControle,
        produit: this.selectedProduit
      });
      this.newPlanDeControle = '';
      this.selectedProduit = '';
    } else {
      alert('Please fill in both fields.');
    }
  }
}
