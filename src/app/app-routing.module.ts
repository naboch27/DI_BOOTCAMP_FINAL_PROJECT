import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CompteComponent } from './components/compte/compte.component';
import { ConsultationComponent } from './components/consultation/consultation.component';
import { DonComponent } from './components/don/don.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NotFoundComponent } from './components/not-found/not-found.component';
import { SensitizationComponent } from './components/sensitization/sensitization.component';

const routes: Routes = [

  { path: 'home', component: HomeComponent },
  { path: 'sensibilisation', component: SensitizationComponent },
  { path: 'don', component: DonComponent },
  { path: 'consulter', component: ConsultationComponent },
  { path: 'compte', component: CompteComponent },
  { path: 'login', component: LoginComponent },
  { path: '**', component: NotFoundComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
