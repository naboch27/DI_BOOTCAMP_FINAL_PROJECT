import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardPersonnelComponent } from './components/dashboard-personnel/dashboard-personnel.component';

const routes: Routes = [
  {
    path:'',component:DashboardPersonnelComponent,
    children: [
      
    ]
  },
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class PersonnelsRoutingModule { }
