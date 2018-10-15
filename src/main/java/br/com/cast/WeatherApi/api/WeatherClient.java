package br.com.cast.WeatherApi.api;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.cast.WeatherApi.dto.WeatherDto;

@Component
public class WeatherClient {

	private static final String URL_BUSCA_PREVISOES = "http://api.openweathermap.org/data/2.5/forecast?q={cidade},br&units=metric&mode=json&appid={appid}&lang=pt";
	private static final String APPID = "cd42ef5f7f0a8c24bd7cc0d5958fd543";
	private RestTemplate client;

	public WeatherClient(RestTemplateBuilder builder) {
		this.client = builder.build();
	}

	public WeatherDto getPrevisoes(String cidade) {
		WeatherDto weatherDto = this.client.getForObject(URL_BUSCA_PREVISOES, WeatherDto.class, cidade, APPID);
		return weatherDto;
	}
	

}
