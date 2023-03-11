import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SensitizationComponent } from './sensitization.component';

describe('SensitizationComponent', () => {
  let component: SensitizationComponent;
  let fixture: ComponentFixture<SensitizationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SensitizationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(SensitizationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
