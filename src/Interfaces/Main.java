package Interfaces;

public class Main {

	public static void main(String[] args) {

		// FUNCTIONAL INTERFACES / LAMBDA FUNCTIONS

		// Pasando una instancia de clase que implemente la interfaz
		greet(new ConsolePrinter());

		// Pasando una función anónima (es la propia implementación del método)
		greet(message -> System.out.println("Anonymous: " + message));

		// Guardando la implementación en una variable de tipo Printer (interfaz)
		Printer printer = message -> System.out.println("Variable: " + message);
		greet(printer);

		// Method reference
		Printer printer2 = new ConsolePrinter();
		greet(printer2::print);

	}

	private static void greet(Printer printer) {
		printer.print("Hi mom!");
	}

}