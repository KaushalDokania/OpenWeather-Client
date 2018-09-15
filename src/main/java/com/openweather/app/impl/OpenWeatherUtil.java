package com.openweather.app.impl;

public class OpenWeatherUtil {

	private static final String API_KEY="a8e952f34913da8a0e83216a7e4d1b17";
	private static final String WEATHER_URL="https://api.openweathermap.org/data/2.5/weather?";
//	private static final String FORECAST_URL="https://api.openweathermap.org/data/2.5/forecast?";
	
	public static void main(String[] args) {
	}
	
	public static String getCurrentWeather(Integer cityId) {
		String apiUrl = WEATHER_URL.concat("APPID=").concat(API_KEY).concat("&id=").concat(cityId.toString());
//		return getWeather(WEATHER_URL, cityId);
		return HttpClientUtil.getResponseFromUrl(apiUrl);
	}
	
}
