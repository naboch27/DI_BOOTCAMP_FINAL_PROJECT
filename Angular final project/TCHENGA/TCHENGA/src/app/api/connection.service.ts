import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Connection } from "../models/Connection";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class ConnectionService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setConnection(connection : any) {
   return this.httpService.post({endpoint : '/public/api/v1/connection',data : connection});
  }

  updateConnection(connection : Connection) {
    return this.httpService.put({endpoint : '/public/api/v1/connection',data : connection});
  }

  getConnection() {
   return this.httpService.get("/public/api/v1/connection");
  }

  deleteConnection(id : string) {
    return this.httpService.delete(`/public/api/v1/connection/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
