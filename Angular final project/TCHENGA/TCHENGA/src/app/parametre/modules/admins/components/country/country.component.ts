import { Component, OnInit } from '@angular/core';
import { CountryService } from 'src/app/api/country.service';
import { Icountry } from 'src/app/models/Icountry';

@Component({
  selector: 'app-country',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.css']
})
export class CountryComponent {

  icountry :Icountry;
   
  t_country :Icountry[] = [];


  constructor(private countryService : CountryService){
    this.icountry = new Icountry();
  }

  addCountry(){
    this.countryService.setCountry(this.icountry).subscribe({
      next:data =>{
        console.log(data);
        alert("country enregistré avec succes");
      },
      error:error=>{
        console.log(error);
      }
      
    })
  }
  ngOnInit():void{
this.countryService.getCountry().subscribe((Response)=>{
  this.t_country =Response as Icountry[];
  console.log(this.t_country);
})
  }

}
