import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  getTextUrl = 'http://localhost:8080/api/text?textInfo=';
  inputTextUrl = 'http://localhost:8080/api/inputtext?textInfo=';
  getTextReference: string;
  constructor(
    private http: HttpClient
  ) { }

  ngOnInit(): void {
  }

  getText(value: string): any {
    console.log(value);
    this.http.get(this.getTextUrl + value,
      { responseType: 'text' }).subscribe(res => {
      this.getTextReference = res;
    });
  }

  inputTextFocus(): void {
    document.getElementById('text').focus();
  }

  inputText(keyword, text): void {
    const url = this.inputTextUrl + keyword + ',' + text;
    this.http.post(url, {responseType: 'text'});
  }

}
