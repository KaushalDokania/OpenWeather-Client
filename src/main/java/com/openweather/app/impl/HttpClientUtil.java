package com.openweather.app.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpClientUtil {

	public static String getResponseFromUrl(String urlString) {
		try {
			System.out.println("Connecting URL : " + urlString);
			URL url = new URL(urlString);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			Integer responseCode = conn.getResponseCode();
			if (responseCode != 200)
				throw new RuntimeException("Failed : HTTP error code : " + responseCode);

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String line, output="";
			System.out.println("\nReading output from Server .... \n");
			while ((line = br.readLine()) != null) {
				output += line;
			}

			conn.disconnect();
			System.out.println("connection closed");
			
			return output;
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return urlString;
	}
}
