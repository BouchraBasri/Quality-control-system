import { Component } from '@angular/core';
import { Router } from '@angular/router';  // Import Router to navigate after login

@Component({
  selector: 'app-auth',
  templateUrl: './auth.component.html',
  styleUrls: ['./auth.component.css']
})
export class AuthComponent {
  username: string = '';
  password: string = '';

  constructor(private router: Router) { }

  onSubmit(): void {
    if (this.username && this.password) {
      // Perform authentication logic here
      // For example, call an authentication service

      console.log('Username:', this.username);
      console.log('Password:', this.password);

      // Navigate to another route after successful login
      this.router.navigate(['/home']);
    }
  }
}
