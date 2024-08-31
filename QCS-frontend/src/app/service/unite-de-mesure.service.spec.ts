import { TestBed } from '@angular/core/testing';

import { UniteDeMesureService } from './unite-de-mesure.service';

describe('UniteDeMesureService', () => {
  let service: UniteDeMesureService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(UniteDeMesureService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
