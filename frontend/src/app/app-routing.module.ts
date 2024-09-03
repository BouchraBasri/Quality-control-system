import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProduitComponent } from './produit/produit.component';
import { PlanDeControleComponent } from './plan-de-controle/plan-de-controle.component';
import { LigneDeControleComponent } from './ligne-de-controle/ligne-de-controle.component';

const routes: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'dashboard', component: DashboardComponent},
  {path: 'produit', component: ProduitComponent},
  {path: 'plan-de-controle', component: PlanDeControleComponent},
  {path: 'ligne-de-controle', component: LigneDeControleComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
