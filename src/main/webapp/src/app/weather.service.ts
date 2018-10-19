import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class WeatherService {

  climasUrl = 'http://localhost:8080/clima?q=Araraquara'

  constructor(private http: HttpClient) { }

  listar(){
    return this.http.get<any[]>(`${this.climasUrl} `);
  }
}
