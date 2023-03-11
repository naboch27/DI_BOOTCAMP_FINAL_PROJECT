import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CompteDonorComponent } from './compte-donor.component';

describe('CompteDonorComponent', () => {
  let component: CompteDonorComponent;
  let fixture: ComponentFixture<CompteDonorComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CompteDonorComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CompteDonorComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
