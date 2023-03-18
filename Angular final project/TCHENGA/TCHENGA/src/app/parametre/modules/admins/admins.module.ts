import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminsRoutingModule } from './admins-routing.module';
import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { HeaderComponent } from './components/header/header.component';
import { CityComponent } from './components/city/city.component';
import { CountryComponent } from './components/country/country.component';
import { JobsComponent } from './components/jobs/jobs.component';
import { MunicipalitiesComponent } from './components/municipalities/municipalities.component';
import { DocumentComponent } from './components/document/document.component';
import { CenterComponent } from './components/center/center.component';
import { PersonnelsComponent } from './components/personnels/personnels.component';
import { CompteDonorComponent } from './components/compte-donor/compte-donor.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AdminDashboardComponent,
    HeaderComponent,
    CityComponent,
    CountryComponent,
    JobsComponent,
    MunicipalitiesComponent,
    DocumentComponent,
    CenterComponent,
    PersonnelsComponent,
    CompteDonorComponent
  ],
  imports: [
    CommonModule,
    AdminsRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ]
})
export class AdminsModule { }
