import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { WeatherListagemComponent } from './weather-listagem.component';

describe('WeatherListagemComponent', () => {
  let component: WeatherListagemComponent;
  let fixture: ComponentFixture<WeatherListagemComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ WeatherListagemComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(WeatherListagemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
