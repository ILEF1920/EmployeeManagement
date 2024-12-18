import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from '../services/employee.service';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms'; // Import FormsModule

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  standalone: true,
  imports: [CommonModule, FormsModule], // Add FormsModule here
})
export class AddEmployeeComponent {
  employee = {
    name: '',
    role: '',
  };

  constructor(private employeeService: EmployeeService, private router: Router) {}

  addEmployee(): void {
    this.employeeService.addEmployee(this.employee).subscribe(() => {
      this.router.navigate(['/']);
    });
  }
}
