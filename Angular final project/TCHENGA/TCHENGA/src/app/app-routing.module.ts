import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CompteComponent } from './components/site/compte/compte.component';
import { ConsultationComponent } from './components/site/consultation/consultation.component';
import { DonComponent } from './components/site/don/don.component';
import { HomeComponent } from './components/site/home/home.component';
import { LoginComponent } from './components/site/login/login.component';
import { NotFoundComponent } from './components/site/not-found/not-found.component';
import { SensitizationComponent } from './components/site/sensitization/sensitization.component';

const routes: Routes = [

  { path: 'home', component: HomeComponent },
  { path: 'sensibilisation', component: SensitizationComponent },
  { path: 'don', component: DonComponent },
  { path: 'consulter', component: ConsultationComponent },
  { path: 'compte', component: CompteComponent },
  { path: 'login', component: LoginComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },

  //route Child
  {
    path: 'admin', loadChildren: () =>
      import('./parametre/modules/admins/admins.module').then((m) => m.AdminsModule),
  },

  { path: '**', component: NotFoundComponent },


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
