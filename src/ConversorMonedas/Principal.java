package ConversorMonedas;

import javax.swing.*;

public class Principal {

	static Function monedas = new Function();

	public static void main(String[] args) {
		boolean next = true;
		while (next) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Seleccion")).toString();

			switch (opciones) {

			case "Conversor de Moneda": {
				String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
				double ValorRecibido = Double.parseDouble(input);
				monedas.ConvertirMonedas(ValorRecibido);
			}

				int Seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra operación?");
				if (JOptionPane.OK_OPTION != Seleccion) {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					next = false;

				
			}
			case "Conversor de Temperatura"

		}
	}
}
}
