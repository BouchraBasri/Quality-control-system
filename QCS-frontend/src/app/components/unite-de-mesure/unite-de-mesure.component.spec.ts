import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UniteDeMesureComponent } from './unite-de-mesure.component';

describe('UniteDeMesureComponent', () => {
  let component: UniteDeMesureComponent;
  let fixture: ComponentFixture<UniteDeMesureComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [UniteDeMesureComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UniteDeMesureComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
