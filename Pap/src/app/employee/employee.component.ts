import { Component, OnInit } from '@angular/core';
import { Employee } from 'app/pojos/employee';
import { EmployeeService } from 'app/service/employee.service';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  
  employeelist:Employee[];
  totalRecords:any;
  constructor(public empServ:EmployeeService) { }

  ngOnInit(): void {
    
    this.empServ.getEmployeeList().subscribe(data=>{
      this.employeelist=data;
      this.totalRecords=data.length;
    });
  }

}
