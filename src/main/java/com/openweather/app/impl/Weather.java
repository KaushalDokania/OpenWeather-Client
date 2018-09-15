package com.openweather.app.impl;

public class Weather {
	private String timeStamp;
	private City city;
	private WeatherDetails weatherDetails;
	private Double Temperature;
	private Double MinTemp;
	private Double MaxTemp;
	private Integer humidity;
	private Double pressure;
	private Integer visibility;
	private Double windSpeed;
	private Integer windDegree;
	private Integer clouds;
	private Double rainInLast3Hours;
	private Double snowInLast3Hours;
	
	/*--------------- Getters & Setters -----------------*/
	
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public WeatherDetails getWeatherDetails() {
		return weatherDetails;
	}
	public void setWeatherDetails(WeatherDetails weatherDetails) {
		this.weatherDetails = weatherDetails;
	}
	public Double getTemperature() {
		return Temperature;
	}
	public void setTemperature(Double temperature) {
		Temperature = temperature;
	}
	public Double getMinTemp() {
		return MinTemp;
	}
	public void setMinTemp(Double minTemp) {
		MinTemp = minTemp;
	}
	public Double getMaxTemp() {
		return MaxTemp;
	}
	public void setMaxTemp(Double maxTemp) {
		MaxTemp = maxTemp;
	}
	public Integer getHumidity() {
		return humidity;
	}
	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}
	public Double getPressure() {
		return pressure;
	}
	public void setPressure(Double pressure) {
		this.pressure = pressure;
	}
	public Integer getVisibility() {
		return visibility;
	}
	public void setVisibility(Integer visibility) {
		this.visibility = visibility;
	}
	public Double getWindSpeed() {
		return windSpeed;
	}
	public void setWindSpeed(Double windSpeed) {
		this.windSpeed = windSpeed;
	}
	public Integer getWindDegree() {
		return windDegree;
	}
	public void setWindDegree(Integer windDegree) {
		this.windDegree = windDegree;
	}
	public Integer getClouds() {
		return clouds;
	}
	public void setClouds(Integer clouds) {
		this.clouds = clouds;
	}
	public Double getRainInLast3Hours() {
		return rainInLast3Hours;
	}
	public void setRainInLast3Hours(Double rainInLast3Hours) {
		this.rainInLast3Hours = rainInLast3Hours;
	}
	public Double getSnowInLast3Hours() {
		return snowInLast3Hours;
	}
	public void setSnowInLast3Hours(Double snowInLast3Hours) {
		this.snowInLast3Hours = snowInLast3Hours;
	}

}
