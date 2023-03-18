import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DatableComponent } from './datable.component';

describe('DatableComponent', () => {
  let component: DatableComponent;
  let fixture: ComponentFixture<DatableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DatableComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(DatableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
