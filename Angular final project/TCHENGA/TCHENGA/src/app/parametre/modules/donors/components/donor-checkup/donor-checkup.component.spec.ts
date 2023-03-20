import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonorCheckupComponent } from './donor-checkup.component';

describe('DonorCheckupComponent', () => {
  let component: DonorCheckupComponent;
  let fixture: ComponentFixture<DonorCheckupComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DonorCheckupComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DonorCheckupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
