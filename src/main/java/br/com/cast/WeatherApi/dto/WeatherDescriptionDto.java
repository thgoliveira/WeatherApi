package br.com.cast.WeatherApi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDescriptionDto {
	
	@JsonProperty("main")
	private String main;
	
	@JsonProperty("icon")
	private String icon;

	public String getMain() {
		return main;
	}

	public void setMain(String main) {
		this.main = main;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
	
	

}
