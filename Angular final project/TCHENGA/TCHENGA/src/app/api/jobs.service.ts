import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Jobs } from "../models/Jobs";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class JobsService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setJobs(jobs : any) {
   return this.httpService.post({endpoint : '/public/api/v1/jobs',data : jobs});
  }

  updateJobs(jobs : Jobs) {
    return this.httpService.put({endpoint : '/public/api/v1/jobs',data : jobs});
  }

  getJobs() {
   return this.httpService.get("/public/api/v1/jobs");
  }

  deleteJobs(id : number) {
    return this.httpService.delete(`/public/api/v1/jobs/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
