import { Component } from '@angular/core';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";

@Component({
  selector: 'app-ligne-control',
  standalone: true,
    imports: [
        FormsModule,
        ReactiveFormsModule
    ],
  templateUrl: './ligne-de-controle.component.html',
  styleUrl: './ligne-de-controle.component.css'
})
export class LigneControlComponent {

}
