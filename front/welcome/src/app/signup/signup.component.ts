import { Component, OnInit } from '@angular/core';
import { WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(
   //In order to use welcome-data.service, need to use dependency injection
    private service:WelcomeDataService
    ) { 

    
  }

  ngOnInit() {
  }

  getWelcomeMessage(){
    // call the welcome message
     this.service.executeHellowWorldBeanService();
    console.log("get welcome message")
  }

}
