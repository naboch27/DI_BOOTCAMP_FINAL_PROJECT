import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Appointment } from "../models/Appointment";
import { City } from "../models/City";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class AppointmentService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setAppointment(appointment : any) {
   return this.httpService.post({endpoint : '/public/api/v1/city',data : appointment});
  }

  updateAppointment(appointment : Appointment) {
    return this.httpService.put({endpoint : '/public/api/v1/city',data : appointment});
  }

  getAppointment() {
   return this.httpService.get("/public/api/v1/city");
  }

  deleteAppointment(id : number) {
    return this.httpService.delete(`/public/api/v1/city/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
