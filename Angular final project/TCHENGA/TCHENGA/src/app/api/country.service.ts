import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Country } from "../models/Country";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class CountryService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setCountry(country : any) {
   return this.httpService.post({endpoint : '/public/api/v1/country',data : country});
  }

  updateCountry(country : Country) {
    return this.httpService.put({endpoint : '/public/api/v1/country',data : country});
  }

  getCountry() {
   return this.httpService.get("/public/api/v1/country");
  }

  getCountryId(country :Country) {
    return this.httpService.delete(`/public/api/v1/country/${country}`);
   }

  deleteCountry(id : number) {
    return this.httpService.delete(`/public/api/v1/country/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
