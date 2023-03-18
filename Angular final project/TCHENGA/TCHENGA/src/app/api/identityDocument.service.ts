import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { IdentityDocument } from "../models/IdentityDocument";
import { HttpService } from "./api.service";

@Injectable({
  providedIn : 'root'
})
export class identityDocumentService {

  constructor(private httpService : HttpService,private http : HttpClient) {

  }
  

  setIdentityDocument(identityDocument : any) {
   return this.httpService.post({endpoint : '/public/api/v1/document',data : identityDocument});
  }

  updateIdentityDocument(identityDocument : IdentityDocument) {
    return this.httpService.put({endpoint : '/public/api/v1/document',data : identityDocument});
  }

  getIdentityDocument() {
   return this.httpService.get("/public/api/v1/document");
  }

  deleteIdentityDocument(id : number) {
    return this.httpService.delete(`/public/api/v1/document/${id}`);
  }

  GetAllInvoice(){
    return this.http.get('https://jsonplaceholder.typicode.com/users');
  }

}
