package br.com.cast.WeatherApi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.WeatherApi.dto.WeatherResultDto;
import br.com.cast.WeatherApi.service.WeatherService;

@RestController
@RequestMapping(path = "/clima")
public class WeatherApi {
	
	@Autowired
	private WeatherService wService;
	
	@GetMapping
	public List<WeatherResultDto> getCincoDias(@RequestParam("q") String cidade) {
		return wService.getClima(cidade);
	}
	
}
