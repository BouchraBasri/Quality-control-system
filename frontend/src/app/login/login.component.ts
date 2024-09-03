import { Component } from '@angular/core';
import { Router} from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  username: string = '';
  password: string = '';

  constructor(private router: Router) {}

  onSubmit() {
    const validUsername = 'Bouchra';
    const validPassword = '123456';

    if (this.username === validUsername && this.password === validPassword) {
      this.router.navigate(['/dashboard']);
    } else {
      alert('Invalid username or password. Please try again.');
    }
  }
}
