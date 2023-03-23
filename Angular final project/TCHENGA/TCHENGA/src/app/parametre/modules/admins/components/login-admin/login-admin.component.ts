import { Component } from '@angular/core';

@Component({
  selector: 'app-login-admin',
  templateUrl: './login-admin.component.html',
  styleUrls: ['./login-admin.component.css']
})
export class LoginAdminComponent {

  login: any;
  password:any;
  

  envoyer(){
    alert("ok");
  }
  //this.router.navigate(['/error']);

}
