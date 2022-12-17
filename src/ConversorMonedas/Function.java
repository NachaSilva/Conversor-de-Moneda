package ConversorMonedas;

import javax.swing.JOptionPane;

public class Function {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	
	public void ConvertirMonedas(double ValorRecibido) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object [] {"De Pesos Chilenos a Dolar", "De pesos Chilenos a Euros","De Pesos Chilenos a Libras", "De Pesos Chilenos a Yen", "De Dolar a Pesos Chilenos", "De Dolar a Euros", "De Dolar a Libras", "De Dolar a Yen", "De Euro a Peso Chileno", "De Euro a Dolar", "De Euro a Libra", "De Euro a Yen", "De Libras a Peso Chileno", "De Libras a Dolar", "De Libras a Euro", "De Libras a Yen", "De Yen a Peso Chileno", "De Yen a Dolar", "De Yen a Euro", "De Yen a Libras"},"Seleccion")).toString();
	
	switch(opcion) {
	case "De Pesos Chilenos a Dolar":
		monedas.ConvertirPesosChilenosADolar(ValorRecibido);
		break;
	
	case "De pesos Chilenos a Euros":
	monedas.ConvertirPesosChilenosAEuro(ValorRecibido);
		break;
	
	case "De Pesos Chilenos a Libras":
		monedas.ConvertirPesosChilenosaLibras(ValorRecibido);
		break;
		
	case "De Pesos Chilenos a Yen":
		monedas.ConvertirPesosChilenosaYen(ValorRecibido);
		break;
		
	case "De Dolar a Pesos Chilenos":
		monedas.ConvertirDolaraPesosChilenos(ValorRecibido);
		break;
		
	case "De Dolar a Euros":
		monedas.ConvertirDolaraEuros(ValorRecibido);
		break;
		
	case "De Dolar a Libras":
		monedas.ConvertirDolaraLibras(ValorRecibido);
		break;
		
	case "De Dolar a Yen":
		monedas.ConvertirDolaraYen(ValorRecibido);
		break;
		
	case "De Euro a Peso Chileno":
		monedas.ConvertirEuroaPesosChilenos(ValorRecibido);
		break;
		
	case "De Euro a Dolar":
		monedas.ConvertirEuroaDolar(ValorRecibido);
		break;
		
	case "De Euro a Libra":
		monedas.ConvertirEuroaLibras(ValorRecibido);
		break;
		
	case "De Euro a Yen":
		monedas.ConvertirEuroaYen(ValorRecibido);
		break;
		
	case "De Libras a Peso Chileno":
		monedas.ConvertirLibrasaPesoChileno(ValorRecibido);
		break;
		
	case "De Libras a Dolar":
		monedas.ConvertirLibrasaDolar(ValorRecibido);
		break;
		
	case "De Libras a Euro":
		monedas.ConvertirLibrasaEuro(ValorRecibido);
		break;
		
	case "De Libras a Yen":
		monedas.ConvertirLibrasaDolar(ValorRecibido);
		break;
		
	case "De Yen a Peso Chileno":
		monedas.ConvertirYenaPesoChileno(ValorRecibido);
		break;
		
	case "De Yen a Dolar":
		monedas.ConvertirYenaDolar(ValorRecibido);
		break;
		
	case "De Yen a Euro":
		monedas.ConvertirYenaEuro(ValorRecibido);
		break;
		
	case "De Yen a Libras":
		monedas.ConvertirYenaLibras(ValorRecibido);
		break;
		}
	}
	
}
