import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Produit } from '../model/produit.model';

@Injectable({
  providedIn: 'root'
})
export class ProduitService {
  private baseURL = "http://localhost:8081/api/v1/produit";

  constructor(private httpClient: HttpClient) { }

  getAllProduits(): Observable<Produit[]> {
    return this.httpClient.get<Produit[]>(`${this.baseURL}`);
  }

  addProduit(produit: Produit): Observable<Produit> {
    return this.httpClient.post<Produit>(this.baseURL, produit);
  }

  
}
