import { TestBed } from '@angular/core/testing';

import { ParametreAnalyseService } from './parametre-analyse.service';

describe('ParametreAnalyseService', () => {
  let service: ParametreAnalyseService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ParametreAnalyseService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
