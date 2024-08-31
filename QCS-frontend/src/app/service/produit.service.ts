import {Injectable} from "@angular/core";
import {HttpClient} from "@angular/common/http";
import {Produit} from "../model/produit.model";
import {map, Observable} from "rxjs";

@Injectable({providedIn:'root'})
export class ProduitService {

  private host= "http://localhost:3000";
  constructor(private http:HttpClient) {
  }
  getAllProduits(): Observable<Produit[]>{
    return this.http.get<Produit[]>(this.host+"/produits");
  }

  save(produit:Produit): Observable<Produit> {
    return this.http.post<Produit>(this.host+"/produits",produit);
  }


}
