import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NgbCarouselModule, NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { HomeComponent } from './components/site/home/home.component';
import { SensitizationComponent } from './components/site/sensitization/sensitization.component';
import { DonComponent } from './components/site/don/don.component';
import { ConsultationComponent } from './components/site/consultation/consultation.component';
import { CompteComponent } from './components/site/compte/compte.component';
import { LoginComponent } from './components/site/login/login.component';
import { HeaderComponent } from './components/site/header/header.component';
import { FooterComponent } from './components/site/footer/footer.component';
import { NotFoundComponent } from './components/site/not-found/not-found.component';
import {FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { DatableComponent } from './page/datable/datable.component'; 
import {DataTablesModule} from 'angular-datatables';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SensitizationComponent,
    DonComponent,
    ConsultationComponent,
    CompteComponent,
    LoginComponent,
    HeaderComponent,
    FooterComponent,
    NotFoundComponent,
    DatableComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgbCarouselModule,
    HttpClientModule,
    NgbModule,
    DataTablesModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
