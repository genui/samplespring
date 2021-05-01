import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  loginUserUrl = 'http://localhost:8080/api/login?userInfo=';
  errorMessage = '';
  constructor(
    public http: HttpClient
  ) { }

  ngOnInit(): void {
  }

  inputPassword(userName, password): void{
    const url = this.loginUserUrl + userName + '/' + password;
    this.http.get(url, {responseType: 'text'}).subscribe(res => {
      console.log(res);
      if (res) {
        localStorage.setItem('currentUser', res);
        window.location.href = 'app-home';
      } else {
        console.warn(res);
        this.errorMessage = 'ユーザが存在しません';
      }
    });

  }
}
