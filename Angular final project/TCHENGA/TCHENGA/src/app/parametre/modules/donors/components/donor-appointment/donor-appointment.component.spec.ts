import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonorAppointmentComponent } from './donor-appointment.component';

describe('DonorAppointmentComponent', () => {
  let component: DonorAppointmentComponent;
  let fixture: ComponentFixture<DonorAppointmentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DonorAppointmentComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DonorAppointmentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
