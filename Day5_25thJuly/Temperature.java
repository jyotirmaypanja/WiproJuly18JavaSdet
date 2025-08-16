package LabSession25thJuly;

/*
 * Create a Temperature class
Private field: celsius
Provide:
Method to set temperature
Method to convert to Fahrenheit
Method to convert to Kelvin
Apply encapsulation and validation for physical temperature limits.
 */

public class Temperature {
	public double getCelcius() {
		return celcius;
	}

	private double celcius;

	public void setCelcius(double celcius) {
		this.celcius = celcius;
	}
	
	 // Method to convert Celsius to Fahrenheit
    public double toFahrenheit(int celsius) {
       
		return (celsius * 9 / 5) + 32;
    }

    // Method to convert Celsius to Kelvin
    public double toKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    

}
