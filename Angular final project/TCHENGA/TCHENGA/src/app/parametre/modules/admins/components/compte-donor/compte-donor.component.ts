import { Component } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NgbModal, NgbModalConfig } from '@ng-bootstrap/ng-bootstrap';
import { CompteService } from 'src/app/api/compte.service';
import { identityDocumentService } from 'src/app/api/identityDocument.service';
import { JobsService } from 'src/app/api/jobs.service';
import { MunicipalitiesService } from 'src/app/api/municipalities.service';
import { Compte } from 'src/app/models/Compte';
import { Connection } from 'src/app/models/Connection';
import { IdentityDocument } from 'src/app/models/IdentityDocument';
import { Jobs } from 'src/app/models/Jobs';
import { Municipalities } from 'src/app/models/Municipalities';

@Component({
  selector: 'app-compte-donor',
  templateUrl: './compte-donor.component.html',
  styleUrls: ['./compte-donor.component.css']
})
export class CompteDonorComponent {

  
	list_municipalitie: any = [];
	list_jobs: any = [];
	list_document: any = [];

	formsText: FormGroup;

	compte!: Compte;

	identityDocument!: IdentityDocument;
	jobs!: Jobs;
	municipalitie!: Municipalities;

	tab_connection: Connection[] = [];
	tab_compte: Compte[] = [];

	messageSucces: boolean = false;

  messageDelete: boolean = false;

	constructor(private municipalitiesService: MunicipalitiesService, private jobsService: JobsService
		, private documentService: identityDocumentService,
		private compteService: CompteService,
		private formBuilder: FormBuilder,
		config: NgbModalConfig, private modalService: NgbModal) {
		this.formsText = this.formBuilder.group({

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



		this.compteService.getCompte().subscribe((Response) => {
			this.tab_compte = Response as Compte[];
			console.log(this.tab_compte);
		})


	}

	

	
	deleteCompte(id: number) {
		
		this.compteService.deleteCompte(id).subscribe({
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

}
