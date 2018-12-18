import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class WelcomeDataService {

  constructor() { } 

  // retrieving the data from backend
  executeHellowWorldBeanService(){
    console.log("Excecute Hello World Bean Service")
  }
}
