package br.com.cast.WeatherApi.modelo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "clima")
public class WeatherResult {

	@Id
	@SequenceGenerator(sequenceName = "clima_id_seq", name = "gerador_clima_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gerador_clima_seq")
	private Integer id;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "tempmin")
	private String tempMin;
	
	@Column(name = "tempmax")
	private String tempMax;

	@Column(name = "pressure")
	private String pressure;

	@Column(name = "humidity")
	private String humidity;

	@Column(name = "main")
	private String main;

	@Column(name = "icon")
	private String icon;
	
	@Column(name = "speed")
	private String speed;

	@Column(name = "data")
	private Date data;

	/*--------Getters and Setters------------*/

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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	

}
