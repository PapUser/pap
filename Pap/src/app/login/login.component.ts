import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
 
  constructor(public comServ:CommonService,public router:Router) { }
  username:string;
  password:string;
  flag:boolean;
  ngOnInit(): void {
  }

  checklogin(){
    
    //this.flag=this.comServ.checkLoginCredentials(u.username,u.password);
      if (this.username === 'ad' && this.password === 'ad') {
        alert(this.username+"  "+this.password)
        sessionStorage.setItem('role', 'admin');
        this.router.navigateByUrl('admin/dashboard');
      }
  }

}
