import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employee } from 'app/pojos/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  constructor(public httpclient:HttpClient) { }

  url="http://localhost:9090/employee";

  getEmployeeList(){

   return this.httpclient.get<Employee[]>(this.url);

  }
}
