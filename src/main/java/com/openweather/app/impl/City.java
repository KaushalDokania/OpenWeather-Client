package com.openweather.app.impl;

public class City {

	private Integer cityId;
	private String cityName;
	private String country;
	private Integer sunrise;
	private Integer sunset;
	
	/*--------------- Getters & Setters -----------------*/
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getSunrise() {
		return sunrise;
	}
	public void setSunrise(Integer sunrise) {
		this.sunrise = sunrise;
	}
	public Integer getSunset() {
		return sunset;
	}
	public void setSunset(Integer sunset) {
		this.sunset = sunset;
	}
	
}
