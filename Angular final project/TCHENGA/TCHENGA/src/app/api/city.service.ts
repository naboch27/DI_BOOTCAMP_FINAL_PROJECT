import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { City } from "../models/City";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class CityService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setCity(city : any) {
   return this.httpService.post({endpoint : '/public/api/v1/city',data : city});
  }

  updateCity(city : City) {
    return this.httpService.put({endpoint : '/public/api/v1/city',data : city});
  }

  getCity() {
   return this.httpService.get("/public/api/v1/city");
  }

  deleteCity(id : number) {
    return this.httpService.delete(`/public/api/v1/city/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
