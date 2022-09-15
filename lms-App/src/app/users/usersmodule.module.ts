import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { SharedmaterialModule } from 'src/sharedMaterial.module';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { UsersComponent } from './users.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { ToolbarComponent } from './toolbar/toolbar.component';
import { SidenavComponent } from './sidenav/sidenav.component';

const routes:Routes =[
  {path:'',component: UsersComponent,
  children:[
    {path: 'Home', component:HomeComponent},

]},

  {path: '**', redirectTo: ''}
]

@NgModule({
  declarations: [
    UsersComponent, HomeComponent,SidebarComponent,
    ToolbarComponent,SidenavComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    SharedmaterialModule,
    RouterModule.forChild(routes)

  ]
})
export class UsersmoduleModule { }
