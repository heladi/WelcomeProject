import { Component, OnInit } from '@angular/core';
import { WelcomeDataService } from '../service/data/welcome-data.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  welcomeMessageFromService:String
  constructor(
   //In order to use welcome-data.service, need to use dependency injection
    private service:WelcomeDataService
    ) { 

    
  }

  ngOnInit() {
  }

  getWelcomeMessage(){
    // call the welcome message
    console.log(this.service.executeHellowWorldBeanService()) ;
    this.service.executeHellowWorldBeanService().subscribe( 
      // response => this.handleSuccessfulResponse(response)
      // response => console.log(response.message)
      response => this.handleSuccessfulResponse(response)
    );
    console.log("last line")
    // console.log("get welcome message")
  }

  handleSuccessfulResponse(response){
    this.welcomeMessageFromService = response.message
    // console.log(response)
    // console.log(response.message)
  }

}
