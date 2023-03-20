import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Compte } from "../models/Compte";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class CompteService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setCompte(compte : any) {
   return this.httpService.post({endpoint : '/public/api/v1/donor',data : compte});
  }

  updateCompte(compte : Compte) {
    return this.httpService.put({endpoint : '/public/api/v1/donor',data : compte});
  }

  getCompte() {
   return this.httpService.get("/public/api/v1/donor");
  }

  deleteCompte(id : number) {
    return this.httpService.delete(`/public/api/v1/donor/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
