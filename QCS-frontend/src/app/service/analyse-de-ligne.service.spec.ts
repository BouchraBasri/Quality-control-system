import { TestBed } from '@angular/core/testing';

import { AnalyseDeLigneService } from './analyse-de-ligne.service';

describe('AnalyseDeLigneService', () => {
  let service: AnalyseDeLigneService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AnalyseDeLigneService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
