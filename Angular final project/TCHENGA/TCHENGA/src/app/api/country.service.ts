import { Injectable } from "@angular/core";
import { Icountry } from "../models/Icountry";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class CountryService {

  constructor(private httpService : HttpService ) {

  }


  setCountry(country : any) {
   return this.httpService.post({endpoint : '/public/api/v1/country',data : country});
  }

  updateCountry(country : Icountry) {
    return this.httpService.put({endpoint : '/public/api/v1/country',data : country});
  }

  getCountry() {
   return this.httpService.get("/public/api/v1/country");
  }

  deleteCountry(id : string) {
    return this.httpService.delete(`/public/api/v1/country/${id}`);
  }



}
