import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LigneDeControleComponent } from './ligne-de-controle.component';

describe('LigneDeControleComponent', () => {
  let component: LigneDeControleComponent;
  let fixture: ComponentFixture<LigneDeControleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LigneDeControleComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LigneDeControleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
