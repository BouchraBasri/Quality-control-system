import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlanDeControleComponent } from './plan-de-controle.component';

describe('PlanDeControleComponent', () => {
  let component: PlanDeControleComponent;
  let fixture: ComponentFixture<PlanDeControleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PlanDeControleComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PlanDeControleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
