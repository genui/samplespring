import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './page/home/home.component';
import {LoginComponent} from './page/login/login.component';
import {SignupComponent} from './page/signup/signup.component';

const routes: Routes = [
  {path: 'app-home', component: HomeComponent},
  {path: 'app-login', component: LoginComponent},
  {path: 'app-signup', component: SignupComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
