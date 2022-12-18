package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirCelciusaFarenheit(double valorRecibido) {
		double farenheit = ((valorRecibido*9)/5)+32;
		JOptionPane.showMessageDialog(null, "Tienes $ " + farenheit + "° Farenheit");
	}
	
	public void ConvertirCelciusaKelvin(double valorRecibido) {
		double kelvin = valorRecibido + 273.15;
		JOptionPane.showMessageDialog(null, "Tienes $ " + kelvin + "° Kelvin");
	}
	
	public void ConvertirFarenheitaCelcius(double valorRecibido) {
		double celcius = ((valorRecibido-32)*5)/9;
		JOptionPane.showMessageDialog(null, "Tienes $ " + celcius + "° Celcius");
	}
	
	public void ConvertirFarenheitaKelvin(double valorRecibido) {
		double kelvin = (((valorRecibido-32)*5)/9)+273.15;
		JOptionPane.showMessageDialog(null, "Tienes $ " + kelvin + "° Kelvin");
	}
	
	public void ConvertirKelvinaCelcius(double valorRecibido) {
		double celcius = valorRecibido-273.15;
		JOptionPane.showMessageDialog(null, "Tienes $ " + celcius + "° Celcius");
	}
	
	public void ConvertirKelvinaFarenheit(double valorRecibido) {
		double farenheit = (((valorRecibido-273.15)*9)/5)+32;
		JOptionPane.showMessageDialog(null, "Tienes $ " + farenheit + "° Farenheit");
	}
		
	}
	

