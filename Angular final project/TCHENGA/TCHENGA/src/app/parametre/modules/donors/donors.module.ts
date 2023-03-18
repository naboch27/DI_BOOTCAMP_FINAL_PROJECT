import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DonorsRoutingModule } from './donors-routing.module';
import { DashboardDonorComponent } from './components/dashboard-donor/dashboard-donor.component';
import { HeaderComponent } from './components/header/header.component';


@NgModule({
  declarations: [
    DashboardDonorComponent,
    HeaderComponent
  ],
  imports: [
    CommonModule,
    DonorsRoutingModule
  ]
})
export class DonorsModule { }
