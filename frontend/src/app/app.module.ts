import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; 


import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HeaderComponent } from './component/header/header.component';
import { LoginComponent } from './component/login/login.component';
import { DashboardComponent } from './component/dashboard/dashboard.component';
import { ProduitComponent } from './component/produit/produit.component';
import { PlanDeControleComponent } from './component/plan-de-controle/plan-de-controle.component';
import { LigneDeControleComponent } from './component/ligne-de-controle/ligne-de-controle.component';
import { AnalyseComponent } from './component/analyse/analyse.component';
import { AnalyseDeLigneComponent } from './component/analyse-de-ligne/analyse-de-ligne.component';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    DashboardComponent,
    ProduitComponent,
    PlanDeControleComponent,
    LigneDeControleComponent,
    AnalyseComponent,
    AnalyseDeLigneComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
