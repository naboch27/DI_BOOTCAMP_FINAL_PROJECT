import { Component } from '@angular/core';
import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  providers: [NgbCarouselConfig] 
})
export class HomeComponent {

  images = ['../../assets/img/carousel/don1.jpg',
  '../../assets/img/carousel/don2.jpg',
  '../../assets/img/carousel/don3.jpg'
];


}
