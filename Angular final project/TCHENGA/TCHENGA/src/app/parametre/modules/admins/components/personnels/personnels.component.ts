import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, NgModel, Validators } from '@angular/forms';
import { NgbModal, NgbModalConfig } from '@ng-bootstrap/ng-bootstrap';
import { identityDocumentService } from 'src/app/api/identityDocument.service';
import { JobsService } from 'src/app/api/jobs.service';
import { MunicipalitiesService } from 'src/app/api/municipalities.service';
import { StaffService } from 'src/app/api/staff.service';
import { Connection } from 'src/app/models/Connection';
import { IdentityDocument } from 'src/app/models/IdentityDocument';
import { Jobs } from 'src/app/models/Jobs';
import { Municipalities } from 'src/app/models/Municipalities';
import { Staff } from 'src/app/models/Staff';


@Component({
	selector: 'app-personnels',
	templateUrl: './personnels.component.html',
	styleUrls: ['./personnels.component.css'],
	providers: [NgbModalConfig, NgbModal],
})
export class PersonnelsComponent implements OnInit {


	list_municipalitie: any = [];
	list_jobs: any = [];
	list_document: any = [];

	formsText: FormGroup;

	staff!: Staff;

	identityDocument!: IdentityDocument;
	jobs!: Jobs;
	municipalitie!: Municipalities;

	tab_connection: Connection[] = [];
	tab_staff: Staff[] = [];

	messageSucces: boolean = false;

  messageDelete: boolean = false;

	constructor(private municipalitiesService: MunicipalitiesService, private jobsService: JobsService
		, private documentService: identityDocumentService,
		private staffService: StaffService,
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




	addPersonnel() {
		console.log(this.staff);
		console.log(this.identityDocument);
		console.log(this.jobs);
		console.log(this.municipalitie);

		console.log(this.staff);
		if (this.formsText.valid) {
			this.staff = this.formsText.value
			this.staff.documentEntity = JSON.parse(this.staff.documentEntity as unknown as string) as IdentityDocument
			this.staff.jobsEntity = JSON.parse(this.staff.jobsEntity as unknown as string) as Jobs
			this.staff.municipalitiesEntity = JSON.parse(this.staff.municipalitiesEntity as unknown as string) as Municipalities
			let data = JSON.stringify({

				"firstNamePerson": this.staff.firstNamePerson,
				"lastNamePersonne": this.staff.lastNamePersonne,
				"phonePerson": this.staff.phonePerson,
				"emailPerson": this.staff.emailPerson,
				"adressePerson": this.staff.adressePerson,

				"municipalitiesEntity": {
					"municipalitieId": this.staff.municipalitiesEntity.municipalitieId
				},
				"jobsEntity": {
					"jobsId": this.staff.jobsEntity.jobsId
				},
				"documentEntity": {
					"identityDocumentId": this.staff.documentEntity.identityDocumentId
				}
			});
			console.log(data);

			this.staffService.setStaff(data).subscribe({
				next: data => {
					console.log(data);
					this.messageSucces = true;

        setInterval((() => window.location.reload()), 1000);
				},
				error: error => {
					console.log(error);
				}

			})
			console.log("salut");
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



		this.staffService.getStaff().subscribe((Response) => {
			this.tab_staff = Response as Staff[];
			console.log(this.tab_staff);
		})


	}

	open(content: any) {
		this.modalService.open(content, { size: 'xl' });
	}

	
	deleteStaff(id: number) {
		
		this.staffService.deleteStaff(id).subscribe({
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