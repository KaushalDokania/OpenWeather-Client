package com.openweather.app.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

@Service
public class ApiService {

	private final String JSON_DATA = "{\r\n" + 
			"    \"coord\": {\r\n" + 
			"        \"lon\": 37.62,\r\n" + 
			"        \"lat\": 55.75\r\n" + 
			"    },\r\n" + 
			"    \"weather\": [\r\n" + 
			"        {\r\n" + 
			"            \"id\": 800,\r\n" + 
			"            \"main\": \"Clear\",\r\n" + 
			"            \"description\": \"clear sky\",\r\n" + 
			"            \"icon\": \"01d\"\r\n" + 
			"        }\r\n" + 
			"    ],\r\n" + 
			"    \"base\": \"stations\",\r\n" + 
			"    \"main\": {\r\n" + 
			"        \"temp\": 298.41,\r\n" + 
			"        \"pressure\": 1017,\r\n" + 
			"        \"humidity\": 33,\r\n" + 
			"        \"temp_min\": 298.15,\r\n" + 
			"        \"temp_max\": 299.15\r\n" + 
			"    },\r\n" + 
			"    \"visibility\": 10000,\r\n" + 
			"    \"wind\": {\r\n" + 
			"        \"speed\": 3,\r\n" + 
			"        \"deg\": 180\r\n" + 
			"    },\r\n" + 
			"    \"clouds\": {\r\n" + 
			"        \"all\": 0\r\n" + 
			"    },\r\n" + 
			"    \"dt\": 1535194800,\r\n" + 
			"    \"sys\": {\r\n" + 
			"        \"type\": 1,\r\n" + 
			"        \"id\": 7325,\r\n" + 
			"        \"message\": 0.0025,\r\n" + 
			"        \"country\": \"RU\",\r\n" + 
			"        \"sunrise\": 1535163674,\r\n" + 
			"        \"sunset\": 1535215229\r\n" + 
			"    },\r\n" + 
			"    \"id\": 524901,\r\n" + 
			"    \"name\": \"Moscow\",\r\n" + 
			"    \"cod\": 200\r\n" + 
			"}";
	
	public Weather getApiResponse(Integer cityId) {
		Weather weather = new Weather();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE, hh:mm a");
		try {
//			JSONObject jsonResponse = new JSONObject(OpenWeatherUtil.getCurrentWeather(cityId));
			JSONObject jsonResponse = new JSONObject(JSON_DATA);
			weather.setTimeStamp(sdf.format(new Date()));
			weather.setCity(getCityObject(jsonResponse));
			weather.setWeatherDetails(getWeatherDetails(jsonResponse));
			weather.setTemperature(jsonResponse.getJSONObject("main").getDouble("temp"));
			weather.setMinTemp(jsonResponse.getJSONObject("main").getDouble("temp_min"));
			weather.setMaxTemp(jsonResponse.getJSONObject("main").getDouble("temp_max"));
			weather.setHumidity(jsonResponse.getJSONObject("main").getInt("humidity"));
			weather.setPressure(jsonResponse.getJSONObject("main").getDouble("pressure"));
			weather.setVisibility(jsonResponse.getInt("visibility"));
			weather.setWindSpeed(jsonResponse.getJSONObject("wind").getDouble("speed"));
			weather.setWindDegree(jsonResponse.getJSONObject("wind").getInt("deg"));
			weather.setClouds(jsonResponse.getJSONObject("clouds").getInt("all"));
//			weather.setRainInLast3Hours(jsonResponse.getJSONObject("rain").getDouble("rain.3h"));
//			weather.setSnowInLast3Hours(jsonResponse.getJSONObject("snow").getDouble("snow.3h"));
			return weather;
//			return getCityObject(jsonResponse);
//			return getWeatherDetails(jsonResponse);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private City getCityObject(JSONObject jsonResponse) {
		City city = new City();
		try {
			city.setCityId(jsonResponse.getInt("id"));
			city.setCityName(jsonResponse.getString("name"));
			city.setCountry(jsonResponse.getJSONObject("sys").getString("country"));
			city.setSunrise(jsonResponse.getJSONObject("sys").getInt("sunrise"));
			city.setSunset(jsonResponse.getJSONObject("sys").getInt("sunset"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return city;
	}
	
	private WeatherDetails getWeatherDetails(JSONObject jsonResponse) {
		WeatherDetails weatherDetails = new WeatherDetails();
		try {
			JSONArray weatherArray = jsonResponse.getJSONArray("weather");
			JSONObject obj = (JSONObject) weatherArray.get(0);
			weatherDetails.setWeatherId(obj.getInt("id"));
			weatherDetails.setStatus(obj.getString("main"));
			weatherDetails.setDescription(obj.getString("description"));
			weatherDetails.setIconId(obj.getString("icon"));
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return weatherDetails;
	}
}
