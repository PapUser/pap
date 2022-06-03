import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor() { }

  checkLoginCredentials(username:string,password:string){
    alert(username+" "+password);
    return true;

  }
  
}
