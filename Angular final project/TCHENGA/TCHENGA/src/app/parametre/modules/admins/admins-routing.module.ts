import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './components/admin-dashboard/admin-dashboard.component';
import { CenterComponent } from './components/center/center.component';
import { CityComponent } from './components/city/city.component';
import { CompteDonorComponent } from './components/compte-donor/compte-donor.component';
import { CountryComponent } from './components/country/country.component';
import { DocumentComponent } from './components/document/document.component';
import { JobsComponent } from './components/jobs/jobs.component';
import { MunicipalitiesComponent } from './components/municipalities/municipalities.component';
import { PersonnelsComponent } from './components/personnels/personnels.component';
import {FormsModule, ReactiveFormsModule } from '@angular/forms';
import { LoginAdminComponent } from './components/login-admin/login-admin.component';

const routes: Routes = [
  { path: 'api/v1/admin/login', component: LoginAdminComponent },
  {

    path: '', component: AdminDashboardComponent,
    
    children: [

      { path: 'city', component: CityComponent },
      { path: 'country', component: CountryComponent },
      { path: 'center', component: CenterComponent },
      { path: 'jobs', component: JobsComponent },
      { path: 'commune', component: MunicipalitiesComponent },
      { path: 'document', component: DocumentComponent },
      { path: 'personnels', component: PersonnelsComponent },
      { path: 'compte_donor', component: CompteDonorComponent }
     
      

    ]
  },



];

@NgModule({
  imports: [RouterModule.forChild(routes),FormsModule,
    ReactiveFormsModule],
  exports: [RouterModule]
})
export class AdminsRoutingModule { }
