import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

//a simple bean defins the structure of the response
export class LoginSuccessBean {
  constructor(public message:string){

  }

}
@Injectable({
  providedIn: 'root'
})
export class signupDataService {

  constructor(
    private http:HttpClient


  ) { } 

  // retrieving the data from backend
  executeLoginService(){
    return this.http.get<LoginSuccessBean>('http://localhost:8080/login-successful');
    //console.log("Excecute Sign Up Succesfull Service")
  }
}
