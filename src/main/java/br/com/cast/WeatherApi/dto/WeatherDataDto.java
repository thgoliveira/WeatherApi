package br.com.cast.WeatherApi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDataDto {
	
	@JsonProperty("main")
	private WeatherMainDto main;
	
	@JsonProperty("weather")
	private List<WeatherDescriptionDto> weather;
	
	@JsonProperty("wind")
	private WeatherWindDto wind;

	@JsonProperty("dt_txt")
	private String data;

	public WeatherMainDto getMain() {
		return main;
	}

	public void setMain(WeatherMainDto main) {
		this.main = main;
	}

	public List<WeatherDescriptionDto> getWeather() {
		return weather;
	}

	public void setWeather(List<WeatherDescriptionDto> weather) {
		this.weather = weather;
	}

	public WeatherWindDto getWind() {
		return wind;
	}

	public void setWind(WeatherWindDto wind) {
		this.wind = wind;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	



}
