import { Component, OnInit } from '@angular/core';
import { WeatherService } from '../weather.service';

@Component({
  selector: 'app-weather-listagem',
  templateUrl: './weather-listagem.component.html',
  styleUrls: ['./weather-listagem.component.css']
})
export class WeatherListagemComponent implements OnInit {

  climas: Array<any>;

  constructor(private ws: WeatherService) { }

  ngOnInit() {
    this.listar();
  }

  listar(){
    this.ws.listar().subscribe(dados => this.climas = dados);
  }

}
