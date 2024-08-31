import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LigneControlComponent } from './ligne-de-controle.component';

describe('LigneControlComponent', () => {
  let component: LigneControlComponent;
  let fixture: ComponentFixture<LigneControlComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LigneControlComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LigneControlComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
