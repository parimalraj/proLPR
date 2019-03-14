import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'; 

@Injectable({
  providedIn: 'root'
})
export class RestService {
  baseUrl: string ="http://localhost:8080";
  constructor(private http: HttpClient) { }
  myid:string="W132132";
  getText(){
    const url='http://localhost:8080';
    return this.http.get(this.baseUrl+'/api/hello');
  }

  getClassText(){
    const url='http://localhost:8080';
    return this.http.get(this.baseUrl+'/api/topics');
  }

  getClassTextId(name:string){
    const url='http://localhost:8080';
    return this.http.get(this.baseUrl+'/api/topics/'+name);
  }
}
