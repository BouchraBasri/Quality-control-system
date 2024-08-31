import { Component } from '@angular/core';
import {AsyncPipe, NgForOf} from "@angular/common";
import {ReactiveFormsModule} from "@angular/forms";

@Component({
  selector: 'app-plan-de-controle',
  standalone: true,
  imports: [
    AsyncPipe,
    NgForOf,
    ReactiveFormsModule
  ],
  templateUrl: './plan-de-controle.component.html',
  styleUrl: './plan-de-controle.component.css'
})
export class PlanDeControleComponent {

}
