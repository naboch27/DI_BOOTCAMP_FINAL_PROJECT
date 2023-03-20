import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DonorsRoutingModule } from './donors-routing.module';
import { DashboardDonorComponent } from './components/dashboard-donor/dashboard-donor.component';
import { HeaderComponent } from './components/header/header.component';
import { DonorComponent } from './components/donor/donor.component';
import { DonorUpdateComponent } from './components/donor-update/donor-update.component';
import { DonorAppointmentComponent } from './components/donor-appointment/donor-appointment.component';
import { DonorCheckupComponent } from './components/donor-checkup/donor-checkup.component';
import { DonorTakeComponent } from './components/donor-take/donor-take.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    DashboardDonorComponent,
    HeaderComponent,
    DonorComponent,
    DonorUpdateComponent,
    DonorAppointmentComponent,
    DonorCheckupComponent,
    DonorTakeComponent
  ],
  imports: [
    CommonModule,
    DonorsRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class DonorsModule { }
