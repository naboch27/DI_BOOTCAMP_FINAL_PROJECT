import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Center } from "../models/Center";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class CenterService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setCenter(center : any) {
   return this.httpService.post({endpoint : '/public/api/v1/center',data : center});
  }

  updateCenter(center : Center) {
    return this.httpService.put({endpoint : '/public/api/v1/center',data : center});
  }

  getCenter() {
   return this.httpService.get("/public/api/v1/center");
  }

  deleteCenter(id : number) {
    return this.httpService.delete(`/public/api/v1/center/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
