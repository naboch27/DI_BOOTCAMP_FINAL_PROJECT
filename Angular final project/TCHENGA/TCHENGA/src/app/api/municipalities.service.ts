import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Municipalities } from "../models/Municipalities";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class MunicipalitiesService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setMunicipalities(municipalities : any) {
   return this.httpService.post({endpoint : '/public/api/v1/commune',data : municipalities});
  }

  updateMunicipalities(municipalities : Municipalities) {
    return this.httpService.put({endpoint : '/public/api/v1/commune',data : municipalities});
  }

  getMunicipalities() {
   return this.httpService.get("/public/api/v1/commune");
  }

  deleteMunicipalities(id : number) {
    return this.httpService.delete(`/public/api/v1/commune/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
