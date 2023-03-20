import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgbModal, NgbModalConfig } from '@ng-bootstrap/ng-bootstrap';
import { CompteService } from 'src/app/api/compte.service';
import { identityDocumentService } from 'src/app/api/identityDocument.service';
import { JobsService } from 'src/app/api/jobs.service';
import { MunicipalitiesService } from 'src/app/api/municipalities.service';
import { Compte } from 'src/app/models/Compte';
import { IdentityDocument } from 'src/app/models/IdentityDocument';
import { Jobs } from 'src/app/models/Jobs';
import { Municipalities } from 'src/app/models/Municipalities';


@Component({
  selector: 'app-donor-update',
  templateUrl: './donor-update.component.html',
  styleUrls: ['./donor-update.component.css']
})
export class DonorUpdateComponent {

  
  list_municipalitie: any = [];
  list_jobs: any = [];
  list_document: any = [];

  forms: FormGroup;

  compte!: Compte;

  identityDocument!: IdentityDocument;
  jobs!: Jobs;
  municipalitie!: Municipalities;

  //tab_connection: Connection[] = [];
  tab_compte: Compte[] = [];

  messageSucces: boolean = false;

  messageDelete: boolean = false;

  constructor(private municipalitiesService: MunicipalitiesService, private jobsService: JobsService
    , private documentService: identityDocumentService,
    private compteService: CompteService,
    private formBuilder: FormBuilder,
    config: NgbModalConfig, private modalService: NgbModal) {
    this.forms = this.formBuilder.group({

      firstNamePerson: ['', Validators.required],
      lastNamePersonne: ['', Validators.required],
      phonePerson: ['', Validators.required],
      emailPerson: ['', Validators.required],
      adressePerson: ['', Validators.required],
      municipalitiesEntity: [Municipalities, Validators.required],
      jobsEntity: [Jobs, Validators.required],
      documentEntity: [IdentityDocument, Validators.required],
    })

  }




  addCompte() {
    console.log(this.compte);
    console.log(this.identityDocument);
    console.log(this.jobs);
    console.log(this.municipalitie);

    console.log(this.compte);
    if (this.forms.valid) {
      this.compte = this.forms.value
      this.compte.documentEntity = JSON.parse(this.compte.documentEntity as unknown as string) as IdentityDocument
      this.compte.jobsEntity = JSON.parse(this.compte.jobsEntity as unknown as string) as Jobs
      this.compte.municipalitiesEntity = JSON.parse(this.compte.municipalitiesEntity as unknown as string) as Municipalities
      let data = JSON.stringify({

        "firstNamePerson": this.compte.firstNamePerson,
        "lastNamePersonne": this.compte.lastNamePersonne,
        "phonePerson": this.compte.phonePerson,
        "emailPerson": this.compte.emailPerson,
        "adressePerson": this.compte.adressePerson,

        "municipalitiesEntity": {
          "municipalitieId": this.compte.municipalitiesEntity.municipalitieId
        },
        "jobsEntity": {
          "jobsId": this.compte.jobsEntity.jobsId
        },
        "documentEntity": {
          "identityDocumentId": this.compte.documentEntity.identityDocumentId
        }
      });
      console.log(data);

      this.compteService.setCompte(data).subscribe({
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
    else {

    }
  }


  ngOnInit(): void {


    this.documentService.getIdentityDocument().subscribe((data: any) => {
      //console.log(data);
      this.list_document = data
    })

    this.jobsService.getJobs().subscribe((data: any) => {
      //console.log(data);
      this.list_jobs = data
    })

    this.municipalitiesService.getMunicipalities().subscribe((data: any) => {
      //console.log(data);
      this.list_municipalitie = data
    })


  }

}
