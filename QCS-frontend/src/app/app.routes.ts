import { Routes } from '@angular/router';
import {ProduitComponent} from "./components/produit/produit.component";
import {PlanDeControleComponent} from "./components/plan-de-controle/plan-de-controle.component";
import {LigneControlComponent} from "./components/ligne-de-controle/ligne-de-controle.component";
import {AnalyseComponent} from "./components/analyse/analyse.component";
import {AnalysedeLigneComponent} from "./components/analyse-de-ligne/analyse-de-ligne.component";

export const routes: Routes = [
{path:"products",component :ProduitComponent},
  {path:"planControl",component:PlanDeControleComponent},
  {path:"ligneControl",component:LigneControlComponent},
  {path:"analysePage",component: AnalyseComponent},
  {path:"analyseDeLigne",component:AnalysedeLigneComponent}
  ];
