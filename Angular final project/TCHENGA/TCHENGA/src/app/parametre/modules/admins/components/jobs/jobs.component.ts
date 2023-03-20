import { Component } from '@angular/core';
import { JobsService } from 'src/app/api/jobs.service';
import { Jobs } from 'src/app/models/Jobs';

@Component({
  selector: 'app-jobs',
  templateUrl: './jobs.component.html',
  styleUrls: ['./jobs.component.css']
})
export class JobsComponent {

  
  jobs :Jobs;
   
  tab_jobs :Jobs[] = [];

  messageSucces: boolean = false;

  messageDelete: boolean = false;

  constructor(private jobService : JobsService){
    this.jobs = new Jobs();
  }

  addJobs(){
    this.jobService.setJobs(this.jobs).subscribe({
      next:data =>{
        console.log(data);
        this.messageSucces = true;

      setInterval((() => window.location.reload()), 1000);
      },
      error:error=>{
        console.log(error);
      }
      
    })
  }

  ngOnInit():void{
this.jobService.getJobs().subscribe((Response)=>{
  this.tab_jobs =Response as Jobs[];
  console.log(this.tab_jobs);
})
  }

  deleteJobs(id: number) {
    this.jobService.deleteJobs(id).subscribe({
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

  loadJobs(jobs : Jobs){
    this.jobs=jobs;
    console.log(this.jobs)
   }

}
