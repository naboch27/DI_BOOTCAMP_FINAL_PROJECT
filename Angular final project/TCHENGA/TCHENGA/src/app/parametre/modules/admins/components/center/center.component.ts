import { Component } from '@angular/core';
import { NgModel } from '@angular/forms';
import { CenterService } from 'src/app/api/Center.service';
import { MunicipalitiesService } from 'src/app/api/municipalities.service';
import { Center } from 'src/app/models/Center';
import { Municipalities } from 'src/app/models/Municipalities';

@Component({
  selector: 'app-center',
  templateUrl: './center.component.html',
  styleUrls: ['./center.component.css']
})
export class CenterComponent {


  list_commune: any = []
  center: Center;
  municipalitie: any;

  tab_center: Center[] = [];

  messageSucces: boolean = false;

  messageDelete: boolean = false;

  constructor(private municipalitiesService: MunicipalitiesService, private centerService: CenterService) {
    this.center = new Center();
  }

  selectedValue(select: NgModel) {
    console.log(select.control.value)
  }


  addCenter() {
    console.log(this.municipalitie);
    console.log(this.center);
    this.center.municipalities = JSON.parse(this.center.municipalities as unknown as string) as Municipalities
    this.centerService.setCenter(this.center).subscribe({
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
    this.municipalitiesService.getMunicipalities().subscribe((data: any) => {
      //console.log(data);
      this.list_commune = data
    })

    this.centerService.getCenter().subscribe((Response) => {
      this.tab_center = Response as Center[];
      console.log(this.tab_center);
    })
  }

  deleteCenter(id: number) {
    this.centerService.deleteCenter(id).subscribe({
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

  loardCenter(center: Center){
    this.center=center;
    console.log(this.center)
  }

}
