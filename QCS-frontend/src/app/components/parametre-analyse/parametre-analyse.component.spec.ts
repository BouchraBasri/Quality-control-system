import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ParametreAnalyseComponent } from './parametre-analyse.component';

describe('ParametreAnalyseComponent', () => {
  let component: ParametreAnalyseComponent;
  let fixture: ComponentFixture<ParametreAnalyseComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ParametreAnalyseComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ParametreAnalyseComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
