import { Component } from '@angular/core';
import { identityDocumentService } from 'src/app/api/identityDocument.service';
import { IdentityDocument } from 'src/app/models/IdentityDocument';

@Component({
  selector: 'app-document',
  templateUrl: './document.component.html',
  styleUrls: ['./document.component.css']
})
export class DocumentComponent {

  document: IdentityDocument;

  tab_document: IdentityDocument[] = [];


  messageSucces: boolean = false;

  messageDelete: boolean = false;

  constructor(private identityDocumentService: identityDocumentService) {
    this.document = new IdentityDocument();
  }

  addDocument() {
    this.identityDocumentService.setIdentityDocument(this.document).subscribe({
      next: data => {
        console.log(data);
        this.messageSucces = true;

        setInterval((() => window.location.reload()), 1000);
      },
      error: error => {
        console.log(error);
      }

    })
  }
  ngOnInit(): void {
    this.identityDocumentService.getIdentityDocument().subscribe((Response) => {
      this.tab_document = Response as IdentityDocument[];
      console.log(this.tab_document);
    })
  }

  deleteDocument(id: number) {
    this.identityDocumentService.deleteIdentityDocument(id).subscribe({
      next: data => {
        console.log(data);
        // alert("Delete successfull");

        this.messageDelete = true;

        setInterval((() => window.location.reload()), 1000);

      },
      error: error => {
        console.log(error);
      }

    })
  }

  loadIdentityDocument(document: IdentityDocument){
    this.document=document;
    console.log(this.document)
  }

}
