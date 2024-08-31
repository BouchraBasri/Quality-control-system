import { Component } from '@angular/core';
import {AsyncPipe, NgForOf} from "@angular/common";
import {ReactiveFormsModule} from "@angular/forms";

@Component({
  selector: 'app-analyse',
  standalone: true,
    imports: [
        AsyncPipe,
        NgForOf,
        ReactiveFormsModule
    ],
  templateUrl: './analyse.component.html',
  styleUrl: './analyse.component.css'
})
export class AnalyseComponent {

}
