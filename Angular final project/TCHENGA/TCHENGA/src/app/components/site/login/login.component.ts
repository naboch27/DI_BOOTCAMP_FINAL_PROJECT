import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  login: any;

  password:any;

  message:boolean=false;

  constructor(private router: Router){}

  envoyer(){
    
    if(this.login=="momo" && this.password=="123456"){
      this.message=false;
     this.router.navigate(['/admin']);
    }else{
      this.message=true;
      setInterval((() => window.location.reload()), 1000);
    }
  }
  

}
