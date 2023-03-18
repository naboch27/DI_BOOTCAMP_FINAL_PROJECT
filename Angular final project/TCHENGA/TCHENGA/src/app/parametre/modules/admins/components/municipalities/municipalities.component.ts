import { Component,OnInit } from '@angular/core';
import { NgModel } from '@angular/forms';
import { CityService } from 'src/app/api/city.service';
import { MunicipalitiesService } from 'src/app/api/municipalities.service';
import { City } from 'src/app/models/City';
import { Municipalities } from 'src/app/models/Municipalities';

@Component({
  selector: 'app-municipalities',
  templateUrl: './municipalities.component.html',
  styleUrls: ['./municipalities.component.css']
})
export class MunicipalitiesComponent implements OnInit {

  _city:any = []
  municipalities :Municipalities;
  city:any;

  tab_municipalities :Municipalities[] = [];

  messageSucces: boolean = false;

  messageDelete: boolean = false;

  constructor(private municipalitiesService: MunicipalitiesService,private cityService : CityService){
    this.municipalities = new Municipalities();
  }

  selectedValue(select:NgModel){

    console.log(select.control.value)

  }

  
  addMunicipalities(){
    console.log(this.municipalities);
    console.log(this.city);
    this.municipalities.city = JSON.parse(this.municipalities.city as unknown as string) as City
   this.municipalitiesService.setMunicipalities(this.municipalities).subscribe({
      next:data =>{
        console.log(data);
        this.messageSucces = true;

      setInterval((() => window.location.reload()), 1000);
      },
      error:error=>{
        console.log(error);
      }
      
    })
  }
 
  
  ngOnInit(): void {
    this.cityService.getCity().subscribe((data:any)=>{ 
      //console.log(data);
      this._city = data
    })

    this.municipalitiesService.getMunicipalities().subscribe((Response)=>{
      this.tab_municipalities =Response as Municipalities[];
      console.log(this.tab_municipalities);
    })
}


deleteMunicipalities(id: number) {
  this.municipalitiesService.deleteMunicipalities(id).subscribe({
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
