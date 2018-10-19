import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from  '@angular/common/http';

import { AppComponent } from './app.component';
import { WeatherListagemComponent } from './weather-listagem/weather-listagem.component';
import { WeatherService } from './weather.service';

@NgModule({
  declarations: [
    AppComponent,
    WeatherListagemComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [ WeatherService],
  bootstrap: [AppComponent]
})
export class AppModule { }
