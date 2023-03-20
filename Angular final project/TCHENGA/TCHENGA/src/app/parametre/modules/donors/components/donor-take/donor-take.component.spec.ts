import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonorTakeComponent } from './donor-take.component';

describe('DonorTakeComponent', () => {
  let component: DonorTakeComponent;
  let fixture: ComponentFixture<DonorTakeComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DonorTakeComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DonorTakeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
