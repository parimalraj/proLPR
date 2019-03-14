import { Component, OnInit } from '@angular/core';
import { RestService } from '../services/rest.service';
import { Router } from '@angular/router';
import {NgForm} from '@angular/forms';
import { Observable,of } from 'rxjs';
import { Project } from '../shared/model/project';

@Component({
  selector: 'app-text-read',
  templateUrl: './text-read.component.html',
  styleUrls: ['./text-read.component.css']
})
export class TextReadComponent{
  //project: Project = new Project();

  myserv: {};
  myser: {};
  
  constructor(private pqr: RestService) { }

    getClassData(){
    this.pqr.getClassText().subscribe(pqr => this.myserv = pqr);
  }
  
   getClassDataId(name:string){
    this.pqr.getClassTextId(name).subscribe(xyz => this.myser = xyz);
   
   // console.log(name);
  }
  }

    
//   processForm(form){
//    let s= JSON.stringify(this.project.projectStartDate);
//    if(this.project.priorityTo == undefined){
// this.project.priorityTo = 15;
//    }
//     console.log("Inside ProcessForm: ",this.project.priorityTo,s);
//     if(this.project.projectId == undefined){
//      this.projectService.createProject(this.project)
// 		  .subscribe((data)=> {
// form.reset();
// 			 // this.router.navigate(['add-project']);
// 		  });
//     }
//   }

