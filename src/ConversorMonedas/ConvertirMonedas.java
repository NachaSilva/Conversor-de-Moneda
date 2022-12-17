package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	public void ConvertirPesosChilenosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 884.96;
		monedaDolar = (double) Math.round( monedaDolar * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosChilenosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 938;
		monedaEuro = (double) Math.round( monedaEuro * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	public void ConvertirPesosChilenosaLibras(double valorRecibido) {
		double monedaLibras = valorRecibido / 1067.34;
		monedaLibras = (double) Math.round( monedaLibras * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibras + " Libras");
	}
	public void ConvertirPesosChilenosaYen(double valorRecibido) {
		double monedaYen = valorRecibido / 6.47;
		monedaYen = (double) Math.round( monedaYen * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirDolaraPesosChilenos(double valorRecibido) {
		double monedaChilena = valorRecibido / 879.01;
		monedaChilena = (double) Math.round( monedaChilena * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaChilena + " Pesos Chilenos");
	}
	
	public void ConvertirDolaraEuros(double valorRecibido) {
		double monedaEuro = valorRecibido / 1.06;
		monedaEuro = (double) Math.round( monedaEuro * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void ConvertirDolaraLibras(double valorRecibido) {
		double monedaLibras = valorRecibido / 1.21;
		monedaLibras = (double) Math.round( monedaLibras * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibras + " Libras");
	}
	
	public void ConvertirDolaraYen(double valorRecibido) {
		double monedaYen = valorRecibido / 136.72;
		monedaYen = (double) Math.round( monedaYen * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirEuroaPesosChilenos(double valorRecibido) {
		double monedaChilena = valorRecibido / 931.27;
		monedaChilena = (double) Math.round( monedaChilena * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaChilena + " Pesos Chilenos");
	}
	
	public void ConvertirEuroaDolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 1.06;
		monedaDolar = (double) Math.round( monedaDolar * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirEuroaLibras(double valorRecibido) {
		double monedaLibras = valorRecibido / 1.15;
		monedaLibras = (double) Math.round( monedaLibras * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibras + " Libras");
	}
	
	public void ConvertirEuroaYen(double valorRecibido) {
		double monedaYen = valorRecibido / 144.90;
		monedaYen = (double) Math.round( monedaYen * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirLibrasaPesoChileno(double valorRecibido) {
		double monedaChilena = valorRecibido / 1067.34;
		monedaChilena = (double) Math.round( monedaChilena * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaChilena + " Pesos Chilenos");
	}
	
	public void ConvertirLibrasaDolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 1.21;
		monedaDolar = (double) Math.round( monedaDolar * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirLibrasaEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 1.15;
		monedaEuro = (double) Math.round( monedaEuro * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void ConvertirLibrasaYen(double valorRecibido) {
		double monedaYen = valorRecibido / 166.19;
		monedaYen = (double) Math.round( monedaYen * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirYenaPesoChileno(double valorRecibido) {
		double monedaChilena = valorRecibido / 0.16;
		monedaChilena = (double) Math.round( monedaChilena * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaChilena + " Pesos Chilenos");
	}
	
	public void ConvertirYenaDolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 136.70;
		monedaDolar = (double) Math.round( monedaDolar * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirYenaEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 144.90;
		monedaEuro = (double) Math.round( monedaEuro * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void ConvertirYenaLibras(double valorRecibido) {
		double monedaLibras = valorRecibido / 165.99;
		monedaLibras = (double) Math.round( monedaLibras * 100d)/100; 
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibras + " Libras");
	}
}
