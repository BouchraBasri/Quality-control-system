import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './component/login/login.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { ProduitComponent } from './component/produit/produit.component';
import { PlanDeControleComponent } from './component/plan-de-controle/plan-de-controle.component';
import { LigneDeControleComponent } from './component/ligne-de-controle/ligne-de-controle.component';
import { AnalyseComponent } from './component/analyse/analyse.component';
import { AnalyseDeLigneComponent } from './component/analyse-de-ligne/analyse-de-ligne.component';

const routes: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'dashboard', component: DashboardComponent},
  {path: 'produit', component: ProduitComponent},
  {path: 'plan-de-controle', component: PlanDeControleComponent},
  {path: 'ligne-de-controle', component: LigneDeControleComponent},
  {path: 'analyse', component: AnalyseComponent},
  {path: 'analyse-de-ligne', component: AnalyseDeLigneComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
