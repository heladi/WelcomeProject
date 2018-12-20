import { Component, OnInit } from '@angular/core';
import { signupDataService } from '../service/data/signup-data.service';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  signupMessageFromService:String
  constructor(
   //In order to use signup-data.service, need to use dependency injection
    private service:signupDataService
    ) { 

    
  }

  ngOnInit() {
  }

  getSignupMessage(){
    // call the signup message
    console.log(this.service.executeLoginService()) ;
    this.service.executeLoginService().subscribe( 
      response => this.handleSuccessfulResponse(response)
    );
    console.log("last line")
  }

  handleSuccessfulResponse(response){
    this.signupMessageFromService = response.message
    console.log(response);
    // console.log(response.message)
  }

}
