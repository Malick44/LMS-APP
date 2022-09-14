import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule,Routes } from '@angular/router';
import { SharedmaterialModule } from 'src/sharedMaterial.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './users/home/home.component';
import { SidebarComponent } from './users/sidebar/sidebar.component';
import { ToolbarComponent } from './users/toolbar/toolbar.component';
import { UsersComponent } from './users/users.component';


const routes:Routes=[
  {path: 'lmsApp', loadChildren:() =>import('./users/usersmodule.module').then(m =>m.UsersmoduleModule)},
  {path: '**', redirectTo: 'lmsApp', }
];

@NgModule({

  declarations: [
    AppComponent,



  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    SharedmaterialModule,
    HttpClientModule,
    RouterModule.forRoot(routes)

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
