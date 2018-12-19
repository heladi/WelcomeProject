import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

//a simple bean defins the structure of the response
export class HelloWorldBean {
  constructor(public message:string){

  }

}
@Injectable({
  providedIn: 'root'
})
export class WelcomeDataService {

  constructor(
    private http:HttpClient


  ) { } 

  // retrieving the data from backend
  executeHellowWorldBeanService(){
    return this.http.get<HelloWorldBean>('http://localhost:8080/hello-world-bean');
    //console.log("Excecute Hello World Bean Service")
  }
}
