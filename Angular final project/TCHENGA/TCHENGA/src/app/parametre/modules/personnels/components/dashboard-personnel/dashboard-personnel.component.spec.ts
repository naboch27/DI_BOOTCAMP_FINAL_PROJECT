import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashboardPersonnelComponent } from './dashboard-personnel.component';

describe('DashboardPersonnelComponent', () => {
  let component: DashboardPersonnelComponent;
  let fixture: ComponentFixture<DashboardPersonnelComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DashboardPersonnelComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DashboardPersonnelComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
