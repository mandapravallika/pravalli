package com.pravallika;

public class Country {
	public static void main(String[] args) {
		Country1 countries = new Country1();
			countries.saveCountryNames("India");
			countries.saveCountryNames("USA");
			countries.saveCountryNames("Bangladesh");
			countries.saveCountryNames("China");
			countries.saveCountryNames("Russia");
			countries.saveCountryNames("Japan");

			System.out.println("India: " + countries.retrieveCountry("India"));
			System.out.println("Pakistan: " + countries.retrieveCountry("Pakistan"));
	}
}
		


	


