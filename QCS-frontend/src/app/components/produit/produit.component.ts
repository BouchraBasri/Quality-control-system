import {Component, OnInit} from '@angular/core';
import {NavbarComponent} from "../navbar/navbar.component";
import {SidebarComponent} from "../sidebar/sidebar.component";
import {FooterComponent} from "../footer/footer.component";
import {FormBuilder, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";
import {AsyncPipe, JsonPipe, NgClass, NgForOf, NgIf, NgSwitch} from "@angular/common";
import {ProduitService} from "../../service/produit.service";
import {Observable} from "rxjs";
import {Produit} from "../../model/produit.model";

@Component({
  selector: 'app-produit',
  standalone: true,
  imports: [
    NavbarComponent,
    SidebarComponent,
    FooterComponent,
    ReactiveFormsModule,
    NgIf,
    NgClass,
    NgSwitch,
    AsyncPipe,
    NgForOf,
    JsonPipe
  ],
  templateUrl: './produit.component.html',
  styleUrl: './produit.component.css'
})
export class ProduitComponent implements OnInit{

  produitFormGroup!:FormGroup;
  submitted: boolean  = false;

  produits$: Observable<Produit[]> = new Observable<Produit[]>();
  constructor( private fb:FormBuilder,private produitService: ProduitService ) {
  }

  ngOnInit(): void {
    this.produits$ = this.produitService.getAllProduits();
    this.produitFormGroup=this.fb.group({
      name:['',Validators.required],
      category: ['', Validators.required]
    });
  }
}
