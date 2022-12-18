package ConversorTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	
		ConvertirTemperatura temperatura = new ConvertirTemperatura();
		public void ConvertirTemperatura(double ValorRecibido) {
			String opcion = (JOptionPane.showInputDialog(null, "Elije a qué temperatura deseas convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"De Celcius a Farenheit", "De Celcius a Kelvin", "De Farenheit a Celcius", "De Farenheit a Kelvin", "De Kelvin a Celcius", "De Kelvin a Farenheit"},"Seleccion")).toString();

			switch (opcion) {
			case "De Celcius a Farenheit":
				temperatura.ConvertirCelciusaFarenheit(ValorRecibido);
				break;
				
			case "De Celcius a Kelvin":
				temperatura.ConvertirCelciusaKelvin(ValorRecibido);
				break;
				
			case "De Farenheit a Celcius":
				temperatura.ConvertirFarenheitaCelcius(ValorRecibido);
				break;
			
			case "De Farenheit a Kelvin":
				temperatura.ConvertirFarenheitaKelvin(ValorRecibido);
				break;
				
			case "De Kelvin a Celcius":
				temperatura.ConvertirKelvinaCelcius(ValorRecibido);
				break;
				
			case "De Kelvin a Farenheit":
				temperatura.ConvertirKelvinaFarenheit(ValorRecibido);
				break;
			}
		
		}
}
