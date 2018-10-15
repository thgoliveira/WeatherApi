package br.com.cast.WeatherApi.dto;

public class WeatherMainDto {

	private Long temp_min;
	private Long temp_max;
	private Long pressure;
	private Long humidity;

	public Long getTemp_min() {
		return temp_min;
	}

	public void setTemp_min(Long temp_min) {
		this.temp_min = temp_min;
	}

	public Long getTemp_max() {
		return temp_max;
	}

	public void setTemp_max(Long temp_max) {
		this.temp_max = temp_max;
	}

	public Long getPressure() {
		return pressure;
	}

	public void setPressure(Long pressure) {
		this.pressure = pressure;
	}

	public Long getHumidity() {
		return humidity;
	}

	public void setHumidity(Long humidity) {
		this.humidity = humidity;
	}

}
