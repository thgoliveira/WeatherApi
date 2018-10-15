package br.com.cast.WeatherApi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.WeatherApi.dto.WeatherDto;

@RestController
@RequestMapping(path = "/clima")
public class WeatherApi {
	
	@Autowired
	private WeatherClient weatherClient;
	
	@GetMapping
	public WeatherDto buscar() {
		WeatherDto weatherDto = weatherClient.getPrevisoes("Araraquara");
		return weatherDto;
	}
	
}
