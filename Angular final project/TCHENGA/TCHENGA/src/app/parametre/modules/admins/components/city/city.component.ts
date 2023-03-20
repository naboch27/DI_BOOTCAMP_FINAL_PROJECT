import { Component,OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import { CityService } from 'src/app/api/city.service';
import { CountryService } from 'src/app/api/country.service';
import { City } from 'src/app/models/City';
import { Country } from 'src/app/models/Country';

@Component({
  selector: 'app-city',
  templateUrl: './city.component.html',
  styleUrls: ['./city.component.css']
})
export class CityComponent implements OnInit{

  countries:any = []
  
  city :City;
   country:any;

  tab_city :City[] = [];

  messageSucces: boolean = false;

  messageDelete: boolean = false;

  constructor(private countryService: CountryService,private cityService : CityService){
    this.city = new City();
  }

  selectedValue(select:NgModel){
    console.log(select.control.value)
  }

  
  addCity(){
    console.log(this.country);
    console.log(this.city);
    this.city.country = JSON.parse(this.city.country as unknown as string) as Country
   this.cityService.setCity(this.city).subscribe({
      next:data =>{
        console.log(data);
        this.messageSucces = true;

        setInterval((() => window.location.reload()), 1000);
      },
      error:error=>{
        console.log(error);
      }
      
    })
    console.log("salut");
  }
 
  
  ngOnInit(): void {
    this.countryService.getCountry().subscribe((data:any)=>{ 
      //console.log(data);
      this.countries = data
    })

    this.cityService.getCity().subscribe((Response)=>{
      this.tab_city =Response as City[];
      console.log(this.tab_city);
    })
}

deleteCity(id: number) {
  this.cityService.deleteCity(id).subscribe({
    next: data => {
      console.log(data);
      // alert("Delete successfull");

      this.messageDelete = true;

      setInterval((() => window.location.reload()), 1000);

    },
    error: error => {
      console.log(error);
    }

  })
}
loadCity(city: City){
  this.city=city;
  console.log(this.city)
 }
}
