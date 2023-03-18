import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Staff } from "../models/Staff";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class StaffService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setStaff(staff : any) {
   return this.httpService.post({endpoint : '/public/api/v1/staff',data : staff});
  }

  updateStaff(staff : Staff) {
    return this.httpService.put({endpoint : '/public/api/v1/staff',data : staff});
  }

  getStaff() {
   return this.httpService.get("/public/api/v1/staff");
  }

  deleteStaff(id : number) {
    return this.httpService.delete(`/public/api/v1/staff/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
