package com.openweather.app.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openweather.app.impl.ApiService;
import com.openweather.app.impl.Weather;

@RestController
@RequestMapping("/api")
public class MainController {

	@Autowired
	ApiService apiService;
	
	@GetMapping("/hi")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/weather")
	public ResponseEntity<?> getWeather(HttpServletResponse response) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
//		JSONObject obj = apiService.getApiResponse(524901);
//		return new ResponseEntity<City>(apiService.getApiResponse(524901), HttpStatus.OK);
		response.addHeader("Access-Control-Allow-Origin", "*");
		response.addHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");
		return new ResponseEntity<Weather>(apiService.getApiResponse(524901), HttpStatus.OK);
	}
}
