import { Component, OnInit } from '@angular/core';
import { Router, RouterLink } from '@angular/router';
import { windowTime } from 'rxjs';
import { CountryService } from 'src/app/api/country.service';
import { Country } from 'src/app/models/Country';

@Component({
  selector: 'app-country',
  templateUrl: './country.component.html',
  styleUrls: ['./country.component.css']
})
export class CountryComponent {

  country: Country;

  tab_country: Country[] = [];

  messageSucces: boolean = false;

  messageDelete: boolean = false;

  constructor(private countryService: CountryService) {
    this.country = new Country();
  }

  addCountry() {
    this.countryService.setCountry(this.country).subscribe({
      next: data => {
        console.log(data);
        this.messageSucces = true;

        setInterval((() => window.location.reload()), 1000);

      },
      error: error => {
        console.log(error);
      }

    })
  }
  ngOnInit(): void {
    this.countryService.getCountry().subscribe((Response) => {
      this.tab_country = Response as Country[];
      console.log(this.tab_country);
    })
  }

  deleteCountry(id: number) {
    this.countryService.deleteCountry(id).subscribe({
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

}


