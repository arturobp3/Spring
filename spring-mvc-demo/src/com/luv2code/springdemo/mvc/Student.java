package com.luv2code.springdemo.mvc;

import java.util.HashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String, String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;


	public Student() {
		
		//Rellenamos countryOptions
		
		countryOptions = new HashMap<String, String>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("SP", "Spain");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
	}
	

	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public HashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getCountry() {
		return this.country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
}
