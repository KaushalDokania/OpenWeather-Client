package com.openweather.app.impl;

public class WeatherDetails {

	private Integer weatherId;
	private String status;
	private String description;
	private String iconId;
	
	/*--------------- Getters & Setters -----------------*/
	public Integer getWeatherId() {
		return weatherId;
	}
	public void setWeatherId(Integer weatherId) {
		this.weatherId = weatherId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getIconId() {
		return iconId;
	}
	public void setIconId(String iconId) {
		this.iconId = iconId;
	}
	
}
