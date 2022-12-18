package ConversorMonedas;

import javax.swing.*;

import ConversorTemperatura.FunctionTemperatura;

public class Principal {

	static Function monedas = new Function();
	static FunctionTemperatura temperatura = new FunctionTemperatura();

	public static void main(String[] args) {
		boolean next = true;
		while (next) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
					JOptionPane.QUESTION_MESSAGE, null,
					new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Seleccion")).toString();
			
			System.out.println(opciones);
			
			if (opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
				double ValorRecibido = Double.parseDouble(input);
				monedas.ConvertirMonedas(ValorRecibido);

				int Seleccion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra operación?");
				if (JOptionPane.OK_OPTION != Seleccion) {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					next = false;
				};
			}
			
			if (opciones == "Conversor de Temperatura") {
				String inputTemperatura = JOptionPane.showInputDialog("Ingrese un valor para convertir");
				double valorRecibido = Double.parseDouble(inputTemperatura);
				temperatura.ConvertirTemperatura(valorRecibido);

				int SeleccionTemperatura = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra operación?");
				if (JOptionPane.OK_OPTION != SeleccionTemperatura) {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					next = false;
				};
				
			}
		}
	}
	public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
    }
}
