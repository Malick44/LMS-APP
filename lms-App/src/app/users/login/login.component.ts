import { Component, OnInit } from '@angular/core';
import { MatList } from '@angular/material/list';
import { MatDivider } from '@angular/material/divider';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {
logIn() {
throw new Error('Method not implemented.');
}
  credentials!: FormGroup ;
  error!:string;

  constructor(private fb:FormBuilder,private routes: Router) { }

  ngOnInit(): void {
    this.credentials= this.fb.group({
      username:'',
      password:''

      });
      this.error= " "

  }

}
