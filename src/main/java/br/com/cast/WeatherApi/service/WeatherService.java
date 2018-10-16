package br.com.cast.WeatherApi.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.WeatherApi.api.WeatherClient;
import br.com.cast.WeatherApi.dto.WeatherDataDto;
import br.com.cast.WeatherApi.dto.WeatherDescriptionDto;
import br.com.cast.WeatherApi.dto.WeatherDto;
import br.com.cast.WeatherApi.dto.WeatherResultDto;
import br.com.cast.WeatherApi.modelo.WeatherResult;
import br.com.cast.WeatherApi.repositorio.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	private WeatherClient wclient;

	@Autowired
	private WeatherRepository wRepository;

	public List<WeatherResultDto> getClima(String cidade) {

		List<WeatherResultDto> data = new ArrayList<>();
		List<WeatherResult> entidade = wRepository.buscarTudo(cidade);

		
		if (entidade.size() < 5) {

			wRepository.buscarParaExcluir(cidade);
			
			Map<String, WeatherResultDto> map = new HashMap<>();
			WeatherDto resultado = wclient.getPrevisoes(cidade);

			for (WeatherDataDto wDataDto : resultado.getList()) {
				String dataString = wDataDto.getData().substring(0, 10);
				if (map.containsKey(dataString)) {
					continue;
				}

				WeatherResultDto wrDto = fromApiParaDto(cidade, wDataDto);
				map.put(dataString, wrDto);
				data.add(wrDto);
				WeatherResult dados = fromEntidade(wrDto);
				wRepository.inserir(dados);
			}
			
		} else {

			for (WeatherResult weatherResult : entidade) {
				WeatherResultDto wResultDto = fromDto(cidade, weatherResult);
				data.add(wResultDto);
				
			}
		}
		
		return data;
	}

	/* Conversores DTO e ENTIDADE */

	private WeatherResultDto fromApiParaDto(String cidade, WeatherDataDto dataDto) {
		WeatherResultDto wResultDto = new WeatherResultDto();
		wResultDto.setCidade(cidade);
		wResultDto.setTempMin(dataDto.getMain().getTempMin());
		wResultDto.setTempMax(dataDto.getMain().getTempMax());
		wResultDto.setPressure(dataDto.getMain().getPressure());
		wResultDto.setHumidity(dataDto.getMain().getHumidity());
		wResultDto.setDataTxt(dataDto.getData());
		wResultDto.setSpeed(dataDto.getWind().getSpeed());

		for (WeatherDescriptionDto WeatherDataDto : dataDto.getWeather()) {
			wResultDto.setMain(WeatherDataDto.getMain());
			wResultDto.setIcon(WeatherDataDto.getIcon());
		}
		return wResultDto;
	}

	public WeatherResult fromEntidade(WeatherResultDto wResultDto) {
		WeatherResult wResult = new WeatherResult();
		wResult.setCidade(wResultDto.getCidade());
		wResult.setTempMin(wResultDto.getTempMin());
		wResult.setTempMax(wResultDto.getTempMax());
		wResult.setPressure(wResultDto.getPressure());
		wResult.setHumidity(wResultDto.getHumidity());
		wResult.setMain(wResultDto.getMain());
		wResult.setIcon(wResultDto.getIcon());
		wResult.setSpeed(wResultDto.getSpeed());
		wResult.setData(stringToDate(wResultDto.getDataTxt()));

		return wResult;
	}

	public WeatherResultDto fromDto(String cidade, WeatherResult wResult) {
		WeatherResultDto wResultDto = new WeatherResultDto();
		wResultDto.setCidade(cidade);
		wResultDto.setTempMin(wResult.getTempMin());
		wResultDto.setTempMax(wResult.getTempMax());
		wResultDto.setPressure(wResult.getPressure());
		wResultDto.setHumidity(wResult.getHumidity());
		wResultDto.setMain(wResult.getMain());
		wResultDto.setIcon(wResult.getIcon());
		wResultDto.setSpeed(wResult.getSpeed());
		wResultDto.setDataTxt(dateToString(wResult.getData()));

		return wResultDto;
	}

	public Date stringToDate(String data) {
		Date dataFormatada = null;
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dataFormatada = format.parse(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataFormatada;
	}

	public String dateToString(Date date) {
		String dataFormatada = "";
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try {
			dataFormatada = format.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dataFormatada;
	}

}
