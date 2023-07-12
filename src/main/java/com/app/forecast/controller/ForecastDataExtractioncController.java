package com.app.forecast.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ForecastDataExtractioncController {
	
	@GetMapping("/getData/{city}")
	public String extractWeatherData(@PathVariable String city) {
		String APIKey = "784a452adca267f1c49f9446d2fce60f";
		String URL = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + APIKey;
		RestTemplate template=new RestTemplate();
		return template.getForObject(URL, String.class);
	}

}
