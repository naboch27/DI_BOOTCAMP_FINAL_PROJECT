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

  images = ['../../assets/img/carousel/don1.jpg',
  '../../assets/img/carousel/don2.jpg',
  '../../assets/img/carousel/don3.jpg'
];

  constructor(){

  }

  ngOnInit(): void {
      
  }

  
}
