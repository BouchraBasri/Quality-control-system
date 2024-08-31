import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalysedeLigneComponent } from './analyse-de-ligne.component';

describe('AnalysedeLigneComponent', () => {
  let component: AnalysedeLigneComponent;
  let fixture: ComponentFixture<AnalysedeLigneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AnalysedeLigneComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AnalysedeLigneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
