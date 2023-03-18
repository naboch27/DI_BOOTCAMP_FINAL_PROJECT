import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { PersonnelsRoutingModule } from './personnels-routing.module';
import { DashboardPersonnelComponent } from './components/dashboard-personnel/dashboard-personnel.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';


@NgModule({
  declarations: [
    DashboardPersonnelComponent,
    HeaderComponent,
    FooterComponent
  ],
  imports: [
    CommonModule,
    PersonnelsRoutingModule
  ]
})
export class PersonnelsModule { }
