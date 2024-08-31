import { TestBed } from '@angular/core/testing';

import { LigneDeControleService } from './ligne-de-controle.service';

describe('LigneDeControleService', () => {
  let service: LigneDeControleService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LigneDeControleService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
