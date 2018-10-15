package br.com.cast.WeatherApi.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {

	private WeatherMain main;
	private WeatherDescription weather;
	private WeatherWind wind;

	@JsonProperty("dt_txt")
	private String data;

	public WeatherMain getMain() {
		return main;
	}

	public void setMain(WeatherMain main) {
		this.main = main;
	}

	public WeatherDescription getWeather() {
		return weather;
	}

	public void setWeather(WeatherDescription weather) {
		this.weather = weather;
	}

	public WeatherWind getWind() {
		return wind;
	}

	public void setWind(WeatherWind wind) {
		this.wind = wind;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
