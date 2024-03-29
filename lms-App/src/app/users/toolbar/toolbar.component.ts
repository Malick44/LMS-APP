import { Component, EventEmitter, OnInit, Output } from '@angular/core';

@Component({
  selector: 'app-toolbar',
  templateUrl: './toolbar.component.html',
  styleUrls: ['./toolbar.component.scss']
})
export class ToolbarComponent implements OnInit {
  @Output() toggleSidenav = new EventEmitter<void>();
  @Output() toggleTheme = new EventEmitter<void>();
  @Output() toggleDir = new EventEmitter<void>();

loggedInUser!:string;

openAddContactDialog() {
throw new Error('Method not implemented.');
}


  constructor() { }

  ngOnInit(): void {
    this.loggedInUser= 'Roberto';
  }

}
