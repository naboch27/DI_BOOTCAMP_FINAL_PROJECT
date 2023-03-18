import { Component,OnInit } from '@angular/core';
import { Subject } from 'rxjs'
import { CountryService } from 'src/app/api/country.service';

@Component({
  selector: 'app-datable',
  templateUrl: './datable.component.html',
  styleUrls: ['./datable.component.css']
})

export class DatableComponent  implements OnInit {

  constructor(
    public service: CountryService
  ) {}

  Invoiceheader: any;
  pdfurl = '';
  invoiceno: any;
  dtoptions: DataTables.Settings = {};
  dtTrigger:Subject<any>=new Subject<any>();

  ngOnInit(): void {
    this.dtoptions = {
      pagingType: 'full_numbers',
      searching:true,
    //  paging:false
    lengthChange:false,
    language:{
      searchPlaceholder:'Text Customer'
    }
  };
  this.LoadInvoice();

}
LoadInvoice() {
  this.service.GetAllInvoice().subscribe(res => {
    this.Invoiceheader = res;
    this.dtTrigger.next(null);
  });
}

}