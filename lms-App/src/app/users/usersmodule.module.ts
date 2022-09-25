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
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { CourseComponent } from './course/course.component';
import { TestComponent } from './test/test.component';
import { RatingsComponent } from './ratings/ratings.component';
import { InstructorComponent } from './instructor/instructor.component';
import { FormsModule} from '@angular/forms';



const routes:Routes =[
  {path:'',component: UsersComponent,
  children:[
    {path: 'Home', component:HomeComponent},
    {path: "login", component:LoginComponent},
    {path: "register", component:RegisterComponent},
    {path: "course", component:CourseComponent},
    {path: "test", component:TestComponent}
]},

  {path: '**', redirectTo: ''}
]

@NgModule({
  declarations: [
    UsersComponent, HomeComponent,SidebarComponent,
    ToolbarComponent,SidenavComponent, LoginComponent,
     RegisterComponent, CourseComponent, TestComponent,
      RatingsComponent, InstructorComponent
  ],
  imports: [
    CommonModule,
    HttpClientModule,
    SharedmaterialModule,
    FormsModule,
    RouterModule.forChild(routes)

  ]
})
export class UsersmoduleModule { }
