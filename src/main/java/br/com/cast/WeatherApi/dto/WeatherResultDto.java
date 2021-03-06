package br.com.cast.WeatherApi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResultDto {
	
	@JsonProperty("cidade")
	private String cidade;
	
	@JsonProperty("temp_min")
	private String tempMin;
	
	@JsonProperty("temp_max")
	private String tempMax;
	
	@JsonProperty("pressure")
	private String pressure;
	
	@JsonProperty("humidity")
	private String humidity;
	
	@JsonProperty("main")
	private String main;
	
	@JsonProperty("icon")
	private String icon;
	
	@JsonProperty("speed")
	private String speed;
	
	@JsonProperty("dt_txt")
	private String dataTxt;

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getTempMin() {
		return tempMin;
	}

	public void setTempMin(String tempMin) {
		this.tempMin = tempMin;
	}

	public String getTempMax() {
		return tempMax;
	}

	public void setTempMax(String tempMax) {
		this.tempMax = tempMax;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

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

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getDataTxt() {
		return dataTxt;
	}

	public void setDataTxt(String dataTxt) {
		this.dataTxt = dataTxt;
	}

	

	

}
