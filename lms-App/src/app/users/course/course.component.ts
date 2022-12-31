import { BreakpointObserver, BreakpointState } from '@angular/cdk/layout';
import { Component, OnInit, ViewChild } from '@angular/core';
import { MatSidenav } from '@angular/material/sidenav';
import { Router } from '@angular/router';
import { formField } from 'aws-amplify';
import { NavigationRoute } from '../navigationRoute';

const SMALL_WIDTH_BREAKPOINT = 768;
@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.scss']
})
export class CourseComponent implements OnInit {

  public isScreenSmall!: boolean;
 fontSize:string[]=[];
  showFiller = false;

  navigationroute!:NavigationRoute;

  isDarkTheme: boolean = false;
  dir: string = 'ltr';

  constructor(
    private breakpointObserver: BreakpointObserver,

    private router: Router) { }

  @ViewChild(MatSidenav)
  sidenav!: MatSidenav;

  toggleTheme() {
    this.isDarkTheme = !this.isDarkTheme;
  }

  toggleDir() {
    this.dir = this.dir == 'ltr' ? 'rtl' : 'ltr';
  }

  ngOnInit(): void {
    this.breakpointObserver
      .observe([`(max-width: ${SMALL_WIDTH_BREAKPOINT}px)`])
      .subscribe((state: BreakpointState) => {
        this.isScreenSmall = state.matches;
        this.showFiller=true;

      });



    this.router.events.subscribe(() => {
      if (this.isScreenSmall) {
        this.sidenav.close();
      }
    });
  }
}
