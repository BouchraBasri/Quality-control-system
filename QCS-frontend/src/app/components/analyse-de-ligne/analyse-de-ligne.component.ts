import {Component, OnInit} from '@angular/core';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { MultiSelectModule } from 'primeng/multiselect';

@Component({
  selector: 'app-analyse-de-ligne',
  standalone: true,
  imports: [
    ReactiveFormsModule,
    FormsModule,
    MultiSelectModule
  ],
  templateUrl: './analyse-de-ligne.component.html',
  styleUrl: './analyse-de-ligne.component.css',

  })
export class AnalysedeLigneComponent  implements OnInit{
  analyses = [
    { label: 'Option 1', value: '1' },
    { label: 'Option 2', value: '2' },
    { label: 'Option 3', value: '3' }
  ];

  selectedAnalyses: any[] = [];

  ngOnInit(): void {
  }
}
