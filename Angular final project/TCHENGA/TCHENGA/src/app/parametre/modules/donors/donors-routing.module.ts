import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardDonorComponent } from './components/dashboard-donor/dashboard-donor.component';

const routes: Routes = [
  {
    path:'',component:DashboardDonorComponent,
    children: [
      
    ]
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DonorsRoutingModule { }
