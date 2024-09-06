import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AnalyseDeLigneComponent } from './analyse-de-ligne.component';

describe('AnalyseDeLigneComponent', () => {
  let component: AnalyseDeLigneComponent;
  let fixture: ComponentFixture<AnalyseDeLigneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AnalyseDeLigneComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AnalyseDeLigneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
