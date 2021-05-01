import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.scss']
})
export class SignupComponent implements OnInit {
  userRegister = 'http://localhost:8080/api/signup?userInfo=';
  loginUserUrl = 'http://localhost:8080/api/login?userInfo=';
  constructor(
    public http: HttpClient
  ) { }

  ngOnInit(): void {
  }
  registerUser(username, password): void{
    const url = this.loginUserUrl + username + '/' + password;
    this.http.get(url, {responseType: 'text'}).subscribe(res => {
      if (res != null) {
        this.postUserInfo(username, password);
      }
    });
  }
  postUserInfo(username, password): void{
    const random = Math.random().toString(32).substring(2);
    const url = this.userRegister + random + '/' +  username + '/' + password;
    this.http.post(url, {responseType: 'json'}).subscribe();
    localStorage.setItem('currentUser', random);
    window.location.href = 'app-home';
  }
}
