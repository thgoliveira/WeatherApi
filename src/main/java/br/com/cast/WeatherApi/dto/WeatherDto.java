package br.com.cast.WeatherApi.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherDto {

	@JsonProperty("list")
	private List<WeatherDataDto> list;

	public List<WeatherDataDto> getList() {
		return list;
	}

	public void setList(List<WeatherDataDto> list) {
		this.list = list;
	}
	
	

}
