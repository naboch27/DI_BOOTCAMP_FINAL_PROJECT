import { Component, OnInit } from '@angular/core';
import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [NgbCarouselConfig] 
})
export class AppComponent implements OnInit{
  title = 'TCHENGA';

  constructor(){

  }

  ngOnInit(): void {
      
  }

  
}
