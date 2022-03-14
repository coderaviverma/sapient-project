package com.coderaviverma.Sapient.Project.service;


import com.coderaviverma.Sapient.Project.entity.Weather;

public interface WeatherService {
	public Weather getWeatherForCity(String city);
}
