import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { DashboardDonorComponent } from './components/dashboard-donor/dashboard-donor.component';
import { DonorAppointmentComponent } from './components/donor-appointment/donor-appointment.component';
import { DonorCheckupComponent } from './components/donor-checkup/donor-checkup.component';
import { DonorTakeComponent } from './components/donor-take/donor-take.component';
import { DonorUpdateComponent } from './components/donor-update/donor-update.component';
import { DonorComponent } from './components/donor/donor.component';

const routes: Routes = [
  {
    path:'',component:DashboardDonorComponent,
    children: [
      { path: 'donor', component:DonorComponent },
      { path: 'donor/update', component:DonorUpdateComponent },
      { path: 'donor/appointment', component:DonorAppointmentComponent },
      { path: 'donor/checkup', component:DonorCheckupComponent },
      { path: 'donor/prelevement', component:DonorTakeComponent }
    ]
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes),
    FormsModule,
    ReactiveFormsModule],
  exports: [RouterModule]
})
export class DonorsRoutingModule { }
