import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {any} from "codelyzer/util/function";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  getTextUrl = 'http://localhost:8080/api/gettext?textInfo=';
  inputTextUrl = 'http://localhost:8080/api/inputtext?textInfo=';
  getTextReference: string;
  currentUserId: string = localStorage.getItem('currentUser');
  constructor(
    private http: HttpClient
  ) { }

  ngOnInit(): void {
    const user = localStorage.getItem('currentUser');
    console.log(user);
    if (!user){
      window.location.href = 'app-login';
    }
  }

  getText(value: string): any {
    this.http.get(this.getTextUrl + value,
      { responseType: 'text' }).subscribe(res => {
      this.getTextReference = res;
    });
  }

  inputTextFocus(): void {
    document.getElementById('text').focus();
  }

  inputText(keyword, text): void {
    const url = this.inputTextUrl + this.currentUserId + '/' + keyword + '/' + text;
    this.http.post(url, {responseType: any}).subscribe();
  }

}
